// Clase para Movimiento en dos dimensiones
public class Movimiento2D {
    //Declaración de atributos privados valocidad inicial y ángulo
    private double velocidadInicial;
    private double angulo; // en grados
    
    //Getter de la velocidad inicial
    public double getVelocidadInicial() {
        return velocidadInicial;
    }
    //Setter de la velocidad inicial
    public void setVelocidadInicial(double velocidadInicial) {
        this.velocidadInicial = velocidadInicial;
    }
    
    //Geter de ángulo
    public double getAngulo() {
        return angulo;
    }
    
    //Setter del ángulo
    public void setAngulo(double angulo) {
        this.angulo = angulo;
    }

    public double calcularAlcance() {
        // fórmula: R = (v^2 * sin(2θ)) / g
        double radianes = Math.toRadians(angulo);
        return (Math.pow(velocidadInicial, 2) * Math.sin(2 * radianes)) / 9.8;
    }

    public double calcularAlturaMaxima() {
        // fórmula: h = (v^2 * sin²(θ)) / (2g)
        double radianes = Math.toRadians(angulo);
        return (Math.pow(velocidadInicial * Math.sin(radianes), 2)) / (2 * 9.8);
    }
}
