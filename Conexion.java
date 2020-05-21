package transportesdecolombia;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;


public class Conexion {
 Connection conect = null;
    public Connection conexion()
        {
            try { // Metodo try para capturar excepciones
                //ejecucion dem metodo para cargar el Driver MySQL
                Class.forName("com.mysql.jdbc.Driver");
                conect = DriverManager.getConnection("jdbc:mysql://localhost/transporte","root","");
                System.out.println("Operacion Exitosa...");
               // JOptionPane.showMessageDialog(null,"Operacion Exitosa...");
               
              
                
            } catch (ClassNotFoundException | SQLException e) {
                System.out.println("Hubo un error en la conexion");
                JOptionPane.showMessageDialog(null,"Error en conexion"+e);
            }
            return conect;
        }

}
