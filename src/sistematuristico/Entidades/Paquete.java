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
    private Alojamiento aloja;
    private Pasaje pasa;
    private int cantPersonas;

    public Paquete() {
        this.cantPersonas = 1;
    }

    public Paquete(Ciudad origen, Ciudad destino, Alojamiento alojaminto, Pasaje pasaje, int cantPersonas) {
        this.origen = origen;
        this.destino = destino;
        this.aloja = alojaminto;
        this.pasa = pasaje;
        this.cantPersonas = cantPersonas;
    }

    public Paquete(int idPaquete, Ciudad origen, Ciudad destino, Alojamiento alojaminto, Pasaje pasaje, int cantPersonas) {
        this.idPaquete = idPaquete;
        this.origen = origen;
        this.destino = destino;
        this.aloja = alojaminto;
        this.pasa = pasaje;
        this.cantPersonas = cantPersonas;
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

    public Alojamiento getAloja() {
        return aloja;
    }

    public void setAloja(Alojamiento alojaminto) {
        this.aloja = alojaminto;
    }

    public Pasaje getPasa() {
        return pasa;
    }

    public void setPasa(Pasaje pasaje) {
        this.pasa = pasaje;
    }

    public int getCantPersonas() {
        return cantPersonas;
    }

    public void setCantPersonas(int cantPersonas) {
        this.cantPersonas = cantPersonas;
    }

    @Override
    public String toString() {
        return idPaquete + " " + origen + " " + destino + " " + aloja + " " + pasa;
    }

}
