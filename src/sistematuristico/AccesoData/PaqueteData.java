/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
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
import sistematuristico.Entidades.Paquete;
import sistematuristico.Entidades.Pasaje;

/**
 *
 * @author Usuario
 */
public class PaqueteData {

    private Connection con = null;
     private CiudadData ciudaddata=new CiudadData();
    private AlojamientoData alojamientodata = new AlojamientoData();
    private PasajeData pasajedata=new PasajeData();
    
    public PaqueteData() {
        con = Conexion.getConexion();
    }

    public void AltaPaquete(Paquete paquete) {
        String sql = "INSERT INTO paquete( idOrigen, idDestino, idAlojamiento, idPasaje) VALUES (?,?,?,?)";
        try {
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setInt(1, paquete.getOrigen().getIdCiudad());
            ps.setInt(2, paquete.getDestino().getIdCiudad());
            ps.setInt(3, paquete.getAloja().getIdAlojamiento());
            ps.setInt(4, paquete.getPasa().getIdPasaje());

            ps.executeUpdate();
            ResultSet rs = ps.getGeneratedKeys();
            if (rs.next()) {
                paquete.setIdPaquete(rs.getInt(1));
                JOptionPane.showMessageDialog(null, "Se genero su paquete turistico con exito.");
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Paquete" + ex.getMessage());
        }
    }

    public void ModificarPaquete(int idPaquete, Paquete paquete) {
        String sql = "UPDATE paquete SET origen = ? , destino = ?, alojamiento = ?, pasaje = ? WHERE idPaquete = ?";
        PreparedStatement ps = null;

        try {
            ps = con.prepareStatement(sql);
            ps.setInt(1, paquete.getOrigen().getIdCiudad());
            ps.setInt(2, paquete.getDestino().getIdCiudad());
            ps.setInt(3, paquete.getAloja().getIdAlojamiento());
            ps.setInt(4, paquete.getPasa().getIdPasaje());

            int exito = ps.executeUpdate();

            if (exito == 1) {
                JOptionPane.showMessageDialog(null, "se modifico el Paquete exitosamente");
            } else {
                JOptionPane.showMessageDialog(null, "El Paquete no existe");
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Paquete " + ex.getMessage());
        }
    }

    public void BajaPaquete(int idPaquete) { //"eliminar"
        try {
            String sql = "DELETE FROM paquete WHERE  idPaquete = ? ";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, idPaquete);

            if (ps.executeUpdate() > 0) {

                JOptionPane.showMessageDialog(null, "El registro ha sido eliminado exitosamente",
                        "Operación Exitosa", JOptionPane.INFORMATION_MESSAGE);

                ps.close();

            } else {

                JOptionPane.showMessageDialog(null, "No se ha podido eliminar el registro\n"
                        + "Inténtelo nuevamente.", "Error en la operación",
                        JOptionPane.ERROR_MESSAGE);

            }

        } catch (SQLException error) {

            JOptionPane.showMessageDialog(null, "No se ha podido eliminar el registro\n Inténtelo nuevamente.\n"
                    + "Error: " + error, "Error en la operación", JOptionPane.ERROR_MESSAGE);

        }

    }
         public Paquete buscarPaquete(int id) {
        Paquete paquete = null;
        String sql = "SELECT idOrigen, idDestino, idAlojamiento, idPasaje FROM paquete WHERE idPaquete = ?";
        PreparedStatement ps = null;
        try {
            ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                paquete = new Paquete();
                paquete.setIdPaquete(id);
                Ciudad ciudad1 =ciudaddata.buscarCiudad(rs.getInt("idDestino"));
                paquete.setDestino(ciudad1);
                Ciudad ciudad2 =ciudaddata.buscarCiudad(rs.getInt("idDestino"));
                paquete.setDestino(ciudad2);
                Alojamiento alojamiento=alojamientodata.buscarAlojamiento(rs.getInt("idAlojamiento"));
                paquete.setAloja(alojamiento);
                Pasaje pasaje=pasajedata.buscarPasaje(rs.getInt("idPasaje"));
                paquete.setPasa(pasaje);
              
            } else {
                JOptionPane.showMessageDialog(null, "No existe el paquete");
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla paquete " + ex.getMessage());
        }
        return paquete;
     }
}
