package conexion;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

public class conexionSQL {

    Connection conectar = null;

    public Connection conexion() {
     try {
        // Cargar el controlador JDBC
        Class.forName("com.mysql.cj.jdbc.Driver");

        // Establecer la conexión
        conectar = DriverManager.getConnection("jdbc:mysql://localhost/login", "root", "durtecks");
        System.out.println("Conexión exitosa");

    } catch (Exception e) {
        JOptionPane.showMessageDialog(null, "Error de conexión: " + e.getMessage());
    }
    return conectar;
}
}
