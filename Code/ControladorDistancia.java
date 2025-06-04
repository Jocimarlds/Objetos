package controlador;

import modelo.Punto;
import vista.VistaDistancia;
import servicio.ServicioDistancia;
import excepcion.EntradaInvalidaException;

public class ControladorDistancia {
    private VistaDistancia vista;
    private ServicioDistancia servicio;

    public ControladorDistancia(VistaDistancia vista, ServicioDistancia servicio) {
        this.vista = vista;
        this.servicio = servicio;
    }

    public void ejecutar() {
        try {
            double x1 = vista.pedirCoordenada("Ingrese x1: ");
            double y1 = vista.pedirCoordenada("Ingrese y1: ");
            double x2 = vista.pedirCoordenada("Ingrese x2: ");
            double y2 = vista.pedirCoordenada("Ingrese y2: ");

            Punto p1 = new Punto(x1, y1);
            Punto p2 = new Punto(x2, y2);

            double distancia = servicio.calcularDistancia(p1, p2);
            vista.mostrarResultado(distancia);
        } catch (Exception e) {
            vista.mostrarError(e.getMessage());
        }
    }
}
