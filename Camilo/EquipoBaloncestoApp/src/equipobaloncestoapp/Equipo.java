/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package equipobaloncestoapp;
import java.util.*;
/**
 *
 * @author camilo
 */
public class Equipo  {
    private String nombre;
    ArrayList <Jugador> listaA = new ArrayList <Jugador>();
    
    public Equipo() {
    }
    
    public Equipo(String nombre) {
        this.nombre = nombre;
    }
     public void adicionalJugador(Jugador obj){
        listaA.add(obj);     
    }
    public int definirTamañoJugadores(){
        return listaA.size();
    }
    public int puntosAcumulados(){
        int i= 0;
        Jugador aux= new Jugador();
        Iterator it= listaA.iterator();
       while(it.hasNext()){
           aux=(Jugador) it.next();
           i = i + aux.getPuntosAnotados();  
       }   
        System.out.println(i);
        return i;
    }
}
