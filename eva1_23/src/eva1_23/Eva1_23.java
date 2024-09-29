/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_23;

import java.util.Scanner;

/**
 *
 * @author 52452
 */
public class Eva1_23 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         int año;
        Scanner captu;
        captu=new Scanner(System.in);
        System.out.println("dame un mes del año");
        año=captu.nextInt();
        captu.nextLine();   
        
           switch (año){
        case 1 -> System.out.println("enero");
            //se salta todo el swicht
      case 2 -> System.out.println("febrero");
       case 3 -> System.out.println("Marzo");
       case 4 -> System.out.println("abril");
       case 5 -> System.out.println("mayo");
       case 6 -> System.out.println("junio");
       case 7 -> System.out.println("julio");
       case 81 -> System.out.println("agosto");
       case 9 -> System.out.println("septiembre");
       case 10 -> System.out.println("octubre");
       case 11 -> System.out.println("noviembre");
       case 12 -> System.out.println("Diecmbre");
       default -> System.out.println("mes invalido solo( del mes del 1a 12)");
    }
    }
    
}
