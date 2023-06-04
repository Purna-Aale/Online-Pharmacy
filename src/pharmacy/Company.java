
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

public class Company extends javax.swing.JFrame {
    Connection conn=null;
    PreparedStatement pst=null;
    public Company() {
        initComponents();
        this.setLocationRelativeTo(null);
        //this.setOpacity(0.8f);
        //imageicon();
        companylist();
    }
     public void companylist() {
        try {
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/pharmacy", "root", "");
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery("select * from companymanage");
            companylist.setModel(DbUtils.resultSetToTableModel(rs));
        } catch (SQLException exp) {
            exp.printStackTrace();
        }

    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabelid = new javax.swing.JLabel();
        jLabelname = new javax.swing.JLabel();
        jLabeladdress = new javax.swing.JLabel();
        jLabelexperience = new javax.swing.JLabel();
        jLabelphonenbr = new javax.swing.JLabel();
        jTextFieldid = new javax.swing.JTextField();
        jTextFieldname = new javax.swing.JTextField();
        jTextFieldaddress = new javax.swing.JTextField();
        jTextFieldexperience = new javax.swing.JTextField();
        jTextFieldphonenbr = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        companylist = new javax.swing.JTable();
        jButtonadd = new javax.swing.JButton();
        jButtonupdate = new javax.swing.JButton();
        jButtondelete = new javax.swing.JButton();
        jButtonclear = new javax.swing.JButton();
        jLabelcompanylist = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabelmin = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabelback = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        jPanel13 = new javax.swing.JPanel();
        jPanel14 = new javax.swing.JPanel();
        jPanel15 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jPanel9 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 102, 0)));
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

        jLabelid.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabelid.setForeground(new java.awt.Color(255, 255, 255));
        jLabelid.setText("ID:");
        jPanel1.add(jLabelid, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 160, -1, -1));

        jLabelname.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabelname.setForeground(new java.awt.Color(255, 255, 255));
        jLabelname.setText("NAME:");
        jPanel1.add(jLabelname, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 220, -1, -1));

        jLabeladdress.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabeladdress.setForeground(new java.awt.Color(255, 255, 255));
        jLabeladdress.setText("ADDRESS:");
        jPanel1.add(jLabeladdress, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 280, -1, -1));

        jLabelexperience.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabelexperience.setForeground(new java.awt.Color(255, 255, 255));
        jLabelexperience.setText("EXPERIENCE:");
        jPanel1.add(jLabelexperience, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 210, -1, -1));

        jLabelphonenbr.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabelphonenbr.setForeground(new java.awt.Color(255, 255, 255));
        jLabelphonenbr.setText("PHONE NBR:");
        jPanel1.add(jLabelphonenbr, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 266, -1, -1));

        jTextFieldid.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jTextFieldid.setForeground(new java.awt.Color(0, 102, 0));
        jTextFieldid.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextFieldidKeyTyped(evt);
            }
        });
        jPanel1.add(jTextFieldid, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 160, 140, -1));

        jTextFieldname.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jTextFieldname.setForeground(new java.awt.Color(0, 102, 0));
        jTextFieldname.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextFieldnameKeyPressed(evt);
            }
        });
        jPanel1.add(jTextFieldname, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 220, 140, -1));

        jTextFieldaddress.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jTextFieldaddress.setForeground(new java.awt.Color(0, 102, 0));
        jTextFieldaddress.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextFieldaddressKeyPressed(evt);
            }
        });
        jPanel1.add(jTextFieldaddress, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 280, 140, -1));

        jTextFieldexperience.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jTextFieldexperience.setForeground(new java.awt.Color(0, 102, 0));
        jTextFieldexperience.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextFieldexperienceKeyTyped(evt);
            }
        });
        jPanel1.add(jTextFieldexperience, new org.netbeans.lib.awtextra.AbsoluteConstraints(516, 207, 146, -1));

        jTextFieldphonenbr.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jTextFieldphonenbr.setForeground(new java.awt.Color(0, 102, 0));
        jTextFieldphonenbr.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextFieldphonenbrKeyPressed(evt);
            }
        });
        jPanel1.add(jTextFieldphonenbr, new org.netbeans.lib.awtextra.AbsoluteConstraints(516, 263, 146, -1));

        companylist.setBackground(new java.awt.Color(0, 102, 102));
        companylist.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0)));
        companylist.setForeground(new java.awt.Color(255, 255, 255));
        companylist.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "COMID", "COMNAME", "COMADDRESS", "COMEXPERIENCE", "COMPHONENBR"
            }
        ));
        companylist.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                companylistMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(companylist);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 460, 623, 95));

        jButtonadd.setBackground(new java.awt.Color(0, 102, 0));
        jButtonadd.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
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
        jPanel1.add(jButtonadd, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 350, -1, 20));

        jButtonupdate.setBackground(new java.awt.Color(0, 102, 0));
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
        jPanel1.add(jButtonupdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 350, -1, 20));

        jButtondelete.setBackground(new java.awt.Color(0, 102, 0));
        jButtondelete.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
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
        jPanel1.add(jButtondelete, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 350, -1, 20));

        jButtonclear.setBackground(new java.awt.Color(0, 102, 0));
        jButtonclear.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
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
        jPanel1.add(jButtonclear, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 350, -1, 20));

        jLabelcompanylist.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabelcompanylist.setForeground(new java.awt.Color(255, 255, 255));
        jLabelcompanylist.setText("COMPANYLIST");
        jPanel1.add(jLabelcompanylist, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 430, -1, -1));

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
                .addGap(0, 661, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addComponent(jLabelmin)
                .addGap(31, 31, 31)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(jLabel2)
                .addComponent(jLabel3)
                .addComponent(jLabelmin))
        );

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(1, 1, 780, 20));

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
                .addContainerGap(736, Short.MAX_VALUE)
                .addComponent(jLabelback)
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabelback))
        );

        jPanel1.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 20, 780, 20));

        jPanel8.setBackground(new java.awt.Color(255, 0, 0));

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 570, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 50, 570));

        jPanel13.setBackground(new java.awt.Color(255, 255, 255));

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
                .addGap(0, 470, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 40, 10, 570));

        jLabel4.setFont(new java.awt.Font("Viner Hand ITC", 3, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("welcome !");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 50, -1, -1));

        jPanel6.setBackground(new java.awt.Color(0, 204, 204));
        jPanel6.setForeground(new java.awt.Color(204, 0, 0));

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 720, Short.MAX_VALUE)
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 100, 720, 10));

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setForeground(new java.awt.Color(204, 0, 0));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 740, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 400, 740, 10));

        jPanel9.setBackground(new java.awt.Color(204, 0, 0));
        jPanel9.setForeground(new java.awt.Color(204, 0, 0));

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 720, Short.MAX_VALUE)
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 570, 720, 10));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("MANAGE COMPANY");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 120, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 779, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 597, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonclearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonclearActionPerformed
        jTextFieldid.setText(null);
        jTextFieldname.setText(null);
        jTextFieldaddress.setText(null);
        jTextFieldexperience.setText(null);
        jTextFieldphonenbr.setText(null);
    }//GEN-LAST:event_jButtonclearActionPerformed

    private void jButtondeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtondeleteActionPerformed
        if (jTextFieldid.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Enter the company id to be deleted.");
        } else {
            try {
                conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/pharmacy", "root", "");
                String COMID = jTextFieldid.getText();
                String Deletequery = "Delete from pharmacy.companymanage where COMID =" +COMID;
                Statement delete = conn.createStatement();
                delete.executeUpdate(Deletequery);
                companylist();
                JOptionPane.showMessageDialog(this, "Deleted successfully");
            } catch (SQLException exp) {
                exp.printStackTrace();
            }
        }
    }//GEN-LAST:event_jButtondeleteActionPerformed

    private void jButtonupdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonupdateActionPerformed
        if (jTextFieldid.getText().isEmpty() || jTextFieldname.getText().isEmpty() || jTextFieldaddress.getText().isEmpty() || jTextFieldexperience.getText().isEmpty()|| jTextFieldphonenbr.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Missing information.");
        } else {
            try {

                conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/pharmacy", "root", "");
                String UpdateQuery = "Update pharmacy.companymanage set COMNAME='"+jTextFieldname.getText()+"'"+",COMADDRESS='"+jTextFieldaddress.getText()+"'"+",COMEXPERIENCE='"+jTextFieldexperience.getText()+"'"+",COMPHONENBR='"+jTextFieldphonenbr.getText()+"'"+"where COMID="+jTextFieldid.getText();
                Statement smt=conn.createStatement();
                smt.executeUpdate(UpdateQuery);
                companylist();
                JOptionPane.showMessageDialog(this, "updated successfully.");
            } catch (SQLException exp) {
                exp.printStackTrace();
            }

        }
    }//GEN-LAST:event_jButtonupdateActionPerformed

    private void jButtonaddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonaddActionPerformed
        try{
            conn = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/pharmacy","root","");
            String query = "INSERT INTO `companymanage`(`COMID`, `COMNAME`, `COMADDRESS`, `COMEXPERIENCE`, `COMPHONENBR`) VALUES (?, ?, ?,?,?)";
            pst=conn.prepareStatement(query);
            pst.setString(1, jTextFieldid.getText());
            pst.setString(2, jTextFieldname.getText());
            pst.setString(3, jTextFieldaddress.getText());
            pst.setString(4, jTextFieldexperience.getText());
            pst.setString(5, jTextFieldphonenbr.getText());
            int row = pst.executeUpdate();
            companylist();
            JOptionPane.showMessageDialog(null,"sucessfully addeded.");
        }

        catch(Exception exp)
        {
            JOptionPane.showMessageDialog(null,exp);
        }
    }//GEN-LAST:event_jButtonaddActionPerformed

    private void companylistMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_companylistMouseClicked
        DefaultTableModel model = (DefaultTableModel) companylist.getModel();
        int Myindex = companylist.getSelectedRow();
        jTextFieldid.setText(model.getValueAt(Myindex, 0).toString());
        jTextFieldname.setText(model.getValueAt(Myindex, 1).toString());
        jTextFieldaddress.setText(model.getValueAt(Myindex, 2).toString());
        jTextFieldexperience.setText(model.getValueAt(Myindex, 3).toString());
        jTextFieldphonenbr.setText(model.getValueAt(Myindex, 4).toString());
        companylist();
    }//GEN-LAST:event_companylistMouseClicked

    private void jTextFieldphonenbrKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldphonenbrKeyPressed
        String PHONENBR=jTextFieldphonenbr.getText();
        int length=PHONENBR.length();
        char c = evt.getKeyChar();
        if(evt.getKeyChar()>='0'&&evt.getKeyChar()<='9')
        {
            if(length<10)
            {
                jTextFieldphonenbr.setEditable(true);
            }
            else{
                jTextFieldphonenbr.setEditable(false);

            }
        }else{
            if(evt.getExtendedKeyCode()==KeyEvent.VK_BACK_SPACE ||evt.getExtendedKeyCode()==KeyEvent.VK_DELETE)
            {
                jTextFieldphonenbr.setEditable(true);
            }else{
                jTextFieldphonenbr.setEditable(false);
            }
        }

    }//GEN-LAST:event_jTextFieldphonenbrKeyPressed

    private void jTextFieldexperienceKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldexperienceKeyTyped
        char c = evt.getKeyChar();
        if(!Character.isDigit(c))
        {
            evt.consume();;
        }
    }//GEN-LAST:event_jTextFieldexperienceKeyTyped

    private void jTextFieldaddressKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldaddressKeyPressed
        char c = evt.getKeyChar();
        if(Character.isLetter(c)||Character.isWhitespace(c)||Character.isISOControl(c))
        {
            jTextFieldaddress.setEditable(true);
        }
        else{
            jTextFieldaddress.setEditable(false);

        }
    }//GEN-LAST:event_jTextFieldaddressKeyPressed

    private void jTextFieldnameKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldnameKeyPressed
        char c = evt.getKeyChar();
        if(Character.isLetter(c)||Character.isWhitespace(c)||Character.isISOControl(c))
        {
            jTextFieldname.setEditable(true);
        }
        else{
            jTextFieldname.setEditable(false);

        }
    }//GEN-LAST:event_jTextFieldnameKeyPressed

    private void jTextFieldidKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldidKeyTyped
        char c = evt.getKeyChar();
        if(!Character.isDigit(c))
        {
            evt.consume();;
        }
    }//GEN-LAST:event_jTextFieldidKeyTyped

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

    private void jLabelbackMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelbackMouseClicked

        Adminhome obj=new Adminhome();
        obj.setVisible(true);
        dispose();
    }//GEN-LAST:event_jLabelbackMouseClicked

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

    private void jPanel1MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MouseDragged
     int x=evt.getXOnScreen();
     int y=evt.getYOnScreen();
     setLocation(x-xmouse, y-ymouse); 
    }//GEN-LAST:event_jPanel1MouseDragged

    private void jPanel1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MousePressed
    xmouse=evt.getX();
    ymouse=evt.getY(); 
    }//GEN-LAST:event_jPanel1MousePressed
    private int xmouse, ymouse;
    public static void main(String args[]) {
               java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
         new Company().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable companylist;
    private javax.swing.JButton jButtonadd;
    private javax.swing.JButton jButtonclear;
    private javax.swing.JButton jButtondelete;
    private javax.swing.JButton jButtonupdate;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabeladdress;
    private javax.swing.JLabel jLabelback;
    private javax.swing.JLabel jLabelcompanylist;
    private javax.swing.JLabel jLabelexperience;
    private javax.swing.JLabel jLabelid;
    private javax.swing.JLabel jLabelmin;
    private javax.swing.JLabel jLabelname;
    private javax.swing.JLabel jLabelphonenbr;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextFieldaddress;
    private javax.swing.JTextField jTextFieldexperience;
    private javax.swing.JTextField jTextFieldid;
    private javax.swing.JTextField jTextFieldname;
    private javax.swing.JTextField jTextFieldphonenbr;
    // End of variables declaration//GEN-END:variables
}
