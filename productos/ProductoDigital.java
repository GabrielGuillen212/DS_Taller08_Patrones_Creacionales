package productos;

public class ProductoDigital implements Producto{
    private String nombre;
    private double precio;
    private double tamaño;
    private String formato;

    public ProductoDigital(String nombre, double precio, double tamaño, String formato) {
    this.nombre = nombre;
    this.precio = precio;
    this.tamaño = tamaño;
    this.formato = formato;
    }

    @Override
    public void mostrarDetalles(){
        System.out.println("[Digital] - " + getNombre() + ", Precio: $" + getPrecio() + ", tamaño: " + tamaño + "MB, Formato: " + formato);
    }

    @Override
    public String getNombre() {
        return nombre;
    }

    @Override
    public double getPrecio() {
        return precio;
    }
}
