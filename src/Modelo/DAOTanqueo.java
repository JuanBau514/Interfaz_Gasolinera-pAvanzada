
package Modelo;
import Modelo.Tanqueo;
import java.util.List;

/**
 * @author juanpbcl
 */

public interface DAOTanqueo {
    public void registrar(Tanqueo tanqueo) throws Exception;
    public void modificar(Tanqueo tanqueo) throws Exception;
    public void limpiarRegistro(Tanqueo tanqueo) throws Exception;
    public List <Tanqueo> listar() throws Exception;
}
