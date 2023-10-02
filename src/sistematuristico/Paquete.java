/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistematuristico;

/**
 *
 * @author Usuario
 */
public class Paquete {
    private int idPaquete;
    private Ciudad origen;
    private Ciudad destino;
    private Alojamiento alojaminto;
    private Pasaje pasaje;

    public Paquete() {
    }

    public Paquete(Ciudad origen, Ciudad destino, Alojamiento alojaminto, Pasaje pasaje) {
        this.origen = origen;
        this.destino = destino;
        this.alojaminto = alojaminto;
        this.pasaje = pasaje;
    }
    
    
}
