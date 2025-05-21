public class Movimiento2D extends Movimiento {
    private double velocidadInicial;
    private double angulo;
    private final double g = 9.8;

    public void setVelocidadInicial(double velocidadInicial) {
        this.velocidadInicial = velocidadInicial;
    }

    public void setAngulo(double angulo) {
        this.angulo = angulo;
    }

    @Override
    public double calcularDistancia() {
        double anguloRad = Math.toRadians(angulo);
        return (Math.pow(velocidadInicial, 2) * Math.sin(2 * anguloRad)) / g;
    }

    @Override
    public double calcularVelocidad() {
        // En el tiro parabólico, la velocidad no es constante, por lo que no se calcula directamente como en otros movimientos.
        // Puede ser calculada a partir de otros parámetros, pero por simplicidad, se puede omitir aquí.
        return 0;
    }

    public double calcularAlturaMaxima() {
        double anguloRad = Math.toRadians(angulo);
        return (Math.pow(velocidadInicial, 2) * Math.pow(Math.sin(anguloRad), 2)) / (2 * g);
    }
}
