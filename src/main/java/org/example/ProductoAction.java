package org.example;

import com.opensymphony.xwork2.ActionSupport;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;
import org.example.Database;
public class ProductoAction extends ActionSupport {
    private int id;
    private Producto producto;
    private List<Producto> productos;
    private int cantidad;

    // Obtener todos los productos
    public String listar() {
        try (Connection connection = Database.getConnection()) {
            ProductoDAO productoDAO = new ProductoDAO(connection);
            productos = productoDAO.obtenerTodosLosProductos();
            return SUCCESS;
        } catch (SQLException e) {
            addActionError("Error al obtener la lista de productos");
            return ERROR;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    // Obtener un producto por ID
    public String detalle() {
        try (Connection connection = Database.getConnection()) {
            ProductoDAO productoDAO = new ProductoDAO(connection);
            producto = productoDAO.obtenerProductoPorId(id);
            return SUCCESS;
        } catch (SQLException e) {
            addActionError("Error al obtener los detalles del producto");
            return ERROR;
        }
    }

    // Comprar un producto
    public String comprar() {
        try (Connection connection = Database.getConnection()) {
            ProductoDAO productoDAO = new ProductoDAO(connection);
            boolean success = productoDAO.comprarProducto(id, cantidad);
            if (success) {
                return SUCCESS;
            } else {
                addActionError("No hay suficiente stock para completar la compra");
                return ERROR;
            }
        } catch (SQLException e) {
            addActionError("Error al procesar la compra");
            return ERROR;
        }
    }

    // Getters y setters para id, producto, productos y cantidad
}
