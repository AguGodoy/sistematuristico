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
import sistematuristico.Entidades.Paquete;

/**
 *
 * @author Usuario
 */
public class PaqueteData {

    private Connection con = null;

    public PaqueteData() {
        con = Conexion.getConexion();
    }

    public void AltaPaquete(Paquete paquete) {
        String sql = "INSERT INTO paquete( idOrigen, idDestino, idAlojamiento, idPasaje) VALUES (?,?,?,?)";
        try {
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setObject(1, paquete.getOrigen());
            ps.setObject(2, paquete.getDestino());
            ps.setObject(3, paquete.getAlojamiento());
            ps.setObject(4, paquete.getPasaje());

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
            ps.setObject(1, paquete.getOrigen());
            ps.setObject(2, paquete.getDestino());
            ps.setObject(3, paquete.getAlojamiento());
            ps.setObject(4, paquete.getPasaje());
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
}
