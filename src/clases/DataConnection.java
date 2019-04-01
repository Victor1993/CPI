package clases;

import java.sql.*;
import java.util.ArrayList;
import javax.swing.JOptionPane;
 
public class DataConnection {
 
    public static Connection con; // atribut per a guardar l’objecte connexió.
    private static DataConnection INSTANCE = null;
 
    /**Método constructor que ejecuta el método para conectar con la base de datos
     *
     */
    private DataConnection() {
        performConnection();
    }
 
    /**Crea una instancia de la base de datos en caso de no estar creada.
     *
     */
    private synchronized static void createInstance() {
        if (INSTANCE == null) {
            INSTANCE = new DataConnection();
        }
    }
 
    /**Metodo para retornar una instancia de la conexion. Si no esta creada la crea, y si esta creada la retorna
     * @return retorna una instancia de la conexión a la base de datos
     */
    public static DataConnection getInstance() {
        if (INSTANCE == null) createInstance();
        return INSTANCE;
    }
 
    /**Método para eliminar la instancia de la conexión
     *
     */
    public static void delInstance() {
        INSTANCE = null;
        closeConnection();
    }
 
    /**Método que crea la conexión a la base de datos
     *
     */
    public void performConnection() {
             
        String host = "localhost:3306";
        String user = "root";
        String pass = "";
        String dtbs = "bd_name";
 
        try { // preparamos la conexión
            Class.forName("com.mysql.jdbc.Driver");
            String newConnectionURL = "jdbc:mysql://" + host + "/" + dtbs + "?"
                    + "user=" + user + "&password=" + pass;
            con = DriverManager.getConnection(newConnectionURL);
            System.out.println("Conexion exitosa.");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,"<html><style>body{font-family:Arial, Helvetica, sans-serif;"
                              + "font-size:11px}</style>"
                              + "<div align=\"justify\">Ocurrió un problema al intentar conectarse con la Base de Datos.<br>"
                              + "Verifique su conexión con el servidor.<br>El sistema no se ejecutará hasta solucionar el problema</div></html>",
                    "Error de conexión",JOptionPane.ERROR_MESSAGE);
            System.exit(0);
        }
    }
 
    /**Método para cerrar la conexión con la base de dades
     *
     */
    public static void closeConnection() {
        try {
            con.close();
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Error: "+ex.getMessage(),"Error al cerrar la conexión con la BD",JOptionPane.ERROR_MESSAGE);
        }
    }
    
}
