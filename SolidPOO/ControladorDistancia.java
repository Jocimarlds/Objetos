package controlador;

import modelo.PuntoModelo;
import repositorio.HistorialRepositorio;
import vista.VistaDistancia;

public class ControladorDistancia {
    private final PuntoModelo modelo;
    private final VistaDistancia vista;
    private final HistorialRepositorio repositorio;

    public ControladorDistancia(PuntoModelo modelo, VistaDistancia vista) {
        this.modelo = modelo;
        this.vista = vista;
        this.repositorio = new HistorialRepositorio();

        this.vista.agregarListenerCalculo(e -> {
            try {
                double x1 = Double.parseDouble(vista.getX1());
                double y1 = Double.parseDouble(vista.getY1());
                double x2 = Double.parseDouble(vista.getX2());
                double y2 = Double.parseDouble(vista.getY2());

                modelo.setCoordenadas(x1, y1, x2, y2);
                double distancia = modelo.calcularDistancia();
                vista.mostrarResultado(String.format("%.2f", distancia));

                String entrada = String.format("(%f, %f) a (%f, %f) = %.2f", x1, y1, x2, y2, distancia);
                repositorio.guardarEntrada(entrada);

            } catch (NumberFormatException ex) {
                vista.mostrarError("Por favor, ingresa números válidos.");
            } catch (Exception ex) {
                vista.mostrarError("Ocurrió un error: " + ex.getMessage());
            }
        });

        this.vista.agregarListenerHistorial(e -> {
            try {
                var historial = repositorio.leerHistorial();
                if (historial.isEmpty()) {
                    vista.mostrarError("No hay cálculos guardados aún.");
                } else {
                    vista.mostrarHistorial(historial);
                }
            } catch (Exception ex) {
                vista.mostrarError("Error al leer el historial: " + ex.getMessage());
            }
        });
    }
}
