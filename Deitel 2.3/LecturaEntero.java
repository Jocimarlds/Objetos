import java.util.InputMismatchException;
import java.util.Scanner;
public class LecturaEntero {
private Scanner teclado = new Scanner(System.in);
public int leerNumero()
{
//crea objeto vista
Vista vista = new Vista();
//variable locales
boolean salir = false;
int num =0;
while(!salir){
vista.leerNumeroEntero();
// aviso por consola
try {
    num = teclado.nextInt(); // lee un número del usuario
salir = true;
} catch (InputMismatchException e) {
vista.mostrarInputMismatchException();
teclado.next();
}
}//fin del while;
return num ;//Retorna num
}//fin del metodo leerNumero()
} 