
package Interfases;

import java.util.ArrayList;
import Modelo.Tanqueo;

/**
 * @author juanpbcl
 */

public interface DAOTanqueo {

    public void registrar(Tanqueo tanqueo) throws Exception;
    public void modificar(Tanqueo tanqueo) throws Exception;
    public ArrayList<Tanqueo> listar() throws Exception;

}
