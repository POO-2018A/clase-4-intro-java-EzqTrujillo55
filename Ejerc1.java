package ejerc1;
import java.util.Scanner;
/**
 *
 * @author Ezq
 */
public class Ejerc1 {

  
    public static void main(String[] args) {
        
    //Inicializacion de objeto lector y declaracion de variables
    Scanner lector=new Scanner(System.in);
    double fahrenheit;
    double celsius;
    
    
    System.out.println("Ingrese temperatura en fahrenheit: ");
    fahrenheit=lector.nextDouble(); //Ingreso de valor
    while(fahrenheit>100 || fahrenheit<0){ //Comprobacion de rango adecuado
    System.out.println("El valor debe estar entre 0 y 100, ingrese de nuevo: ");
    fahrenheit=lector.nextDouble();
    }
    celsius=((fahrenheit-32)*5)/9; //Calculo de temperatura en celsius
        System.out.println("Temperatura en celsius= " + celsius);  //Impresion de temperatura en celsius 
      
    
    }
    
}
