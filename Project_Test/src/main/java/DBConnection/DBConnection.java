package DBConnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

public class DBConnection {
 
    public static String URL = "jdbc:mysql://localhost:3306/presentationtest?autoReconnect=true&useSSL=false";
    public static String user = "root";
    public static String password = "1234";
    
    public Connection connection_;
    PreparedStatement ps;
    ResultSet rs;
 
    public Connection getConnection(){
            
        try{
        
            connection_ = DriverManager.getConnection(URL, user, password);
            JOptionPane.showMessageDialog(null, "Successful Connection");
            
        }catch(Exception ex){ System.err.println("Error " + ex);}
        
        return connection_;
    }
}
