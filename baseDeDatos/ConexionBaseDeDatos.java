public class ConexionBaseDeDatos {
    private static ConexionBaseDeDatos instancia;

    private ConexionBaseDeDatos(){
        System.out.println("Conectando con la base de datos...");
    }

    public static ConexionBaseDeDatos getInstancia(){
        if(instancia == null){
            instancia = new ConexionBaseDeDatos();
        }
        return instancia;
    }

    public void mostrarQuery(){
        System.out.println("Mostrando query: ");
    }
}
