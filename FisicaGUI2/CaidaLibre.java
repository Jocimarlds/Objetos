public class CaidaLibre extends Movimiento {
    private final double g = 9.8; // Gravedad

    @Override
    public double calcularDistancia() {
        return 0.5 * g * Math.pow(tiempo, 2);
    }

    @Override
    public double calcularVelocidad() {
        return g * tiempo;
    }
}
