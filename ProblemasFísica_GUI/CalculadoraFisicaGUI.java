import javax.swing.*;
import java.awt.event.*;

public class CalculadoraFisicaGUI extends JFrame {
    private JTextField tiempoField, distanciaField, velocidadInicialField, aceleracionField, anguloField;
    private JTextArea resultadoArea;
    private JButton calcularButton;
    private JComboBox<String> movimientoComboBox;
    private Controlador controlador;

    // Campos de entrada de datos
    private JPanel panelDatos;

    public CalculadoraFisicaGUI() {
        setTitle("Calculadora de Física");
        setSize(500, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);

        controlador = new Controlador(this);

        JLabel movimientoLabel = new JLabel("Selecciona el Movimiento:");
        movimientoLabel.setBounds(30, 30, 150, 30);
        add(movimientoLabel);

        String[] opciones = { 
            "Movimiento Uniforme", 
            "Movimiento Uniformemente Acelerado",
            "Caída Libre",
            "Tiro Parabólico"
        };
        movimientoComboBox = new JComboBox<>(opciones);
        movimientoComboBox.setBounds(180, 30, 200, 30);
        add(movimientoComboBox);

        // Panel donde se van a agregar los campos de datos
        panelDatos = new JPanel();
        panelDatos.setBounds(30, 70, 400, 200);
        panelDatos.setLayout(null);
        add(panelDatos);

        // Configurar los campos de entrada
        setupCampos();

        // Botón para calcular
        calcularButton = new JButton("Calcular");
        calcularButton.setBounds(30, 230, 150, 30);
        add(calcularButton);

        // Área de resultados
        resultadoArea = new JTextArea();
        resultadoArea.setBounds(30, 270, 400, 100);
        resultadoArea.setEditable(false);
        add(resultadoArea);

        // Acción cuando el usuario cambia la selección en el combo box
        movimientoComboBox.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                actualizarCampos();
            }
        });

        // Acción cuando el usuario hace clic en "Calcular"
        calcularButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                controlador.calcular();
            }
        });

        // Mostrar los campos correspondientes al movimiento inicial
        actualizarCampos();
    }

    // Configurar todos los campos de entrada
    private void setupCampos() {
        // Campo para Tiempo
        JLabel tiempoLabel = new JLabel("Tiempo (s):");
        tiempoLabel.setBounds(30, 10, 150, 30);
        panelDatos.add(tiempoLabel);
        tiempoField = new JTextField();
        tiempoField.setBounds(180, 10, 100, 30);
        panelDatos.add(tiempoField);

        // Campo para Distancia (Movimiento Uniforme y Caída Libre)
        JLabel distanciaLabel = new JLabel("Distancia (m):");
        distanciaLabel.setBounds(30, 50, 150, 30);
        panelDatos.add(distanciaLabel);
        distanciaField = new JTextField();
        distanciaField.setBounds(180, 50, 100, 30);
        panelDatos.add(distanciaField);

        // Campo para Velocidad Inicial (Movimiento Uniformemente Acelerado)
        JLabel velocidadInicialLabel = new JLabel("Velocidad Inicial (m/s):");
        velocidadInicialLabel.setBounds(30, 90, 150, 30);
        panelDatos.add(velocidadInicialLabel);
        velocidadInicialField = new JTextField();
        velocidadInicialField.setBounds(180, 90, 100, 30);
        panelDatos.add(velocidadInicialField);

        // Campo para Aceleración (Movimiento Uniformemente Acelerado)
        JLabel aceleracionLabel = new JLabel("Aceleración (m/s²):");
        aceleracionLabel.setBounds(30, 130, 150, 30);
        panelDatos.add(aceleracionLabel);
        aceleracionField = new JTextField();
        aceleracionField.setBounds(180, 130, 100, 30);
        panelDatos.add(aceleracionField);

        // Campo para Ángulo (Tiro Parabólico)
        JLabel anguloLabel = new JLabel("Ángulo (°):");
        anguloLabel.setBounds(30, 170, 150, 30);
        panelDatos.add(anguloLabel);
        anguloField = new JTextField();
        anguloField.setBounds(180, 170, 100, 30);
        panelDatos.add(anguloField);
    }

    // Actualizar los campos de acuerdo con el tipo de movimiento seleccionado
    private void actualizarCampos() {
        String selectedMovement = (String) movimientoComboBox.getSelectedItem();

        // Mostrar u ocultar campos según la selección
        if (selectedMovement.equals("Movimiento Uniforme")) {
            distanciaField.setVisible(true);
            velocidadInicialField.setVisible(false);
            aceleracionField.setVisible(false);
            anguloField.setVisible(false);
        } else if (selectedMovement.equals("Movimiento Uniformemente Acelerado")) {
            distanciaField.setVisible(true);
            velocidadInicialField.setVisible(true);
            aceleracionField.setVisible(true);
            anguloField.setVisible(false);
        } else if (selectedMovement.equals("Caída Libre")) {
            distanciaField.setVisible(false);
            velocidadInicialField.setVisible(false);
            aceleracionField.setVisible(false);
            anguloField.setVisible(false);
        } else if (selectedMovement.equals("Tiro Parabólico")) {
            distanciaField.setVisible(false);
            velocidadInicialField.setVisible(true);
            aceleracionField.setVisible(false);
            anguloField.setVisible(true);
        }

        // Reorganizar el panel de datos para que todo quede bien alineado
        panelDatos.revalidate();
        panelDatos.repaint();
    }

    // Métodos getters para obtener los valores de los campos
    public String getTiempo() {
        return tiempoField.getText();
    }

    public String getDistancia() {
        return distanciaField.getText();
    }

    public String getVelocidadInicial() {
        return velocidadInicialField.getText();
    }

    public String getAceleracion() {
        return aceleracionField.getText();
    }

    public String getAngulo() {
        return anguloField.getText();
    }

    public void setResultado(String resultado) {
        resultadoArea.setText(resultado);
    }
}
