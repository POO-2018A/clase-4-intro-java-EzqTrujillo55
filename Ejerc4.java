package ejerc4;
import java.util.Scanner;
/**
 *
 * @author Ezq
 */
public class Ejerc4 {

    
    public static void main(String[] args) {
       //Declaracion de variable e inicializacion de objeto lector
       Scanner lector= new Scanner(System.in);
       int numero;
       
       System.out.println("Ingrese un numero: ");
       numero= lector.nextInt(); //Ingreso de numero 
      
       if(numero==0){ //Comprobaciones de par, impar y neutro
       System.out.println("El numero es neutro");
       }else if(numero%2==0){
           System.out.println("El numero es par");
    }else{
       System.out.println("El numero es impar");
       
    }
    
}
}
