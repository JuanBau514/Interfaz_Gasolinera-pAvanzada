package Modelo;

/**
 *
 * @author juanpbaucl
 */
public class Tanqueo {
    
    private float Cantidad;
    private float Precio;
    private float Total;


    public Tanqueo (float Cantidadtank, float Preciotank) {
        this.Cantidad = Cantidadtank;
        this.Precio = Preciotank;
        this.Total = 0;
    }

    public float getCantidad() {
        return this.Cantidad;
    }

    public float getPrecio() {
        return this.Precio;
    }

    public float getTotal() {
        return this.Total;
    }

    public void setCantidad(float Cantidad) {
        this.Cantidad = Cantidad;
    }

    public void setPrecio(float Precio) {
        this.Precio = Precio;
    }

    public void setTotal(float Total) {
        this.Total = Total;
    }

    public void registrarTanqueoPrecio() {
            this.Total = this.Cantidad / this.Precio; // Multiplicar la cantidad por el precio
    }

    public void registrarTanqueoCantidad() {
        this.Total = this.Cantidad * this.Precio; // Multiplicar el total por el precio
    }
    
  
    public void limpiarRegistro() {
        this.Cantidad = 0;
        this.Precio = 0;
        this.Total = 0;
    }

    public String toString() {
        return "Cantidad: " + this.Cantidad + "\nPrecio: " + this.Precio + "\nTotal: " + this.Total;
    }

    public void imprimir() {
        System.out.println(this.toString());
    }
 
}
