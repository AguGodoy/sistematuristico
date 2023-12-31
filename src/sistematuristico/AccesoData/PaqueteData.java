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
import java.util.ArrayList;
import java.util.List;
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
    private CiudadData ciudadData = new CiudadData();
    private AlojamientoData alojamientoData = new AlojamientoData();
    private PasajeData pasajeData = new PasajeData();

    public PaqueteData() {
        con = Conexion.getConexion();
    }

    public int AltaPaquete(Paquete paquete) {
        String sql = "INSERT INTO paquete( idOrigen, idDestino, idAlojamiento, idPasaje,cantPersonas,estado) VALUES (?,?,?,?,?,?)";
        try {
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setInt(1, paquete.getOrigen().getIdCiudad());
            ps.setInt(2, paquete.getDestino().getIdCiudad());
            ps.setInt(3, paquete.getAloja().getIdAlojamiento());
            ps.setInt(4, paquete.getPasa().getIdPasaje());
            ps.setInt(5, paquete.getCantPersonas());
            ps.setBoolean(6, true);

            ps.executeUpdate();
            ResultSet rs = ps.getGeneratedKeys();
            if (rs.next()) {
                paquete.setIdPaquete(rs.getInt(1));
                //JOptionPane.showMessageDialog(null, "Se genero su paquete turistico con exito.");
                return paquete.getIdPaquete();
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Paquete [AltaPaquete]" + ex.getMessage());
        }
        return 0;
    }

    public void ModificarPaquete(int idPaquete, Paquete paquete) {
        String sql = "UPDATE paquete SET idOrigen = ? , idDestino = ?, idAlojamiento = ?, idPasaje = ?, cantPersonas = ?,estado = ? WHERE idPaquete = ?";
        PreparedStatement ps = null;

        try {
            ps = con.prepareStatement(sql);
            ps.setInt(1, paquete.getOrigen().getIdCiudad());
            ps.setInt(2, paquete.getDestino().getIdCiudad());
            ps.setInt(3, paquete.getAloja().getIdAlojamiento());
            ps.setInt(4, paquete.getPasa().getIdPasaje());
            ps.setInt(5, paquete.getCantPersonas());
            ps.setBoolean(6, paquete.isEstado());
            ps.setInt(7, idPaquete);

            int exito = ps.executeUpdate();

            if (exito == 1) {
                // JOptionPane.showMessageDialog(null, "se modifico el Paquete exitosamente");
            } else {
                JOptionPane.showMessageDialog(null, "El Paquete no existe");
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Paquete [ModificarPaquete]" + ex.getMessage());
        }
    }

    public void BajaPaquete(int idPaquete) { //"eliminar"
        String sql = "UPDATE paquete SET estado = 0 WHERE idPaquete = ?";
        PreparedStatement ps = null;
        try {
            ps = con.prepareStatement(sql);
            ps.setInt(1, idPaquete);
            if (ps.executeUpdate() > 0) {

                /*JOptionPane.showMessageDialog(null, "El registro ha sido eliminado exitosamente",
                        "Operación Exitosa", JOptionPane.INFORMATION_MESSAGE);*/
            } else {

                JOptionPane.showMessageDialog(null, "No se ha podido eliminar el registro\n"
                        + "Inténtelo nuevamente.", "Error en la operación",
                        JOptionPane.ERROR_MESSAGE);

            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Paquete [BajaPaquete]" + ex.getMessage());
        }

    }

    public void BajaRealPaquete(int idPaquete) {
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
        String sql = "SELECT idOrigen, idDestino, idAlojamiento, idPasaje, cantPersonas,estado FROM paquete WHERE idPaquete = ?";
        PreparedStatement ps = null;
        try {
            ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                paquete = new Paquete();
                paquete.setIdPaquete(id);
                Ciudad ciudad1 = ciudadData.buscarCiudad(rs.getInt("idOrigen"));
                paquete.setOrigen(ciudad1);
                Ciudad ciudad2 = ciudadData.buscarCiudad(rs.getInt("idDestino"));
                paquete.setDestino(ciudad2);
                Alojamiento alojamiento = alojamientoData.buscarAlojamiento(rs.getInt("idAlojamiento"));
                paquete.setAloja(alojamiento);
                Pasaje pasaje = pasajeData.buscarPasaje(rs.getInt("idPasaje"));
                paquete.setPasa(pasaje);
                paquete.setCantPersonas(rs.getInt("cantPersonas"));
                paquete.setEstado(rs.getBoolean("estado"));

            } else {
                JOptionPane.showMessageDialog(null, "No existe el paquete");
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla paquete en buscarPaquete" + ex.getMessage());
        }
        return paquete;
    }
     public List<Paquete> listarPaquetes() {
        List<Paquete> ListaPaquetes = new ArrayList<>();
        try {
            String sql = "SELECT * FROM paquete";
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Paquete paquete = new Paquete();
                paquete.setIdPaquete(rs.getInt("idPaquete"));
                paquete.setOrigen(ciudadData.buscarCiudad(rs.getInt("idOrigen")));
                paquete.setDestino(ciudadData.buscarCiudad(rs.getInt("idDestino")));            
                paquete.setAloja(alojamientoData.buscarAlojamiento(rs.getInt("idAlojamiento")));
                paquete.setPasa(pasajeData.buscarPasaje(rs.getInt("idPasaje")));
                paquete.setCantPersonas(rs.getInt("cantPersonas"));
                paquete.setEstado(rs.getBoolean("estado"));
                
                ListaPaquetes.add(paquete);
            }
            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Ciudad\n[Error en el metodo listarPaquetes de PaqueteData]\n" + ex.getMessage());
        }
        return ListaPaquetes;
    }
}
