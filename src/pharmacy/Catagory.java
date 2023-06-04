package pharmacy;
import java.awt.Color;
import java.awt.Image;
import java.awt.event.KeyEvent;
import java.sql.*;
import javax.swing.JOptionPane;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.regex.*;
import javax.swing.ImageIcon;
import javax.swing.border.LineBorder;
import net.proteanit.sql.DbUtils;
import javax.swing.table.DefaultTableModel;

public class Catagory extends javax.swing.JFrame {
    Connection conn=null;
    PreparedStatement pst=null;

    public Catagory() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setOpacity(0.8f);
       // imageicon() ;
        catagorylist();

    }
     /*public void imageicon() {
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icon/k1.png"));
        Image img = i1.getImage();
        Image imageScale = img.getScaledInstance(logo.getWidth(), logo.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon scaledIcon = new ImageIcon(imageScale);
        logo.setIcon(scaledIcon);
    }*/
      public void catagorylist() {
          try {
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/pharmacy", "root", "");
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery("select * from catagory");
            jTablecatagorylist.setModel(DbUtils.resultSetToTableModel(rs));
        } catch (SQLException exp) {
            exp.printStackTrace();
        }
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        jPanel10 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabelcid = new javax.swing.JLabel();
        jLabelcname = new javax.swing.JLabel();
        jTextFieldcatid = new javax.swing.JTextField();
        jTextFieldcatname = new javax.swing.JTextField();
        catagorylist = new javax.swing.JScrollPane();
        jTablecatagorylist = new javax.swing.JTable();
        catagory = new javax.swing.JLabel();
        jButtonadd = new javax.swing.JButton();
        jButtonupdate = new javax.swing.JButton();
        jButtondelete = new javax.swing.JButton();
        jButtonclear = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabelmin = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabelback = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jPanel9 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        jPanel13 = new javax.swing.JPanel();
        jPanel14 = new javax.swing.JPanel();
        jPanel15 = new javax.swing.JPanel();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        jPanel10.setBackground(new java.awt.Color(204, 0, 0));
        jPanel10.setForeground(new java.awt.Color(204, 0, 0));

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 420, Short.MAX_VALUE)
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 102, 0)));
        jPanel1.setForeground(new java.awt.Color(0, 102, 0));
        jPanel1.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jPanel1MouseDragged(evt);
            }
        });
        jPanel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanel1MousePressed(evt);
            }
        });
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabelcid.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabelcid.setForeground(new java.awt.Color(255, 255, 255));
        jLabelcid.setText("CATAGORY ID:");
        jPanel1.add(jLabelcid, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 150, -1, -1));

        jLabelcname.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabelcname.setForeground(new java.awt.Color(255, 255, 255));
        jLabelcname.setText("CATAGORY NAME:");
        jPanel1.add(jLabelcname, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 210, -1, -1));

        jTextFieldcatid.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jTextFieldcatid.setForeground(new java.awt.Color(0, 102, 0));
        jPanel1.add(jTextFieldcatid, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 150, 149, -1));

        jTextFieldcatname.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jTextFieldcatname.setForeground(new java.awt.Color(0, 102, 0));
        jPanel1.add(jTextFieldcatname, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 210, 149, -1));

        jTablecatagorylist.setBackground(new java.awt.Color(0, 102, 102));
        jTablecatagorylist.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0)));
        jTablecatagorylist.setForeground(new java.awt.Color(255, 255, 255));
        jTablecatagorylist.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "CATID", "CATNAME"
            }
        ));
        jTablecatagorylist.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTablecatagorylistMouseClicked(evt);
            }
        });
        catagorylist.setViewportView(jTablecatagorylist);

        jPanel1.add(catagorylist, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 370, 318, 75));

        catagory.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        catagory.setForeground(new java.awt.Color(255, 255, 255));
        catagory.setText("Catagory list");
        jPanel1.add(catagory, new org.netbeans.lib.awtextra.AbsoluteConstraints(201, 334, -1, -1));

        jButtonadd.setBackground(new java.awt.Color(0, 102, 102));
        jButtonadd.setForeground(new java.awt.Color(255, 255, 255));
        jButtonadd.setText("ADD");
        jButtonadd.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButtonaddMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButtonaddMouseExited(evt);
            }
        });
        jButtonadd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonaddActionPerformed(evt);
            }
        });
        jPanel1.add(jButtonadd, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 270, 60, 20));

        jButtonupdate.setBackground(new java.awt.Color(0, 102, 102));
        jButtonupdate.setForeground(new java.awt.Color(255, 255, 255));
        jButtonupdate.setText("UPDATE");
        jButtonupdate.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButtonupdateMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButtonupdateMouseExited(evt);
            }
        });
        jButtonupdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonupdateActionPerformed(evt);
            }
        });
        jPanel1.add(jButtonupdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 270, -1, 20));

        jButtondelete.setBackground(new java.awt.Color(0, 102, 102));
        jButtondelete.setForeground(new java.awt.Color(255, 255, 255));
        jButtondelete.setText("DELETE");
        jButtondelete.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButtondeleteMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButtondeleteMouseExited(evt);
            }
        });
        jButtondelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtondeleteActionPerformed(evt);
            }
        });
        jPanel1.add(jButtondelete, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 270, -1, 20));

        jButtonclear.setBackground(new java.awt.Color(0, 102, 102));
        jButtonclear.setForeground(new java.awt.Color(255, 255, 255));
        jButtonclear.setText("CLEAR");
        jButtonclear.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButtonclearMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButtonclearMouseExited(evt);
            }
        });
        jButtonclear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonclearActionPerformed(evt);
            }
        });
        jPanel1.add(jButtonclear, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 270, -1, 20));

        jPanel3.setBackground(new java.awt.Color(255, 0, 0));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("x");
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("max");
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
        });

        jLabelmin.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabelmin.setForeground(new java.awt.Color(255, 255, 255));
        jLabelmin.setText("min");
        jLabelmin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelminMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(0, 400, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addComponent(jLabelmin)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(jLabel2)
                .addComponent(jLabel3)
                .addComponent(jLabelmin))
        );

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(1, 1, 510, -1));

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));
        jPanel5.setForeground(new java.awt.Color(204, 0, 0));

        jLabelback.setBackground(new java.awt.Color(0, 102, 0));
        jLabelback.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabelback.setText("Back");
        jLabelback.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelbackMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabelbackMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabelbackMouseExited(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap(466, Short.MAX_VALUE)
                .addComponent(jLabelback)
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabelback))
        );

        jPanel1.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 20, 510, 20));

        jPanel6.setBackground(new java.awt.Color(0, 204, 204));
        jPanel6.setForeground(new java.awt.Color(204, 0, 0));

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 460, Short.MAX_VALUE)
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 100, 460, 10));

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setForeground(new java.awt.Color(204, 0, 0));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 460, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 320, 460, 10));

        jPanel9.setBackground(new java.awt.Color(204, 0, 0));
        jPanel9.setForeground(new java.awt.Color(204, 0, 0));

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 420, Short.MAX_VALUE)
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 530, 420, 10));

        jPanel7.setBackground(new java.awt.Color(204, 0, 0));
        jPanel7.setForeground(new java.awt.Color(204, 0, 0));

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 460, Short.MAX_VALUE)
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 470, 460, 10));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Welcome !");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 60, -1, -1));

        jPanel8.setBackground(new java.awt.Color(255, 0, 0));

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 460, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 40, 460));

        javax.swing.GroupLayout jPanel14Layout = new javax.swing.GroupLayout(jPanel14);
        jPanel14.setLayout(jPanel14Layout);
        jPanel14Layout.setHorizontalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 28, Short.MAX_VALUE)
        );
        jPanel14Layout.setVerticalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel15Layout = new javax.swing.GroupLayout(jPanel15);
        jPanel15.setLayout(jPanel15Layout);
        jPanel15Layout.setHorizontalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 42, Short.MAX_VALUE)
        );
        jPanel15Layout.setVerticalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel13Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(65, 65, 65)
                .addComponent(jPanel14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(84, 84, 84))
        );
        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 360, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 40, 10, 460));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 509, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 496, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonaddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonaddActionPerformed
   try{
                    conn = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/pharmacy","root","");
                    String query = "INSERT INTO `catagory`(`CATID`, `CATNAME`) VALUES (?, ?)";
                    pst=conn.prepareStatement(query);
                    pst.setString(1, jTextFieldcatid.getText());
                    pst.setString(2, jTextFieldcatname.getText());
                    int row = pst.executeUpdate();
                    catagorylist();
                     JOptionPane.showMessageDialog(null,"sucessfully addeded.");
                }
                
                    catch(Exception exp)
                    {
                     JOptionPane.showMessageDialog(null,exp);
                    }       
             
    }//GEN-LAST:event_jButtonaddActionPerformed

    private void jButtonupdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonupdateActionPerformed
      if (jTextFieldcatid.getText().isEmpty() || jTextFieldcatname.getText().isEmpty()) {
        JOptionPane.showMessageDialog(this, "Missing information.");
        } else {
            try {
             
                conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/pharmacy", "root", "");
                  String UpdateQuery = "Update pharmacy.catagory set CATNAME='"+jTextFieldcatname.getText()+"'"+"where CATID="+jTextFieldcatid.getText();
                Statement smt=conn.createStatement();
                smt.executeUpdate(UpdateQuery);
                catagorylist();
                JOptionPane.showMessageDialog(this, "updated successfully.");
            } catch (SQLException exp) {
                exp.printStackTrace();
            }

        }
    }//GEN-LAST:event_jButtonupdateActionPerformed

    private void jButtonclearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonclearActionPerformed
        jTextFieldcatid.setText(null);
        jTextFieldcatname.setText(null);
    }//GEN-LAST:event_jButtonclearActionPerformed

    private void jButtondeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtondeleteActionPerformed
        if (jTextFieldcatid.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Enter the company id to be deleted.");
        } else {
            try {
                conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/pharmacy", "root", "");
                String CATID = jTextFieldcatid.getText();
                String Deletequery = "Delete from pharmacy.catagory where CATID =" +CATID;
                Statement delete = conn.createStatement();
                delete.executeUpdate(Deletequery);
                catagorylist();
                                           
                JOptionPane.showMessageDialog(this, "Deleted successfully");
            } catch (SQLException exp) {
                exp.printStackTrace();
            }
        }
    }//GEN-LAST:event_jButtondeleteActionPerformed

    private void jTablecatagorylistMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTablecatagorylistMouseClicked
        DefaultTableModel model = (DefaultTableModel) jTablecatagorylist.getModel();
        int Myindex = jTablecatagorylist.getSelectedRow();
        jTextFieldcatid.setText(model.getValueAt(Myindex, 0).toString());
        jTextFieldcatname.setText(model.getValueAt(Myindex, 1).toString());
        catagorylist();
    }//GEN-LAST:event_jTablecatagorylistMouseClicked

    private void jLabelbackMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelbackMouseClicked
      Adminhome obj=new Adminhome();
      obj.setVisible(true);
      dispose();
    }//GEN-LAST:event_jLabelbackMouseClicked

    private void jButtonaddMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonaddMouseEntered
    jButtonadd.setForeground(Color.WHITE);
    jButtonadd.setBackground(new Color(0,102,102));
    jButtonadd.setBorder(new LineBorder(new Color(255,102,0), 1, true));     
    }//GEN-LAST:event_jButtonaddMouseEntered

    private void jButtonaddMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonaddMouseExited
    jButtonadd.setForeground(new Color(0,102,102));
    jButtonadd.setBackground(Color.YELLOW);
    jButtonadd.setBorder(new LineBorder(Color.WHITE, 1, true));   
    }//GEN-LAST:event_jButtonaddMouseExited

    private void jButtonupdateMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonupdateMouseEntered
    jButtonupdate.setForeground(Color.WHITE);
    jButtonupdate.setBackground(new Color(0,102,102));
    jButtonupdate.setBorder(new LineBorder(new Color(255,102,0), 1, true));     
    }//GEN-LAST:event_jButtonupdateMouseEntered

    private void jButtonupdateMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonupdateMouseExited
    jButtonupdate.setForeground(new Color(0,102,102));
    jButtonupdate.setBackground(Color.YELLOW);
    jButtonupdate.setBorder(new LineBorder(Color.WHITE, 1, true));   
    }//GEN-LAST:event_jButtonupdateMouseExited

    private void jButtondeleteMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtondeleteMouseEntered
    jButtondelete.setForeground(Color.WHITE);
    jButtondelete.setBackground(new Color(0,102,102));
    jButtondelete.setBorder(new LineBorder(new Color(255,102,0), 1, true));  
    }//GEN-LAST:event_jButtondeleteMouseEntered

    private void jButtondeleteMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtondeleteMouseExited
    jButtondelete.setForeground(new Color(0,102,102));
    jButtondelete.setBackground(Color.YELLOW);
    jButtondelete.setBorder(new LineBorder(Color.WHITE, 1, true)); 
    }//GEN-LAST:event_jButtondeleteMouseExited

    private void jButtonclearMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonclearMouseEntered
    jButtonclear.setForeground(Color.WHITE);
    jButtonclear.setBackground(new Color(0,102,102));
    jButtonclear.setBorder(new LineBorder(new Color(255,102,0), 1, true));  
    }//GEN-LAST:event_jButtonclearMouseEntered

    private void jButtonclearMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonclearMouseExited
    jButtonclear.setForeground(new Color(0,102,102));
    jButtonclear.setBackground(Color.YELLOW);
    jButtonclear.setBorder(new LineBorder(Color.WHITE, 1, true));
    }//GEN-LAST:event_jButtonclearMouseExited

    private void jLabelbackMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelbackMouseEntered
    jLabelback.setForeground(Color.red);
    jLabelback.setBackground(new Color(0,102,0));
    jLabelback.setBorder(new LineBorder(new Color(255,102,0), 1, true));
    }//GEN-LAST:event_jLabelbackMouseEntered

    private void jLabelbackMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelbackMouseExited
    jLabelback.setForeground(new Color(0,102,0));
    jLabelback.setBackground(Color.YELLOW);
    jLabelback.setBorder(new LineBorder(Color.WHITE, 1, true));
    }//GEN-LAST:event_jLabelbackMouseExited

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        System.exit(0);
    }//GEN-LAST:event_jLabel2MouseClicked

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
        /*if(getExtendedState()!=Login.MAXIMIZED_BOTH)
        {
            this.setExtendedState(Login.MAXIMIZED_BOTH);
        }else{
            this.setExtendedState(Login.NORMAL);
        }*/
    }//GEN-LAST:event_jLabel3MouseClicked

    private void jLabelminMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelminMouseClicked
        /*this.setExtendedState(Login.ICONIFIED);*/
    }//GEN-LAST:event_jLabelminMouseClicked

    private void jPanel1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MousePressed
    xmouse=evt.getX();
    ymouse=evt.getY(); 
    }//GEN-LAST:event_jPanel1MousePressed

    private void jPanel1MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MouseDragged
     int x=evt.getXOnScreen();
     int y=evt.getYOnScreen();
     setLocation(x-xmouse, y-ymouse);
    }//GEN-LAST:event_jPanel1MouseDragged
    private int xmouse, ymouse;
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
         new Catagory().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel catagory;
    private javax.swing.JScrollPane catagorylist;
    private javax.swing.JButton jButtonadd;
    private javax.swing.JButton jButtonclear;
    private javax.swing.JButton jButtondelete;
    private javax.swing.JButton jButtonupdate;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabelback;
    private javax.swing.JLabel jLabelcid;
    private javax.swing.JLabel jLabelcname;
    private javax.swing.JLabel jLabelmin;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTablecatagorylist;
    private javax.swing.JTextField jTextFieldcatid;
    private javax.swing.JTextField jTextFieldcatname;
    // End of variables declaration//GEN-END:variables
}
