package showroom;

import java.sql.*;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import static showroom.connection.dbpass;
import static showroom.connection.dbuname;
import static showroom.connection.myurl;

public class purchase extends javax.swing.JInternalFrame {

    public purchase() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jComboBox2 = new javax.swing.JComboBox<>();
        jComboBox3 = new javax.swing.JComboBox<>();
        jComboBox4 = new javax.swing.JComboBox<>();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setTitle("Purchase");
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
        jLabel1.setText("Purchase Variants");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setText("Supplier Details");

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Choose" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("Choose Supplier");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("Phone");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setText("Address");

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setText(".....");

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel7.setText(".....");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel2))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(57, 57, 57)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel3)
                            .addComponent(jLabel5))))
                .addGap(87, 87, 87)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 123, Short.MAX_VALUE)
                        .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap(162, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel2)
                .addGap(31, 31, 31)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(40, 40, 40)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel6))
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel7))
                .addGap(0, 92, Short.MAX_VALUE))
        );

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel8.setText("Bill Date");

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel9.setText(".....");

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel10.setText("Variant Details");

        jLabel11.setText("Choose Series");

        jLabel12.setText("Choose Model");

        jLabel13.setText("Choose Variant");

        jLabel14.setText("Purchase Rate");

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Choose" }));
        jComboBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox2ActionPerformed(evt);
            }
        });

        jComboBox3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Choose" }));
        jComboBox3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox3ActionPerformed(evt);
            }
        });

        jComboBox4.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Choose", " " }));

        jLabel16.setText("Quantity");

        jButton1.setText("Add");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(jLabel10))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(108, 108, 108)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel11)
                            .addComponent(jLabel12)
                            .addComponent(jLabel13)
                            .addComponent(jLabel14)
                            .addComponent(jLabel15)
                            .addComponent(jLabel16))
                        .addGap(84, 84, 84)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton1)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jTextField1)
                                .addComponent(jComboBox4, 0, 126, Short.MAX_VALUE)
                                .addComponent(jComboBox3, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jComboBox2, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jTextField2)))))
                .addContainerGap(114, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel10)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(jComboBox3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(jComboBox4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(7, 7, 7)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel16))
                .addGap(18, 18, 18)
                .addComponent(jButton1)
                .addGap(0, 24, Short.MAX_VALUE))
        );

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "VariantID", "Name", "Rate", "Qty", "Total Cost"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jButton2.setText("Remove Item");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("Save Bill");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jLabel17.setText("Total Bill");

        jLabel18.setText(".....");

        jLabel20.setText(".....");

        jLabel21.setText("Grand Total");

        jLabel23.setText("Purchase ID");

        jLabel24.setText(".....");

        jLabel25.setText("GST");

        jLabel19.setText(".....");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel17)
                .addGap(18, 18, 18)
                .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(56, 56, 56)
                .addComponent(jLabel25)
                .addGap(18, 18, 18)
                .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(55, 55, 55)
                .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel19))
                .addGap(298, 298, 298)
                .addComponent(jButton3)
                .addGap(58, 58, 58))
            .addGroup(layout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel23)
                        .addGap(35, 35, 35)
                        .addComponent(jLabel24)
                        .addGap(339, 339, 339)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel8)
                        .addGap(46, 46, 46)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton2)
                            .addComponent(jLabel9))
                        .addGap(78, 78, 78))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1261, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(23, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(jLabel23)
                            .addComponent(jLabel24)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(jLabel9))))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton2)
                        .addGap(40, 40, 40)))
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 325, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton3)
                    .addComponent(jLabel17)
                    .addComponent(jLabel18)
                    .addComponent(jLabel20)
                    .addComponent(jLabel21)
                    .addComponent(jLabel22)
                    .addComponent(jLabel25)
                    .addComponent(jLabel19))
                .addContainerGap(32, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formInternalFrameOpened(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameOpened
        fetchsupp();
        fetchseries();
        fetchpurchid();
        Date obj = new Date();
        jLabel9.setText(obj.toString());
    }//GEN-LAST:event_formInternalFrameOpened

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
try
 {
 Connection myconn = DriverManager.getConnection(myurl, dbuname, dbpass);
 try
 {
 String qu="select * from addsupp where suppid=?";
 PreparedStatement myst = myconn.prepareStatement(qu);
 
 String bigname=jComboBox1.getSelectedItem().toString();
 String data[] = bigname.split(",");
 myst.setString(1, data[0]);
 
 ResultSet myres=myst.executeQuery();
 if(myres.next())
 {
    jLabel6.setText(myres.getString("phone"));
    jLabel7.setText(myres.getString("address"));
 }
 else
 {
 JOptionPane.showMessageDialog(rootPane, "No Details Found");
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
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void jComboBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox2ActionPerformed
        fetchmodel();
    }//GEN-LAST:event_jComboBox2ActionPerformed

    private void jComboBox3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox3ActionPerformed
         fetchvariant();
    }//GEN-LAST:event_jComboBox3ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
 String bigname=jComboBox4.getSelectedItem().toString();
 String pdata[] = bigname.split(",");
 
 double rt,qt,tc;
 rt=Double.parseDouble(jTextField1.getText());
 qt=Double.parseDouble(jTextField2.getText());
 tc=rt*qt;
 
 Object myrow[] = {pdata[0],pdata[1],rt,qt,tc};//PUTTING ALL VALUES OF CAR IN TABLE
 
 DefaultTableModel mymodel = (DefaultTableModel)jTable1.getModel();
 
 mymodel.addRow(myrow);
 fetchtotal();
 
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        DefaultTableModel mymodel = (DefaultTableModel)jTable1.getModel();
        mymodel.removeRow(jTable1.getSelectedRow());//REMOVING ROW ITEM
        fetchtotal();//GETTING NEW GRAND TOTAL AFTER REMOVAL
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
try
 {
 
 Connection myconn = DriverManager.getConnection(myurl, dbuname, dbpass);
 try
 {
 String q="insert into purchase values(?,?,?,?,?,?)";

 PreparedStatement myst = myconn.prepareStatement(q);
 myst.setString(1, jLabel24.getText());
 
 String bigname=jComboBox1.getSelectedItem().toString();
 String data[]=bigname.split(",");
 myst.setString(2, data[0]);
 myst.setString(3, jLabel18.getText());
 myst.setString(4, jLabel20.getText());
 myst.setString(5, jLabel19.getText());
 SimpleDateFormat myformat = new SimpleDateFormat("yyyy-MM-dd");
 String purchdt = myformat.format(new Date());
 myst.setString(6, purchdt);
 
 int count = myst.executeUpdate();
 

 if(count==1)
 {
 for(int x=0;x<jTable1.getRowCount();x++)
 {
 q="insert into purchdetails(PurchID,varid,name,rate,qty,tc) values(?,?,?,?,?,?)";

 myst = myconn.prepareStatement(q);
 myst.setString(1, jLabel24.getText());
 myst.setString(2, jTable1.getValueAt(x, 0).toString());
 myst.setString(3, jTable1.getValueAt(x, 1).toString());
 myst.setString(4, jTable1.getValueAt(x, 2).toString());
 myst.setString(5, jTable1.getValueAt(x, 3).toString());
 myst.setString(6, jTable1.getValueAt(x, 4).toString());
 myst.executeUpdate();
 //HERE WE DONT NEED ANOTHER TRY CATCH SINCE ITS UNDER ONE.
 
 q="update addvar set stock=stock+? where varid=?";

 myst = myconn.prepareStatement(q);
 myst.setString(1, jTable1.getValueAt(x, 3).toString());//WE UPDATE STOCK OF OUR VARIANT
 myst.setString(2, jTable1.getValueAt(x, 0).toString());
 
 myst.executeUpdate();
 
  printpurch obj = new printpurch();
 obj.purchid=jLabel24.getText();
 obj.tb=jLabel18.getText();
 obj.gst=jLabel20.getText();
 obj.gt=jLabel19.getText();
 Parentframe.jDesktopPane1.add(obj);//(*IMP*)TO DO THIS YOU HAVE TO GIVE PUBLIC ACCESS AND STATIC TO JDESKTOPPANE IN THE PARENTFRAME FROM PROPERTIES>CODE
 obj.setVisible(true);
 }
 
 JOptionPane.showMessageDialog(rootPane, "Purchase added successfully");
   fetchpurchid();
 }
 else
 {
 JOptionPane.showMessageDialog(rootPane, "Purchase not added successfully");
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
    }//GEN-LAST:event_jButton3ActionPerformed

void fetchsupp()
{
try
 {
 Connection myconn = DriverManager.getConnection(myurl, dbuname, dbpass);
 try
 {
 String qu="select * from addsupp";
 PreparedStatement myst = myconn.prepareStatement(qu);
 ResultSet myres=myst.executeQuery();
 if(myres.next())
 {
     do
    {
        jComboBox1.addItem(myres.getString("suppid")+","+myres.getString("name"));
    }
    while(myres.next());
 }
 else
 {
 jComboBox1.removeAllItems();
 jComboBox1.addItem("No Suppliers");
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
    void fetchseries()
    {
try
 {
 Connection myconn = DriverManager.getConnection(myurl, dbuname, dbpass);
 try
 {
 String qu="select * from addseries";
 PreparedStatement myst = myconn.prepareStatement(qu);
 ResultSet myres=myst.executeQuery();
 if(myres.next())
 {
     jComboBox3.removeAllItems();
 jComboBox3.addItem("Choose");
 do
 {
 jComboBox2.addItem(myres.getString("serid")+","+myres.getString("name"));
 }
 while(myres.next());
 }
 else
 {
 jComboBox2.removeAllItems();
 jComboBox2.addItem("No Series");
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
    void fetchmodel()
    {
if(jComboBox2.getSelectedIndex()>0)//To confirm if there is selected item since it causes error sometimes WHEN THERE ARE MORE THAN 2 COMBO BOXES
 {
 try
 {
 Connection myconn = DriverManager.getConnection(myurl, dbuname, dbpass);
 try
 {
 String qu="select * from addmodel where serid=?";
 PreparedStatement myst = myconn.prepareStatement(qu);
 
 String bigname=jComboBox2.getSelectedItem().toString();//1001,Packed Product
 String data[]=bigname.split(",");
 myst.setString(1, data[0]);
 
 ResultSet myres=myst.executeQuery();
 if(myres.next())
 {
 jComboBox3.removeAllItems();
 jComboBox3.addItem("Choose");
 
 jComboBox4.removeAllItems();
 jComboBox4.addItem("Choose");
 
 do
 {
 jComboBox3.addItem(myres.getString("modid")+","+myres.getString("name"));
 }
 while(myres.next());
 }
 else
 {
 jComboBox3.removeAllItems();
 jComboBox3.addItem("No Model");
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
    }
    void fetchvariant()
    {
if(jComboBox3.getSelectedIndex()>0)
 {
 try
 {
 Connection myconn = DriverManager.getConnection(myurl, dbuname, dbpass);
 try
 {
 String qu="select * from addvar where modid=?";
 PreparedStatement myst = myconn.prepareStatement(qu);
 
 String bigname=jComboBox3.getSelectedItem().toString();
 String data[]=bigname.split(",");
 myst.setString(1, data[0]);
 
 ResultSet myres=myst.executeQuery();
 if(myres.next())
 {
 jComboBox4.removeAllItems();
 jComboBox4.addItem("Choose");
 do
 {
 jComboBox4.addItem(myres.getString("varid")+","+myres.getString("name"));
 }
 while(myres.next());
 }
 else
 {
 jComboBox4.removeAllItems();
 jComboBox4.addItem("No Variants");
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
    }
 
    void fetchpurchid()
    {
try
 {
 Connection myconn = DriverManager.getConnection(myurl, dbuname, dbpass);
 try
 {
 String qu="select * from purchase order by purchid desc";
 PreparedStatement myst = myconn.prepareStatement(qu);
 
 ResultSet myres=myst.executeQuery();
 if(myres.next())
 {
 int pid = myres.getInt("purchid");
 pid++;
 jLabel24.setText(String.valueOf(pid));
 }
 else
 {
 jLabel24.setText("2000");
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
 void fetchtotal()   
 {
    double gtotal=0;
    for(int x=0;x<jTable1.getRowCount();x++)
    {
    gtotal+=Double.parseDouble(jTable1.getValueAt(x, 4).toString());
    }
    jLabel18.setText(String.valueOf(gtotal));

    double gst = (gtotal*12)/100;
    double billtotal = gtotal+gst;

    jLabel20.setText(String.valueOf(gst));
    jLabel19.setText(String.valueOf(billtotal));
 }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JComboBox<String> jComboBox3;
    private javax.swing.JComboBox<String> jComboBox4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    // End of variables declaration//GEN-END:variables
}
