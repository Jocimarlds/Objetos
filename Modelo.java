public class Modelo {
    private Suma suma;
    private Resta resta;
    //constructores
    public Modelo() {
    }
    public Modelo(Suma suma, Resta resta) {
    this.suma = suma;
    this.resta = resta;
    }
    //gets y sets
    public Suma getSuma() {
    return suma;
    }
    public void setSuma(Suma suma) {
    this.suma = suma;
    }
    public Resta getResta() {
    return resta;
    }
    public void setResta(Resta resta) {
        this.resta = resta;
        }
}