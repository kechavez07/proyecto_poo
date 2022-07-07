/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package equipobaloncestoapp;

/**
 *
 * @author camilo
 */
public class GestorApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Jugador objJugador1=new Jugador(01,"Pablo",19);
        Jugador objJugador2=new Jugador(10,"Maria",18);
        Jugador objJugador3=new Jugador(9,"Jose",21);
        Jugador objJugador4=new Jugador(20,"Ana",20);
        Equipo objL1= new Equipo();
    
        objL1.adicionalJugador(objJugador1);
        objL1.adicionalJugador(objJugador2);
        objL1.adicionalJugador(objJugador3);
        objL1.adicionalJugador(objJugador4);
        
//        Jugador objJugador5=new Jugador(02,"Marco",9);
//        Jugador objJugador6=new Jugador(05,"Marcelo",8);
//        Jugador objJugador7=new Jugador(19,"Jonathan",15);
//        Jugador objJugador8=new Jugador(07,"Anabel",25);
//        Equipo objL2= new Equipo("Chancleta");
//        objL2.adicionalJugador(objJugador5);
//        objL2.adicionalJugador(objJugador6);
//        objL2.adicionalJugador(objJugador7);
//        objL2.adicionalJugador(objJugador8);
        
        System.out.println(objL1.definirTamañoJugadores());
        System.out.println(objL1.puntosAcumulados());
    }
    
}
