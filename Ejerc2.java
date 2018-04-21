package ejerc2;
import java.util.Scanner;
/**
 *
 * @author Ezq
 */
public class Ejerc2 {
    public static void main(String[] args) {
        //Declaracion de cadena e inicializacion de objeto lector
       Scanner lector=new Scanner(System.in);
       String nombre;
       System.out.println("Ingrese su nombre"); 
       nombre=lector.next(); //Ingreso de cadena
       nombre=nombre.toUpperCase(); //Transformacion de cadena a mayusculas
       System.out.println("Hola [" + nombre + "]"); //Impresion 
    }
    
}
