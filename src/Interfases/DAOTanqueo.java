
package Interfases;

import java.util.List;
import Modelo.Tanqueo;

/**
 * @author juanpbcl
 */

public interface DAOTanqueo {

    public void registrar(Tanqueo tanqueo) throws Exception;
    public void modificar(Tanqueo tanqueo) throws Exception; 
    public List<Tanqueo> listar() throws Exception;

}
