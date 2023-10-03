package sistematuristico.AccesoData;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import sistematuristico.Entidades.Ciudad;

public class CiudadData {

    private Connection con = null;

    public CiudadData() {
        con = Conexion.getConexion();
    }

    public void AltaCiudad(Ciudad ciudad) {
        String sql = "INSERT INTO alumno (idCiudad, nombre, nombre, provincia, pais,estado) VALUES (?, ?, ?, ?, ?,?)";
        try {
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setInt(1, ciudad.getIdCiudad());
            ps.setString(2, ciudad.getNombre());
            ps.setString(3, ciudad.getProvincia());
            ps.setString(3, ciudad.getPais());
            ps.setBoolean(5, ciudad.isEstado());
            ps.executeUpdate();
            ResultSet rs = ps.getGeneratedKeys();
            if (rs.next()) {
                ciudad.setIdCiudad(rs.getInt(1));
                JOptionPane.showMessageDialog(null, "Ciudad añadido con exito.");
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Ciudad\n[Error en el metodo AltaCiudad de CiudadData]\n" + ex.getMessage());
        }
    }

    public void BajaCiudad(int IdCiudadParametro) {
        String sql = "UPDATE ciudad SET estado = 0 WHERE IdCiudad = ? ";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, IdCiudadParametro);
            int exito = ps.executeUpdate();

            if (exito == 1) {
                JOptionPane.showMessageDialog(null, " Se eliminó la Ciudad.");
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Ciudad\n[Error en el metodo BajaCiudad de CiudadData]\n" + ex.getMessage());
        }
    }

    public void ModificacionCiudad(int IdCiudadParametro, Ciudad ciudad) {
        String sql = "UPDATE ciudad SET nombre = ? , provincia = ?, pais = ?, estado = ? WHERE idCiudad = ?";
        PreparedStatement ps = null;
        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, ciudad.getNombre());
            ps.setString(2, ciudad.getProvincia());
            ps.setString(3, ciudad.getPais());
            ps.setBoolean(4, ciudad.isEstado());
            ps.setInt(5, ciudad.getIdCiudad());

            int exito = ps.executeUpdate();
            if (exito == 1) {
                JOptionPane.showMessageDialog(null, "Modificado Exitosamente.");
            } else {
                JOptionPane.showMessageDialog(null, "La Ciudad no existe");
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Ciudad\n[Error en el metodo ModificacionCiudad de CiudadData]\n" + ex.getMessage());
        }
    }

}
