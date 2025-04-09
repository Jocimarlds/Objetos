public class App {
    public static void main(String[] args) throws Exception {
    //preparao los espacio para los objetos
    Modelo modelo;
    Vista vista ;
    Controlador controlador;
    //inicio los objetos
    modelo = new Modelo();
    vista = new Vista();
    controlador = new Controlador(modelo, vista);
    //metodos
    controlador.iniciar();
    }
}