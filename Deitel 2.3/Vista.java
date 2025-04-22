public class Vista{
    // atributos
    String black="\033[30m";
    String red="\033[31m";
    String green="\033[32m";
    String yellow="\033[33m";
    String blue="\033[34m";
    String purple="\033[35m";
    String cyan="\033[36m";
    String white="\033[37m";
    String reset="\u001B[0m";

    public void mostrarTitulo(){
    System.out.println(yellow);
    System.out.println("==================================="); // informacion por consola
    System.out.println("Programa para sumar dos enteros "); // informacion por consola
    System.out.println("y dar el resultado por consola "); // informacion por consola
    System.out.println("==================================="); // informacion po consola
    System.out.println(reset);
    }

    public void mostrarMenu() {
    System.out.println(blue);
    System.out.println("\t1. Sumar dos Enteros");
    System.out.println("\t2. Restar dos Enteros");
    System.out.println("\t3. Salir\n\n");
    leerOpcionEntero();
    System.out.println(reset);
    }

    public void leerNumeroEntero() {
    System.out.println(red);
    System.out.print("\tEscriba el número entero: "+ reset);
    }

    public void leerOpcionEntero() {
    System.out.println("");
    System.out.print("\tEscoga la opción: ");
    System.out.println(reset);
    }

    public void mostrarResultado(int numero1, int numero2, int resultado) {
    System.out.println(yellow);
    System.out.printf("\t%d + %d = %d \n",numero1, numero2, resultado);
    System.out.println(reset);
    }

    public void mostrarDefault() {
    System.out.println(yellow);
    System.out.println("\tSolo números entre 1 y 2\n");
    System.out.println(reset);
    }

    public void mostrarDespedida(){
    System.out.println(yellow);
    System.out.println("\tJCT, agradece el uso de Software");
    System.out.println("\tRegresa pronto ");
    System.out.println(reset);
    }

    public void saltarLinea() {
    System.out.println("");
    }
    public void mostrarInputMismatchException() {
    System.out.println(red);
    System.out.println("\n\tDebe DIGITAR un número Entero\n");
    System.out.println(reset);
    }
}