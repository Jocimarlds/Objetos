//FIG 4.18 PanelDibujo.java
//Uso de drawline para conectar las esquinas de un panel
import java.awt.Graphics;
import javax.swing.JPanel;
import java.awt.Color;

public class PanelDibujo extends JPanel
{

    //Dibuja una x desde las esquinas del panel
    
    public void paintComponent(Graphics g)
    {
    //Llama a paintComponent para asegurar que el panel se muestre correctamente
    super.paintComponent(g);

    setBackground(Color.GREEN);
    int achura = getWidth(); // Anchura total
    int altura = getHeight(); // Altura total
    
    //Dibuja una línea de la esquinasuperior izquierda a la esquina inferior izquierda
    g.setColor(Color.YELLOW);
    g.drawLine(0, 0, achura, altura);

    //Dibuja un línea de la esquina inferior
    g.setColor(Color.BLACK );
    g.drawLine(0, altura, achura, 0);

    //Rectángulo (relleno y borde)
        g.setColor(Color.BLUE);
        g.fillRect(30, 100, 350, 60);
        g.setColor(Color.BLACK);
        g.drawRect(30, 100, 350, 60);
    }
}//Fin de la clase PanelDibujo
