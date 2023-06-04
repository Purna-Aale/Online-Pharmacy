
package pharmacy;
import java.awt.Color;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.border.LineBorder;

public class Adminhome extends javax.swing.JFrame {

    public Adminhome() {
        initComponents();
        this.setLocationRelativeTo(null);
        imageicon();
        //imageicon1();
        imageicon2();
        imageicon3();  
        imageicon4();
        imageicon5();
        imageicon6();
        imageicon7();  
        imageicon8();
        imageicon9();
        imageicon10();
        //this.setOpacity(0.8f);

        
    }
     public void imageicon() {
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icon/a.png"));
        Image img = i1.getImage();
        Image imageScale = img.getScaledInstance(adminlogo.getWidth(), adminlogo.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon scaledIcon = new ImageIcon(imageScale);
        adminlogo.setIcon(scaledIcon);
    }
     
     public void imageicon2()
    {
        ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("icon/e.png"));
        Image img=i1.getImage();
        Image imageScale=img.getScaledInstance(catagory.getWidth(), catagory.getHeight(), Image.SCALE_SMOOTH);    
        ImageIcon scaledIcon=new ImageIcon(imageScale);
        catagory.setIcon(scaledIcon);
        
    }
      public void imageicon3()
    {
        ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("icon/f.png"));
        Image img=i1.getImage();
        Image imageScale=img.getScaledInstance(company.getWidth(), company.getHeight(), Image.SCALE_SMOOTH);    
        ImageIcon scaledIcon=new ImageIcon(imageScale);
        company.setIcon(scaledIcon);
        
    }
       public void imageicon4()
    {
        ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("icon/b.png"));
        Image img=i1.getImage();
        Image imageScale=img.getScaledInstance(product.getWidth(), product.getHeight(), Image.SCALE_SMOOTH);    
        ImageIcon scaledIcon=new ImageIcon(imageScale);
        product.setIcon(scaledIcon);
        
    }
        public void imageicon5()
    {
        ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("icon/c.png"));
        Image img=i1.getImage();
        Image imageScale=img.getScaledInstance(customer.getWidth(), customer.getHeight(), Image.SCALE_SMOOTH);    
        ImageIcon scaledIcon=new ImageIcon(imageScale);
        customer.setIcon(scaledIcon);
        
    }
         public void imageicon6()
    {
        ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("icon/g.png"));
        Image img=i1.getImage();
        Image imageScale=img.getScaledInstance(bill.getWidth(), bill.getHeight(), Image.SCALE_SMOOTH);    
        ImageIcon scaledIcon=new ImageIcon(imageScale);
        bill.setIcon(scaledIcon);
        
    }
         public void imageicon7()
    {
        ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("icon/w.png"));
        Image img=i1.getImage();
        Image imageScale=img.getScaledInstance(c.getWidth(), c.getHeight(), Image.SCALE_SMOOTH);    
        ImageIcon scaledIcon=new ImageIcon(imageScale);
        c.setIcon(scaledIcon);
        
    }
         public void imageicon8()
    {
        ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("icon/r.png"));
        Image img=i1.getImage();
        Image imageScale=img.getScaledInstance(report.getWidth(), report.getHeight(), Image.SCALE_SMOOTH);    
        ImageIcon scaledIcon=new ImageIcon(imageScale);
        report.setIcon(scaledIcon);
        
    }
         public void imageicon9()
    {
        ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("icon/i.png"));
        Image img=i1.getImage();
        Image imageScale=img.getScaledInstance(setting.getWidth(), setting.getHeight(), Image.SCALE_SMOOTH);    
        ImageIcon scaledIcon=new ImageIcon(imageScale);
        setting.setIcon(scaledIcon);
        
    }
         public void imageicon10()
    {
        ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("icon/m.png"));
        Image img=i1.getImage();
        Image imageScale=img.getScaledInstance(location.getWidth(), location.getHeight(), Image.SCALE_SMOOTH);    
        ImageIcon scaledIcon=new ImageIcon(imageScale);
        location.setIcon(scaledIcon);
        
    }
     
     
     

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jYearChooser1 = new com.toedter.calendar.JYearChooser();
        jPanel1 = new javax.swing.JPanel();
        jLabelproduct = new javax.swing.JLabel();
        jLabelcustomerorder = new javax.swing.JLabel();
        jLabelcustomer = new javax.swing.JLabel();
        jLabelcatagory = new javax.swing.JLabel();
        jLabelcompany = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabelmin = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        adminlogo = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jButtonlogout = new javax.swing.JButton();
        c = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        report = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        location = new javax.swing.JLabel();
        recent = new javax.swing.JLabel();
        setting = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        catagory = new javax.swing.JLabel();
        company = new javax.swing.JLabel();
        product = new javax.swing.JLabel();
        customer = new javax.swing.JLabel();
        bill = new javax.swing.JLabel();
        jPanel9 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
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

        jLabelproduct.setBackground(new java.awt.Color(0, 153, 153));
        jLabelproduct.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabelproduct.setForeground(new java.awt.Color(0, 153, 153));
        jLabelproduct.setText("Product");
        jLabelproduct.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelproductMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabelproductMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabelproductMouseExited(evt);
            }
        });
        jPanel1.add(jLabelproduct, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 390, -1, -1));

        jLabelcustomerorder.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabelcustomerorder.setForeground(new java.awt.Color(0, 153, 153));
        jLabelcustomerorder.setText("Customer order");
        jLabelcustomerorder.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelcustomerorderMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabelcustomerorderMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabelcustomerorderMouseExited(evt);
            }
        });
        jPanel1.add(jLabelcustomerorder, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 480, -1, -1));

        jLabelcustomer.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabelcustomer.setForeground(new java.awt.Color(0, 153, 153));
        jLabelcustomer.setText("Customer");
        jLabelcustomer.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelcustomerMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabelcustomerMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabelcustomerMouseExited(evt);
            }
        });
        jPanel1.add(jLabelcustomer, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 490, -1, -1));

        jLabelcatagory.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabelcatagory.setForeground(new java.awt.Color(0, 153, 153));
        jLabelcatagory.setText("Catagory");
        jLabelcatagory.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelcatagoryMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabelcatagoryMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabelcatagoryMouseExited(evt);
            }
        });
        jPanel1.add(jLabelcatagory, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 250, -1, -1));

        jLabelcompany.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabelcompany.setForeground(new java.awt.Color(0, 153, 153));
        jLabelcompany.setText("Company");
        jLabelcompany.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelcompanyMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabelcompanyMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabelcompanyMouseExited(evt);
            }
        });
        jPanel1.add(jLabelcompany, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 250, -1, -1));

        jPanel2.setBackground(new java.awt.Color(255, 0, 0));
        jPanel2.setForeground(new java.awt.Color(255, 0, 0));

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

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(666, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabelmin)
                .addGap(27, 27, 27)
                .addComponent(jLabel2)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabelmin)
                    .addComponent(jLabel2)))
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1, 1, 780, -1));

        jPanel3.setBackground(new java.awt.Color(255, 0, 0));
        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 0, 204)));

        jLabel4.setFont(new java.awt.Font("Viner Hand ITC", 3, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("\"Welcome to \"");

        jLabel5.setFont(new java.awt.Font("Viner Hand ITC", 3, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Admin Portal");

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 204, 204)));

        jButtonlogout.setBackground(new java.awt.Color(0, 102, 0));
        jButtonlogout.setForeground(new java.awt.Color(255, 255, 255));
        jButtonlogout.setText("LOG OUT");
        jButtonlogout.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonlogoutMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButtonlogoutMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButtonlogoutMouseExited(evt);
            }
        });

        jLabel6.setText("Event");

        jLabel7.setText("Report");

        recent.setText("Recent Activity");

        jLabel9.setText("Setting");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButtonlogout))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(setting, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel9))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(location, javax.swing.GroupLayout.DEFAULT_SIZE, 45, Short.MAX_VALUE)
                                    .addComponent(report, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(c, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel7)
                                    .addComponent(recent))))))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addComponent(c, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(72, 72, 72)
                        .addComponent(jLabel6)))
                .addGap(37, 37, 37)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(report, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addComponent(location, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(recent)
                        .addGap(13, 13, 13)))
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(52, 52, 52)
                        .addComponent(jLabel9))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addComponent(setting, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 52, Short.MAX_VALUE)
                .addComponent(jButtonlogout)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(0, 21, Short.MAX_VALUE)
                .addComponent(adminlogo, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5))
                .addContainerGap())
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel5))
                    .addComponent(adminlogo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 240, 520));

        jPanel5.setBackground(new java.awt.Color(0, 0, 0));
        jPanel5.setForeground(new java.awt.Color(204, 0, 0));

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 780, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 20, 780, 20));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(204, 0, 0));
        jLabel3.setText("Welcome !");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 60, -1, -1));

        jPanel6.setBackground(new java.awt.Color(0, 204, 204));
        jPanel6.setForeground(new java.awt.Color(204, 0, 0));

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 520, Short.MAX_VALUE)
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 100, 520, 10));

        jPanel7.setBackground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 520, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 40, 20, 520));
        jPanel1.add(catagory, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 170, 90, 70));
        jPanel1.add(company, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 160, 100, 80));
        jPanel1.add(product, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 290, 90, 80));
        jPanel1.add(customer, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 400, 90, 80));
        jPanel1.add(bill, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 406, 80, 70));

        jPanel9.setBackground(new java.awt.Color(204, 0, 0));
        jPanel9.setForeground(new java.awt.Color(204, 0, 0));

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 520, Short.MAX_VALUE)
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 530, 520, 10));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonlogoutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonlogoutMouseClicked
      System.exit(0);  
    }//GEN-LAST:event_jButtonlogoutMouseClicked

    private void jLabelproductMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelproductMouseClicked
       Product obj=new Product();
       obj.setVisible(true);
       dispose();
    }//GEN-LAST:event_jLabelproductMouseClicked

    private void jLabelcatagoryMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelcatagoryMouseClicked
     Catagory obj=new Catagory();
     obj.setVisible(true);
     dispose();
    }//GEN-LAST:event_jLabelcatagoryMouseClicked

    private void jLabelcustomerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelcustomerMouseClicked
     Customer obj=new Customer();
      obj.setVisible(true);
      dispose();
    }//GEN-LAST:event_jLabelcustomerMouseClicked

    private void jLabelcompanyMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelcompanyMouseClicked
      Company obj=new Company();
      obj.setVisible(true);
      dispose();
    }//GEN-LAST:event_jLabelcompanyMouseClicked

    private void jButtonlogoutMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonlogoutMouseEntered
    jButtonlogout.setForeground(Color.WHITE);
    jButtonlogout.setBackground(new Color(0,102,102));
    jButtonlogout.setBorder(new LineBorder(new Color(255,102,0), 1, true)); 
    }//GEN-LAST:event_jButtonlogoutMouseEntered

    private void jButtonlogoutMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonlogoutMouseExited
    jButtonlogout.setForeground(new Color(0,102,102));
    jButtonlogout.setBackground(Color.black);
    jButtonlogout.setBorder(new LineBorder(Color.WHITE, 1, true));  
    }//GEN-LAST:event_jButtonlogoutMouseExited
    private int xmouse, ymouse;
    private void jLabelproductMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelproductMouseEntered
    jLabelproduct.setForeground(Color.red);
    jLabelproduct.setBackground(new Color(0,153,153));
    jLabelproduct.setBorder(new LineBorder(new Color(255,102,0), 1, true)); 
    }//GEN-LAST:event_jLabelproductMouseEntered

    private void jLabelproductMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelproductMouseExited
    jLabelproduct.setForeground(new Color(0,153,153));
    jLabelproduct.setBackground(Color.green);
    jLabelproduct.setBorder(new LineBorder(Color.WHITE, 1, true));
    }//GEN-LAST:event_jLabelproductMouseExited

    private void jLabelcatagoryMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelcatagoryMouseEntered
    jLabelcatagory.setForeground(Color.red);
    jLabelcatagory.setBackground(new Color(0,153,153));
    jLabelcatagory.setBorder(new LineBorder(new Color(255,102,0), 1, true)); 
    }//GEN-LAST:event_jLabelcatagoryMouseEntered

    private void jLabelcatagoryMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelcatagoryMouseExited
    jLabelcatagory.setForeground(new Color(0,153,153));
    jLabelcatagory.setBackground(Color.YELLOW);
    jLabelcatagory.setBorder(new LineBorder(Color.WHITE, 1, true));
    }//GEN-LAST:event_jLabelcatagoryMouseExited

    private void jLabelcustomerorderMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelcustomerorderMouseEntered
    jLabelcustomerorder.setForeground(Color.red);
    jLabelcustomerorder.setBackground(new Color(0,153,153));
    jLabelcustomerorder.setBorder(new LineBorder(new Color(255,102,0), 1, true)); 
    }//GEN-LAST:event_jLabelcustomerorderMouseEntered

    private void jLabelcustomerorderMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelcustomerorderMouseExited
    jLabelcustomerorder.setForeground(new Color(0,153,153));
    jLabelcustomerorder.setBackground(Color.GREEN);
    jLabelcustomerorder.setBorder(new LineBorder(Color.WHITE, 1, true));
    }//GEN-LAST:event_jLabelcustomerorderMouseExited

    private void jLabelcustomerMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelcustomerMouseEntered
    jLabelcustomer.setForeground(Color.red);
    jLabelcustomer.setBackground(new Color(0,153,153));
    jLabelcustomer.setBorder(new LineBorder(new Color(255,102,0), 1, true)); 
    }//GEN-LAST:event_jLabelcustomerMouseEntered

    private void jLabelcustomerMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelcustomerMouseExited
    jLabelcustomer.setForeground(new Color(0,153,153));
    jLabelcustomer.setBackground(Color.YELLOW);
    jLabelcustomer.setBorder(new LineBorder(Color.WHITE, 1, true));
    }//GEN-LAST:event_jLabelcustomerMouseExited

    private void jLabelcompanyMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelcompanyMouseEntered
    jLabelcompany.setForeground(Color.red);
    jLabelcompany.setBackground(new Color(0,153,153));
    jLabelcompany.setBorder(new LineBorder(new Color(255,102,0), 1, true)); 
    }//GEN-LAST:event_jLabelcompanyMouseEntered

    private void jLabelcompanyMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelcompanyMouseExited
    jLabelcompany.setForeground(new Color(0,153,153));
    jLabelcompany.setBackground(Color.YELLOW);
    jLabelcompany.setBorder(new LineBorder(Color.WHITE, 1, true));
    }//GEN-LAST:event_jLabelcompanyMouseExited

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

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        System.exit(0);
    }//GEN-LAST:event_jLabel2MouseClicked

    private void jPanel1MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MouseDragged
    int x=evt.getXOnScreen();
    int y=evt.getYOnScreen();
    setLocation(x-xmouse, y-ymouse); 
    }//GEN-LAST:event_jPanel1MouseDragged

    private void jPanel1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MousePressed
    xmouse=evt.getX();
    ymouse=evt.getY();
    }//GEN-LAST:event_jPanel1MousePressed

    private void jLabelcustomerorderMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelcustomerorderMouseClicked
     Vieworderbyadmin obj=new Vieworderbyadmin();
     obj.setVisible(true);
     dispose();
    }//GEN-LAST:event_jLabelcustomerorderMouseClicked

    public static void main(String args[]) {
      
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Adminhome().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel adminlogo;
    private javax.swing.JLabel bill;
    private javax.swing.JLabel c;
    private javax.swing.JLabel catagory;
    private javax.swing.JLabel company;
    private javax.swing.JLabel customer;
    private javax.swing.JButton jButtonlogout;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabelcatagory;
    private javax.swing.JLabel jLabelcompany;
    private javax.swing.JLabel jLabelcustomer;
    private javax.swing.JLabel jLabelcustomerorder;
    private javax.swing.JLabel jLabelmin;
    private javax.swing.JLabel jLabelproduct;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel9;
    private com.toedter.calendar.JYearChooser jYearChooser1;
    private javax.swing.JLabel location;
    private javax.swing.JLabel product;
    private javax.swing.JLabel recent;
    private javax.swing.JLabel report;
    private javax.swing.JLabel setting;
    // End of variables declaration//GEN-END:variables
}
