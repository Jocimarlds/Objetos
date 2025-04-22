// Clase para Movimiento Uniforme: v = d / t
public class MovimientoUniforme {
    //Declaración de atributos privados distancia y tiempo
    private double distancia;
    private double tiempo;
    
    //Getter de distancia
    public double getDistancia() {
        return distancia;
    }
    //Setter de distancia
    public void setDistancia(double distancia) {
        this.distancia = distancia;
    }
    //Getter de tiempo
    public double getTiempo() {
        return tiempo;
    }
    //Setter de tiempo
    public void setTiempo(double tiempo) {
        this.tiempo = tiempo;
    }
    //Método para calcular la velocidad
    public double calcularVelocidad() {
        return distancia / tiempo;
    }
}
