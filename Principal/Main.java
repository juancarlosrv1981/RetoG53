package Principal;
import Model.*;
import View.*;

public class Main {

    public static void main(String[] args) {
      //connection
      Conexion conexion= new Conexion();
      //conexion.getConnection();
        
      //1. creamos la instancia de la vista login
      Login login = new Login();
      login.setVisible(true);
      
     
    }
    
}
