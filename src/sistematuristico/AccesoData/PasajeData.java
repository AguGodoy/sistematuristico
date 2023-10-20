package sistematuristico.AccesoData;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import sistematuristico.Entidades.Ciudad;
import sistematuristico.Entidades.Pasaje;

public class PasajeData {

    private Connection con = null;
    private CiudadData ciudaddata = new CiudadData();

    public PasajeData() {
        con = Conexion.getConexion();
    }

    public int AltaPasaje(Pasaje pasaje) {
        String sql = "INSERT INTO pasaje (transporte, importe, idOrigen, estado) VALUES ( ?, ?, ?, ?)";
        try {
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setString(1, pasaje.getTransporte());
            ps.setDouble(2, pasaje.getImporte());
            ps.setInt(3, pasaje.getOrigen().getIdCiudad());
            ps.setBoolean(4, pasaje.isEstado());
            //ps.setInt(6, pasaje.getDestino().getIdCiudad());
            ps.executeUpdate();
            ResultSet rs = ps.getGeneratedKeys();
            if (rs.next()) {
                pasaje.setIdPasaje(rs.getInt(1));
                //JOptionPane.showMessageDialog(null, "pasaje añadido con exito.");
            }
            ps.close();
            return pasaje.getIdPasaje();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "\"Error al acceder a la tabla pasaje \\n[Error en el metodo Altapasaje de PasajeData]\\n\"" + ex.getMessage());
        }
        return 0;
    }

    public void BajaPasaje(int idPasaje) {
        String sql = "UPDATE pasaje SET estado = 0 WHERE IdPasaje = ? ";
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
        String sql = "UPDATE pasaje SET transporte = ?, importe = ? , idOrigen = ?, estado = ? WHERE Idpasaje = ?";
        PreparedStatement ps = null;
        try {
            ps = con.prepareStatement(sql);

            ps.setString(1, pasaje.getTransporte());
            ps.setDouble(2, pasaje.getImporte());
            ps.setInt(3, pasaje.getOrigen().getIdCiudad());
            ps.setBoolean(4, pasaje.isEstado());
            ps.setInt(5, IdPasaje);

            int exito = ps.executeUpdate();
            if (exito == 1) {
                //JOptionPane.showMessageDialog(null, "Modificado Exitosamente.");
            } else {
                JOptionPane.showMessageDialog(null, "el Pasaje no existe");
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla pasaje \n[Error en el metodo ModificacionPasaje de PasajeData]\n" + ex.getMessage());
        }
    }

    public Pasaje buscarPasaje(int id) {
        Pasaje pasaje = null;
        String sql = "SELECT idPasaje, transporte, importe, idOrigen, estado FROM pasaje WHERE idPasaje = ? AND estado = 1";
        PreparedStatement ps = null;
        try {
            ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                pasaje = new Pasaje();
                pasaje.setIdPasaje(id);
                pasaje.setTransporte(rs.getString("transporte"));
                pasaje.setImporte(rs.getDouble("importe"));
                pasaje.setEstado(rs.getBoolean("estado"));
                Ciudad ciudad = ciudaddata.buscarCiudad(rs.getInt("idOrigen"));
                pasaje.setOrigen(ciudad);

            } else {
                JOptionPane.showMessageDialog(null, "No existe el pasaje");
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla pasaje " + ex.getMessage());
        }
        return pasaje;
    }
     public void BajaRealPasaje(int IdPasaje) {
        String sql = "DELETE FROM `pasaje` WHERE IdPasaje= ?";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, IdPasaje);
            int exito = ps.executeUpdate();

            if (exito == 1) {
                JOptionPane.showMessageDialog(null, " Se eliminó el Pasaje.");
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Pasaje\n[Error en el metodo BajaRealCiudad de CiudadData]\n" + ex.getMessage());
        }
    }

}
