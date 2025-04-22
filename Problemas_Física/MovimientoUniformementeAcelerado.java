// Clase para Movimiento Uniformemente Acelerado: d = v0t + ½at²
public class MovimientoUniformementeAcelerado {
    //Declaración de atributos privados velocidad inicial, tiempo y aceleración
    private double velocidadInicial;
    private double tiempo;
    private double aceleracion;
    //Getter de velocidad inicial
    public double getVelocidadInicial() {
        return velocidadInicial;
    }
    //Setter de velocidad inicial
    public void setVelocidadInicial(double velocidadInicial) {
        this.velocidadInicial = velocidadInicial;
    }
    //Getter de tiempo
    public double getTiempo() {
        return tiempo;
    }
    //Setter de tiempo
    public void setTiempo(double tiempo) {
        this.tiempo = tiempo;
    }
    //Getter de aceleración
    public double getAceleracion() {
        return aceleracion;
    }
    //Setter de aceleración
    public void setAceleracion(double aceleracion) {
        this.aceleracion = aceleracion;
    }
    //Método que calcula la distancia en MUA
    public double calcularDistancia() {
        return velocidadInicial * tiempo + 0.5 * aceleracion * tiempo * tiempo;
    }
}
