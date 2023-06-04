package pharmacy;
import java.awt.Color;
import java.awt.Image;
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

public class Product extends javax.swing.JFrame {
    Connection conn;
    PreparedStatement pst;
    ResultSet rs;

    public Product() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setOpacity(0.8f);
        medicinelist();
        company(); 
        //imageicon();
        catagory();
    }
    /*public void imageicon()
    {
        ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("icon/k1.png"));
        Image img=i1.getImage();
        Image imageScale=img.getScaledInstance(logo.getWidth(), logo.getHeight(), Image.SCALE_SMOOTH);    
        ImageIcon scaledIcon=new ImageIcon(imageScale);
        logo.setIcon(scaledIcon);
        
    }*/

    public void medicinelist() {
        try {
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/pharmacy", "root", "");
            Statement st = conn.createStatement();
            rs = st.executeQuery("select * from pharmacy.admin");
            jTablemedicinelist.setModel(DbUtils.resultSetToTableModel(rs));
        } catch (SQLException exp) {
            exp.printStackTrace();
        }

    }
    public void company()
    {
        try{
           conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/pharmacy", "root", ""); 
           Statement st = conn.createStatement();
           String Query="select * from pharmacy.companymanage";
           rs = st.executeQuery(Query);
           while(rs.next())
           {
               String mycompany=rs.getString("COMNAME");
               company.addItem(mycompany);
               
           }
        }
        catch(SQLException exp)
        {
           exp.printStackTrace();  
        }
    }
    public void catagory()
    {
        try{
           conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/pharmacy", "root", ""); 
           Statement st = conn.createStatement();
           String Query="select * from pharmacy.catagory";
           rs = st.executeQuery(Query);
           while(rs.next())
           {
               String mycatagory=rs.getString("CATNAME");
               jComboBoxmedcinecatagory.addItem(mycatagory);
               
           }
        }
        catch(SQLException exp)
        {
           exp.printStackTrace();  
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jButtonclear = new javax.swing.JButton();
        jButtonupdate = new javax.swing.JButton();
        jButtonadd = new javax.swing.JButton();
        jButtondelete = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabelmin = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabelback = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTablemedicinelist = new javax.swing.JTable();
        jTextFieldmedicineprice = new javax.swing.JTextField();
        jComboBoxmedcinecatagory = new javax.swing.JComboBox<>();
        jTextFieldmedicinenmae = new javax.swing.JTextField();
        jTextFieldmedicineid = new javax.swing.JTextField();
        jLabelmedicineprice = new javax.swing.JLabel();
        jLabelmedicinecatagory = new javax.swing.JLabel();
        jLabelmedicinename = new javax.swing.JLabel();
        jLabelmedicineid = new javax.swing.JLabel();
        company = new javax.swing.JComboBox<>();
        jLabelcompany = new javax.swing.JLabel();
        jDateChooserexpiredate = new com.toedter.calendar.JDateChooser();
        jLabelexpiredate = new javax.swing.JLabel();
        jDateChoosermanufacturedate = new com.toedter.calendar.JDateChooser();
        jLabelmanufacturedate = new javax.swing.JLabel();
        jTextFieldquantity = new javax.swing.JTextField();
        jLabelquantity = new javax.swing.JLabel();
        jLabelmedicinelist = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jPanel9 = new javax.swing.JPanel();
        jPanel13 = new javax.swing.JPanel();
        jPanel14 = new javax.swing.JPanel();
        jPanel15 = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane2.setViewportView(jTable2);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("MANAGE MEDICINE");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 120, -1, -1));

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
        jPanel1.add(jButtonclear, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 360, -1, 20));

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
        jPanel1.add(jButtonupdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 360, 100, 20));

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
        jPanel1.add(jButtonadd, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 360, 80, 20));

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
        jPanel1.add(jButtondelete, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 360, 83, 20));

        jPanel2.setBackground(new java.awt.Color(255, 0, 0));

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

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 681, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addComponent(jLabelmin)
                .addGap(31, 31, 31)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(jLabel2)
                .addComponent(jLabel3)
                .addComponent(jLabelmin))
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1, 1, 800, -1));

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
                .addContainerGap(756, Short.MAX_VALUE)
                .addComponent(jLabelback)
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabelback))
        );

        jPanel1.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 20, 800, 20));

        jPanel6.setBackground(new java.awt.Color(0, 204, 204));
        jPanel6.setForeground(new java.awt.Color(204, 0, 0));

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 740, Short.MAX_VALUE)
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 100, 740, -1));

        jLabel4.setFont(new java.awt.Font("Viner Hand ITC", 3, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("welcome !");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 50, -1, -1));

        jTablemedicinelist.setBackground(new java.awt.Color(0, 102, 102));
        jTablemedicinelist.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0)));
        jTablemedicinelist.setForeground(new java.awt.Color(255, 255, 255));
        jTablemedicinelist.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "MED ID", "MED NAME", "MED CATAGORY", "MED PRICE", "QUANTITY", "MAN DATE", "EXPIRE DATE", "COMPANY"
            }
        ));
        jTablemedicinelist.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTablemedicinelistMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(jTablemedicinelist);

        jPanel1.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 450, 670, 120));

        jTextFieldmedicineprice.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jTextFieldmedicineprice.setForeground(new java.awt.Color(0, 102, 0));
        jTextFieldmedicineprice.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextFieldmedicinepriceKeyTyped(evt);
            }
        });
        jPanel1.add(jTextFieldmedicineprice, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 300, 108, -1));

        jComboBoxmedcinecatagory.setBackground(new java.awt.Color(0, 102, 102));
        jComboBoxmedcinecatagory.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jComboBoxmedcinecatagory.setForeground(new java.awt.Color(255, 255, 255));
        jComboBoxmedcinecatagory.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxmedcinecatagoryActionPerformed(evt);
            }
        });
        jPanel1.add(jComboBoxmedcinecatagory, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 260, 110, -1));

        jTextFieldmedicinenmae.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jTextFieldmedicinenmae.setForeground(new java.awt.Color(0, 102, 0));
        jPanel1.add(jTextFieldmedicinenmae, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 210, 108, -1));

        jTextFieldmedicineid.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jTextFieldmedicineid.setForeground(new java.awt.Color(0, 102, 0));
        jTextFieldmedicineid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldmedicineidActionPerformed(evt);
            }
        });
        jPanel1.add(jTextFieldmedicineid, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 170, 106, -1));

        jLabelmedicineprice.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabelmedicineprice.setForeground(new java.awt.Color(255, 255, 255));
        jLabelmedicineprice.setText("MEDICINE PRICE:");
        jPanel1.add(jLabelmedicineprice, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 300, -1, 22));

        jLabelmedicinecatagory.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabelmedicinecatagory.setForeground(new java.awt.Color(255, 255, 255));
        jLabelmedicinecatagory.setText("MEDICINE CATAGORY:");
        jPanel1.add(jLabelmedicinecatagory, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 260, -1, -1));

        jLabelmedicinename.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabelmedicinename.setForeground(new java.awt.Color(255, 255, 255));
        jLabelmedicinename.setText("MEDICINE NAME:");
        jPanel1.add(jLabelmedicinename, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 220, -1, 20));

        jLabelmedicineid.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabelmedicineid.setForeground(new java.awt.Color(255, 255, 255));
        jLabelmedicineid.setText("MEDICINE ID:");
        jPanel1.add(jLabelmedicineid, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 170, -1, 20));

        company.setBackground(new java.awt.Color(0, 102, 102));
        company.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        company.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(company, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 300, 110, -1));

        jLabelcompany.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabelcompany.setForeground(new java.awt.Color(255, 255, 255));
        jLabelcompany.setText("COMPANY:");
        jPanel1.add(jLabelcompany, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 300, -1, 20));

        jDateChooserexpiredate.setBackground(new java.awt.Color(255, 255, 255));
        jDateChooserexpiredate.setForeground(new java.awt.Color(0, 102, 0));
        jPanel1.add(jDateChooserexpiredate, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 250, 110, 30));

        jLabelexpiredate.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabelexpiredate.setForeground(new java.awt.Color(255, 255, 255));
        jLabelexpiredate.setText("EXPIRE DATE:");
        jPanel1.add(jLabelexpiredate, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 260, -1, 20));

        jDateChoosermanufacturedate.setBackground(new java.awt.Color(255, 255, 255));
        jDateChoosermanufacturedate.setForeground(new java.awt.Color(0, 102, 0));
        jPanel1.add(jDateChoosermanufacturedate, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 210, 110, 30));

        jLabelmanufacturedate.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabelmanufacturedate.setForeground(new java.awt.Color(255, 255, 255));
        jLabelmanufacturedate.setText("MANFACTURE DATE:");
        jPanel1.add(jLabelmanufacturedate, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 220, -1, 20));

        jTextFieldquantity.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jTextFieldquantity.setForeground(new java.awt.Color(0, 102, 0));
        jTextFieldquantity.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldquantityActionPerformed(evt);
            }
        });
        jTextFieldquantity.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextFieldquantityKeyTyped(evt);
            }
        });
        jPanel1.add(jTextFieldquantity, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 170, 108, -1));

        jLabelquantity.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabelquantity.setForeground(new java.awt.Color(255, 255, 255));
        jLabelquantity.setText("QUANTITY:");
        jPanel1.add(jLabelquantity, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 180, -1, 20));

        jLabelmedicinelist.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabelmedicinelist.setForeground(new java.awt.Color(255, 255, 255));
        jLabelmedicinelist.setText("MEDICINE LIST");
        jPanel1.add(jLabelmedicinelist, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 420, -1, -1));

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
            .addGap(0, 740, Short.MAX_VALUE)
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 590, 740, 10));

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

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 610));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextFieldmedicineidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldmedicineidActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldmedicineidActionPerformed

    private void jTextFieldquantityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldquantityActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldquantityActionPerformed

    private void jButtonupdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonupdateActionPerformed

        if (jTextFieldmedicineid.getText().isEmpty() || jTextFieldmedicinenmae.getText().isEmpty() || jTextFieldmedicineprice.getText().isEmpty() || jTextFieldquantity.getText().isEmpty()) {
        JOptionPane.showMessageDialog(this, "Missing information.");
        } else {
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
            String date = sdf.format(jDateChoosermanufacturedate.getDate());
            String date1 = sdf.format(jDateChooserexpiredate.getDate());
            try {
             
                conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/pharmacy", "root", "");
                String UpdateQuery = "Update pharmacy.admin set MEDNAME='" + jTextFieldmedicinenmae.getText()+"'"+",MEDCATAGORY='"+jComboBoxmedcinecatagory.getSelectedItem().toString()+"'"+",MEDPRICE='"+jTextFieldmedicineprice.getText()+"'"+",QUANTITY='"+jTextFieldquantity.getText()+"'"+",MANDATE='"+date+"'"+",EXPIREDATE='"+date1+"'"+",COMPANY='"+company.getSelectedItem().toString()+"'"+"where MEDID="+jTextFieldmedicineid.getText();
                Statement smt=conn.createStatement();
                smt.executeUpdate(UpdateQuery);
                JOptionPane.showMessageDialog(this, "Updated successfully.");
                medicinelist();
            } catch (SQLException exp) {
                exp.printStackTrace();
            }

        }
    }//GEN-LAST:event_jButtonupdateActionPerformed

    private void jButtonaddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonaddActionPerformed

        try {
            conn = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/pharmacy", "root", "");
            String query = "INSERT INTO `admin`(`MEDID`, `MEDNAME`, `MEDCATAGORY`, `MEDPRICE`, `QUANTITY`, `MANDATE`, `EXPIREDATE`, `COMPANY`) VALUES (?, ?, ?, ?, ?, ? ,? ,?)";
            pst = conn.prepareStatement(query);
            pst.setString(1, jTextFieldmedicineid.getText());
            pst.setString(2, jTextFieldmedicinenmae.getText());
            pst.setString(3, String.valueOf(jComboBoxmedcinecatagory.getSelectedItem()));
            pst.setString(4, jTextFieldmedicineprice.getText());
            pst.setString(5, jTextFieldquantity.getText());
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
            String date = sdf.format(jDateChoosermanufacturedate.getDate());
            String date1 = sdf.format(jDateChooserexpiredate.getDate());
            pst.setString(6, date);
            pst.setString(7, date1);
            pst.setString(8, String.valueOf(company.getSelectedItem()));
            int row = pst.executeUpdate();
            medicinelist();
            conn.close();
           
            JOptionPane.showMessageDialog(null, "successfully added.");
        } catch (SQLException exp) {
            JOptionPane.showMessageDialog(null, exp);
        }
    }//GEN-LAST:event_jButtonaddActionPerformed

    private void jButtonclearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonclearActionPerformed
        // TODO add your handling code here:
        jTextFieldmedicineid.setText(null);
        jTextFieldmedicinenmae.setText(null);
        jComboBoxmedcinecatagory.setSelectedItem(null);
        jTextFieldmedicineprice.setText(null);
        jTextFieldquantity.setText(null);
        jDateChoosermanufacturedate.setDate(null);
        jDateChooserexpiredate.setDate(null);
        company.setSelectedItem(null);


    }//GEN-LAST:event_jButtonclearActionPerformed

    private void jButtondeleteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtondeleteMouseClicked
        if (jTextFieldmedicineid.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Enter the medcine id to be deleted.");
        } else {
            try {
                conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/pharmacy", "root", "");
                String MEDID = jTextFieldmedicineid.getText();
                String Query = "Delete from pharmacy.admin where MEDID=" + MEDID;
                Statement delete = conn.createStatement();
                delete.executeUpdate(Query);
                JOptionPane.showMessageDialog(this, "Deleted successfully");
                medicinelist();
                conn.close();
            } catch (SQLException exp) {
                exp.printStackTrace();
            }
        }
    }//GEN-LAST:event_jButtondeleteMouseClicked

    private void jTablemedicinelistMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTablemedicinelistMouseClicked
        DefaultTableModel model = (DefaultTableModel) jTablemedicinelist.getModel();
        int Myindex = jTablemedicinelist.getSelectedRow();
        jTextFieldmedicineid.setText(model.getValueAt(Myindex, 0).toString());
        jTextFieldmedicinenmae.setText(model.getValueAt(Myindex, 1).toString());
        jComboBoxmedcinecatagory.setSelectedItem(model.getValueAt(Myindex, 2).toString());
        jTextFieldmedicineprice.setText(model.getValueAt(Myindex, 3).toString());
        jTextFieldquantity.setText(model.getValueAt(Myindex, 4).toString());
        medicinelist();

    }//GEN-LAST:event_jTablemedicinelistMouseClicked

    private void jComboBoxmedcinecatagoryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxmedcinecatagoryActionPerformed
    }//GEN-LAST:event_jComboBoxmedcinecatagoryActionPerformed

    private void jButtonaddMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonaddMouseClicked
    }//GEN-LAST:event_jButtonaddMouseClicked

    private void jTextFieldmedicinepriceKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldmedicinepriceKeyTyped
      char c = evt.getKeyChar();
      if(!Character.isDigit(c))
              {
                  evt.consume();;
              }
    }//GEN-LAST:event_jTextFieldmedicinepriceKeyTyped

    private void jTextFieldquantityKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldquantityKeyTyped
       char c = evt.getKeyChar();
      if(!Character.isDigit(c))
              {
                  evt.consume();;
              }
    }//GEN-LAST:event_jTextFieldquantityKeyTyped

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
                new Product().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> company;
    private javax.swing.JButton jButtonadd;
    private javax.swing.JButton jButtonclear;
    private javax.swing.JButton jButtondelete;
    private javax.swing.JButton jButtonupdate;
    private javax.swing.JComboBox<String> jComboBoxmedcinecatagory;
    private com.toedter.calendar.JDateChooser jDateChooserexpiredate;
    private com.toedter.calendar.JDateChooser jDateChoosermanufacturedate;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabelback;
    private javax.swing.JLabel jLabelcompany;
    private javax.swing.JLabel jLabelexpiredate;
    private javax.swing.JLabel jLabelmanufacturedate;
    private javax.swing.JLabel jLabelmedicinecatagory;
    private javax.swing.JLabel jLabelmedicineid;
    private javax.swing.JLabel jLabelmedicinelist;
    private javax.swing.JLabel jLabelmedicinename;
    private javax.swing.JLabel jLabelmedicineprice;
    private javax.swing.JLabel jLabelmin;
    private javax.swing.JLabel jLabelquantity;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTable2;
    private javax.swing.JTable jTablemedicinelist;
    private javax.swing.JTextField jTextFieldmedicineid;
    private javax.swing.JTextField jTextFieldmedicinenmae;
    private javax.swing.JTextField jTextFieldmedicineprice;
    private javax.swing.JTextField jTextFieldquantity;
    // End of variables declaration//GEN-END:variables

}
