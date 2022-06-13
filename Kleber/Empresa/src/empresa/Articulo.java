
package empresa;

public class Articulo {
    private float precio;
    private String nombre;
    private String codigo;

    public Articulo() {
    }

    public Articulo(float precio, String nombre, String codigo) {
        this.precio = precio;
        this.nombre = nombre;
        this.codigo = codigo;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }   
}
