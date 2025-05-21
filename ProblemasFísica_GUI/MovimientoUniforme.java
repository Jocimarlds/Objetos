// Clase MovimientoUniforme (hereda de Movimiento)
public class MovimientoUniforme extends Movimiento {
    private double distancia;

    // Getter y Setter de distancia
    public double getDistancia() {
        return distancia;
    }

    public void setDistancia(double distancia) {
        this.distancia = distancia;
    }

    @Override
    public double calcularVelocidad() {
        return distancia / tiempo;  // Fórmula: v = d / t
    }

    @Override
    public double calcularDistancia() {
        return distancia;  // La distancia ya está dada
    }
}
