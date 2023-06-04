package pharmacy;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.Image;
import java.sql.*;
import javax.swing.JOptionPane;
import java.sql.Connection;
import java.sql.PreparedStatement;
import javax.swing.ImageIcon;
import javax.swing.border.LineBorder;
public class Login extends javax.swing.JFrame {
    Connection conn=null;
    
    public Login() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setOpacity(0.8f);

        imageicon();
        
    }
    public void imageicon()
    {
        ImageIcon i=new ImageIcon(ClassLoader.getSystemResource("icon/d.png"));
        Image img=i.getImage();
        Image imageScale=img.getScaledInstance(logo.getWidth(), logo.getHeight(), Image.SCALE_SMOOTH);    
        ImageIcon scaledIcon=new ImageIcon(imageScale);
        logo.setIcon(scaledIcon);
        
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        jPanel3 = new javax.swing.JPanel();
        jLabeluertypeselect = new javax.swing.JLabel();
        jComboBoxuserselection = new javax.swing.JComboBox<>();
        jLabelusername = new javax.swing.JLabel();
        jLabelpassword = new javax.swing.JLabel();
        jButtonsignin = new javax.swing.JButton();
        jButtonforgotpassword = new javax.swing.JButton();
        jLabeldonthaveacccount = new javax.swing.JLabel();
        jTextFieldusername = new javax.swing.JTextField();
        jPasswordFieldpassword = new javax.swing.JPasswordField();
        jButtonregister = new javax.swing.JButton();
        jButtonclear = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabelmin = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        logo = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel3.setBackground(new java.awt.Color(0, 0, 0));
        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 204, 0)));
        jPanel3.setForeground(new java.awt.Color(51, 153, 0));
        jPanel3.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jPanel3MouseDragged(evt);
            }
        });
        jPanel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanel3MousePressed(evt);
            }
        });
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabeluertypeselect.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabeluertypeselect.setForeground(new java.awt.Color(255, 255, 255));
        jLabeluertypeselect.setText(" USER TYPE :");
        jPanel3.add(jLabeluertypeselect, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 140, -1, -1));

        jComboBoxuserselection.setBackground(new java.awt.Color(0, 102, 0));
        jComboBoxuserselection.setForeground(new java.awt.Color(255, 255, 255));
        jComboBoxuserselection.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "ADMIN", "USER" }));
        jPanel3.add(jComboBoxuserselection, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 140, 124, -1));

        jLabelusername.setBackground(new java.awt.Color(153, 0, 0));
        jLabelusername.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabelusername.setForeground(new java.awt.Color(255, 255, 255));
        jLabelusername.setText("USERNAME:");
        jPanel3.add(jLabelusername, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 190, -1, -1));

        jLabelpassword.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabelpassword.setForeground(new java.awt.Color(255, 255, 255));
        jLabelpassword.setText("PASSWORD:");
        jPanel3.add(jLabelpassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 240, -1, -1));

        jButtonsignin.setBackground(new java.awt.Color(0, 102, 0));
        jButtonsignin.setForeground(new java.awt.Color(255, 255, 255));
        jButtonsignin.setText("SIGNIN");
        jButtonsignin.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonsignin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonsigninMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButtonsigninMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButtonsigninMouseExited(evt);
            }
        });
        jButtonsignin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonsigninActionPerformed(evt);
            }
        });
        jPanel3.add(jButtonsignin, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 290, 80, -1));

        jButtonforgotpassword.setBackground(new java.awt.Color(0, 102, 0));
        jButtonforgotpassword.setForeground(new java.awt.Color(255, 255, 255));
        jButtonforgotpassword.setText("FORGOT PASSWORD");
        jButtonforgotpassword.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonforgotpassword.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jButtonforgotpasswordMouseMoved(evt);
            }
        });
        jButtonforgotpassword.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonforgotpasswordMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButtonforgotpasswordMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButtonforgotpasswordMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jButtonforgotpasswordMousePressed(evt);
            }
        });
        jPanel3.add(jButtonforgotpassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 340, 190, -1));

        jLabeldonthaveacccount.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabeldonthaveacccount.setForeground(new java.awt.Color(255, 255, 255));
        jLabeldonthaveacccount.setText("IF YOU DON'T HAVE ACCCOUNT ???");
        jPanel3.add(jLabeldonthaveacccount, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 380, 241, -1));

        jTextFieldusername.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jTextFieldusername.setForeground(new java.awt.Color(0, 102, 0));
        jPanel3.add(jTextFieldusername, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 190, 187, -1));

        jPasswordFieldpassword.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jPasswordFieldpassword.setForeground(new java.awt.Color(0, 102, 0));
        jPanel3.add(jPasswordFieldpassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 240, 187, -1));

        jButtonregister.setBackground(new java.awt.Color(0, 102, 0));
        jButtonregister.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jButtonregister.setForeground(new java.awt.Color(255, 255, 255));
        jButtonregister.setText("Register");
        jButtonregister.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonregister.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonregisterMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButtonregisterMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButtonregisterMouseExited(evt);
            }
        });
        jButtonregister.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonregisterActionPerformed(evt);
            }
        });
        jPanel3.add(jButtonregister, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 410, -1, -1));

        jButtonclear.setBackground(new java.awt.Color(0, 102, 0));
        jButtonclear.setForeground(new java.awt.Color(255, 255, 255));
        jButtonclear.setText("CLEAR");
        jButtonclear.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonclear.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonclearMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButtonclearMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButtonclearMouseExited(evt);
            }
        });
        jPanel3.add(jButtonclear, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 290, 90, -1));

        jPanel1.setBackground(new java.awt.Color(255, 0, 0));
        jPanel1.setForeground(new java.awt.Color(255, 0, 0));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("max");
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
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

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("X");
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(556, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabelmin)
                .addGap(27, 27, 27)
                .addComponent(jLabel2)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabelmin)
                    .addComponent(jLabel2)))
        );

        jPanel3.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1, 1, 670, -1));

        jPanel2.setBackground(new java.awt.Color(255, 0, 0));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 0, 204)));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("\"Welcome to e-Pharmacy\"");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel4)
                .addGap(71, 71, 71))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(logo, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(96, 96, 96)
                .addComponent(logo, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(jLabel4)
                .addContainerGap(174, Short.MAX_VALUE))
        );

        jPanel3.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 240, 450));

        jPanel4.setBackground(new java.awt.Color(204, 0, 0));
        jPanel4.setForeground(new java.awt.Color(204, 0, 0));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );

        jPanel3.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 460, 400, 10));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 2, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Welcome Back !");
        jPanel3.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 60, -1, -1));

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));
        jPanel5.setForeground(new java.awt.Color(204, 0, 0));

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 680, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );

        jPanel3.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 20, 680, 20));

        jPanel6.setBackground(new java.awt.Color(0, 204, 204));
        jPanel6.setForeground(new java.awt.Color(204, 0, 0));

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );

        jPanel3.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 100, 400, 10));

        jPanel7.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 450, Short.MAX_VALUE)
        );

        jPanel3.add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 40, 30, 450));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 672, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonforgotpasswordMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonforgotpasswordMouseClicked

    }//GEN-LAST:event_jButtonforgotpasswordMouseClicked

    
    private void jButtonsigninActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonsigninActionPerformed
       PreparedStatement pst;
       ResultSet rs;
       String USERNAME =jTextFieldusername.getText();
       String PASSWORD =String.valueOf(jPasswordFieldpassword.getText());
       String USERTYPE=jComboBoxuserselection.getSelectedItem().toString();
       String query = "SELECT * FROM `register` WHERE `USERNMAE`=? AND `PASSWORD`=? AND `USERTYPE`=?";
        
        try{
                    pst=Jdbc1connection.getConnection().prepareStatement(query);
                    pst.setString(1, USERNAME );
                    pst.setString(2, PASSWORD );
                    pst.setString(3, USERTYPE);
                    rs=pst.executeQuery();
                   
                    if(rs.next())
                    {
                        JOptionPane.showMessageDialog(this,"you are successfully login" );
                        if(jComboBoxuserselection.getSelectedIndex()==0)
                        {
                            Adminhome obj=new Adminhome();
                            obj.setVisible(true);
                            dispose();
                       }
                        else{
                            Userhome obj=new Userhome();
                            obj.setVisible(true);
                            dispose();
                        }
                            
                        }
                        else{
                                
                                
                        JOptionPane.showMessageDialog(this,"Incorrect username and password");
                    }
                    
                    }
                    catch(SQLException exp)
                    {
                    JOptionPane.showMessageDialog(this,exp);
                    }
                                     
    }//GEN-LAST:event_jButtonsigninActionPerformed

    private void jButtonregisterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonregisterActionPerformed
        jTextFieldusername.setText(null);   
        jPasswordFieldpassword.setText(null);
  
    }//GEN-LAST:event_jButtonregisterActionPerformed

    private void jButtonregisterMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonregisterMouseClicked
     Register obj=new Register();
     obj.setVisible(true);
     dispose();
    }//GEN-LAST:event_jButtonregisterMouseClicked

    private void jButtonforgotpasswordMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonforgotpasswordMouseMoved
      jButtonforgotpassword.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
    }//GEN-LAST:event_jButtonforgotpasswordMouseMoved

    private void jButtonforgotpasswordMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonforgotpasswordMousePressed
      Forgotpassword obj=new Forgotpassword();
        obj.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButtonforgotpasswordMousePressed

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        System.exit(0);
    }//GEN-LAST:event_jLabel2MouseClicked

    private void jButtonclearMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonclearMouseClicked
     jTextFieldusername.setText(null);   
     jPasswordFieldpassword.setText(null);
    }//GEN-LAST:event_jButtonclearMouseClicked

    private void jButtonsigninMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonsigninMouseClicked
    }//GEN-LAST:event_jButtonsigninMouseClicked

    private void jButtonsigninMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonsigninMouseEntered
    jButtonsignin.setForeground(Color.WHITE);
    jButtonsignin.setBackground(new Color(0,102,102));
    jButtonsignin.setBorder(new LineBorder(new Color(255,102,0), 1, true));  
    }//GEN-LAST:event_jButtonsigninMouseEntered

    private void jButtonsigninMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonsigninMouseExited
    jButtonsignin.setForeground(new Color(0,102,102));
    jButtonsignin.setBackground(Color.YELLOW);
    jButtonsignin.setBorder(new LineBorder(Color.WHITE, 1, true));
    }//GEN-LAST:event_jButtonsigninMouseExited

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

    private void jButtonforgotpasswordMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonforgotpasswordMouseEntered
    jButtonforgotpassword.setForeground(Color.WHITE);
    jButtonforgotpassword.setBackground(new Color(0,102,102));
    jButtonforgotpassword.setBorder(new LineBorder(new Color(255,102,0), 1, true)); 
    }//GEN-LAST:event_jButtonforgotpasswordMouseEntered

    private void jButtonforgotpasswordMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonforgotpasswordMouseExited
    jButtonforgotpassword.setForeground(new Color(0,102,102));
    jButtonforgotpassword.setBackground(Color.YELLOW);
    jButtonforgotpassword.setBorder(new LineBorder(Color.WHITE, 1, true));
    }//GEN-LAST:event_jButtonforgotpasswordMouseExited

    private void jButtonregisterMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonregisterMouseEntered
    jButtonregister.setForeground(Color.WHITE);
    jButtonregister.setBackground(new Color(0,102,102));
    jButtonregister.setBorder(new LineBorder(new Color(255,102,0), 1, true)); 
    }//GEN-LAST:event_jButtonregisterMouseEntered

    private void jButtonregisterMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonregisterMouseExited
    jButtonregister.setForeground(new Color(0,102,102));
    jButtonregister.setBackground(Color.YELLOW);
    jButtonregister.setBorder(new LineBorder(Color.WHITE, 1, true));
    }//GEN-LAST:event_jButtonregisterMouseExited
    private int xmouse, ymouse;
    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
     if(getExtendedState()!=Login.MAXIMIZED_BOTH)
     {
      this.setExtendedState(Login.MAXIMIZED_BOTH);
     }else{
         this.setExtendedState(Login.NORMAL);
     }
    }//GEN-LAST:event_jLabel1MouseClicked

    private void jLabelminMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelminMouseClicked
      /*this.setExtendedState(Login.ICONIFIED);*/
    }//GEN-LAST:event_jLabelminMouseClicked

    private void jPanel3MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel3MouseDragged
    int x=evt.getXOnScreen();
     int y=evt.getYOnScreen();
     setLocation(x-xmouse, y-ymouse); 
    }//GEN-LAST:event_jPanel3MouseDragged

    private void jPanel3MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel3MousePressed
    xmouse=evt.getX();
    ymouse=evt.getY();
    }//GEN-LAST:event_jPanel3MousePressed

    public static void main(String args[]) {
       
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonclear;
    private javax.swing.JButton jButtonforgotpassword;
    private javax.swing.JButton jButtonregister;
    private javax.swing.JButton jButtonsignin;
    private javax.swing.JComboBox<String> jComboBoxuserselection;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabeldonthaveacccount;
    private javax.swing.JLabel jLabelmin;
    private javax.swing.JLabel jLabelpassword;
    private javax.swing.JLabel jLabeluertypeselect;
    private javax.swing.JLabel jLabelusername;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPasswordField jPasswordFieldpassword;
    private javax.swing.JTextField jTextFieldusername;
    private javax.swing.JLabel logo;
    // End of variables declaration//GEN-END:variables
}
