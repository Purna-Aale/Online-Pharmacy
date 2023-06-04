
package pharmacy;
import java.awt.Color;
import java.awt.Image;
import java.awt.event.KeyEvent;
import java.sql.*;
import javax.swing.JOptionPane;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.ImageIcon;
import javax.swing.border.LineBorder;
import static jdk.jfr.FlightRecorder.register;

public class Register extends javax.swing.JFrame {

    public Register() {
        initComponents();
        imageicon();
        this.setLocationRelativeTo(null);
        this.setOpacity(0.8f);

    }
    public void imageicon()
    {
        ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("icon/d.png"));
        Image img=i1.getImage();
        Image imageScale=img.getScaledInstance(logo.getWidth(), logo.getHeight(), Image.SCALE_SMOOTH);    
        ImageIcon scaledIcon=new ImageIcon(imageScale);
        logo.setIcon(scaledIcon);
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSlider1 = new javax.swing.JSlider();
        jPanel8 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabelfullname = new javax.swing.JLabel();
        jLabelusername = new javax.swing.JLabel();
        jLabelpassword = new javax.swing.JLabel();
        jLabelconfirmpassword = new javax.swing.JLabel();
        jLabelemail = new javax.swing.JLabel();
        jLabelphonenbr = new javax.swing.JLabel();
        jLabeladdress = new javax.swing.JLabel();
        jPasswordFieldpassword = new javax.swing.JPasswordField();
        jPasswordFieldcinfirmpassword = new javax.swing.JPasswordField();
        jTextFieldemail = new javax.swing.JTextField();
        jTextFieldphonenbr = new javax.swing.JTextField();
        jTextFieldaddress = new javax.swing.JTextField();
        jTextFieldfullname = new javax.swing.JTextField();
        jTextFieldusername = new javax.swing.JTextField();
        jButtonback = new javax.swing.JButton();
        jButtonsubmit = new javax.swing.JButton();
        jButtonclear = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabelmin = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        logo = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jPanel9 = new javax.swing.JPanel();

