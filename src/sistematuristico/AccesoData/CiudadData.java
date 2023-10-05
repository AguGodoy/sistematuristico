package sistematuristico.AccesoData;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import sistematuristico.Entidades.Ciudad;

public class CiudadData {

    private Connection con = null;

    public CiudadData() {
        con = Conexion.getConexion();
    }

    public void AltaCiudad(Ciudad ciudad) {
        String sql = "INSERT INTO ciudad (idCiudad, nombre, provincia, pais, estado) VALUES (?, ?, ?, ?, ?)";
        try {
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setInt(1, ciudad.getIdCiudad());
            ps.setString(2, ciudad.getNombre());
            ps.setString(3, ciudad.getProvincia());
            ps.setString(4, ciudad.getPais());
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
    public void BajaRealCiudad(int IdCiudadParametro) {
        String sql = "DELETE FROM `ciudad` WHERE IdCiudad = ?";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, IdCiudadParametro);
            int exito = ps.executeUpdate();

            if (exito == 1) {
                JOptionPane.showMessageDialog(null, " Se eliminó la Ciudad.");
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Ciudad\n[Error en el metodo BajaRealCiudad de CiudadData]\n" + ex.getMessage());
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
            ps.setInt(5, IdCiudadParametro);

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
     public Ciudad buscarCiudad(int id) {
        Ciudad ciudad = null;
        String sql = "SELECT  nombre, provincia, pais, estado FROM ciudad WHERE idCiudad = ?";
        PreparedStatement ps = null;
        try {
            ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                ciudad = new Ciudad();
                ciudad.setIdCiudad(id);
                ciudad.setNombre(rs.getString("nombre"));
                ciudad.setProvincia(rs.getString("provincia"));
                ciudad.setPais(rs.getString("pais"));
                ciudad.setEstado(rs.getBoolean("estado"));

            } else {
                JOptionPane.showMessageDialog(null, "No existe la Ciudad");
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Ciudad\n[Error en el metodo buscarCiudad de CiudadData]\n" + ex.getMessage());
        }
        return ciudad;
     }
     
     public List<Ciudad> listarCiudades() {
        List<Ciudad> ListaCiudades = new ArrayList<>();
        try {
            String sql = "SELECT * FROM ciudad";
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Ciudad ciudad = new Ciudad();
                ciudad.setIdCiudad(rs.getInt("idCiudad"));
                ciudad.setNombre(rs.getString("nombre"));
                ciudad.setProvincia(rs.getString("provincia"));
                ciudad.setPais(rs.getString("pais"));
                ciudad.setEstado(rs.getBoolean("estado"));
                
                ListaCiudades.add(ciudad);
            }
            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Ciudad\n[Error en el metodo listarCiudades de CiudadData]\n" + ex.getMessage());
        }
        return ListaCiudades;
    }

}
