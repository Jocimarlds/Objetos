public class Controlador {
    private CalculadoraFisicaGUI vista;

    public Controlador(CalculadoraFisicaGUI vista) {
        this.vista = vista;
    }

    public void calcular() {
        try {
            double tiempo = Double.parseDouble(vista.getTiempo());
            Movimiento movimiento = null;

            switch ((String) vista.movimientoComboBox.getSelectedItem()) {
                case "Movimiento Uniforme":
                    double distancia = Double.parseDouble(vista.getDistancia());
                    movimiento = new MovimientoUniforme();
                    ((MovimientoUniforme) movimiento).setDistancia(distancia);
                    break;
                case "Movimiento Uniformemente Acelerado":
                    double velocidadInicial = Double.parseDouble(vista.getVelocidadInicial());
                    double aceleracion = Double.parseDouble(vista.getAceleracion());
                    movimiento = new MovimientoUniformementeAcelerado();
                    ((MovimientoUniformementeAcelerado) movimiento).setVelocidadInicial(velocidadInicial);
                    ((MovimientoUniformementeAcelerado) movimiento).setAceleracion(aceleracion);
                    break;
                case "Caída Libre":
                    movimiento = new CaidaLibre();
                    break;
                case "Tiro Parabólico":
                    double velocidadInicial2D = Double.parseDouble(vista.getVelocidadInicial());
                    double angulo = Double.parseDouble(vista.getAngulo());
                    movimiento = new Movimiento2D();
                    ((Movimiento2D) movimiento).setVelocidadInicial(velocidadInicial2D);
                    ((Movimiento2D) movimiento).setAngulo(angulo);
                    break;
                default:
                    throw new Exception("Selección no válida.");
            }

            movimiento.setTiempo(tiempo);

            String resultado = "";
            if (movimiento instanceof Movimiento2D) {
                Movimiento2D mov2d = (Movimiento2D) movimiento;
                resultado += "Alcance: " + mov2d.calcularDistancia() + " m\n";
                resultado += "Altura Máxima: " + mov2d.calcularAlturaMaxima() + " m";
            } else {
                resultado += "Velocidad: " + movimiento.calcularVelocidad() + " m/s\n";
                resultado += "Distancia: " + movimiento.calcularDistancia() + " m";
            }

            vista.setResultado(resultado);

        } catch (Exception ex) {
            vista.setResultado("Error: " + ex.getMessage());
        }
    }
}
