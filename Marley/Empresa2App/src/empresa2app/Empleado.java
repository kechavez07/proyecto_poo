
package empresa2app;

/**
 *
 * @author Jeimy
 */
public class Empleado {
    private String numero;
    private String nombre;
    private float sueldo;
    private Empresa empresa1;

    public Empleado(String numero, String nombre, float sueldo) {
        this.numero = numero;
        this.nombre = nombre;
        this.sueldo = sueldo;
    }

    public Empleado(String numero, String nombre, float sueldo, Empresa empresa1) {
        this.numero = numero;
        this.nombre = nombre;
        this.sueldo = sueldo;
        this.empresa1 = empresa1;
    }

    public Empleado() {
        numero="";
        nombre="";
        sueldo=0;
    }
    
    public String getNumero() {
        return numero;
    }

    public String getNombre() {
        return nombre;
    }

    public float getSueldo() {
        return sueldo;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setSueldo(float sueldo) {
        this.sueldo = sueldo;
    }

    @Override
    public String toString() {
        return "Empleado{" + "numero=" + numero + ", nombre=" + nombre + ", sueldo=" + sueldo + '}';
    }
    
    

    
    
}
