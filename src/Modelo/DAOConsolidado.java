
package Modelo;
import Modelo.Consolidado;
import java.util.List;


/**
 * @author juanpbcl
 */

public interface DAOConsolidado {
    public void registrar(Consolidado consolidado) throws Exception;
    public void eliminar(Consolidado consolidado) throws Exception;
    public void modificar(Consolidado consolidado) throws Exception;
    public List <Consolidado> listar() throws Exception;
}
