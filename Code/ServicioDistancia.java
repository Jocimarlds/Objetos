package servicio;

import modelo.Punto;
import excepcion.EntradaInvalidaException;

public class ServicioDistancia {

    public double calcularDistancia(Punto p1, Punto p2) {
        if (p1 == null || p2 == null) {
            throw new EntradaInvalidaException("Los puntos no pueden ser nulos.");
        }

        double dx = p2.getX() - p1.getX();
        double dy = p2.getY() - p1.getY();
        return Math.sqrt(dx * dx + dy * dy);
    }
}
