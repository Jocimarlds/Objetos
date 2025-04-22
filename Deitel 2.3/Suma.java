public class Suma {

    //Campos
    private Numero numero1;
    private Numero numero2;

    //Constructores
    public Suma() {
    }
    public Suma(Numero n1, Numero n2) {
    this.numero1=n1;
    this.numero2=n2;
    }
    public Numero getNumero1() {
    return numero1;

    }
    public void setNumero1(Numero numero1) {
    this.numero1 = numero1;
    }
    public Numero getNumero2() {
    return numero2;
    }
    public void setNumero2(Numero numero2) {
    this.numero2 = numero2;
    }
    public int sumar( Numero n1, Numero n2){
    int s = n1.getNumero()+ n2.getNumero();
    return s;
    }
    @Override
    public String toString() {
    return "Suma " + numero1 + numero2 +" = " + sumar(numero2, numero1) ;
    }
}