package productos;

public class ProductoFisico implements Producto{
    private String nombre;
    private double precio;
    private double peso;
    private String dimensiones;

    public ProductoFisico(String nombre, double precio, double peso, String dimensiones) {
        this.nombre = nombre;
        this.precio = precio;
        this.peso = peso;
        this.dimensiones = dimensiones;
    }

    @Override
    public void mostrarDetalles(){
        System.out.println("[Físico] - " + getNombre() + ", Precio: $" + getPrecio() + ", Peso: " + peso + "kg, Dim: " + dimensiones);
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
