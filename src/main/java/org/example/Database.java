package org.example;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Database {
    // Configuración de la conexión a la base de datos
    private static final String URL = "jdbc:mysql://localhost:3306/nombre_base_de_datos";
    private static final String USER = "usuario";
    private static final String PASSWORD = "contraseña";

    // Método para obtener una conexión a la base de datos
    public static Connection getConnection() throws SQLException {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            return DriverManager.getConnection(URL, USER, PASSWORD);
        } catch (ClassNotFoundException e) {
            throw new SQLException("Error al cargar el controlador JDBC", e);
        }
    }
}
