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

    public void AltaPasaje(Pasaje idPasaje) {
        String sql = "INSERT INTO alumno (Ciudad origen, Ciudad destino, Alojamiento alojaminto, Pasaje pasaje) VALUES (?, ?, ?, ?, ?,?)";
        try {
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setInt(1, Pasaje.getidPasaje());
            ps.setString(2, Pasaje.gettransporte());
            ps.setdouble(3, Pasaje.getimporte());
            ps.setCiudad(3, Pasaje.getorigen());
            ps.setBoolean(5, Pasaje.getestado());
            ps.executeUpdate();
            ResultSet rs = ps.getGeneratedKeys();
            if (rs.next()) {
                Pasaje.setidPasaje(rs.getInt(1));
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
            ps.setInt(1, IdPasaje);
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
             ps.setInt(1, pasaje.getidPasaje());
            ps.setString(2, pasaje.gettransporte());
            ps.setdouble(3, pasaje.getimporte());
            ps.setCiudad(3, pasaje.getOrigen());
            ps.setBoolean(5, pasaje.getestado);

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

