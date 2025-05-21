public class MovimientoUniformementeAcelerado extends Movimiento {
    private double velocidadInicial;
    private double aceleracion;

    public void setVelocidadInicial(double velocidadInicial) {
        this.velocidadInicial = velocidadInicial;
    }

    public void setAceleracion(double aceleracion) {
        this.aceleracion = aceleracion;
    }

    @Override
    public double calcularDistancia() {
        return velocidadInicial * tiempo + 0.5 * aceleracion * Math.pow(tiempo, 2);
    }

    @Override
    public double calcularVelocidad() {
        return velocidadInicial + aceleracion * tiempo;
    }
}
