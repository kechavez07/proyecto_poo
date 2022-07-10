/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import com.mongodb.BasicDBObject;

/**
 *
 * @author Jeimy
 */
public class UsuarioDAO {
    public void insertarUsuario(Usuario p){
        Conexion objCon=new Conexion();
        BasicDBObject documento= new BasicDBObject();
        documento.put("nombre", p.getNombre());
        documento.put("apellido", p.getApellido());
        documento.put("id", p.getId());
        documento.put("contraseña", p.getContraseña());
        documento.put("email", p.getEmail());
        documento.put("numeroCelular", p.getNumeroCelular());
        documento.put("fecha", p.getFechaNacimiento());
        objCon.coleccion.insert(documento);
    }
}
