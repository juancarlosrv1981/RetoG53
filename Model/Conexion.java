package Model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {
    
    Connection connection;
     
     String driver = "com.mysql.cj.jdbc.Driver";
     String cadenaConexion = "jdbc:mysql://localhost:3306/Reto1";  
     String user = "root";
     String password = "";
     
    public Conexion(){
         try {
             Class.forName(driver);
             
             connection = DriverManager.getConnection(cadenaConexion, user, password);
             
             if (connection != null) {
                 System.out.println("Connection to the Data Base, done");                 
             }
         } catch (ClassNotFoundException | SQLException e) {
                System.out.println("Connection to the Data Base, Fail");                 
         }                  
    }     
     
     public Connection getConnection(){
         return connection;
     }
}
