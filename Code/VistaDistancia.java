package vista;

import java.util.Scanner;

public class VistaDistancia {
    private Scanner scanner = new Scanner(System.in);

    public double pedirCoordenada(String mensaje) {
        System.out.print(mensaje);
        while (!scanner.hasNextDouble()) {
            System.out.print("Entrada inválida. Intente de nuevo: ");
            scanner.next(); // limpia entrada no numérica
        }
        return scanner.nextDouble();
    }

    public void mostrarResultado(double distancia) {
        System.out.printf("La distancia entre los puntos es: %.2f\n", distancia);
    }

    public void mostrarError(String mensaje) {
        System.out.println("Error: " + mensaje);
    }
}
