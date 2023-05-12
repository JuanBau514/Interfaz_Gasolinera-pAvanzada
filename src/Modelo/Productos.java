
package Modelo;

/**
 *
 * @author juanpbcl
 */
public class Productos {

    private int idProductos;
    private String NombreProducto;
    private float PrecioUnitario;
    private int CantidadDisponible;
    private boolean Agregar;
    
    public Productos(int idProductos, String NombreProducto, float PrecioUnitario, int CantidadDisponible, boolean Agregar) {
        this.idProductos = idProductos;
        this.NombreProducto = NombreProducto;
        this.PrecioUnitario = PrecioUnitario;
        this.CantidadDisponible = CantidadDisponible;
        this.Agregar = Agregar;
    }

    public int getIdProductos() {
        return this.idProductos;
    }

    public String getNombreProducto() {
        return this.NombreProducto;
    }

    public float getPrecioUnitario() {
        return this.PrecioUnitario;
    }

    public int getCantidadDisponible() {
        return this.CantidadDisponible;
    }

    public boolean getAgregar() {
        return this.Agregar;
    }

    public void setIdProductos(int idProductos) {
        this.idProductos = idProductos;
    }

    public void setNombreProducto(String NombreProducto) {
        this.NombreProducto = NombreProducto;
    }

    public void setPrecioUnitario(float PrecioUnitario) {
        this.PrecioUnitario = PrecioUnitario;
    }

    public void setCantidadDisponible(int CantidadDisponible) {
        this.CantidadDisponible = CantidadDisponible;
    }

    public void setAgregar(boolean Agregar) {
        this.Agregar = Agregar;
    }
    
}
