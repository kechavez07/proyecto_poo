
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
//    public void mismaEmpresa(Empresa empresa1, Empresa empresa2){
////        Empresa aux= new Empresa();
////        Empresa aux2= new Empresa();
//        ListaEmpleados listaAux1= new ListaEmpleados();
//        ListaEmpleados listaAux2= new ListaEmpleados();
//        Empleado aux3= new Empleado();
//        Empleado aux4= new Empleado();
//        listaAux1=empresa1.getLisEmple();
//        listaAux2=empresa2.getLisEmple();
//        ListaEmpleados aux1= new ListaEmpleados();
//        Iterator objIterator= listaEmpleado.iterator();
//        if( empresa1.getRazonSocial()!=empresa2.getRazonSocial()){
//            aux4=(Empleado)objIterator.next();
//            aux3=(Empleado)objIterator.next();
//            while(objIterator.hasNext()){
//                aux3=(Empleado)objIterator.next();
//                
//                if(aux3.getNombre()==aux4.getNombre()){
//                    aux1.adicionalEmpleado(aux3);
//                }
//                aux4=(Empleado)objIterator.next();
//            }
//            
//        }System.out.println("Misma empresa ");
//            aux1.mostrarLista(); 
//    }
    
}
