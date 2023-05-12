package Controlador;

import Interfases.DAOTanqueo;
import Coneccion.*;
import Modelo.Tanqueo;
import java.util.ArrayList;
import java.sql.*;
import java.util.List;

public class ConTanqueo extends Connector implements DAOTanqueo{

    @Override
    public void registrar(Tanqueo tanqueo) throws Exception {
        try {
            this.conectar();
            String sql = "INSERT INTO Tanqueo (Cantidad, Precio, Total) VALUES (?,?,?)";
            PreparedStatement ps = this.connection.prepareStatement(sql);
            ps.setFloat(1, tanqueo.getCantidad());
            ps.setFloat(2, tanqueo.getPrecio());
            ps.setFloat(3, tanqueo.getTotal());
            ps.executeUpdate();
            ps.close();
        } catch (Exception e) {
            throw e;
        } finally {
            this.desconectar();
        }
    }

    @Override
    public void modificar(Tanqueo tanqueo) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public ArrayList<Tanqueo> listar() throws Exception {
        List <Tanqueo> lista= null;
        try {
            this.conectar();
            String sql = "SELECT * FROM Tanqueo";
            PreparedStatement ps = this.connection.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            lista = new ArrayList<Tanqueo>();
            while (rs.next()) {
                Tanqueo tan = new Tanqueo();
                tan.setIdTanqueo(rs.getInt("idTanqueo"));
                tan.setCantidad(rs.getFloat("Cantidad"));
                tan.setPrecio(rs.getFloat("Precio"));
                tan.setTotal(rs.getFloat("Total"));
                lista.add(tan);
            }
            rs.close();
            ps.close();
        } catch (Exception e) {
            throw e;
        } finally {
            this.desconectar();
        }
        return (ArrayList<Tanqueo>) lista;
    }
    
}
