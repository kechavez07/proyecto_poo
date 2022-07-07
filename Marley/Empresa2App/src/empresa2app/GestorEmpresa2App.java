
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
//        Empleado objempleado6= new Empleado("00005","Dario Esteban",570.0f);
        
        ListaEmpleados objListaEmpleado= new ListaEmpleados();
        objListaEmpleado.adicionalEmpleado(objempleado1);
        objListaEmpleado.adicionalEmpleado(objempleado2);
        objListaEmpleado.adicionalEmpleado(objempleado3);
        objListaEmpleado.adicionalEmpleado(objempleado4);
        objListaEmpleado.adicionalEmpleado(objempleado5);
//        objListaEmpleado.adicionalEmpleado(objempleado6);
        
        Empresa empresa1= new Empresa("Yupi",objListaEmpleado);
        empresa1.mostrarCantidadEmpleados();
        empresa1.sumaSueldo();
        objListaEmpleado.compararEmpleadoEmpresa();
        
        Empleado objempleado6= new Empleado("00005","Maria Jose",350.0f);
        Empleado objempleado7= new Empleado("00005","jose",450.0f);
        Empleado objempleado8= new Empleado("00006","Carlos",400.0f);
        Empleado objempleado9= new Empleado("00006","Ramon",550.0f);
        Empleado objempleado10= new Empleado("00007","Esteban",560.0f);
        
        ListaEmpleados objListaEmpleado1= new ListaEmpleados();
        objListaEmpleado.adicionalEmpleado(objempleado6);
        objListaEmpleado.adicionalEmpleado(objempleado7);
        objListaEmpleado.adicionalEmpleado(objempleado8);
        objListaEmpleado.adicionalEmpleado(objempleado9);
        objListaEmpleado.adicionalEmpleado(objempleado10);
        Empresa empresa2= new Empresa("Sony",objListaEmpleado);
        
//        objListaEmpleado1.mismaEmpresa(empresa1, empresa2);
    }
    
}
