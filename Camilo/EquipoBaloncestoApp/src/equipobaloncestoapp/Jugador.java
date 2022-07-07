/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package equipobaloncestoapp;

/**
 *
 * @author camilo
 */
public class Jugador {
    private int numeroUniforme;
    private String nombre;
    private int puntosAnotados;

    public Jugador() {
    }

    public Jugador(int numeroUniforme, String nombre, int puntosAnotados) {
        this.numeroUniforme = numeroUniforme;
        this.nombre = nombre;
        this.puntosAnotados = puntosAnotados;
    }

    public int getNumeroUniforme() {
        return numeroUniforme;
    }

    public void setNumeroUniforme(int numeroUniforme) {
        this.numeroUniforme = numeroUniforme;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getPuntosAnotados() {
        return puntosAnotados;
    }

    public void setPuntosAnotados(int puntosAnotados) {
        this.puntosAnotados = puntosAnotados;
    }
    
}
