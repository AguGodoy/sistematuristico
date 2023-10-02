/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistematuristico.AccesoData;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class Conexion {

    private static final String URL = "jdbc:mariadb://localhost/";
    private static final String DB = "sistematuristico";
    private static final String USUARIO = "root";
    private static String PASSWORD = "";

    private static Conexion conexion = null;

    private Conexion() {
        try {
            Class.forName("org.mariadb.jdbc.Driver");
        } catch (ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(null, "No se puede establecer la conexion [" + ex.getMessage() + "]");
        }

    }

    public static Connection getConexion() {
        Connection con = null;
        if (conexion == null) {
            conexion = new Conexion();
        }
        try {
            con = DriverManager.getConnection(URL + DB + "?useLegacyDatetimeCode=false&serverTimezone=UTC"
                    + "&user=" + USUARIO + "&password=" + PASSWORD);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error de conexion [" + ex.getMessage() + "]");
        }
        return con;
    }
}
