public class Movimiento2D {
    private double velocidadInicial;
    private double angulo;

    // Aceleración de la gravedad
    private final double g = 9.8;

    public double getVelocidadInicial() {
        return velocidadInicial;
    }

    public void setVelocidadInicial(double velocidadInicial) {
        this.velocidadInicial = velocidadInicial;
    }

    public double getAngulo() {
        return angulo;
    }

    public void setAngulo(double angulo) {
        this.angulo = angulo;
    }

    // Calcular el alcance
    public double calcularAlcance() {
        // Convertir el ángulo de grados a radianes
        double anguloRad = Math.toRadians(angulo);
        return (Math.pow(velocidadInicial, 2) * Math.sin(2 * anguloRad)) / g;
    }

    // Calcular la altura máxima
    public double calcularAlturaMaxima() {
        // Convertir el ángulo de grados a radianes
        double anguloRad = Math.toRadians(angulo);
        return (Math.pow(velocidadInicial, 2) * Math.pow(Math.sin(anguloRad), 2)) / (2 * g);
    }
}
