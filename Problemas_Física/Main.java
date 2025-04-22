//Desarrollado por: Jocimar David Gutiérrez Ladeut 
//Facultad de Ingeniería Universidad Distrital FJDC
//Código institucional: 20242005127
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcion;

        do {
            // Menú de opciones
            System.out.println("\n=== Calculadora de Fisica ===");
            System.out.println("1. Movimiento Uniforme");
            System.out.println("2. Movimiento Uniformemente Acelerado");
            System.out.println("3. Caida Libre");
            System.out.println("4. Movimiento en 2D");
            System.out.println("0. Salir");
            System.out.print("Selecciona una opcion: ");
            opcion = sc.nextInt(); // Lee la opción del menú

            // Procesamiento según la opción seleccionada
            switch (opcion) {
                case 1: // Movimiento Uniforme
                    // Pedir datos
                    System.out.print("Ingresa la distancia (m): ");
                    double distancia = sc.nextDouble();

                    System.out.print("Ingresa el tiempo (s): ");
                    double tiempo = sc.nextDouble();

                    // Crear objeto MovimientoUniforme y calcular velocidad
                    MovimientoUniforme mu = new MovimientoUniforme();
                    mu.setDistancia(distancia);
                    mu.setTiempo(tiempo);

                    System.out.println("Velocidad (m/s): " + mu.calcularVelocidad());
                    break;

                case 2: // Movimiento Uniformemente Acelerado
                    // Pedir datos
                    System.out.print("Ingresa la velocidad inicial (m/s): ");
                    double velocidadInicial = sc.nextDouble();

                    System.out.print("Ingresa la aceleracion (m/s²): ");
                    double aceleracion = sc.nextDouble();

                    System.out.print("Ingresa el tiempo (s): ");
                    double tiempoMUA = sc.nextDouble();

                    // Crear objeto MovimientoUniformementeAcelerado y calcular distancia
                    MovimientoUniformementeAcelerado mua = new MovimientoUniformementeAcelerado();
                    mua.setVelocidadInicial(velocidadInicial);
                    mua.setAceleracion(aceleracion);
                    mua.setTiempo(tiempoMUA);

                    System.out.println("Distancia recorrida (m): " + mua.calcularDistancia());
                    break;

                case 3: // Caída Libre
                    // Pedir datos
                    System.out.print("Ingresa el tiempo de caída (s): ");
                    double tiempoCaida = sc.nextDouble();

                    // Crear objeto CaidaLibre y calcular velocidad final y distancia
                    CaidaLibre caida = new CaidaLibre();
                    caida.setTiempo(tiempoCaida);

                    System.out.println("Velocidad final (m/s): " + caida.calcularVelocidadFinal());
                    System.out.println("Distancia recorrida (m): " + caida.calcularDistancia());
                    break;

                case 4: // Movimiento en 2D
                    // Pedir datos
                    System.out.print("Ingresa la velocidad inicial (m/s): ");
                    double velocidadInicial2D = sc.nextDouble();

                    System.out.print("Ingresa el ángulo de lanzamiento (grados): ");
                    double angulo2D = sc.nextDouble();

                    // Crear objeto Movimiento2D y calcular alcance y altura
                    Movimiento2D mov2d = new Movimiento2D();
                    mov2d.setVelocidadInicial(velocidadInicial2D);
                    mov2d.setAngulo(angulo2D);

                    System.out.println("Alcance (m): " + mov2d.calcularAlcance());
                    System.out.println("Altura máxima (m): " + mov2d.calcularAlturaMaxima());
                    break;

                case 0: // Salir
                    System.out.println("Saliendo del programa...");
                    break;

                default:
                    // Si la opción no es válida
                    System.out.println("Opción no válida. Por favor, selecciona una opción correcta.");
                    break;
            }

        } while (opcion != 0); // Termina cuando el usuario elige salir (opción 0)

        sc.close(); // Cerrar el Scanner al final
    }
}

