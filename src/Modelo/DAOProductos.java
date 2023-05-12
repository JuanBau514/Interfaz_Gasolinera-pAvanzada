
package Modelo;
import Modelo.Productos;
import java.util.List;

/**
 * @author juanpbcl
 */

public interface DAOProductos {
    public void registrar(Productos productos) throws Exception;
    public void eliminar(Productos productos) throws Exception;
    public void modificar(Productos productos) throws Exception;
    public List <Productos> listar() throws Exception;
}
