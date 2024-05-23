package org.example;

import java.util.HashMap;
import java.util.Map;

public class Carrito {
    private Map<Integer, Integer> items;

    public Carrito() {
        items = new HashMap<>();
    }

    public void agregarProducto(int id, int cantidad) {
        items.put(id, items.getOrDefault(id, 0) + cantidad);
    }

    public void removerProducto(int id) {
        items.remove(id);
    }

    public Map<Integer, Integer> obtenerItems() {
        return items;
    }
}
