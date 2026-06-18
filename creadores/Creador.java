package creadores;

import productos.Producto;

public interface Creador {
    Producto crearProducto(String nombre, double precio, double atributoNumerico, String atributoTexto);
}