        jPanel8.setBackground(new java.awt.Color(204, 0, 0));
        jPanel8.setForeground(new java.awt.Color(204, 0, 0));

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );

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

        jLabelfullname.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabelfullname.setForeground(new java.awt.Color(255, 255, 255));
        jLabelfullname.setText("FULL NAME:");
        jPanel1.add(jLabelfullname, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 130, -1, -1));

        jLabelusername.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabelusername.setForeground(new java.awt.Color(255, 255, 255));
        jLabelusername.setText("USER NAME:");
        jPanel1.add(jLabelusername, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 180, -1, -1));

        jLabelpassword.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabelpassword.setForeground(new java.awt.Color(255, 255, 255));
        jLabelpassword.setText("PASSWORD:");
        jPanel1.add(jLabelpassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 230, -1, -1));

        jLabelconfirmpassword.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabelconfirmpassword.setForeground(new java.awt.Color(255, 255, 255));
        jLabelconfirmpassword.setText("CONFIRM PASS:");
        jPanel1.add(jLabelconfirmpassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 280, -1, -1));

        jLabelemail.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabelemail.setForeground(new java.awt.Color(255, 255, 255));
        jLabelemail.setText("EMAIL:");
        jPanel1.add(jLabelemail, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 320, -1, -1));

        jLabelphonenbr.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabelphonenbr.setForeground(new java.awt.Color(255, 255, 255));
        jLabelphonenbr.setText("PHONE NBR:");
        jPanel1.add(jLabelphonenbr, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 380, -1, -1));

        jLabeladdress.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabeladdress.setForeground(new java.awt.Color(255, 255, 255));
        jLabeladdress.setText("ADDRESS:");
        jPanel1.add(jLabeladdress, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 430, -1, -1));

        jPasswordFieldpassword.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jPasswordFieldpassword.setForeground(new java.awt.Color(0, 102, 0));
        jPanel1.add(jPasswordFieldpassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 230, 200, -1));

        jPasswordFieldcinfirmpassword.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jPasswordFieldcinfirmpassword.setForeground(new java.awt.Color(0, 102, 0));
        jPasswordFieldcinfirmpassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jPasswordFieldcinfirmpasswordActionPerformed(evt);
            }
        });
        jPanel1.add(jPasswordFieldcinfirmpassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 280, 200, -1));

        jTextFieldemail.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jTextFieldemail.setForeground(new java.awt.Color(0, 102, 0));
        jTextFieldemail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldemailActionPerformed(evt);
            }
        });
        jTextFieldemail.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextFieldemailKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextFieldemailKeyReleased(evt);
            }
        });
        jPanel1.add(jTextFieldemail, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 320, 200, -1));

        jTextFieldphonenbr.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jTextFieldphonenbr.setForeground(new java.awt.Color(0, 102, 0));
        jTextFieldphonenbr.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextFieldphonenbrKeyPressed(evt);
            }
        });
        jPanel1.add(jTextFieldphonenbr, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 370, 200, -1));

        jTextFieldaddress.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jTextFieldaddress.setForeground(new java.awt.Color(0, 102, 0));
        jTextFieldaddress.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextFieldaddressKeyPressed(evt);
            }
        });
        jPanel1.add(jTextFieldaddress, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 430, 200, -1));

        jTextFieldfullname.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jTextFieldfullname.setForeground(new java.awt.Color(0, 102, 0));
        jTextFieldfullname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldfullnameActionPerformed(evt);
            }
        });
        jTextFieldfullname.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextFieldfullnameKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextFieldfullnameKeyReleased(evt);
            }
        });
        jPanel1.add(jTextFieldfullname, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 130, 200, -1));

        jTextFieldusername.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jTextFieldusername.setForeground(new java.awt.Color(0, 102, 0));
        jTextFieldusername.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldusernameActionPerformed(evt);
            }
        });
        jPanel1.add(jTextFieldusername, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 180, 200, -1));

        jButtonback.setBackground(new java.awt.Color(0, 102, 102));
        jButtonback.setForeground(new java.awt.Color(255, 255, 255));
        jButtonback.setText("BACK");
        jButtonback.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonback.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonbackMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButtonbackMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButtonbackMouseExited(evt);
            }
        });
        jButtonback.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonbackActionPerformed(evt);
            }
        });
        jPanel1.add(jButtonback, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 490, 70, -1));

        jButtonsubmit.setBackground(new java.awt.Color(0, 102, 102));
        jButtonsubmit.setForeground(new java.awt.Color(255, 255, 255));
        jButtonsubmit.setText("SUBMIT");
        jButtonsubmit.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonsubmit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButtonsubmitMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButtonsubmitMouseExited(evt);
            }
        });
        jButtonsubmit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonsubmitActionPerformed(evt);
            }
        });
        jPanel1.add(jButtonsubmit, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 490, -1, -1));

        jButtonclear.setBackground(new java.awt.Color(0, 102, 102));
        jButtonclear.setForeground(new java.awt.Color(255, 255, 255));
        jButtonclear.setText("CLEAR");
        jButtonclear.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
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
        jPanel1.add(jButtonclear, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 490, 80, -1));

        jPanel2.setBackground(new java.awt.Color(255, 0, 0));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("x");
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });

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

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 571, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jLabelmin)
                .addGap(31, 31, 31)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(jLabel2)
                .addComponent(jLabel1)
                .addComponent(jLabelmin))
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1, 1, 690, -1));

        jPanel3.setBackground(new java.awt.Color(255, 0, 0));
        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 0, 204)));

        jLabel4.setFont(new java.awt.Font("Viner Hand ITC", 3, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("\"Welcome to e-Pharmacy\"");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(92, 92, 92)
                        .addComponent(jLabel5))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel4)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(logo, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(133, 133, 133)
                .addComponent(logo, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5)
                .addContainerGap(210, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 250, 540));

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));
        jPanel5.setForeground(new java.awt.Color(204, 0, 0));

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 690, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 20, 690, 20));

        jPanel7.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 540, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 40, 20, 540));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 2, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Register Now !");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 60, -1, -1));

        jPanel6.setBackground(new java.awt.Color(0, 204, 204));
        jPanel6.setForeground(new java.awt.Color(204, 0, 0));

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 420, Short.MAX_VALUE)
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 100, 420, 10));

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setForeground(new java.awt.Color(204, 0, 0));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 420, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 470, 420, 10));

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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 549, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextFieldusernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldusernameActionPerformed
       
    }//GEN-LAST:event_jTextFieldusernameActionPerformed

    private void jPasswordFieldcinfirmpasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jPasswordFieldcinfirmpasswordActionPerformed
       
    }//GEN-LAST:event_jPasswordFieldcinfirmpasswordActionPerformed

    private void jTextFieldemailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldemailActionPerformed
        
    }//GEN-LAST:event_jTextFieldemailActionPerformed

    private void jButtonbackMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonbackMouseClicked
        // TODO add your handling code here:
        Login obj=new Login();
        obj.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButtonbackMouseClicked

    private void jButtonsubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonsubmitActionPerformed
   
            String FULLNAME =jTextFieldfullname.getText();
            String USERNAME =jTextFieldusername.getText();
            String PASSWORD =String.valueOf(jPasswordFieldpassword.getText());
            String CONFIRMPASSWORD=String.valueOf(jPasswordFieldcinfirmpassword.getText());
            String EMAIL =jTextFieldemail.getText();
            String PHONENBR=jTextFieldphonenbr.getText();
            String ADDRESS = jTextFieldaddress.getText();
            
            if(FULLNAME.equals(""))
            {
               JOptionPane.showMessageDialog(null,"please enter your full name."); 
            
            }
            
            else if(USERNAME.equals(""))
            {
               JOptionPane.showMessageDialog(null,"please enter your user name."); 
            }
            
            else if(PASSWORD.equals(""))
            {
               JOptionPane.showMessageDialog(null,"please enter your password."); 
            }
            else if(!PASSWORD.equals(CONFIRMPASSWORD))
            {
               JOptionPane.showMessageDialog(null,"please retype your password again."); 
            }
            
            else if(EMAIL.equals(""))
            {
               JOptionPane.showMessageDialog(null,"please enter your email id."); 
            }
            
            else if(PHONENBR.equals(""))
            {
               JOptionPane.showMessageDialog(null,"please enter your phonenbr."); 
            }
            
            else if(ADDRESS.equals(""))
            {
               JOptionPane.showMessageDialog(null,"please enter your address."); 
            }
            else{
            
            PreparedStatement pst;
            String query = "INSERT INTO `register`(`FULLNAME`, `USERNMAE`, `PASSWORD`, `CONFIRMPASSWORD`, `EMAIL`, `PHONENBR`, `ADDRESS`) VALUES (?,?,?,?,?,?,?)";
            try{
            pst=Jdbc1connection.getConnection().prepareStatement(query);
            pst.setString(1, FULLNAME );
            pst.setString(2, USERNAME );
            pst.setString(3, PASSWORD );
            pst.setString(4, CONFIRMPASSWORD );
            pst.setString(5, EMAIL );
            pst.setString(6, PHONENBR );
            pst.setString(7, ADDRESS );
       
            pst.executeUpdate();
            
            JOptionPane.showMessageDialog(null,"Your account is successfully created.");
            }
                
                    catch(SQLException exp)
                    {
                    Logger.getLogger(Register.class.getName()).log(Level.SEVERE,null,exp);
                    }  
            }
    }//GEN-LAST:event_jButtonsubmitActionPerformed

    private void jTextFieldfullnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldfullnameActionPerformed
        // TODO add your handling code here:
        
      
    }//GEN-LAST:event_jTextFieldfullnameActionPerformed

    private void jButtonclearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonclearActionPerformed
        // TODO add your handling code here:
        
        jTextFieldfullname.setText(null);
        jTextFieldusername.setText(null);
        jPasswordFieldpassword.setText(null);
        jPasswordFieldcinfirmpassword.setText(null);
        jTextFieldemail.setText(null);
        jTextFieldphonenbr.setText(null);
        jTextFieldaddress.setText(null);
    }//GEN-LAST:event_jButtonclearActionPerformed

    private void jButtonbackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonbackActionPerformed
      
    }//GEN-LAST:event_jButtonbackActionPerformed

    private void jTextFieldfullnameKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldfullnameKeyReleased
       
        
    }//GEN-LAST:event_jTextFieldfullnameKeyReleased

    private void jTextFieldphonenbrKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldphonenbrKeyPressed
        // TODO add your handling code here:
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

    private void jTextFieldfullnameKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldfullnameKeyPressed
        // TODO add your handling code here:
        
       char c = evt.getKeyChar();
       if(Character.isLetter(c)||Character.isWhitespace(c)||Character.isISOControl(c))
               {
                 jTextFieldfullname.setEditable(true);  
               }
       else{
           jTextFieldfullname.setEditable(false);
           
       }
    }//GEN-LAST:event_jTextFieldfullnameKeyPressed

    private void jTextFieldaddressKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldaddressKeyPressed
        // TODO add your handling code here:
        char c = evt.getKeyChar();
       if(Character.isLetter(c)||Character.isWhitespace(c)||Character.isISOControl(c))
               {
                 jTextFieldaddress.setEditable(true);  
               }
       else{
                jTextFieldaddress.setEditable(false);
           
       }
    }//GEN-LAST:event_jTextFieldaddressKeyPressed

    private void jTextFieldemailKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldemailKeyReleased
     /*String PATTERN="^[a-zA-Z0-9][0,30][@][a-zA-Z0-9][0,10][.][a-zA-Z][0,5]$";
     Pattern patt=Pattern.compile(PATTERN);
     Matcher match=patt.matcher(jTextFieldemail.getText());
     if(!match.matches())
     {
       jTextFieldemail.setEditable(true); 
     } 
     else
     {
      jTextFieldemail.setEditable(false);    
     }
     if(Pattern.matches("^[a-zA-Z0-9][0,30][@][a-zA-Z0-9][0,10][.][a-zA-Z][0,5]$",jTextFieldemail.getText()))
     {
       JOptionPane.showMessageDialog(null,"please enter a valid emial");   
     }
     else{
         JOptionPane.showMessageDialog(null,JOptionPane.INFORMATION_MESSAGE);   
     }*/
    }//GEN-LAST:event_jTextFieldemailKeyReleased

    private void jTextFieldemailKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldemailKeyPressed
        
    }//GEN-LAST:event_jTextFieldemailKeyPressed

    private void jButtonbackMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonbackMouseEntered
    jButtonback.setForeground(Color.WHITE);
    jButtonback.setBackground(new Color(0,102,102));
    jButtonback.setBorder(new LineBorder(new Color(255,102,0), 1, true));   
    }//GEN-LAST:event_jButtonbackMouseEntered

    private void jButtonbackMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonbackMouseExited
    jButtonback.setForeground(new Color(0,102,102));
    jButtonback.setBackground(Color.YELLOW);
    jButtonback.setBorder(new LineBorder(Color.WHITE, 1, true)); 
    }//GEN-LAST:event_jButtonbackMouseExited

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

    private void jButtonsubmitMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonsubmitMouseEntered
    jButtonsubmit.setForeground(Color.WHITE);
    jButtonsubmit.setBackground(new Color(0,102,102));
    jButtonsubmit.setBorder(new LineBorder(new Color(255,102,0), 1, true));  
    }//GEN-LAST:event_jButtonsubmitMouseEntered

    private void jButtonsubmitMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonsubmitMouseExited
    jButtonsubmit.setForeground(new Color(0,102,102));
    jButtonsubmit.setBackground(Color.YELLOW);
    jButtonsubmit.setBorder(new LineBorder(Color.WHITE, 1, true));
    }//GEN-LAST:event_jButtonsubmitMouseExited
    private int xmouse, ymouse;
    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
     System.exit(0);
    }//GEN-LAST:event_jLabel2MouseClicked

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        /*if(getExtendedState()!=Login.MAXIMIZED_BOTH)
        {
            this.setExtendedState(Login.MAXIMIZED_BOTH);
        }else{
            this.setExtendedState(Login.NORMAL);
        }*/
    }//GEN-LAST:event_jLabel1MouseClicked

    private void jLabelminMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelminMouseClicked
        /*this.setExtendedState(Login.ICONIFIED);*/
    }//GEN-LAST:event_jLabelminMouseClicked

    private void jPanel1MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MouseDragged
     int x=evt.getXOnScreen();
     int y=evt.getYOnScreen();
     setLocation(x-xmouse, y-ymouse);  
    }//GEN-LAST:event_jPanel1MouseDragged

    private void jPanel1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MousePressed
    xmouse=evt.getX();
    ymouse=evt.getY();
    }//GEN-LAST:event_jPanel1MousePressed

    public static void main(String args[]) {
        
              java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Register().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonback;
    private javax.swing.JButton jButtonclear;
    private javax.swing.JButton jButtonsubmit;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabeladdress;
    private javax.swing.JLabel jLabelconfirmpassword;
    private javax.swing.JLabel jLabelemail;
    private javax.swing.JLabel jLabelfullname;
    private javax.swing.JLabel jLabelmin;
    private javax.swing.JLabel jLabelpassword;
    private javax.swing.JLabel jLabelphonenbr;
    private javax.swing.JLabel jLabelusername;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JPasswordField jPasswordFieldcinfirmpassword;
    private javax.swing.JPasswordField jPasswordFieldpassword;
    private javax.swing.JSlider jSlider1;
    private javax.swing.JTextField jTextFieldaddress;
    private javax.swing.JTextField jTextFieldemail;
    private javax.swing.JTextField jTextFieldfullname;
    private javax.swing.JTextField jTextFieldphonenbr;
    private javax.swing.JTextField jTextFieldusername;
    private javax.swing.JLabel logo;
    // End of variables declaration//GEN-END:variables
}
