package sistematuristico.AccesoData;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import sistematuristico.Entidades.Pasaje;

public class PasajeData {

    private Connection con = null;

    public PasajeData() {
        con = Conexion.getConexion();
    }

    public void AltaPasaje(Pasaje Pasaje) {
        String sql = "INSERT INTO alumno (Ciudad origen, Ciudad destino, Alojamiento alojaminto, Pasaje pasaje) VALUES (?, ?, ?, ?, ?,?)";
        try {
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setInt(1, Pasaje.getIdPasaje());
            ps.setString(2, Pasaje.getTransporte());
            ps.setDouble(3, Pasaje.getImporte());
            ps.setCiudad(3, Pasaje.getOrigen());
            ps.setBoolean(5, Pasaje.isEstado());
            ps.executeUpdate();
            ResultSet rs = ps.getGeneratedKeys();
            if (rs.next()) {
                Pasaje.setIdPasaje(rs.getInt(1));
                JOptionPane.showMessageDialog(null, "pasaje añadido con exito.");
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "\"Error al acceder a la tabla pasaje \\n[Error en el metodo Altapasaje de PasajeData]\\n\"" + ex.getMessage());
        }
    }

    public void BajaPasaje(int idPasaje) {
        String sql = "UPDATE ciudad SET estado = 0 WHERE IdCiudad = ? ";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, idPasaje);
            int exito = ps.executeUpdate();

            if (exito == 1) {
                JOptionPane.showMessageDialog(null, " Se eliminó el pasaje.");
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla pasaje \n[Error en el metodo BajaPasaje de PasajeData]\n" + ex.getMessage());
        }
    }

    public void ModificacionPasaje(int IdPasaje, Pasaje pasaje) {
        String sql = "UPDATE ciudad SET nombre = ? , provincia = ?, pais = ?, estado = ? WHERE idCiudad = ?";
        PreparedStatement ps = null;
        try {
            ps = con.prepareStatement(sql);
             ps.setInt(1, pasaje.getIdPasaje());
            ps.setString(2, pasaje.getTransporte());
            ps.setDouble(3, pasaje.getImporte());
            ps.setCiudad(3, pasaje.getOrigen());
            ps.setBoolean(5, pasaje.isEstado());

            int exito = ps.executeUpdate();
            if (exito == 1) {
                JOptionPane.showMessageDialog(null, "Modificado Exitosamente.");
            } else {
                JOptionPane.showMessageDialog(null, "el Pasaje no existe");
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla pasaje \n[Error en el metodo ModificacionPasaje de PasajeData]\n" + ex.getMessage());
        }
    }

}

