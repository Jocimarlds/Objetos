public class Numero {
    private int numero;
    public Numero() {
    this.numero = 0;
    }
    public int getNumero() {
    return numero;
    }
    public void setNumero(int numero) {
    this.numero = numero;
    }
    @Override
    public String toString() {
    return numero + " ";
    }
}