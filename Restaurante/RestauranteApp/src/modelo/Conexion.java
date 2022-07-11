
package modelo;

import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.MongoClient;

public class Conexion {
        DB baseDatos;
    DBCollection coleccion;
    DBCollection coleccionPedido;
    
    //Constructor
    public Conexion(){
        MongoClient mongo=new MongoClient("localhost",27017);
        baseDatos= mongo.getDB("Restaurante");
        coleccion= baseDatos.getCollection("Usuario");
<<<<<<< HEAD
        coleccionPedido=baseDatos.getCollection("Pedidos");
        System.out.println("Conexion aBD ok");
=======
        System.out.println("Conexion a BD ok");
>>>>>>> 689df4d70c69ca02c93005f719d3b283af9e33aa
        
    }
}

