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

public class addmodel extends javax.swing.JInternalFrame {
String id="",sid="";
    public addmodel()
    {
       initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jTextField1 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setTitle("Add Model/Accessories");
        addInternalFrameListener(new javax.swing.event.InternalFrameListener() {
            public void internalFrameActivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameClosed(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameClosing(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeactivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeiconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameIconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameOpened(javax.swing.event.InternalFrameEvent evt) {
                formInternalFrameOpened(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("Add Model/Accessory");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setText("Choose Series/Accessory");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setText("Model/Accessory Name");

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Choose" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        jButton1.setText("Add ");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Series ID", "Model ID", "Name"
            }
        ));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jButton2.setText("Update");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("Delete");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setText("Models");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(72, 72, 72)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2))
                        .addGap(68, 68, 68)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jTextField1, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jComboBox1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButton2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButton3))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(158, 158, 158)
                        .addComponent(jLabel1)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 470, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel4)
                        .addGap(235, 235, 235))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addComponent(jLabel1)
                .addGap(75, 75, 75)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2)
                    .addComponent(jButton3))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(37, Short.MAX_VALUE)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 480, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(65, 65, 65))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
  if(validin())
    {
 try
 {
     Connection myconn = DriverManager.getConnection(myurl, dbuname, dbpass);
 try
 {
 String q="select * from addmodel where name=?";

 PreparedStatement myst = myconn.prepareStatement(q);
 myst.setString(1, jTextField1.getText());
 ResultSet myres = myst.executeQuery();
 if(myres.next()==false)
 {  
            try
             {
                 String qu="insert into addmodel(serid,name) values(?,?)";//SENDING QUERY
 
                PreparedStatement mystt = myconn.prepareStatement(qu);
                String a=jComboBox1.getSelectedItem().toString();
                String data[]=a.split(",");
                mystt.setString(1, data[0]);//FILLING QUERY
                mystt.setString(2, jTextField1.getText());
                
                int count = mystt.executeUpdate();//HERE OUTPUT IS 1 IF EXECUTED SUCCESFULLY
                DefaultTableModel mymodel = (DefaultTableModel)jTable1.getModel();
                if(count==1)
                {
                  JOptionPane.showMessageDialog(rootPane, "Model added successfully");
                
                  mymodel.setRowCount(0);
                 
                    clearfields();
                } 
                else
                {
                JOptionPane.showMessageDialog(rootPane, "Model not added successfully");
                }
             }
            catch(Exception e)
                {
                JOptionPane.showMessageDialog(rootPane, "Error in inputting " + e.getMessage());
                }
}
  else
 {
         JOptionPane.showMessageDialog(rootPane, "Model already added");
 }}
 catch(Exception e)
 {
   JOptionPane.showMessageDialog(rootPane, "Error while searching " + e.getMessage());
 }
 finally
    {
        myconn.close();//CONNECTION MUST BE CLOSED
    }}
  
 catch(Exception e)
 {
   JOptionPane.showMessageDialog(rootPane, "Error in connection " + e.getMessage());
 }
       }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
          
 int uchoice = JOptionPane.showConfirmDialog(rootPane,"Are you sure to delete?");//SHOWS A CONFIRM DIALOG BOX
 if(uchoice==JOptionPane.YES_OPTION)//YES OPTION GIVES AN INTEGER
 {
    try  
    {      //TO DELETE

        Connection myconn = DriverManager.getConnection(myurl, dbuname, dbpass);
        try
        {

        String q="delete from addmodel where modid=?";

        PreparedStatement myst = myconn.prepareStatement(q);
        myst.setString(1, id);
        int count = myst.executeUpdate();
        DefaultTableModel mymodel = (DefaultTableModel)jTable1.getModel();
        if(count==1)
        {
            jButton3.setEnabled(false);
                jButton2.setEnabled(false);
            if(jTable1.getSelectedRowCount()!=0)
            {
             JOptionPane.showMessageDialog(rootPane, "Model deleted successfully");
       
             mymodel.removeRow(jTable1.getSelectedRow());
             mymodel.setRowCount(0); 
             fetchtable2();            //CASE WHEN ROW IS SELECTED, SO WE FETCH MODELS WITH SERID IN COMBOBOX ONLY
             clearfields();

             
            }
            else
            {
                JOptionPane.showMessageDialog(rootPane, "Model deleted successfully");
             
                
                fetchtable3(); //FETCHING ALL MODELS WITH SERID
                   clearfields();
            }
        }
        else
        {
        JOptionPane.showMessageDialog(rootPane, "Model not deleted successfully");
        }

        }
        catch(Exception e)
        {
        JOptionPane.showMessageDialog(rootPane, "Error Occured while deleting" + e.getMessage());
        }
        finally
        {
        myconn.close();
        }
    }
    catch(Exception e)
    {
    JOptionPane.showMessageDialog(rootPane, "Error in connection " + e.getMessage());
    }
 }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
          id = jTable1.getValueAt(jTable1.getSelectedRow(), 1).toString();
          sid = jTable1.getValueAt(jTable1.getSelectedRow(), 0).toString();
          try
            {
            Connection myconn = DriverManager.getConnection(myurl, dbuname, dbpass);
            try
            {
            String q="select * from addmodel where modid=?";

            PreparedStatement myst = myconn.prepareStatement(q);
            myst.setString(1,id);
            ResultSet myres = myst.executeQuery();

            if(myres.next())
            {
                String qu="select * from addseries where serid=?";
                PreparedStatement myst1 = myconn.prepareStatement(qu);
                myst1.setString(1,sid);
                ResultSet myres1 = myst1.executeQuery();
                if(myres1.next())
                {
                    jTextField1.setText(myres.getString("name"));  //MODEL NAME FROM MYRES
                    jComboBox1.setSelectedItem(sid+","+myres1.getString("name"));  //SERIES NAME FROM MYRES1
                    jButton3.setEnabled(true);
                    jButton2.setEnabled(true);
                }
            }
            else
            {
                JOptionPane.showMessageDialog(rootPane, "No model found");
                clearfields();
                jButton3.setEnabled(false);
                jButton2.setEnabled(false);
            }

            }
            catch(Exception e)
            {
            JOptionPane.showMessageDialog(rootPane, "Error Occured while mouse clicking" + e.getMessage());
            }
            finally
            {
            myconn.close();
            }
            }
            catch(Exception e)
            {
            JOptionPane.showMessageDialog(rootPane, "Error in connection " + e.getMessage());
            }
    }//GEN-LAST:event_jTable1MouseClicked

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
                if(validin())
{
    
   
 try  //TO UPDATE
 {
 
 Connection myconn = DriverManager.getConnection(myurl, dbuname, dbpass);//IMPORTANT- WE CALL CONSTRUCTOR OR IMPORT STATIC ITS VARIABLES THAT WE USE WHILE MAKING CONNECTION  
 try
 {
 String q="update addmodel set name=?,serid=? where modid=?";
//UPDATE AND DELETE ARE VERY RISKY COMMANDS AS IF WE DONT ADD WHERE ALL THE RECORDS WILL BE UPDATED/DELETED
 PreparedStatement myst = myconn.prepareStatement(q);
 myst.setString(1, jTextField1.getText());
 String bigname=jComboBox1.getSelectedItem().toString();
 String data[]=bigname.split(",");
 myst.setString(2, data[0]);
 myst.setString(3, id);
// EVERY AREA IS UPDATED AGAIN
 int count = myst.executeUpdate();
DefaultTableModel mymodel = (DefaultTableModel)jTable1.getModel();
                   
 if(count==1)
 {
     jButton3.setEnabled(false);
     jButton2.setEnabled(false);
    JOptionPane.showMessageDialog(rootPane, "Model updated successfully");
    
    mymodel.setRowCount(0); 
    fetchtable2();
      clearfields();
 }
 else
 {
 JOptionPane.showMessageDialog(rootPane, "Model not updated successfully");
 }

 }
 catch(Exception e)
 {
 JOptionPane.showMessageDialog(rootPane, "Error Occured while updating" + e.getMessage());
 }
 finally
 {
 myconn.close();
 }
 }
 catch(Exception e)
 {
 JOptionPane.showMessageDialog(rootPane, "Error in connection " + e.getMessage());
 }
}
                else
                {
                    JOptionPane.showMessageDialog(rootPane, "Error due to validations" );
                }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void formInternalFrameOpened(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameOpened
        fetchbox();
         jButton3.setEnabled(false);
        jButton2.setEnabled(false);
       
    }//GEN-LAST:event_formInternalFrameOpened

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
         fetchtable2();
    }//GEN-LAST:event_jComboBox1ActionPerformed

    void fetchtable()
    {
         try              
        {
            Connection myconn = DriverManager.getConnection(myurl, dbuname, dbpass);
            try
            {
                String q="select * from addmodel";
                PreparedStatement myst = myconn.prepareStatement(q);             
                ResultSet myres = myst.executeQuery();
                DefaultTableModel mymodel = (DefaultTableModel)jTable1.getModel();
                if(myres.next())
                {
                   mymodel.setRowCount(0);
                 do
                 {
                    String mid=myres.getString("modid");
                    String sid=myres.getString("serid");
                    String name=myres.getString("name");
                    Object myrow[] = {sid,mid,name};
                    mymodel.addRow(myrow);
                    }
                    while(myres.next());
                }
                else
                {
                    
                    mymodel.setRowCount(0);
             
                }

        }
        catch(Exception e)
        {
        JOptionPane.showMessageDialog(rootPane, "Error Occured while searching model" + e.getMessage());
        }
        finally
        {
        myconn.close();
        }
        }
        catch(Exception e)
        {
        JOptionPane.showMessageDialog(rootPane, "Error in connection " + e.getMessage());
        }
    }
    void fetchtable2()
    {
         try              
        {
            Connection myconn = DriverManager.getConnection(myurl, dbuname, dbpass);
            try
            {
                String q="select * from addmodel where serid=?";
                PreparedStatement myst = myconn.prepareStatement(q);
                String bigname=jComboBox1.getSelectedItem().toString();
                String data[]=bigname.split(",");
                myst.setString(1, data[0]);
                ResultSet myres = myst.executeQuery();
                DefaultTableModel mymodel = (DefaultTableModel)jTable1.getModel();
                if(myres.next())
                {
                   mymodel.setRowCount(0);
                 do
                 {
                    String mid=myres.getString("modid");
                    String sid=myres.getString("serid");
                    String name=myres.getString("name");
                    Object myrow[] = {sid,mid,name};
                    mymodel.addRow(myrow);
                    }
                    while(myres.next());
                }
                else
                {
                    
                    mymodel.setRowCount(0);
             
                }

        }
        catch(Exception e)
        {
        JOptionPane.showMessageDialog(rootPane, "Error Occured while searching model" + e.getMessage());
        }
        finally
        {
        myconn.close();
        }
        }
        catch(Exception e)
        {
        JOptionPane.showMessageDialog(rootPane, "Error in connection " + e.getMessage());
        }
    }
    void fetchtable3()
    {
         try              
        {
            Connection myconn = DriverManager.getConnection(myurl, dbuname, dbpass);
            try
            {
                String q="select * from addmodel where serid=?";
                PreparedStatement myst = myconn.prepareStatement(q);
                myst.setString(1, sid);
                ResultSet myres = myst.executeQuery();
                DefaultTableModel mymodel = (DefaultTableModel)jTable1.getModel();
                if(myres.next())
                {
                   mymodel.setRowCount(0);
                 do
                 {
                    String mid=myres.getString("modid");
                    String sid=myres.getString("serid");
                    String name=myres.getString("name");
                    Object myrow[] = {sid,mid,name};
                    mymodel.addRow(myrow);
                    }
                    while(myres.next());
                }
                else
                {
                    
                    mymodel.setRowCount(0);
             
                }

        }
        catch(Exception e)
        {
        JOptionPane.showMessageDialog(rootPane, "Error Occured while searching model" + e.getMessage());
        }
        finally
        {
        myconn.close();
        }
        }
        catch(Exception e)
        {
        JOptionPane.showMessageDialog(rootPane, "Error in connection " + e.getMessage());
        }
    }
    void fetchbox()
    {
        try
 {
 Connection myconn = DriverManager.getConnection(myurl, dbuname, dbpass);
 try
 {
 String q="select * from addseries";

 PreparedStatement myst = myconn.prepareStatement(q);
 ResultSet myres = myst.executeQuery();
 if(myres.next())
 {
     do
     {
          jComboBox1.addItem(myres.getString("serid")+","+myres.getString("name"));
     }while(myres.next());
 }

 }
 catch(Exception e)
 {
 JOptionPane.showMessageDialog(rootPane, "Error Occured " + e.getMessage());
 }
 finally
 {
 myconn.close();
 }
 }
 catch(Exception e)
 {
 JOptionPane.showMessageDialog(rootPane, "Error in connection " + e.getMessage());
 }
    }
    boolean validin()
    {
         
         if(jComboBox1.getSelectedIndex()==0)
        {
            JOptionPane.showMessageDialog(rootPane, "Please choose series");
            return false;
        }
         if(jTextField1.getText().length()==0)
        {
            JOptionPane.showMessageDialog(rootPane, "Please enter model name");
            return false;
        }
         else
         {
             return true;
         }
    }
      void clearfields()
    {
        jTextField1.setText(null);
        jComboBox1.setSelectedIndex(0);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
