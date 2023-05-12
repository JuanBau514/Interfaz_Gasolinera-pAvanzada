
package Modelo;

/**
 *
 * @author juanpbcl
 */
public class Factura {

    private int idFactura;
    private String Direccion;
    private String Nombre;
    private String Apellido;
    private String Correo;
    private String Telefono;

    public Factura(int idFactura, String Direccion, String Nombre, String Apellido, String Correo, String Telefono) {
        this.idFactura = idFactura;
        this.Direccion = Direccion;
        this.Nombre = Nombre;
        this.Apellido = Apellido;
        this.Correo = Correo;
        this.Telefono = Telefono;
    }

    public int getIdFactura() {
        return this.idFactura;
    }

    public String getDireccion() {
        return this.Direccion;
    }

    public String getNombre() {
        return this.Nombre;
    }

    public String getApellido() {
        return this.Apellido;
    }

    public String getCorreo() {
        return this.Correo;
    }

    public String getTelefono() {
        return this.Telefono;
    }

    public void setIdFactura(int idFactura) {
        this.idFactura = idFactura;
    }

    public void setDireccion(String Direccion) {
        this.Direccion = Direccion;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public void setApellido(String Apellido) {
        this.Apellido = Apellido;
    }

    public void setCorreo(String Correo) {
        this.Correo = Correo;
    }

    public void setTelefono(String Telefono) {
        this.Telefono = Telefono;
    }
    
}
