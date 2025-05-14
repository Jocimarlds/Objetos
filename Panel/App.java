//FIG 4.19: PruebaPanelDibujo,java Crear un objeto JFrame para mostrar PanelDibujo
import javax.swing.JFrame;

public class App 
{
    public static void main(String[] args) 
    {
        //Crea un panel que contiene nuestro dibujo
        PanelDibujo panel = new PanelDibujo();
        //Crea un nuevo marco para contener el panel
        JFrame aplicacion = new JFrame("JOCIMAR");

        //Establece el marco para salir cuando se cierre
        aplicacion.add(panel);//Agrega el panel al marco
        aplicacion.setSize(400, 250);//Establece el tamaño del marco
        aplicacion.setVisible(true);//Hace que el marco sea visible
        aplicacion.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}