public abstract class Movimiento {
    protected double tiempo;

    public void setTiempo(double tiempo) {
        this.tiempo = tiempo;
    }

    public abstract double calcularDistancia();
    public abstract double calcularVelocidad();
}
