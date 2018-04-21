package ejerc5;
import java.util.Scanner;
/**
 *
 * @author Ezq
 */
public class Ejerc5 {

    
    public static void main(String[] args) {
        
    //Declaracion de variable e inicializacion de objeto lector
    Scanner lector= new Scanner(System.in);
    int mes;
    
    System.out.println("Ingrese el numero de un mes: ");
    mes=lector.nextInt(); //Ingreso de numero
    while(mes<=0 || mes>12){ //Comprobacion de rango adecuado
            System.out.println("El valor debe estar entre 1 y 12, ingrese de nuevo: ");
            mes=lector.nextInt();
                                  }

    switch(mes){ //Ejecuciones segun lo ingresado 
        case 1: System.out.println("Enero");
                break;
        case 2: System.out.println("Febrero");
                break;
        case 3: System.out.println("Marzo");
                break;
        case 4: System.out.println("Abril");
                break;
        case 5: System.out.println("Mayo");
                break;
        case 6: System.out.println("Junio");
                break;
        case 7: System.out.println("Julio");
                break;
        case 8: System.out.println("Agosto");
                break;
        case 9: System.out.println("Septiembre");
                break;
        case 10: System.out.println("Octubre");
                break;
        case 11: System.out.println("Noviembre");
                break;
        case 12: System.out.println("Diciembre");
                break; 
    }
    
}

}