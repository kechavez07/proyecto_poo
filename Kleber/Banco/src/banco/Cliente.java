
package banco;
public class Cliente {
    private String nombre;
    private String apellido;
    private String id;
    private String ubicacion;
    private String telefono;
    private String email;
    private Preferencia preferencia;
    private Tipo tipo; 

    public Cliente(String nombre, String apellido, String id, String ubicacion, String telefono, String email, Preferencia preferencia, Tipo tipo) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.id = id;
        this.ubicacion = ubicacion;
        this.telefono = telefono;
        this.email = email;
        this.preferencia = preferencia;
        this.tipo = tipo;
    }



    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Preferencia getPreferencia() {
        return preferencia;
    }

    public void setPreferencia(Preferencia preferencia) {
        this.preferencia = preferencia;
    }

    public Tipo getTipo() {
        return tipo;
    }

    public void setTipo(Tipo tipo) {
        this.tipo = tipo;
    }
    
    
}
