// Clase MovimientoUniformementeAcelerado (hereda de Movimiento)
public class MovimientoUniformementeAcelerado extends Movimiento {
    private double velocidadInicial;
    private double aceleracion;

    // Setters y Getters
    public double getVelocidadInicial() {
        return velocidadInicial;
    }

    public void setVelocidadInicial(double velocidadInicial) {
        this.velocidadInicial = velocidadInicial;
    }

    public double getAceleracion() {
        return aceleracion;
    }

    public void setAceleracion(double aceleracion) {
        this.aceleracion = aceleracion;
    }

    @Override
    public double calcularVelocidad() {
        return velocidadInicial + aceleracion * tiempo;  // Fórmula: v = v0 + a * t
    }

    @Override
    public double calcularDistancia() {
        return velocidadInicial * tiempo + 0.5 * aceleracion * tiempo * tiempo;  // Fórmula: d = v0 * t + ½ * a * t²
    }
}
