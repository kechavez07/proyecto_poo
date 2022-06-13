
package empresa;

import java.util.ArrayList;
import java.util.List;

public class GestorEmpresa {

  
    public static void main(String[] args) {
       Articulo ar1=new Articulo(2.05f,"Jabon","1");
       Articulo ar2=new Articulo(3.75f,"chocolate","2");
       Articulo ar3=new Articulo(1.5f,"pollo","3");
       Articulo ar4=new Articulo(4.60f,"pescado","4");
       Articulo ar5=new Articulo(0.90f,"galletas","5");
        ArrayList<Articulo> venta1= new ArrayList();
        ArrayList<Articulo> venta2= new ArrayList();
        ArrayList<Articulo> venta3= new ArrayList();
        ArrayList<Articulo> venta4= new ArrayList();
        ArrayList<Articulo> empres= new ArrayList();
       Sucursal suc1=new Sucursal(venta1,"sucrsal_1");
       suc1.addArticulo(ar5);
       suc1.addArticulo(ar1);
       suc1.addArticulo(ar3);
       suc1.addArticulo(ar4);
       suc1.addArticulo(ar4);
       suc1.addArticulo(ar1);
       suc1.addArticulo(ar1);
       suc1.addArticulo(ar2);
       suc1.addArticulo(ar1);
       suc1.addArticulo(ar2);
       suc1.addArticulo(ar5);
       suc1.addArticulo(ar5);
       Sucursal suc2=new Sucursal(venta2,"sucrsal_2");
       suc2.addArticulo(ar5);
       suc2.addArticulo(ar4);
       suc2.addArticulo(ar2);
       suc2.addArticulo(ar1);
       suc2.addArticulo(ar3);
       suc2.addArticulo(ar1);
       suc2.addArticulo(ar5);
       suc2.addArticulo(ar4);
       suc2.addArticulo(ar2);
       suc2.addArticulo(ar1);
       suc2.addArticulo(ar5);
       suc2.addArticulo(ar1);
       suc2.addArticulo(ar5);
       suc2.addArticulo(ar2);
       suc2.addArticulo(ar5);
       Sucursal suc3=new Sucursal(venta3,"sucrsal_3");
       suc3.addArticulo(ar5);
       suc3.addArticulo(ar3);
       suc3.addArticulo(ar4);
       suc3.addArticulo(ar5);
       suc3.addArticulo(ar1);
       suc3.addArticulo(ar2);
       suc3.addArticulo(ar5);
       suc3.addArticulo(ar4);
       suc3.addArticulo(ar4);
       suc3.addArticulo(ar5);
       suc3.addArticulo(ar1);
       Sucursal suc4=new Sucursal(venta4,"sucrsal_4");
       suc4.addArticulo(ar1);
       suc4.addArticulo(ar3);
       suc4.addArticulo(ar4);
       suc4.addArticulo(ar4);
       suc4.addArticulo(ar2);
       suc4.addArticulo(ar2);
       suc4.addArticulo(ar1);
       suc4.addArticulo(ar1);
       suc4.addArticulo(ar3);
       suc4.addArticulo(ar5);
       suc4.addArticulo(ar3);
       suc4.addArticulo(ar5);
       suc4.addArticulo(ar1);
       Empresa empresa=new Empresa(empres);
       empresa.addSucursal(suc1);
       empresa.addSucursal(suc2);
       empresa.addSucursal(suc3);
       empresa.addSucursal(suc4);
       
       suc1.mostrarCantidadesTotales();
       suc2.cantidadArticulosVendidos();
       suc1.cantidadArticulosEspecifico("3");
       suc1.mostrartotalVenta();
       suc2.mostrartotalVenta();
       suc3.mostrartotalVenta();       
       suc4.mostrartotalVenta();
       empresa.recaudacionTotal();
       empresa.mayorVenta();
    }
    
}
