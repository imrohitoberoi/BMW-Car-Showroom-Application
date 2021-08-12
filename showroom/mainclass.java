package showroom;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import static showroom.connection.dbpass;
import static showroom.connection.dbuname;
import static showroom.connection.myurl;

public class mainclass {

    public static void main(String[] args) {
        try               
        {
        Connection myconn = DriverManager.getConnection(myurl, dbuname, dbpass);
        try
            {
            String q="select * from signup";
            PreparedStatement myst = myconn.prepareStatement(q);
            ResultSet myres = myst.executeQuery();

            if(myres.next())
            {
               login obj=new login();
               obj.setVisible(true);
            }
            else
            {
                createadmin obj=new createadmin();
                obj.setVisible(true);
            }

            }
            catch(Exception e)
            {
            JOptionPane.showMessageDialog(null, "Error Occured " + e.getMessage());//NULL BECAUSE THERE IS NO ROOTPANE IN MAIN CLASS(ITS NOT JFRAME)
            }
            finally
            {
            myconn.close();
            }
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, "Error in connection " + e.getMessage());
        }
    }
    
}
