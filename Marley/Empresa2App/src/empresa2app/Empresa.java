
package empresa2app;

/**
 *
 * @author Jeimy
 */
public class Empresa {
    private String razonSocial;
    private ListaEmpleados lisEmple;

    public Empresa(String razonSocial, ListaEmpleados lisEmple) {
        this.razonSocial = razonSocial;
        this.lisEmple = lisEmple;
    }

    public Empresa() {
        razonSocial="";
        lisEmple=null;
    }
    

    public String getRazonSocial() {
        return razonSocial;
    }

    public ListaEmpleados getLisEmple() {
        return lisEmple;
    }
    public void mostrarCantidadEmpleados(){
        System.out.println("Cantidad de empleados: "+ lisEmple.definirTamaño());
    }
    public void sumaSueldo(){
        System.out.println("La suma de los sueldos de la empresa es ");
        lisEmple.sumaSueldo();
        
    }
    
}
