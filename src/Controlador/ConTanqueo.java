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
        try {
            this.conectar();
            String sql = "UPDATE Tanqueo SET Cantidad = ?, Precio = ?, Total = ? WHERE idTanqueo = ?";
            PreparedStatement ps = this.connection.prepareStatement(sql);
            ps.setFloat(1, tanqueo.getCantidad());
            ps.setFloat(2, tanqueo.getPrecio());
            ps.setFloat(3, tanqueo.getTotal());
            ps.setInt(4, tanqueo.getIdTanqueo());
            ps.executeUpdate();
            ps.close();
        } catch (Exception e) {
            throw e;
        } finally {
            this.desconectar();
        }
    }

    @Override
    public ArrayList<Tanqueo> listar() throws Exception {
        ArrayList<Tanqueo> lista = new ArrayList<Tanqueo>();
        try {
            this.conectar();
            String sql = "SELECT * FROM Tanqueo";
            PreparedStatement ps = this.connection.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Tanqueo tanqueo = new Tanqueo();
                tanqueo.setIdTanqueo(rs.getInt("idTanqueo"));
                tanqueo.setCantidad(rs.getFloat("Cantidad"));
                tanqueo.setPrecio(rs.getFloat("Precio"));
                tanqueo.setTotal(rs.getFloat("Total"));
                lista.add(tanqueo);
            }
            rs.close();
            ps.close();
        } catch (Exception e) {
            throw new Exception("Error al listar los consolidados: " + e.getMessage());
        } finally {
            this.desconectar();
        }
        return lista;
    }
    
}
