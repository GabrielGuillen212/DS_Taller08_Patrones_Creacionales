package creadores;

import productos.Producto;
import productos.ProductoFisico;

public class CreadorProductoFisico implements Creador {

    @Override
    public Producto crearProducto(String nombre, double precio, double peso, String dimensiones) {
        return new ProductoFisico(nombre, precio, peso, dimensiones);
    }
}