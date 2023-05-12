
package Modelo;
import Modelo.Factura;
import java.util.List;

/**
 * @author juanpbcl
 */

public interface DAOFactura {
    public void registrar(Factura factura) throws Exception;
    public void modificar(Factura factura) throws Exception;
    public List <Factura> listar() throws Exception;
}
