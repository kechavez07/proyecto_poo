
package empresa2app;


public class GestorEmpresa2App {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Empleado objempleado1= new Empleado("00003","Maria Jose",350.0f);
        Empleado objempleado2= new Empleado("00003","Juan Pablo",450.0f);
        Empleado objempleado3= new Empleado("00002","Jorge",400.0f);
        Empleado objempleado4= new Empleado("00002","Cristian Josue",550.0f);
        Empleado objempleado5= new Empleado("00005","Dario Esteban",560.0f);
        
        ListaEmpleados objListaEmpleado= new ListaEmpleados();
        objListaEmpleado.adicionalEmpleado(objempleado1);
        objListaEmpleado.adicionalEmpleado(objempleado2);
        objListaEmpleado.adicionalEmpleado(objempleado3);
        objListaEmpleado.adicionalEmpleado(objempleado4);
        objListaEmpleado.adicionalEmpleado(objempleado5);
        Empresa empresa1= new Empresa("Yupi",objListaEmpleado);
        empresa1.mostrarCantidadEmpleados();
        empresa1.sumaSueldo();
        objListaEmpleado.compararEmpleadoEmpresa();
    }
    
}
