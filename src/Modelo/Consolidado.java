
package Modelo;

/**
 *
 * @author juanpbcl
 */
public class Consolidado {

    private int id;
    private int Fk_Ventas;
    private String nombre_Producto;
    private String descripcion;
    private int cantidadDisponible;
    private int CantidadVendida;
    private int Fk_Productos;
    private int VentaTotal;

    public Consolidado(int id, int Fk_Ventas, String nombre_Producto, String descripcion, int cantidadDisponible, int CantidadVendida, int Fk_Productos,int VentaTotal) {
        this.id = id;
        this.Fk_Ventas = Fk_Ventas;
        this.nombre_Producto = nombre_Producto;
        this.descripcion = descripcion;
        this.cantidadDisponible = cantidadDisponible;
        this.CantidadVendida = CantidadVendida;
        this.Fk_Productos = Fk_Productos;
        this.VentaTotal = VentaTotal;
    }

    public int getId() {
        return this.id;
    }

    public int getFk_Ventas() {
        return this.Fk_Ventas;
    }

    public String getNombre_Producto() {
        return this.nombre_Producto;
    }

    public String getDescripcion() {
        return this.descripcion;
    }

    public int getCantidadDisponible() {
        return this.cantidadDisponible;
    }

    public int getCantidadVendida() {
        return this.CantidadVendida;
    }

    public int getVentaTotal() {
        return this.VentaTotal;
    }

    public int getFkProductos() {
        return this.Fk_Productos;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setFk_Ventas(int Fk_Ventas) {
        this.Fk_Ventas = Fk_Ventas;
    }

    public void setNombre_Producto(String nombre_Producto) {
        this.nombre_Producto = nombre_Producto;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public void setCantidadDisponible(int cantidadDisponible) {
        this.cantidadDisponible = cantidadDisponible;
    }

    public void setCantidadVendida(int CantidadVendida) {
        this.CantidadVendida = CantidadVendida;
    }

    public void setVentaTotal(float f) {
        this.VentaTotal = (int) f;
    }

    public void setFkProductos(int Fk_Productos) {
        this.Fk_Productos = Fk_Productos;
    }
}
