
package travel.management.system;

import java.sql.*;  

public class Conn{
    public Connection conn;
    Connection c;
    public Statement s;
    public Conn(){  
        try{  
            Class.forName("com.mysql.cj.jdbc.Driver");
            c =DriverManager.getConnection("jdbc:mysql://localhost:3306/railwaymanagementsystem", "root", "satyjit6022");
            
            s =c.createStatement();  
            
           
        }catch(Exception e){ 
            System.out.println(e);
        }  
    }  
}  
