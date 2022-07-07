
package modelo;

import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.MongoClient;

public class Conexion {
        DB baseDatos;
    DBCollection coleccion;
    
    //Constructor
    public Conexion(){
        MongoClient mongo=new MongoClient("localhost",27017);
        baseDatos= mongo.getDB("clinica");
        coleccion= baseDatos.getCollection("proveedores");
        System.out.println("Conexion aBD ok");
        
    }
}

