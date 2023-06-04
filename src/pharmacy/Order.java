package pharmacy;
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
import javax.swing.table.DefaultTableModel;
import java.util.Date;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import javax.swing.table.TableModel;
import net.proteanit.sql.DbUtils;
public class Order extends javax.swing.JFrame {
    Connection conn;
    PreparedStatement pst;
    ResultSet rs;
    public Order() {
        initComponents();
        //imageicon();
        date();
        medicinelist();
    }
    
   /*public void imageicon()
    {
        ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("icon/d.png"));
        Image img=i1.getImage();
        Image imageScale=img.getScaledInstance(logo.getWidth(), logo.getHeight(), Image.SCALE_SMOOTH);    
        ImageIcon scaledIcon=new ImageIcon(imageScale);
        logo.setIcon(scaledIcon);
        
    }*/
   public void date()
   {
       Date d1=new Date();
       SimpleDateFormat s = new SimpleDateFormat("yyyy-MM-dd");
       date.setText(s.format(d1));
       
   }
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
   
    private void update()
   {
       int newqty = oldqty-Integer.valueOf(jTextFieldquantity.getText());
        try {
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/pharmacy", "root", ""); 
            String UpdateQuery = "Update pharmacy.admin set QUANTITY='"+newqty+"'"+"where MEDID="+productid;
            Statement smt=conn.createStatement();
            smt.executeUpdate(UpdateQuery);
             medicinelist();
         } catch (SQLException exp) {
            exp.printStackTrace();
         }
             }
    /*public void customer()
    {
        try{
           conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/pharmacy", "root", ""); 
           Statement st = conn.createStatement();
           String Query="select * from pharmacy.register";
           rs = st.executeQuery(Query);
           while(rs.next())
           {
               String name=rs.getString("USERNAME");
               jTextField1.setText(name);
               String phone=rs.getString("PHONENBR");
               jTextField2.setText(phone);
               
           }
        }
        catch(SQLException exp)
        {
           exp.printStackTrace();  
        }
    }*/
       @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabelquantity = new javax.swing.JLabel();
        jTextFieldquantity = new javax.swing.JTextField();
        jLabelbill = new javax.swing.JLabel();
        jLabelmedcinelist = new javax.swing.JLabel();
        jButtondelete = new javax.swing.JButton();
        jButtonclear = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTablemedicinelist = new javax.swing.JTable();
        jLabeldate = new javax.swing.JLabel();
        date = new javax.swing.JLabel();
        jLabeltotprice = new javax.swing.JLabel();
        jTextFieldprice = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTablebill1 = new javax.swing.JTable();
        jButtonupdate = new javax.swing.JButton();
        jButtonconformorder = new javax.swing.JButton();
        jButtonaddtobill = new javax.swing.JButton();
        jTextFieldtotprice = new javax.swing.JTextField();
        jLabelprice1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jTextFieldcustomername = new javax.swing.JTextField();
        jTextFieldphonenbr = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabelmin = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 102, 0)));

        jLabelquantity.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabelquantity.setForeground(new java.awt.Color(255, 255, 255));
        jLabelquantity.setText("QUANTITY:");

        jTextFieldquantity.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jTextFieldquantity.setForeground(new java.awt.Color(0, 102, 0));

        jLabelbill.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabelbill.setForeground(new java.awt.Color(255, 255, 255));
        jLabelbill.setText("BILL");

        jLabelmedcinelist.setBackground(new java.awt.Color(255, 255, 255));
        jLabelmedcinelist.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabelmedcinelist.setForeground(new java.awt.Color(255, 255, 255));
        jLabelmedcinelist.setText("MEDCINE LIST");

        jButtondelete.setBackground(new java.awt.Color(0, 102, 0));
        jButtondelete.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButtondelete.setForeground(new java.awt.Color(255, 255, 255));
        jButtondelete.setText("Delete");
        jButtondelete.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtondeleteMouseClicked(evt);
            }
        });

        jButtonclear.setBackground(new java.awt.Color(0, 102, 0));
        jButtonclear.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButtonclear.setForeground(new java.awt.Color(255, 255, 255));
        jButtonclear.setText("Clear");
        jButtonclear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonclearActionPerformed(evt);
            }
        });

        jTablemedicinelist.setForeground(new java.awt.Color(0, 102, 0));
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

        jLabeldate.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabeldate.setForeground(new java.awt.Color(255, 255, 255));
        jLabeldate.setText("Date:");

        date.setForeground(new java.awt.Color(0, 102, 0));

        jLabeltotprice.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabeltotprice.setForeground(new java.awt.Color(255, 255, 255));
        jLabeltotprice.setText("TOTAL:");

        jTextFieldprice.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jTextFieldprice.setForeground(new java.awt.Color(0, 102, 0));

        jTablebill1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "BILL ID", "MED NAME", "MEDTPYE", "QUANTITY ", "QUANTITY PRICE", "TOTAL PRICE"
            }
        ));
        jTablebill1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTablebill1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTablebill1);

        jButtonupdate.setBackground(new java.awt.Color(0, 102, 0));
        jButtonupdate.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButtonupdate.setForeground(new java.awt.Color(255, 255, 255));
        jButtonupdate.setText("Update");
        jButtonupdate.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonupdateMouseClicked(evt);
            }
        });
        jButtonupdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonupdateActionPerformed(evt);
            }
        });

        jButtonconformorder.setBackground(new java.awt.Color(0, 102, 0));
        jButtonconformorder.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButtonconformorder.setForeground(new java.awt.Color(255, 255, 255));
        jButtonconformorder.setText("Conform order");
        jButtonconformorder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonconformorderActionPerformed(evt);
            }
        });

        jButtonaddtobill.setBackground(new java.awt.Color(0, 102, 0));
        jButtonaddtobill.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButtonaddtobill.setForeground(new java.awt.Color(255, 255, 255));
        jButtonaddtobill.setText("Add To Bill");
        jButtonaddtobill.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonaddtobillMouseClicked(evt);
            }
        });
        jButtonaddtobill.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonaddtobillActionPerformed(evt);
            }
        });

        jTextFieldtotprice.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jTextFieldtotprice.setForeground(new java.awt.Color(0, 102, 0));

        jLabelprice1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabelprice1.setForeground(new java.awt.Color(255, 255, 255));
        jLabelprice1.setText("PRICE:");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Customer Name:");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Phone nbr:");

        jTextFieldcustomername.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jTextFieldcustomername.setForeground(new java.awt.Color(0, 102, 0));

        jTextFieldphonenbr.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jTextFieldphonenbr.setForeground(new java.awt.Color(0, 102, 0));

        jPanel2.setBackground(new java.awt.Color(255, 0, 0));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("x");
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("max");
        jLabel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel5MouseClicked(evt);
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
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel5)
                .addGap(18, 18, 18)
                .addComponent(jLabelmin)
                .addGap(31, 31, 31)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(jLabel2)
                .addComponent(jLabel5)
                .addComponent(jLabelmin))
        );

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 19, Short.MAX_VALUE)
        );

        jPanel4.setBackground(new java.awt.Color(255, 0, 0));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 61, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jLabel6.setFont(new java.awt.Font("Viner Hand ITC", 3, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Order your medcine!");

        jPanel6.setBackground(new java.awt.Color(0, 153, 153));
        jPanel6.setForeground(new java.awt.Color(0, 204, 204));

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 869, Short.MAX_VALUE)
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 9, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButtonaddtobill)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonupdate, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(103, 103, 103)
                                .addComponent(jLabelprice1)
                                .addGap(27, 27, 27)
                                .addComponent(jTextFieldprice, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(94, 94, 94)
                                .addComponent(jLabelquantity)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jTextFieldquantity, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(100, 100, 100)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel3))
                        .addGap(17, 17, 17)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextFieldcustomername, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextFieldphonenbr, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(67, 67, 67)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                            .addComponent(jButtondelete, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(jButtonclear)
                            .addGap(37, 37, 37)
                            .addComponent(jLabeltotprice)
                            .addGap(18, 18, 18)
                            .addComponent(jTextFieldtotprice, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(jButtonconformorder)))
                    .addComponent(jLabelmedcinelist)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabelbill)
                        .addGap(74, 74, 74)
                        .addComponent(jLabeldate)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(date, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(jLabel6)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(66, 66, 66)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 742, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(21, Short.MAX_VALUE))))
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(39, 39, 39)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabelbill)
                                .addComponent(jLabeldate)
                                .addComponent(jTextFieldcustomername, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel3))
                            .addComponent(date, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel4)
                                    .addComponent(jTextFieldphonenbr, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(69, 69, 69)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jTextFieldquantity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabelquantity))
                                .addGap(29, 29, 29)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jTextFieldprice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabelprice1))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jButtonclear)
                                    .addComponent(jButtondelete)
                                    .addComponent(jButtonupdate)
                                    .addComponent(jButtonconformorder)
                                    .addComponent(jButtonaddtobill)
                                    .addComponent(jTextFieldtotprice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabeltotprice))
                                .addGap(28, 28, 28)
                                .addComponent(jLabelmedcinelist)
                                .addGap(18, 18, 18)
                                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(32, 32, 32))))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonaddtobillActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonaddtobillActionPerformed

    }//GEN-LAST:event_jButtonaddtobillActionPerformed

    private void jButtonaddtobillMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonaddtobillMouseClicked
        if(flag==0||jTextFieldquantity.getText().isEmpty()||jTextFieldprice.getText().isEmpty())
        {
            JOptionPane.showMessageDialog(this,"please fil the required filed");
        }
        else{
            totalprice = Integer.valueOf(jTextFieldprice.getText())*Integer.valueOf(jTextFieldquantity.getText());
            Vector v1=new Vector();
            v1.add(i);
            v1.add(medname);
            v1.add(medtype);
            v1.add(jTextFieldquantity.getText());
            v1.add(jTextFieldprice.getText());
            v1.add(totalprice);
            /*java.lang.String highsensective = null;
            //if(medtype == highsensective)
            {
                Highdosemedcineaprove obj=new Highdosemedcineaprove();
                obj.setVisible(true);
                dispose();
            }else*/
            DefaultTableModel model1 = (DefaultTableModel) jTablebill1.getModel();
            model1.addRow(v1);

            total=total+totalprice;
            jTextFieldtotprice.setText("Rs"+total);
            update();
            i++;
            JOptionPane.showMessageDialog(this,"added to bill successfully");
        }
    }//GEN-LAST:event_jButtonaddtobillMouseClicked

    private void jButtonconformorderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonconformorderActionPerformed
        DefaultTableModel model2 = (DefaultTableModel) jTablebill1.getModel();
        if(jTablebill1.getRowCount() == 0)
        {
            JOptionPane.showMessageDialog(this,"table is empty....");
        }else{
            String BILLID,MEDNAME,QUANTITY,PRICE,TOTALPRICE;
            try{
                conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/pharmacy","root","");
                for(int i=0;i<model2.getRowCount();i++)
                {
                    BILLID = model2.getValueAt(i, 0).toString();
                    MEDNAME = model2.getValueAt(i, 1).toString();
                    QUANTITY= model2.getValueAt(i, 2).toString();
                    PRICE= model2.getValueAt(i, 3).toString();
                    TOTALPRICE= model2.getValueAt(i, 4).toString();
                    String query = "INSERT INTO `customerorder`(`BILLID`, `MEDNAME`, `QUANTITY`, `PRICE`, `TOTALPRICE`) VALUES (?, ?, ?,?,?)";
                    PreparedStatement pst=conn.prepareStatement(query);
                    pst.setString(1, BILLID);
                    pst.setString(2, MEDNAME);
                    pst.setString(3, QUANTITY);
                    pst.setString(4, PRICE);
                    pst.setString(5, TOTALPRICE);
                    pst.execute();
                }
                JOptionPane.showMessageDialog(this,"successfully order");
                model2.setRowCount(0);
            }

            catch(Exception exp)
            {
                JOptionPane.showMessageDialog(null,exp);
            }

        }
        /*try {
            conn = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/pharmacy", "root", "");
            String query = "INSERT INTO `order`(`CUSTOMERNAME`, `PHONENBR`, `TOTALPRICE`) VALUES (?, ?, ?)";
            pst = conn.prepareStatement(query);
            pst.setString(1, jTextFieldcustomername.getText());
            pst.setString(2, jTextFieldphonenbr.getText());
            pst.setString(5, jTextFieldtotprice.getText());
            conn.close();

            JOptionPane.showMessageDialog(null, "order successfully.");
        } catch (SQLException exp) {
            JOptionPane.showMessageDialog(null, exp);
        }
        Vieworderbyadmin.jTextFieldcustomername.setText(Order.jTextFieldcustomername.getText());
        Vieworderbyadmin.jTextFieldphonenbr.setText(Order.jTextFieldphonenbr.getText());
        Vieworderbyadmin.jTextFieldtotprice.setText(Order.jTextFieldtotprice.getText());
        Vieworderbyadmin.date.setText(Order.date.getText());
        // TableModel model1=jTablebill.getModel();
        //int indexs[]=jTablebill1.getSelectedRows();
        //DefaultTableModel model2=(DefaultTableModel) obj.jTablebill1.getModel();
      */
    }//GEN-LAST:event_jButtonconformorderActionPerformed

    private void jButtonupdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonupdateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonupdateActionPerformed

    private void jButtonupdateMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonupdateMouseClicked
        DefaultTableModel model1 = (DefaultTableModel) jTablebill1.getModel();
        if(jTablebill1.getSelectedRowCount() == 1)
        {
            String qty=jTextFieldquantity.getText();
            String pric=jTextFieldprice.getText();
            model1.setValueAt(qty,jTablebill1.getSelectedRow(), 2);
            model1.setValueAt(pric,jTablebill1.getSelectedRow(),3);
            JOptionPane.showMessageDialog(this,"updated successfully....");
        }else{
            if(jTablebill1.getSelectedRowCount() == 0)
            {
                JOptionPane.showMessageDialog(this,"table is empty....");

            }else{
                JOptionPane.showMessageDialog(this,"please select the single row to update....");
            }
        }
    }//GEN-LAST:event_jButtonupdateMouseClicked

    private void jTablebill1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTablebill1MouseClicked
        DefaultTableModel model = (DefaultTableModel) jTablebill1.getModel();
        int Myindex = jTablebill1.getSelectedRow();
        jTextFieldquantity.setText(model.getValueAt(Myindex, 2).toString());
        jTextFieldprice.setText(model.getValueAt(Myindex, 3).toString());
    }//GEN-LAST:event_jTablebill1MouseClicked

    private void jTablemedicinelistMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTablemedicinelistMouseClicked
        DefaultTableModel model = (DefaultTableModel) jTablemedicinelist.getModel();
        int Myindex = jTablemedicinelist.getSelectedRow();
        productid=Integer.valueOf(model.getValueAt(Myindex, 0).toString());
        //jTextFieldmedicineid.setText(model.getValueAt(Myindex, 0).toString());
        medname=model.getValueAt(Myindex, 1).toString();
        medtype=model.getValueAt(Myindex, 2).toString();
        oldqty=Integer.valueOf(model.getValueAt(Myindex, 4).toString());
        jTextFieldprice.setText(model.getValueAt(Myindex, 3).toString());
        flag = 1;
        medicinelist();
    }//GEN-LAST:event_jTablemedicinelistMouseClicked

    private void jButtonclearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonclearActionPerformed
        jTextFieldprice.setText(null);
        jTextFieldquantity.setText(null);
    }//GEN-LAST:event_jButtonclearActionPerformed

    private void jButtondeleteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtondeleteMouseClicked
        DefaultTableModel model2 = (DefaultTableModel) jTablebill1.getModel();
        if(jTablebill1.getSelectedRowCount() == 1)
        {
            model2.removeRow(jTablebill1.getSelectedRow());
            JOptionPane.showMessageDialog(this,"deleted  successfully....");
        }else{
            if(jTablebill1.getSelectedRowCount() == 0)
            {
                JOptionPane.showMessageDialog(this,"table is empty....");

            }else{
                JOptionPane.showMessageDialog(this,"please select the single row to update....");
            }
        }
    }//GEN-LAST:event_jButtondeleteMouseClicked

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        System.exit(0);
    }//GEN-LAST:event_jLabel2MouseClicked

    private void jLabel5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseClicked
        /*if(getExtendedState()!=Login.MAXIMIZED_BOTH)
        {
            this.setExtendedState(Login.MAXIMIZED_BOTH);
        }else{
            this.setExtendedState(Login.NORMAL);
        }*/
    }//GEN-LAST:event_jLabel5MouseClicked

    private void jLabelminMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelminMouseClicked
        /*this.setExtendedState(Login.ICONIFIED);*/
    }//GEN-LAST:event_jLabelminMouseClicked
      
    int i=1,qtyprice,totalprice=0,total;
    String medname,medtype;      int flag = 0,productid,oldqty;            public static void main(String args[]) {
            java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Order().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel date;
    private javax.swing.JButton jButtonaddtobill;
    private javax.swing.JButton jButtonclear;
    private javax.swing.JButton jButtonconformorder;
    private javax.swing.JButton jButtondelete;
    private javax.swing.JButton jButtonupdate;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabelbill;
    private javax.swing.JLabel jLabeldate;
    private javax.swing.JLabel jLabelmedcinelist;
    private javax.swing.JLabel jLabelmin;
    private javax.swing.JLabel jLabelprice1;
    private javax.swing.JLabel jLabelquantity;
    private javax.swing.JLabel jLabeltotprice;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTablebill1;
    private javax.swing.JTable jTablemedicinelist;
    private javax.swing.JTextField jTextFieldcustomername;
    private javax.swing.JTextField jTextFieldphonenbr;
    private javax.swing.JTextField jTextFieldprice;
    private javax.swing.JTextField jTextFieldquantity;
    private javax.swing.JTextField jTextFieldtotprice;
    // End of variables declaration//GEN-END:variables

    private int setText(String toString) {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

    private void String() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
