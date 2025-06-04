import controlador.ControladorDistancia;
import modelo.PuntoModelo;
import vista.VistaDistancia;

public class Main {
    public static void main(String[] args) {
        javax.swing.SwingUtilities.invokeLater(() -> {
            PuntoModelo modelo = new PuntoModelo();
            VistaDistancia vista = new VistaDistancia();
            new ControladorDistancia(modelo, vista);
            vista.setVisible(true);
        });
    }
}
