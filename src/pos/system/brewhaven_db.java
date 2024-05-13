/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pos.system;

/**
 *
 * @author JJ
 */
import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Statement;
import java.sql.SQLException;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

        
        
public class brewhaven_db {
    private Connection conn;
    private Statement statement;
    
    public connection openConnection (String driver, Object ex) throws SQLException
    {
        if (conn == null)
        {
            String url= "jdbc.mysql://localohst/";
            String dbName = "brewhaven_db";
            String Driver = "com.mysql.jdbc.Driver";
            String userName = "root";
            String password = "admin";
            try{
            
                Class.forName(driver);
                this.conn = (Connection) DriverManager.getConnection(url+dbName,userName,password);
                
                
                System.out.println("Connection Successful!");
            }
            catch (ClassNotFoundException | SQLException sqle) {
                System.out.println("Connection Successful!");
                Logger.getLogger(brewhaven_db.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return null;
    }   
    

    private static class connection {

        public connection() {
        }
    }
        
    
}
