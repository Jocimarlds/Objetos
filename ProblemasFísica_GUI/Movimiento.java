// Clase abstracta Movimiento (Modelo)
public abstract class Movimiento {
    protected double tiempo;

    public void setTiempo(double tiempo) {
        this.tiempo = tiempo;
    }

    // Métodos abstractos que las clases hijas deben implementar
    public abstract double calcularVelocidad();
    public abstract double calcularDistancia();
}
