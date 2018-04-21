package ejerc6;
import java.util.Scanner;
/**
 *
 * @author Ezq
 */
public class Ejerc6 {

   
    public static void main(String[] args) {
        //Declaracion e inicializacion de objeto lector y declaracion de variables
        Scanner lector= new Scanner(System.in);
        boolean estaNevando;
        boolean estaLloviendo;
        double temperatura;
        
        
        System.out.println("Escriba true si esta nevando, caso contrario escriba false");
        estaNevando=lector.nextBoolean(); //Ingreso de true o false 
        System.out.println("Escriba true si esta lloviendo, caso contrario escriba false");
        estaLloviendo=lector.nextBoolean(); //Ingreso de true o false
        System.out.println("Ingrese la temperatura");
        temperatura= lector.nextDouble(); //Ingreso de temperatura
        
        if(estaNevando || estaLloviendo){ //Comprobacion de nieve o lluvia
        System.out.println("Nos quedamos en casa!");
        }else if(temperatura <10){ //Comprobacion de temperatura menor a 10 grados
            System.out.println("Nos quedamos en casa!");
        }else{
              System.out.println("Vamos afuera!"); 
        }
        
       
    }
    
}
