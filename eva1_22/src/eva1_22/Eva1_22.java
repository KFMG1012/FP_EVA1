/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_22;

import java.util.Scanner;

/**
 *
 * @author 52452
 */
public class Eva1_22 {
    public static void main(String[] args) {
 int dia;
        Scanner captu;
        captu=new Scanner(System.in);
        System.out.println("dame el dia de la semana");
        dia=captu.nextInt();
        captu.nextLine();   
        
           switch (dia){
        case 1:
    System.out.println("domingo");
   break;//se salta todo el swicht
      case 2:
    System.out.println("Lunes");
    break;
       case 3:
    System.out.println("Martes");
    break;
       case 4:
    System.out.println("Miercoles");
    break;
       case 5:
    System.out.println("Jueves");
    break;
       case 6:
    System.out.println("Viernes");
    break;
       case 7:
    System.out.println("Sabado");
    break;
       default:
       System.out.println("dia invalido solo( del dia del 1a 7)");
    }
    }
 

        
}
