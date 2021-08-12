package showroom;

import java.sql.*;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import static showroom.connection.dbpass;
import static showroom.connection.dbuname;
import static showroom.connection.myurl;

public class sale extends javax.swing.JInternalFrame {

    public sale() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jComboBox5 = new javax.swing.JComboBox<>();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jRadioButton3 = new javax.swing.JRadioButton();
        jRadioButton4 = new javax.swing.JRadioButton();
        jTextField6 = new javax.swing.JTextField();
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
        jLabel6 = new javax.swing.JLabel();
        jTextField7 = new javax.swing.JTextField();
        jLabel30 = new javax.swing.JLabel();
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
        jLabel7 = new javax.swing.JLabel();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setTitle("Sale");
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
        jLabel1.setText("Sale Variants");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setText("Buyer Details");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("Name");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("Phone");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setText("Address");

        jLabel26.setText("Payment method");

        jLabel27.setText("EMI");

        jLabel28.setText("Insurance");

        jLabel29.setText("Aadhar No.");

        jComboBox5.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Choose", "Cash", "Net banking", "Cheque", "Credit/Debit Card" }));

        buttonGroup1.add(jRadioButton1);
        jRadioButton1.setText("Yes");

        buttonGroup1.add(jRadioButton2);
        jRadioButton2.setText("No");

