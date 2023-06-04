package pharmacy;
import java.awt.Color;
import java.awt.Image;
import java.awt.event.KeyEvent;
import java.lang.System.Logger;
import java.lang.System.Logger.Level;
import java.sql.*;
import javax.swing.JOptionPane;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import javax.swing.ImageIcon;
import javax.swing.border.LineBorder;
import javax.swing.table.DefaultTableModel;
import net.proteanit.sql.DbUtils;
public class Customer extends javax.swing.JFrame {
    Connection conn;
    PreparedStatement pst;
    ResultSet rs;
    public Customer() {
        initComponents();
        this.setLocationRelativeTo(null);
        //this.setOpacity(0.8f);
        //imageicon();
        userlist();
    }
     public void userlist()
     {
         try {
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/pharmacy", "root", "");
            Statement st = conn.createStatement();
            rs = st.executeQuery("select * from pharmacy.register");
            jTableuserlist.setModel(DbUtils.resultSetToTableModel(rs));
        } catch (SQLException exp) {
            exp.printStackTrace();
        }
     }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabelfullname = new javax.swing.JLabel();
        jLabelusername = new javax.swing.JLabel();
        jLabelpassword = new javax.swing.JLabel();
        jLabelconfirmpassword = new javax.swing.JLabel();
        jLabelemail = new javax.swing.JLabel();
        jLabelphonenbr = new javax.swing.JLabel();
        jLabeladdress = new javax.swing.JLabel();
        jTextFieldfullname = new javax.swing.JTextField();
        jTextFieldusername = new javax.swing.JTextField();
        jPasswordFieldpassword = new javax.swing.JPasswordField();
        jPasswordFieldcinfirmpassword = new javax.swing.JPasswordField();
        jTextFieldemail = new javax.swing.JTextField();
        jTextFieldphonenbr = new javax.swing.JTextField();
        jTextFieldaddress = new javax.swing.JTextField();
        jButtonadd = new javax.swing.JButton();
        jButtonupdate = new javax.swing.JButton();
        jButtondelete = new javax.swing.JButton();
        jButtonclear = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTableuserlist = new javax.swing.JTable();
        jLabeluserlist = new javax.swing.JLabel();
        jLabelusertype = new javax.swing.JLabel();
        jTextFieldusertype = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabelmin = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabelback1 = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        jPanel13 = new javax.swing.JPanel();
        jPanel14 = new javax.swing.JPanel();
        jPanel15 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jPanel9 = new javax.swing.JPanel();

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
        jPanel1.add(jLabelfullname, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 170, -1, -1));

        jLabelusername.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabelusername.setForeground(new java.awt.Color(255, 255, 255));
        jLabelusername.setText("USER NAME:");
        jPanel1.add(jLabelusername, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 220, -1, -1));

        jLabelpassword.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabelpassword.setForeground(new java.awt.Color(255, 255, 255));
        jLabelpassword.setText("PASSWORD:");
        jPanel1.add(jLabelpassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 260, -1, -1));

        jLabelconfirmpassword.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabelconfirmpassword.setForeground(new java.awt.Color(255, 255, 255));
        jLabelconfirmpassword.setText("CONFIRM PASSWORD:");
        jPanel1.add(jLabelconfirmpassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 310, -1, -1));

        jLabelemail.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabelemail.setForeground(new java.awt.Color(255, 255, 255));
        jLabelemail.setText("EMAIL:");
        jPanel1.add(jLabelemail, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 170, -1, 20));

        jLabelphonenbr.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabelphonenbr.setForeground(new java.awt.Color(255, 255, 255));
        jLabelphonenbr.setText("PHONE NBR:");
        jPanel1.add(jLabelphonenbr, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 220, -1, -1));

        jLabeladdress.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabeladdress.setForeground(new java.awt.Color(255, 255, 255));
        jLabeladdress.setText("ADDRESS:");
        jPanel1.add(jLabeladdress, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 260, -1, -1));

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
        jPanel1.add(jTextFieldfullname, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 170, 164, -1));

        jTextFieldusername.setForeground(new java.awt.Color(0, 102, 0));
        jTextFieldusername.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldusernameActionPerformed(evt);
            }
        });
        jPanel1.add(jTextFieldusername, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 210, 164, -1));

        jPasswordFieldpassword.setForeground(new java.awt.Color(0, 102, 0));
        jPanel1.add(jPasswordFieldpassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 260, 164, -1));

        jPasswordFieldcinfirmpassword.setForeground(new java.awt.Color(0, 102, 0));
        jPasswordFieldcinfirmpassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jPasswordFieldcinfirmpasswordActionPerformed(evt);
            }
        });
        jPanel1.add(jPasswordFieldcinfirmpassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 310, 164, -1));

        jTextFieldemail.setForeground(new java.awt.Color(0, 102, 0));
        jTextFieldemail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldemailActionPerformed(evt);
            }
        });
        jPanel1.add(jTextFieldemail, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 170, 179, -1));

        jTextFieldphonenbr.setForeground(new java.awt.Color(0, 102, 0));
        jTextFieldphonenbr.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextFieldphonenbrKeyPressed(evt);
            }
        });
        jPanel1.add(jTextFieldphonenbr, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 220, 179, -1));

        jTextFieldaddress.setForeground(new java.awt.Color(0, 102, 0));
        jTextFieldaddress.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextFieldaddressKeyPressed(evt);
            }
        });
        jPanel1.add(jTextFieldaddress, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 260, 179, -1));

        jButtonadd.setBackground(new java.awt.Color(0, 102, 102));
        jButtonadd.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButtonadd.setForeground(new java.awt.Color(255, 255, 255));
        jButtonadd.setText("ADD");
        jButtonadd.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonaddMouseClicked(evt);
            }
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
        jPanel1.add(jButtonadd, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 360, 80, 20));

        jButtonupdate.setBackground(new java.awt.Color(0, 102, 102));
        jButtonupdate.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
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
        jPanel1.add(jButtonupdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 360, 100, 20));

        jButtondelete.setBackground(new java.awt.Color(0, 102, 102));
        jButtondelete.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButtondelete.setForeground(new java.awt.Color(255, 255, 255));
        jButtondelete.setText("DELETE");
        jButtondelete.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtondeleteMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButtondeleteMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButtondeleteMouseExited(evt);
            }
        });
        jPanel1.add(jButtondelete, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 360, 83, 20));

        jButtonclear.setBackground(new java.awt.Color(0, 102, 102));
        jButtonclear.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
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
        jPanel1.add(jButtonclear, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 360, -1, 20));

        jTableuserlist.setBackground(new java.awt.Color(0, 102, 51));
        jTableuserlist.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0)));
        jTableuserlist.setForeground(new java.awt.Color(255, 255, 255));
        jTableuserlist.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "FULL NAME", "USER NAME", "PASSWORD", "CONFIRM PASSWORD", "EMAIL", "PHONE NBR", "ADDRESS", "USERTYPE"
            }
        ));
        jTableuserlist.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableuserlistMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(jTableuserlist);

        jPanel1.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 450, 680, 120));

        jLabeluserlist.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabeluserlist.setForeground(new java.awt.Color(255, 255, 255));
        jLabeluserlist.setText("CUSTOMER LIST");
        jPanel1.add(jLabeluserlist, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 420, -1, -1));

        jLabelusertype.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabelusertype.setForeground(new java.awt.Color(255, 255, 255));
        jLabelusertype.setText("USERTYPE:");
        jPanel1.add(jLabelusertype, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 310, -1, -1));
        jPanel1.add(jTextFieldusertype, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 310, 179, -1));

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
                .addGap(0, 701, Short.MAX_VALUE)
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

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(1, 1, 820, -1));

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));
        jPanel5.setForeground(new java.awt.Color(204, 0, 0));

        jLabelback1.setBackground(new java.awt.Color(0, 102, 0));
        jLabelback1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabelback1.setText("Back");
        jLabelback1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelback1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabelback1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabelback1MouseExited(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap(776, Short.MAX_VALUE)
                .addComponent(jLabelback1)
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabelback1))
        );

        jPanel1.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 20, 820, 20));

        jPanel8.setBackground(new java.awt.Color(255, 0, 0));
        jPanel8.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 48, Short.MAX_VALUE)
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 568, Short.MAX_VALUE)
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
            .addGap(0, 760, Short.MAX_VALUE)
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 90, 760, -1));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("MANAGE MEDICINE");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 120, -1, -1));

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setForeground(new java.awt.Color(204, 0, 0));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 760, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 400, 760, 10));

        jPanel9.setBackground(new java.awt.Color(204, 0, 0));
        jPanel9.setForeground(new java.awt.Color(204, 0, 0));

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 760, Short.MAX_VALUE)
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 590, 760, 10));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextFieldfullnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldfullnameActionPerformed
     
    }//GEN-LAST:event_jTextFieldfullnameActionPerformed

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

    private void jTextFieldfullnameKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldfullnameKeyReleased
        // TODO add your handling code here:

    }//GEN-LAST:event_jTextFieldfullnameKeyReleased

    private void jTextFieldusernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldusernameActionPerformed

    }//GEN-LAST:event_jTextFieldusernameActionPerformed

    private void jPasswordFieldcinfirmpasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jPasswordFieldcinfirmpasswordActionPerformed

    }//GEN-LAST:event_jPasswordFieldcinfirmpasswordActionPerformed

    private void jTextFieldemailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldemailActionPerformed

    }//GEN-LAST:event_jTextFieldemailActionPerformed

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

    private void jButtonaddMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonaddMouseClicked

    }//GEN-LAST:event_jButtonaddMouseClicked

    private void jButtonaddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonaddActionPerformed

            String FULLNAME =  jTextFieldfullname.getText();
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
                     exp.printStackTrace();
                    }  
            }
    }//GEN-LAST:event_jButtonaddActionPerformed

    private void jButtonupdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonupdateActionPerformed

        if (jTextFieldfullname.getText().isEmpty() || jTextFieldusername.getText().isEmpty() || jPasswordFieldpassword.getText().isEmpty() || jPasswordFieldcinfirmpassword.getText().isEmpty()||jTextFieldemail.getText().isEmpty()||jTextFieldphonenbr.getText().isEmpty()||jTextFieldaddress.getText().isEmpty()||jTextFieldphonenbr.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Missing information.");
        } else {
            try {

                conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/pharmacy", "root", "");
                String UpdateQuery = "Update pharmacy.register set FULLNAME='" + jTextFieldfullname.getText()+"'"+",USERNMAE='"+jTextFieldusername.getText()+"'"+",PASSWORD='"+jPasswordFieldpassword.getText()+"'"+",CONFIRMPASSWORD='"+jPasswordFieldcinfirmpassword.getText()+"'"+",EMAIL='"+jTextFieldemail.getText()+"'"+",ADDRESS='"+jTextFieldaddress.getText()+"'"+",USERTYPE='"+jTextFieldusertype.getText()+"'"+"where PHONENBR="+jTextFieldphonenbr.getText();
                Statement smt=conn.createStatement();
                smt.executeUpdate(UpdateQuery);
                JOptionPane.showMessageDialog(this, "Updated successfully.");
                userlist();
            } catch (SQLException exp) {
                exp.printStackTrace();
            }

        }
    }//GEN-LAST:event_jButtonupdateActionPerformed

    private void jButtondeleteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtondeleteMouseClicked
        if (jTextFieldphonenbr.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Enter the phonenbr to be deleted.");
        } else {
            try {
                conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/pharmacy", "root", "");
                String PHONENBR = jTextFieldphonenbr.getText();
                String Query = "Delete from pharmacy.register where PHONENBR=" + PHONENBR;
                Statement delete = conn.createStatement();
                delete.executeUpdate(Query);
                JOptionPane.showMessageDialog(this, "Deleted successfully");
                userlist();
                conn.close();
            } catch (SQLException exp) {
                exp.printStackTrace();
            }
        }
    }//GEN-LAST:event_jButtondeleteMouseClicked

    private void jButtonclearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonclearActionPerformed
        // TODO add your handling code here:
        jTextFieldfullname.setText(null);
        jTextFieldusername.setText(null);
        jPasswordFieldpassword.setText(null);
        jPasswordFieldcinfirmpassword.setText(null);
        jTextFieldemail.setText(null);
        jTextFieldphonenbr.setText(null);
        jTextFieldaddress.setText(null);
        jTextFieldusertype.setText(null);

    }//GEN-LAST:event_jButtonclearActionPerformed

    private void jTableuserlistMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableuserlistMouseClicked
        DefaultTableModel model = (DefaultTableModel) jTableuserlist.getModel();
        int Myindex = jTableuserlist.getSelectedRow();
        jTextFieldfullname.setText(model.getValueAt(Myindex, 0).toString());
        jTextFieldusername.setText(model.getValueAt(Myindex, 1).toString());
        jPasswordFieldpassword.setText(model.getValueAt(Myindex, 2).toString());
        jPasswordFieldcinfirmpassword.setText(model.getValueAt(Myindex, 3).toString());
        jTextFieldemail.setText(model.getValueAt(Myindex, 4).toString());
        jTextFieldphonenbr.setText(model.getValueAt(Myindex, 5).toString());
        jTextFieldaddress.setText(model.getValueAt(Myindex, 6).toString());
        jTextFieldusertype.setText(model.getValueAt(Myindex, 7).toString());
        userlist();
        
    }//GEN-LAST:event_jTableuserlistMouseClicked

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

    private void jLabelback1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelback1MouseClicked

        Adminhome obj=new Adminhome();
        obj.setVisible(true);
        dispose();
    }//GEN-LAST:event_jLabelback1MouseClicked

    private void jLabelback1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelback1MouseEntered
        jLabelback1.setForeground(Color.red);
        jLabelback1.setBackground(new Color(0,102,0));
        jLabelback1.setBorder(new LineBorder(new Color(255,102,0), 1, true));
    }//GEN-LAST:event_jLabelback1MouseEntered

    private void jLabelback1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelback1MouseExited
        jLabelback1.setForeground(new Color(0,102,0));
        jLabelback1.setBackground(Color.YELLOW);
        jLabelback1.setBorder(new LineBorder(Color.WHITE, 1, true));
    }//GEN-LAST:event_jLabelback1MouseExited

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
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Customer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Customer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Customer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Customer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Customer().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonadd;
    private javax.swing.JButton jButtonclear;
    private javax.swing.JButton jButtondelete;
    private javax.swing.JButton jButtonupdate;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabeladdress;
    private javax.swing.JLabel jLabelback1;
    private javax.swing.JLabel jLabelconfirmpassword;
    private javax.swing.JLabel jLabelemail;
    private javax.swing.JLabel jLabelfullname;
    private javax.swing.JLabel jLabelmin;
    private javax.swing.JLabel jLabelpassword;
    private javax.swing.JLabel jLabelphonenbr;
    private javax.swing.JLabel jLabeluserlist;
    private javax.swing.JLabel jLabelusername;
    private javax.swing.JLabel jLabelusertype;
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
    private javax.swing.JPasswordField jPasswordFieldcinfirmpassword;
    private javax.swing.JPasswordField jPasswordFieldpassword;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTableuserlist;
    private javax.swing.JTextField jTextFieldaddress;
    private javax.swing.JTextField jTextFieldemail;
    private javax.swing.JTextField jTextFieldfullname;
    private javax.swing.JTextField jTextFieldphonenbr;
    private javax.swing.JTextField jTextFieldusername;
    private javax.swing.JTextField jTextFieldusertype;
    // End of variables declaration//GEN-END:variables
}
