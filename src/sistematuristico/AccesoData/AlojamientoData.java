package sistematuristico.AccesoData;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import sistematuristico.Entidades.Alojamiento;
import sistematuristico.Entidades.Ciudad;

public class AlojamientoData {
     private Connection con = null;

    public AlojamientoData() {
        con = Conexion.getConexion();
    }

    public void AltaAlojamiento(Alojamiento alojamiento) {
        String sql = "INSERT INTO alojamiento (idAlojamiento, fechaIn, fechaOn, estado, servicio, importe, idDestino) VALUES (?, ?, ?, ?, ?,?,?)";
        try {
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setInt(1, alojamiento.getIdAlojamiento());
            ps.setDate(2, Date.valueOf(alojamiento.getFechaIn()));
            ps.setDate(3, Date.valueOf(alojamiento.getFechaOn()));
            ps.setBoolean(4, alojamiento.isEstado());
            ps.setString(5, alojamiento.getServicio());
            ps.setDouble(6, alojamiento.getImporteDiario());
            ps.setInt(7, alojamiento.getDestino().getIdCiudad());
            ps.executeUpdate();
            ResultSet rs = ps.getGeneratedKeys();
            if (rs.next()) {
                alojamiento.setIdAlojamiento(rs.getInt(1));
                JOptionPane.showMessageDialog(null, "Alojamiento añadido con exito.");
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Alojamiento\n[Error en el metodo AltaAlojamiento de AlojamientoData]\n" + ex.getMessage());
        }
    }

    public void BajaAlojamiento(int IdAlojamientoParametro) {
        String sql = "UPDATE alojamiento SET estado = 0 WHERE IdAlojamiento = ? ";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, IdAlojamientoParametro);
            int exito = ps.executeUpdate();

            if (exito == 1) {
                JOptionPane.showMessageDialog(null, " Se eliminó el Alojamiento.");
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Alojamiento\n[Error en el metodo BajaAlojamiento de AlojamientoData]\n" + ex.getMessage());
        }
    }

    public void ModificacionAlojamiento(int IdAlojamientoParametro, Alojamiento alojamiento) {
        String sql = "UPDATE alojamiento SET fechaIn = ?, fechaOn = ?, estado = ?, servicio = ?, importe = ?, idDestino = ? WHERE IdAlojamiento = ?";
        PreparedStatement ps = null;
        try {
            ps.setDate(1, Date.valueOf(alojamiento.getFechaIn()));
            ps.setDate(2, Date.valueOf(alojamiento.getFechaOn()));
            ps.setBoolean(3, alojamiento.isEstado());
            ps.setString(4, alojamiento.getServicio());
            ps.setDouble(5, alojamiento.getImporteDiario());
            ps.setInt(6, alojamiento.getDestino().getIdCiudad());
            ps.setInt(7, IdAlojamientoParametro);

            int exito = ps.executeUpdate();
            if (exito == 1) {
                JOptionPane.showMessageDialog(null, "Modificado Exitosamente.");
            } else {
                JOptionPane.showMessageDialog(null, "El Alojamiento no existe");
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Alojamiento\n[Error en el metodo ModificacionAlojamiento de AlojamientoData]\n" + ex.getMessage());
        }
    }
}
