/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete4;

/**
 *
 * @author Usuario
 */
public class Estadio {

    private String nombre_de_estadio;
    private double capacidad;
    private String tipo_de_deporte;

    public Estadio() {
        this("", "", 0.0);
    }

    public Estadio(String nom_e, String tipo_depo, double cap) {
        setNombre_de_estadio(nom_e);
        setTipo_de_deporte(tipo_depo);
        setCapacidad(cap);
    }

    public String getNombre_de_estadio() {
        return nombre_de_estadio;
    }

    public double getCapacidad() {
        return capacidad;
    }

    public String getTipo_de_deporte() {
        return tipo_de_deporte;
    }

    public void setNombre_de_estadio(String nom_e) {
        nombre_de_estadio = nom_e;
    }

    public void setCapacidad(double cap) {
        capacidad = cap;
    }

    public void setTipo_de_deporte(String tipo_depo) {
        tipo_de_deporte = tipo_depo;
    }

    @Override
    public String toString() {
        return String.format("Nombre del estadio: %s Tipo de Deporte: %s Capacidad: %f",
                getNombre_de_estadio(), getTipo_de_deporte(), getCapacidad());

    }
}
