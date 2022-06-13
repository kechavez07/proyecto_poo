
package empresa2app;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 *
 * @author Jeimy
 */
public class ListaEmpleados {
    List listaEmpleado;
    private Empresa empresa1;

    public ListaEmpleados() {
        listaEmpleado= new ArrayList<Empleado>();
    }
    public void adicionalEmpleado(Empleado obj){
        listaEmpleado.add(obj);
    }
    public void numeroLista(){
        System.out.println("Listas numero: "+ listaEmpleado.size());
    }
    public int definirTamaño(){
//        System.out.println("Tamaño de lista: ");
        return listaEmpleado.size();
    }
    public void mostrarLista(){
        Empleado aux= new Empleado();
        Iterator objIterator=listaEmpleado.iterator();
        while (objIterator.hasNext()){
            aux=(Empleado)objIterator.next();
            System.out.println(aux.toString());
        }
    }
    public void sumaSueldo( ){
        Empleado aux = new Empleado();
        float suma=0;
        Iterator objIterator= listaEmpleado.iterator();
        while(objIterator.hasNext()){
            aux=(Empleado)objIterator.next();
           suma= suma+aux.getSueldo();
        }
        System.out.println(suma);
    }
    public void compararEmpleadoEmpresa(){
        ListaEmpleados lisAux1= new ListaEmpleados();
        ListaEmpleados lisAux2= new ListaEmpleados();
        Empleado aux1= new Empleado();
        Empleado aux2= new Empleado();
        Iterator objIterator= listaEmpleado.iterator();
        aux2=(Empleado)objIterator.next();
        while(objIterator.hasNext()){
            aux1=(Empleado)objIterator.next();
//            aux1.getNombre();
            if(aux1.getNumero()==aux2.getNumero()){
                lisAux1.adicionalEmpleado(aux1);
            }
            aux2=(Empleado)objIterator.next();
        }
        System.out.println("Mismo numero de empleados \n No permitidos");
        lisAux1.mostrarLista(); 
    }
    public void mismaEmpresa(){
//        Empresa aux= new Empresa();
        
    }
    
}
