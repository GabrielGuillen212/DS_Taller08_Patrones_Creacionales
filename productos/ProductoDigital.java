package productos;

public class ProductoDigital implements Producto{
    private String nombre;
    private double precio;
    private double tamaño;
    private String formato;

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
