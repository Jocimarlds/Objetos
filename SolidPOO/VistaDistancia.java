package vista;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.util.List;

public class VistaDistancia extends JFrame {
    private final JTextField campoX1 = new JTextField(5);
    private final JTextField campoY1 = new JTextField(5);
    private final JTextField campoX2 = new JTextField(5);
    private final JTextField campoY2 = new JTextField(5);
    private final JButton botonCalcular = new JButton("💡 Calcular Distancia");
    private final JButton botonHistorial = new JButton("📜 Ver Historial");
    private final JLabel etiquetaResultado = new JLabel("Distancia: ");

    public VistaDistancia() {
        setTitle("🌍 Calculadora de Distancia");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(400, 300);
        setLocationRelativeTo(null);

        JPanel panelPrincipal = new JPanel();
        panelPrincipal.setLayout(new GridLayout(7, 2, 10, 10));
        panelPrincipal.setBorder(BorderFactory.createEmptyBorder(15, 15, 15, 15));
        panelPrincipal.setBackground(new Color(240, 248, 255));

        configurarCampo(campoX1);
        configurarCampo(campoY1);
        configurarCampo(campoX2);
        configurarCampo(campoY2);
        configurarBoton(botonCalcular, new Color(100, 149, 237));
        configurarBoton(botonHistorial, new Color(60, 179, 113));
        configurarEtiqueta(etiquetaResultado);

        panelPrincipal.add(new JLabel(" X1:"));
        panelPrincipal.add(campoX1);
        panelPrincipal.add(new JLabel(" Y1:"));
        panelPrincipal.add(campoY1);
        panelPrincipal.add(new JLabel(" X2:"));
        panelPrincipal.add(campoX2);
        panelPrincipal.add(new JLabel(" Y2:"));
        panelPrincipal.add(campoY2);
        panelPrincipal.add(botonCalcular);
        panelPrincipal.add(etiquetaResultado);
        panelPrincipal.add(botonHistorial);
        panelPrincipal.add(new JLabel());

        add(panelPrincipal);
    }

    private void configurarCampo(JTextField campo) {
        campo.setFont(new Font("Segoe UI", Font.PLAIN, 14));
        campo.setBackground(Color.WHITE);
        campo.setForeground(new Color(50, 50, 50));
    }

    private void configurarBoton(JButton boton, Color colorFondo) {
        boton.setFont(new Font("Segoe UI", Font.BOLD, 14));
        boton.setBackground(colorFondo);
        boton.setForeground(Color.WHITE);
        boton.setFocusPainted(false);
        boton.setBorder(BorderFactory.createLineBorder(colorFondo.darker(), 2));
    }

    private void configurarEtiqueta(JLabel etiqueta) {
        etiqueta.setFont(new Font("Segoe UI", Font.BOLD, 15));
        etiqueta.setForeground(new Color(25, 25, 112));
    }

    public String getX1() { return campoX1.getText(); }
    public String getY1() { return campoY1.getText(); }
    public String getX2() { return campoX2.getText(); }
    public String getY2() { return campoY2.getText(); }

    public void mostrarResultado(String resultado) {
        etiquetaResultado.setText("Distancia: " + resultado);
    }

    public void mostrarError(String mensaje) {
        JOptionPane.showMessageDialog(this, mensaje, "Error", JOptionPane.ERROR_MESSAGE);
    }

    public void mostrarHistorial(List<String> historial) {
        JTextArea area = new JTextArea(10, 30);
        area.setText(String.join("\n", historial));
        area.setEditable(false);
        JScrollPane scroll = new JScrollPane(area);
        JOptionPane.showMessageDialog(this, scroll, "Historial de Distancias", JOptionPane.INFORMATION_MESSAGE);
    }

    public void agregarListenerCalculo(ActionListener listener) {
        botonCalcular.addActionListener(listener);
    }

    public void agregarListenerHistorial(ActionListener listener) {
        botonHistorial.addActionListener(listener);
    }
}
