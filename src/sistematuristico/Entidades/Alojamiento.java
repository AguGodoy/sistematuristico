/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistematuristico.Entidades;

import java.time.LocalDate;

/**
 *
 * @author Usuario
 */
public class Alojamiento {
    private int idAlojamiento;
    private LocalDate fechaIn;
    private LocalDate fechaOn;
    private boolean estado;
    private String servicio;
    private double importeDiario;
    private Ciudad destino;
    private String tipo;

    public Alojamiento() {
    }

    public Alojamiento(LocalDate fechaIn, LocalDate fechaOn, boolean estado, String servicio, double importeDiario, Ciudad destino,String tipo) {
        this.fechaIn = fechaIn;
        this.fechaOn = fechaOn;
        this.estado = estado;
        this.servicio = servicio;
        this.importeDiario = importeDiario;
        this.destino = destino;
        this.tipo=tipo;
    }

    public Alojamiento(int idAlojamiento, LocalDate fechaIn, LocalDate fechaOn, boolean estado, String servicio, double importeDiario, Ciudad destino,String tipo) {
        this.idAlojamiento = idAlojamiento;
        this.fechaIn = fechaIn;
        this.fechaOn = fechaOn;
        this.estado = estado;
        this.servicio = servicio;
        this.importeDiario = importeDiario;
        this.destino = destino;
        this.tipo=tipo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getIdAlojamiento() {
        return idAlojamiento;
    }

    public void setIdAlojamiento(int idAlojamiento) {
        this.idAlojamiento = idAlojamiento;
    }

    public LocalDate getFechaIn() {
        return fechaIn;
    }

    public void setFechaIn(LocalDate fechaIn) {
        this.fechaIn = fechaIn;
    }

    public LocalDate getFechaOn() {
        return fechaOn;
    }

    public void setFechaOn(LocalDate fechaOn) {
        this.fechaOn = fechaOn;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public String getServicio() {
        return servicio;
    }

    public void setServicio(String servicio) {
        this.servicio = servicio;
    }

    public double getImporteDiario() {
        return importeDiario;
    }

    public void setImporteDiario(double importeDiario) {
        this.importeDiario = importeDiario;
    }

    public Ciudad getDestino() {
        return destino;
    }

    public void setDestino(Ciudad destino) {
        this.destino = destino;
    }
    @Override
    public String toString(){
    return idAlojamiento + " " + fechaIn+" "+fechaOn+" "+ estado+" "+ servicio+" "+ importeDiario+" "+ destino;
}
    
}
