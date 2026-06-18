package creadores;

import productos.Producto;
import productos.ProductoDigital;

public class CreadorProductoDigital implements Creador {

    @Override
    public Producto crearProducto(String nombre, double precio, double tamaño, String formato) {
        return new ProductoDigital(nombre, precio, tamaño, formato);
    }
}