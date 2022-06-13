
package empresa;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Sucursal {
   private List <Articulo> articulos;
   private String numSucursal;

    public Sucursal() {
    }

    public Sucursal(List<Articulo> articulos, String numSucursal) {
        this.articulos = articulos;
        this.numSucursal = numSucursal;
    }

    public List<Articulo> getArticulos() {
        return articulos;
    }

    public void setArticulos(List<Articulo> articulos) {
        this.articulos = articulos;
    }

    public String getNumSucursal() {
        return numSucursal;
    }

    public void setNumSucursal(String numSucursal) {
        this.numSucursal = numSucursal;
    }

   public void addArticulo(Articulo obj ){
      articulos.add(obj);
      this.numSucursal = numSucursal;
   }
   
   public void eliminarArticulo(Articulo obj){
       articulos.remove(obj);
   }
   
   public int buscarCodArticulo(String codigo){
       int acum=0;
       Articulo ar1 = new Articulo();
       Iterator it = articulos.iterator();
       while (it.hasNext()){
           ar1= (Articulo) it.next();
        if (ar1.getCodigo().equals(codigo)){
            acum++;
        }   
       }   
       return acum;    
   }
   
   public void mostrarCantidadesTotales(){
      int cod[]={1,2,3,4,5};
       int n;
       int i=0;
      for (i=0;i<=4;i++){
          n=buscarCodArticulo(String.valueOf(cod[i]));
       System.out.println("camtidad del articulo "+(1+i)+" es: "+n);
      }   
   }
   
   public void cantidadArticulosVendidos(){
       System.out.println("La cantidad de articulos en la "+numSucursal+" vendios es: "+articulos.size());
   }
   public void cantidadArticulosEspecifico(String codigo){
       int n;
       n=buscarCodArticulo(String.valueOf(codigo));
       System.out.println("camtidad del articulo es: "+n);
   }
   public float totalVenta(){
       float acum=0.00f;
       Articulo ar1 = new Articulo();
       Iterator it = articulos.iterator();
       while (it.hasNext()){
           ar1= (Articulo) it.next();
        acum=acum+ar1.getPrecio();
       }   
      return acum;  
   }
   public void mostrartotalVenta(){
      System.out.println("El valor total de venta en la "+numSucursal+" es de: "+totalVenta()); 
   }
}
