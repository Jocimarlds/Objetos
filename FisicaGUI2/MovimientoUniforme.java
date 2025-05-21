public class MovimientoUniforme extends Movimiento {
    private double distancia;

    public void setDistancia(double distancia) {
        this.distancia = distancia;
    }

    @Override
    public double calcularDistancia() {
        return distancia; // La distancia ya está dada, no necesitamos calcularla en Movimiento Uniforme.
    }

    @Override
    public double calcularVelocidad() {
        return distancia / tiempo;
    }
}
