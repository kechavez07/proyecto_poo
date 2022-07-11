
package modelo;
// kleber 

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Plato {
    private String nombre;
    List ingredientes;
    private float cantidad_ingrediente;

    public Plato(String nombre, List ingredientes, float cantidad_ingrediente) {
        this.nombre = nombre;
        this.ingredientes = ingredientes;
        this.cantidad_ingrediente = calcularCantidad();
    }

    public Plato() {
    }

    public Plato(String nombre) {
        this.nombre = nombre;
        ingredientes = new ArrayList<Ingrediente>();
    }

    public String getNombre() {
        return nombre;
         
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List getIngredientes() {
        return ingredientes;
    }

    public void setIngredientes(List ingredientes) {
        this.ingredientes = ingredientes;
    }

    public float getCantidad_ingrediente() {
        return cantidad_ingrediente;
    }

    public void setCantidad_ingrediente(float cantidad_ingrediente) {
        this.cantidad_ingrediente = cantidad_ingrediente;
    }

    
    public void addIn(Ingrediente obj){
        ingredientes.add(obj);
    }
    
    public int tamanio(){
        return ingredientes.size();
    }
public float calcularCantidad(){
        float res=0;
         Ingrediente aux =new Ingrediente ();
         Iterator objIterator= ingredientes.iterator();
         while (objIterator.hasNext()){
             aux=(Ingrediente)objIterator.next();//Don casting debo espesificar de dnde viene 
             res= res + aux.getCantidad();
         }
        //res=
       return res;
    }

    @Override
    public String toString() {
        return "Plato{" + "nombre=" + nombre + ", ingredientes=" + ingredientes + ", cantidad_ingrediente=" + cantidad_ingrediente + '}';
    }

    
    public void mostar(){
        float res=0;
         Ingrediente aux =new Ingrediente ();
         Iterator objIterator= ingredientes.iterator();
         while (objIterator.hasNext()){
             aux=(Ingrediente)objIterator.next();//Don casting debo espesificar de dnde viene 
            System.out.println(aux.toString());
         }
        
    }

}
