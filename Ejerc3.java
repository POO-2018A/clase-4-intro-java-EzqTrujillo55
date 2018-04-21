package ejerc3;
import java.util.Scanner;
/**
 *
 * @author Ezq
 */
public class Ejerc3 {


    public static void main(String[] args) {
        //Declaracion de variable e inicializacion de objeto lector
        Scanner lector= new Scanner(System.in);
        int edad;
        
        System.out.println("Ingrese su edad: ");
        edad= lector.nextInt(); //Ingreso de edad
        while(edad<0){ //Comprobacion de rango adecuado
            System.out.println("El valor debe ser mayor o igual que cero, intente de nuevo");
            edad=lector.nextInt();
        }
        
        if(edad>=18){ //Comprobacion de mayoria o minoria de edad 
            System.out.println("Usted es mayor de edad");
        }else{
        System.out.println("Usted es menor de edad");
             }
    }
    
}
