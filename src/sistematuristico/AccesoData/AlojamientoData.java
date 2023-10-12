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
     private CiudadData ciudaddata=new CiudadData();

    public AlojamientoData() {
        con = Conexion.getConexion();
        
        
    }

    public void AltaAlojamiento(Alojamiento alojamiento) {
        String sql = "INSERT INTO alojamiento ( idAlojamiento, fechaIn, fechaOn, estado, servicio, importe, idDestino,tipoDeAlojamiento) VALUES (?,?, ?, ?, ?, ?,?,?)";
        try {
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setInt(1, alojamiento.getIdAlojamiento());
            ps.setDate(2, Date.valueOf(alojamiento.getFechaIn()));
            ps.setDate(3, Date.valueOf(alojamiento.getFechaOn()));
            ps.setBoolean(4, alojamiento.isEstado());
            ps.setString(5, alojamiento.getServicio());
            ps.setDouble(6, alojamiento.getImporteDiario());
            ps.setInt(7, alojamiento.getDestino().getIdCiudad());
            ps.setString(8, alojamiento.getTipo());
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

    public void ModificacionAlojamiento(int idAlojamientoParametro, Alojamiento alojamiento) {
        String sql = "UPDATE alojamiento SET fechaIn = ?, fechaOn = ?, estado = ?, servicio = ?, importe = ?, idDestino = ?, tipoDeAlojamiento=? WHERE IdAlojamiento = ?";
        PreparedStatement ps = null;
        try {
            ps = con.prepareStatement(sql);
            ps.setDate(1, Date.valueOf(alojamiento.getFechaIn()));
            ps.setDate(2, Date.valueOf(alojamiento.getFechaOn()));
            ps.setBoolean(3, alojamiento.isEstado());
            ps.setString(4, alojamiento.getServicio());
            ps.setDouble(5, alojamiento.getImporteDiario());
            ps.setInt(6, alojamiento.getDestino().getIdCiudad());
            ps.setString(7, alojamiento.getTipo());
            ps.setInt(8, idAlojamientoParametro);
           

            int exito = ps.executeUpdate();
            if (exito == 1) {
                JOptionPane.showMessageDialog(null, "Modificado Exitosamente.");
                alojamiento.setIdAlojamiento(idAlojamientoParametro);
            } else {
                JOptionPane.showMessageDialog(null, "El Alojamiento no existe");
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Alojamiento\n[Error en el metodo ModificacionAlojamiento de AlojamientoData]\n" + ex.getMessage());
        }
    }
     public Alojamiento buscarAlojamiento(int id) {
        Alojamiento alojamiento = null;
        String sql = "SELECT idAlojamiento, fechaIn, fechaOn, estado, servicio, importe, idDestino,tipoDeAlojamiento FROM alojamiento WHERE idAlojamiento = ? AND estado = 1";
        PreparedStatement ps = null;
        try {
            ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                alojamiento = new Alojamiento();
                alojamiento.setIdAlojamiento(id);
                alojamiento.setFechaIn(rs.getDate("fechaIn").toLocalDate());
                alojamiento.setFechaOn(rs.getDate("fechaOn").toLocalDate());
                alojamiento.setEstado(rs.getBoolean("estado"));
                alojamiento.setServicio(rs.getString("servicio"));
                alojamiento.setImporteDiario(rs.getDouble("importe"));
                alojamiento.setTipo(rs.getString("tipoDeAlojamiento"));
                
               Ciudad ciudad=ciudaddata.buscarCiudad(rs.getInt("idDestino"));
                alojamiento.setDestino(ciudad);

            } else {
                JOptionPane.showMessageDialog(null, "No existe registro del alojamiento");
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla alojamiento " + ex.getMessage());
        }
        return alojamiento;
     }
     
}
