// Clase CaidaLibre (hereda de Movimiento)
public class CaidaLibre extends Movimiento {
    private final double g = 9.8; // Gravedad

    @Override
    public double calcularVelocidad() {
        return g * tiempo;  // Fórmula: v = g * t
    }

    @Override
    public double calcularDistancia() {
        return 0.5 * g * tiempo * tiempo;  // Fórmula: d = ½ * g * t²
    }
}
