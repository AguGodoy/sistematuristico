/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistematuristico.Entidades;

/**
 *
 * @author Usuario
 */
public class Pasaje {
  private int idPasaje;
  private String transporte;
  private double importe;
  private Ciudad origen;
  private boolean estado;
  private Ciudad destino;

    public Pasaje() {
    }

    public Pasaje(String Transporte, double importe, Ciudad origen, boolean estado,Ciudad destino) {
        this.transporte = Transporte;
        this.importe = importe;
        this.origen = origen;
        this.estado = estado;
    }

    public Pasaje(int idPasaje, String Transporte, double importe, Ciudad origen, boolean estado,Ciudad destino) {
        this.idPasaje = idPasaje;
        this.transporte = Transporte;
        this.importe = importe;
        this.origen = origen;
        this.estado = estado;
    }

    public Ciudad getDestino() {
        return destino;
    }

    public void setDestino(Ciudad destino) {
        this.destino = destino;
    }

    public Pasaje(int idPasaje, String transporte, double importe, int origen, boolean estado) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public int getIdPasaje() {
        return idPasaje;
    }

    public void setIdPasaje(int idPasaje) {
        this.idPasaje = idPasaje;
    }

    public String getTransporte() {
        return transporte;
    }

    public void setTransporte(String Transporte) {
        this.transporte = Transporte;
    }

    public double getImporte() {
        return importe;
    }

    public void setImporte(double importe) {
        this.importe = importe;
    }

    public Ciudad getOrigen() {
        return origen;
    }

    public void setOrigen(Ciudad origen) {
        this.origen = origen;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }
  
  @Override
  public String toString(){
      return idPasaje+ " " + transporte+ " " + importe + " " + origen+ " " + estado;
  }
}