        buttonGroup2.add(jRadioButton3);
        jRadioButton3.setText("Yes");
        jRadioButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton3ActionPerformed(evt);
            }
        });

        buttonGroup2.add(jRadioButton4);
        jRadioButton4.setText("No");

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
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel28)
                            .addComponent(jLabel27)
                            .addComponent(jLabel26)
                            .addComponent(jLabel29))
                        .addGap(36, 36, 36)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jTextField3)
                                .addComponent(jTextField4)
                                .addComponent(jTextField5, javax.swing.GroupLayout.DEFAULT_SIZE, 179, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jRadioButton1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jRadioButton2))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jRadioButton3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jRadioButton4))
                            .addComponent(jComboBox5, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(173, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel2)
                .addGap(31, 31, 31)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel27)
                    .addComponent(jRadioButton1)
                    .addComponent(jRadioButton2))
                .addGap(8, 8, 8)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel26)
                    .addComponent(jComboBox5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel28)
                    .addComponent(jRadioButton3)
                    .addComponent(jRadioButton4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel29)
                    .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 33, Short.MAX_VALUE))
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

        jLabel14.setText("Sale Rate");

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
        jComboBox4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox4ActionPerformed(evt);
            }
        });

        jLabel16.setText("Discount(%)");

        jButton1.setText("Add");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel6.setText("Quantity");

        jLabel30.setText("Stock Left");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel10)
                .addContainerGap(365, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(108, 108, 108)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel11)
                    .addComponent(jLabel12)
                    .addComponent(jLabel13)
                    .addComponent(jLabel14)
                    .addComponent(jLabel15)
                    .addComponent(jLabel16)
                    .addComponent(jLabel6))
                .addGap(84, 84, 84)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton1)
                    .addComponent(jTextField1)
                    .addComponent(jComboBox4, 0, 126, Short.MAX_VALUE)
                    .addComponent(jComboBox3, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jComboBox2, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jTextField2)
                    .addComponent(jTextField7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel30))
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
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel13)
                            .addComponent(jComboBox4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(jLabel30)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(7, 7, 7)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel16))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1))
        );

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "VariantID", "Name", "Rate(Discount inc.)", "Qty", "Total Cost"
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

        jLabel23.setText("Sale ID");

        jLabel24.setText(".....");

        jLabel25.setText("GST");

        jLabel19.setText(".....");

        jLabel7.setText("....");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel17)
                .addGap(18, 18, 18)
                .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addComponent(jLabel25)
                .addGap(18, 18, 18)
                .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(258, 258, 258)
                .addComponent(jButton3)
                .addGap(58, 58, 58))
            .addGroup(layout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel23)
                        .addGap(35, 35, 35)
                        .addComponent(jLabel24)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel1)
                        .addGap(329, 329, 329)
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
                                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(24, Short.MAX_VALUE))))
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
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel7)
                        .addGap(106, 106, 106)
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
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formInternalFrameOpened(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameOpened
        
        fetchseries();
        fetchsaleid();
        Date obj = new Date();
        jLabel9.setText(obj.toString());
    }//GEN-LAST:event_formInternalFrameOpened

    private void jComboBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox2ActionPerformed
        fetchmodel();
    }//GEN-LAST:event_jComboBox2ActionPerformed

    private void jComboBox3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox3ActionPerformed
         fetchvariant();
    }//GEN-LAST:event_jComboBox3ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
 String bigname=jComboBox4.getSelectedItem().toString();
 String pdata[] = bigname.split(",");
 
 double rt,qt,tc,d;
 rt=Double.parseDouble(jTextField1.getText());
 d=Double.parseDouble(jTextField2.getText());
 rt=rt-((rt*d)/100);
 qt=Double.parseDouble(jTextField7.getText());
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
 String q="insert into sale values(?,?,?,?,?)";

 PreparedStatement myst = myconn.prepareStatement(q);
 myst.setString(1, jLabel24.getText());
 myst.setString(2, jLabel18.getText());
 myst.setString(3, jLabel20.getText());
 myst.setString(4, jLabel19.getText());
 SimpleDateFormat myformat = new SimpleDateFormat("yyyy-MM-dd");
 String saledt = myformat.format(new Date());
 myst.setString(5, saledt);
 
 int count = myst.executeUpdate();
 

 if(count==1)
 {
 for(int x=0;x<jTable1.getRowCount();x++)
 {
 String q1="insert into buyer(saleid,varid,name,phone,address,gtotal,aadhar,emi,payment,insurance,date) values(?,?,?,?,?,?,?,?,?,?,?)";
 PreparedStatement myst1 = myconn.prepareStatement(q1);

 myst1.setString(1, jLabel24.getText());


 myst1.setString(2, jTable1.getValueAt(x, 0).toString());

 myst1.setString(3, jTextField3.getText());
 myst1.setString(4, jTextField4.getText());
 myst1.setString(5, jTextField5.getText());
 
 double a =Double.parseDouble(jTable1.getValueAt(x, 4).toString());
 a=a+((a*12)/100);
 myst1.setString(6, String.valueOf(a));  
 
 myst1.setString(7, jTextField6.getText());
 
 if(jRadioButton1.isSelected())
    {
        myst1.setString(8, "yes");
    }
    else if(jRadioButton2.isSelected())
    {
        myst1.setString(8, jRadioButton2.getText());
    }
 myst1.setString(9, jComboBox5.getSelectedItem().toString());
 
  if(jRadioButton3.isSelected())
    {
        myst1.setString(10, "yes");
    }
    else if(jRadioButton4.isSelected())
    {
        myst1.setString(10, jRadioButton4.getText());
    }
 
 SimpleDateFormat myformat1 = new SimpleDateFormat("yyyy-MM-dd");
 String purchdt1 = myformat1.format(new Date());
 myst1.setString(11, purchdt1);
 
 myst1.executeUpdate();
 //HERE WE DONT NEED ANOTHER TRY CATCH SINCE ITS UNDER ONE.
 
 String q2="update addvar set stock=stock-? where varid=?";
PreparedStatement myst3 = myconn.prepareStatement(q2);
 
 myst3.setString(1, jTable1.getValueAt(x, 3).toString());//WE UPDATE STOCK OF OUR VARIANT
 myst3.setString(2, jTable1.getValueAt(x, 0).toString());
 
 myst3.executeUpdate();
 
 String bigname=jComboBox2.getSelectedItem().toString();
 String pdata[] = bigname.split(",");
 String bigname2=jComboBox3.getSelectedItem().toString();
 String pdata2[] = bigname2.split(",");
 String bigname3=jComboBox4.getSelectedItem().toString();
 String pdata3[] = bigname3.split(",");
 String rt = jTable1.getValueAt(x, 2).toString();
 String qt = jTable1.getValueAt(x, 3).toString();
 String tc = jTable1.getValueAt(x, 4).toString();
 
 
  printsale obj = new printsale();
 obj.saleid=jLabel24.getText();
 obj.tb=jLabel18.getText();
 obj.gst=jLabel20.getText();
 obj.gt=jLabel19.getText();
 obj.rt=rt;
 obj.qt=qt;
 obj.tc=tc;
 obj.s=pdata[1];
 obj.m=pdata2[1];
 obj.v=pdata3[1];
 Parentframe.jDesktopPane1.add(obj);//(*IMP*)TO DO THIS YOU HAVE TO GIVE PUBLIC ACCESS AND STATIC TO JDESKTOPPANE IN THE PARENTFRAME FROM PROPERTIES>CODE
 obj.setVisible(true);
 }
 
 JOptionPane.showMessageDialog(rootPane, "Sale added successfully");
 
 }
 else
 {
 JOptionPane.showMessageDialog(rootPane, "Sale not added successfully");
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

    private void jComboBox4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox4ActionPerformed
          fetchrate();
    }//GEN-LAST:event_jComboBox4ActionPerformed

    private void jRadioButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton3ActionPerformed
     insurance obj=new insurance();
     obj.name=jTextField3.getText();
     obj.phone=jTextField4.getText();
     obj.address=jTextField5.getText();
     Parentframe.jDesktopPane1.add(obj);//(*IMP*)TO DO THIS YOU HAVE TO GIVE PUBLIC ACCESS AND STATIC TO JDESKTOPPANE IN THE PARENTFRAME FROM PROPERTIES>CODE
     obj.setVisible(true);
    }//GEN-LAST:event_jRadioButton3ActionPerformed


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
 jComboBox3.addItem("Choose Model");
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
 jComboBox3.addItem("Choose Model");
 
 jComboBox4.removeAllItems();
 jComboBox4.addItem("Choose Variant");
 
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
 jComboBox4.addItem("Choose Variant");
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
 
    void fetchsaleid()
    {
try
 {
 Connection myconn = DriverManager.getConnection(myurl, dbuname, dbpass);
 try
 {
 String qu="select * from sale order by saleid desc";
 PreparedStatement myst = myconn.prepareStatement(qu);
 
 ResultSet myres=myst.executeQuery();
 if(myres.next())
 {
 int sid = myres.getInt("saleid");
 sid++;
 jLabel24.setText(String.valueOf(sid));
 }
 else
 {
 jLabel24.setText("3000");
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
    int gtotal=0;
    for(int x=0;x<jTable1.getRowCount();x++)
    {
    gtotal+=Double.parseDouble(jTable1.getValueAt(x, 4).toString());
    }
    jLabel18.setText(String.valueOf(gtotal));

    int gst = (gtotal*12)/100;
    int billtotal = gtotal+gst;

    jLabel20.setText(String.valueOf(gst));
    jLabel19.setText(String.valueOf(billtotal));
 }
 void fetchrate()
 {
     if(jComboBox4.getSelectedIndex()>0)
 {
 try
 {
 Connection myconn = DriverManager.getConnection(myurl, dbuname, dbpass);
 try
 {
 String qu="select * from addvar where varid=?";
 PreparedStatement myst = myconn.prepareStatement(qu);
 
 String bigname=jComboBox4.getSelectedItem().toString();
 String data[]=bigname.split(",");
 myst.setString(1, data[0]);
 
 ResultSet myres=myst.executeQuery();
 if(myres.next())
 {
     jTextField1.setText(myres.getString("rate"));
     jTextField2.setText(myres.getString("discount"));
     jLabel7.setText(myres.getString("stock"));
 }
 else
 {
     JOptionPane.showMessageDialog(rootPane, "Variant not found");
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

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JComboBox<String> jComboBox3;
    private javax.swing.JComboBox<String> jComboBox4;
    private javax.swing.JComboBox<String> jComboBox5;
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
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JRadioButton jRadioButton3;
    private javax.swing.JRadioButton jRadioButton4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    // End of variables declaration//GEN-END:variables
}
