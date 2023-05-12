package Coneccion;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Connector {
    
    protected String host = "localhost";
    protected Connection connection; // variable de tipo Connection para la coneccion a la base de datos
    private final String JDBC_DRIVER = "com.mysql.jdbc.Driver";

    private final String DB_URL = "jdbc:mysql://localhost:3306/Gasolinera_Parcial";
    private final String USER = "root";
    private final String PASSWORD = "";

    public void conectar () throws Exception {
        try {
            Class.forName(this.JDBC_DRIVER);
            this.connection = DriverManager.getConnection(this.DB_URL, this.USER, this.PASSWORD);  // se conecta a la base de datos
            Class.forName("com.mysql.jdbc.Driver"); // se conecta al driver de mysql
        } catch (SQLException e) {
            Logger.getLogger(Connection.class.getName()).log(Level.SEVERE, null, e); // muestra un error logico en la consola
        }
    }

    public void desconectar () throws Exception {
        if (this.connection != null) {
            if (!this.connection.isClosed()) {
                this.connection.close();
            }
        }
    }
}
