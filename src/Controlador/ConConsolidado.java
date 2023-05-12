/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import Coneccion.Connector;
import Interfases.DAOConsolidado;
import Modelo.Consolidado;

/**
 *
 * @author juanpbcl
 */
public class ConConsolidado extends Connector implements DAOConsolidado {

    @Override
    public void registrar(Consolidado consolidado) throws Exception {
        try {
            this.conectar();
            // Creando una sentencia SQL que agregara FkVentas NombreProducto cantidad disponible cantidad vendida kf productos y venta total.
            String sql = "INSERT INTO ConsolidadoDeVentas (Fk_Ventas, Nombre_Producto, Descripcion , Cantidad-Disponible, Cantidad_Vendida, Fk_Productos, VentaTotal) VALUES (?,?,?,?,?,?,?)";
            // Preparando la sentencia SQL
            PreparedStatement ps = this.connection.prepareStatement(sql);
            // Agregando los valores a la sentencia SQL
            ps.setInt(1, consolidado.getFk_Ventas());
            ps.setString(2, consolidado.getNombre_Producto());
            ps.setString(3, consolidado.getDescripcion());
            ps.setFloat(4, consolidado.getCantidadDisponible());
            ps.setFloat(5, consolidado.getCantidadVendida());
            ps.setInt(6, consolidado.getFkProductos());
            ps.setFloat(7, consolidado.getVentaTotal());
            // Ejecutando la sentencia SQL
            ps.executeUpdate();
            // Cerrando la sentencia SQL
            ps.close();
            
        } catch (Exception e) {
            throw e;
        } finally {
            this.desconectar();
        }
    }

    @Override
    public void eliminar(Consolidado consolidado) throws Exception {
        try{
            this.conectar();
            String sql = "DELETE FROM ConsolidadoDeVentas WHERE id_Consolidado = ?";
            PreparedStatement ps = this.connection.prepareStatement(sql);
            ps.setInt(1, consolidado.getId());
            ps.executeUpdate();
            ps.close();
        } catch (Exception e) {
            throw e;
        } finally {
            this.desconectar();
        }
    }

    @Override
    public void modificar(Consolidado consolidado) throws Exception {
        try {
            this.conectar();
            String sql = "UPDATE ConsolidadoDeVentas SET Fk_Ventas = ?, Nombre_Producto = ?, Descripcion = ?, Cantidad-Disponible = ?, Cantidad_Vendida = ?, Fk_Productos = ?, VentaTotal = ? WHERE id_Consolidado = ?";
            PreparedStatement ps = this.connection.prepareStatement(sql);
            ps.setInt(1, consolidado.getFk_Ventas());
            ps.setString(2, consolidado.getNombre_Producto());
            ps.setString(3, consolidado.getDescripcion());
            ps.setFloat(4, consolidado.getCantidadDisponible());
            ps.setFloat(5, consolidado.getCantidadVendida());
            ps.setInt(6, consolidado.getFkProductos());
            ps.setFloat(7, consolidado.getVentaTotal());
            ps.setInt(8, consolidado.getId());
            ps.executeUpdate();
            ps.close();
        } catch (Exception e) {
            throw e;
        } finally {
            this.desconectar();
        }
    }

    @Override
    public List<Consolidado> listar() throws Exception {
        List<Consolidado> lista = new ArrayList<>();
        try {
            this.conectar();
            String sql = "SELECT * FROM ConsolidadoDeVentas";
            PreparedStatement ps = this.connection.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Consolidado con = new Consolidado(0, 0, sql, sql, 0, 0, 0, 0);
                con.setId(rs.getInt("id_Consolidado"));
                con.setFk_Ventas(rs.getInt("Fk_Ventas"));
                con.setNombre_Producto(rs.getString("Nombre_Producto"));
                con.setDescripcion(rs.getString("Descripcion"));
                con.setCantidadDisponible(rs.getInt("Cantidad-Disponible"));
                con.setCantidadVendida(rs.getInt("Cantidad_Vendida"));
                con.setFkProductos(rs.getInt("Fk_Productos"));
                con.setVentaTotal(rs.getFloat("VentaTotal"));
                lista.add(con);
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
