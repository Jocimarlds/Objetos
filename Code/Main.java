import controlador.ControladorDistancia;
import servicio.ServicioDistancia;
import vista.VistaDistancia;

public class Main {
    public static void main(String[] args) {
        VistaDistancia vista = new VistaDistancia();
        ServicioDistancia servicio = new ServicioDistancia();
        ControladorDistancia controlador = new ControladorDistancia(vista, servicio);
        controlador.ejecutar();
    }
}
