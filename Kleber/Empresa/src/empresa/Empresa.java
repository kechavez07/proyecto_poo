
package empresa;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Empresa {
    private List sucursal;

    public Empresa(List sucursal) {
        this.sucursal = sucursal;
    }

    public Empresa() {
    }

    public List getSucursal() {
        return sucursal;
    }

    public void setSucursal(List sucursal) {
        this.sucursal = sucursal;
    }
    
    public void addSucursal(Sucursal obj ){
      sucursal.add(obj);
   }
    public void eliminarSucursal(Sucursal obj){
       sucursal.remove(obj);
   }
    public void recaudacionTotal(){
        float acum=0;
       Sucursal ar1 = new Sucursal();
       Iterator it = sucursal.iterator();
       while (it.hasNext()){
           ar1= (Sucursal) it.next();
           acum=acum+ar1.totalVenta();
       }   
       System.out.println("El valor total de venta en todas las sucursales  es de: "+acum);
    }
    public void mayorVenta(){
        String nombre="";
        float v=0;
        int i=0;
        Sucursal ar1 = new Sucursal();
        Iterator it = sucursal.iterator();
       while (it.hasNext()){
           ar1= (Sucursal) it.next();
           if(ar1.totalVenta()>v){
             v=ar1.totalVenta();
             nombre=ar1.getNumSucursal();
           }
       }
       System.out.println("La sucursal con mayor venta es: "+nombre);
    }
}
