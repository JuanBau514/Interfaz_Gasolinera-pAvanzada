package Coneccion;

import java.sql.*;

public class Connector {

    private String userDatabase = "root";
    private String passwordDataBase = "";
    private String nameDataBase="Gasolineria_Parcial";

    private Connection connection = null;
    
    public Connector() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            this.connection = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/"+this.nameDataBase
                +"?useTimezone=true&serverTimezone=UTC", 
                this.userDatabase, this.passwordDataBase);

            System.out.println("Conexion exitosa");

        } catch (Exception e) {

            System.out.println("Error de conexion");
            System.out.println(e.getMessage());
            System.out.println(e.getStackTrace());
            
        }
    }

    public Connection getConnection() {
        return this.connection;
    }
}
