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
import net.proteanit.sql.DbUtils;
public class Customerorderviewbyadmin extends javax.swing.JFrame {
    public Customerorderviewbyadmin() {
        initComponents();
        orderlist();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTablebill = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTablebill.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "BILL ID", "MED NAME", "QUANTITY", "QUANTITY PRICE", "TOTAL PRICE"
            }
        ));
        jTablebill.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTablebillMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTablebill);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 418, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(54, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(161, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTablebillMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTablebillMouseClicked
    }//GEN-LAST:event_jTablebillMouseClicked
    public void orderlist()
     {
         try {
             Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/pharmacy", "root", "");
            Statement st = conn.createStatement();
             ResultSet rs = st.executeQuery("select * from pharmacy.customerorder");
            jTablebill.setModel(DbUtils.resultSetToTableModel(rs));
        } catch (SQLException exp) {
            exp.printStackTrace();
        }
     }
    public static void main(String args[]) {
                java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Customerorderviewbyadmin().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTablebill;
    // End of variables declaration//GEN-END:variables
}
