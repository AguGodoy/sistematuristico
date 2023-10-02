/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistematuristico.Entidades;

/**
 *
 * @author Usuario
 */
public class Paquete {
    private int idPaquete;
    private Ciudad origen;
    private Ciudad destino;
    private Alojamiento alojamiento;
    private Pasaje pasaje;

    public Paquete() {
    }

    public Paquete(Ciudad origen, Ciudad destino, Alojamiento alojaminto, Pasaje pasaje) {
        this.origen = origen;
        this.destino = destino;
        this.alojamiento = alojaminto;
        this.pasaje = pasaje;
    }

    public Paquete(int idPaquete, Ciudad origen, Ciudad destino, Alojamiento alojaminto, Pasaje pasaje) {
        this.idPaquete = idPaquete;
        this.origen = origen;
        this.destino = destino;
        this.alojamiento = alojaminto;
        this.pasaje = pasaje;
    }

    public int getIdPaquete() {
        return idPaquete;
    }

    public void setIdPaquete(int idPaquete) {
        this.idPaquete = idPaquete;
    }

    public Ciudad getOrigen() {
        return origen;
    }

    public void setOrigen(Ciudad origen) {
        this.origen = origen;
    }

    public Ciudad getDestino() {
        return destino;
    }

    public void setDestino(Ciudad destino) {
        this.destino = destino;
    }

    public Alojamiento getAlojaminto() {
        return alojamiento;
    }

    public void setAlojaminto(Alojamiento alojaminto) {
        this.alojamiento = alojaminto;
    }

    public Pasaje getPasaje() {
        return pasaje;
    }

    public void setPasaje(Pasaje pasaje) {
        this.pasaje = pasaje;
    }
    
    @Override
    public String toString(){
        return idPaquete+" "+origen+" "+destino+" " +alojamiento+ " "+ pasaje;
    }
}
