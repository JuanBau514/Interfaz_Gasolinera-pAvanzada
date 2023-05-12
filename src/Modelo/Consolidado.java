
package Modelo;

/**
 *
 * @author juanpbcl
 */
public class Consolidado {

    private int id;
    private String nombreP;
    private String descripcionP;
    private int cantidadDisponibleP;
    private int CantidadVendidaP;
    private int VentaTotalP;


    public Consolidado(int idProducto, String nombre, String descripcion, int cantidadDisponible, int CantidadVendida, int VentaTotal) {
        this.id = idProducto;
        this.nombreP = nombre;
        this.descripcionP = descripcion;
        this.cantidadDisponibleP = cantidadDisponible;
        this.CantidadVendidaP = CantidadVendida;
        this.VentaTotalP = VentaTotal;
    }

    public int getId() {
        return this.id;
    }

    public String getNombreP() {
        return this.nombreP;
    }

    public String getDescripcionP() {
        return this.descripcionP;
    }

    public int getCantidadDisponibleP() {
        return this.cantidadDisponibleP;
    }

    public int getCantidadVendidaP() {
        return this.CantidadVendidaP;
    }

    public int getVentaTotalP() {
        return this.VentaTotalP;
    }

    public void setId(int idProducto) {
        this.id = idProducto;
    }

    public void setNombreP(String nombre) {
        this.nombreP = nombre;
    }

    public void setDescripcionP(String descripcion) {
        this.descripcionP = descripcion;
    }

    public void setCantidadDisponibleP(int cantidadDisponible) {
        this.cantidadDisponibleP = cantidadDisponible;
    }

    public void setCantidadVendidaP(int CantidadVendida) {
        this.CantidadVendidaP = CantidadVendida;
    }

    public void setVentaTotalP(int VentaTotal) {
        this.VentaTotalP = VentaTotal;
    }

}
