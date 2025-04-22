// Clase para Caída Libre: v = gt, d = ½gt²
public class CaidaLibre {
    private final double g = 9.8; //Gravedad como atributo privado
    private double tiempo; //Tiempo como atributo privado
    
    //Getter del valor del tiempo 
    public double getTiempo() {
        return tiempo;
    }
    //Setter del valor tiempo
    public void setTiempo(double tiempo) {
        this.tiempo = tiempo;
    }
    //Método para calcular velocidad final
    public double calcularVelocidadFinal() { 
        return g * tiempo; //Retornar valor guardado en calcularVelocidadFinal
    }
    //Método para calcular distancia
    public double calcularDistancia() {
        return 0.5 * g * tiempo * tiempo; //Retornar valor de calcularDistancia
    }
}
