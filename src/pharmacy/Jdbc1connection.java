package pharmacy;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
public class Jdbc1connection {
    public static Connection getConnection() 
    {
        Connection conn=null;
        try {
            
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/pharmacy","root","");
            
           
        } catch (Exception exp) {
            JOptionPane.showMessageDialog(null,exp);
        }
         return conn;
    }
        
    
    
}
