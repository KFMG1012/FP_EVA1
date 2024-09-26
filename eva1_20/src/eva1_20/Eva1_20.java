/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_20;

import java.util.Scanner;

/**
 *
 * @author 52452
 */
public class Eva1_20 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        
        int dia;
        Scanner captu;
        captu=new Scanner(System.in);
        System.out.println("dame el dia de la semana");
        dia=captu.nextInt();
        captu.nextLine();
        if (dia==1) {
        System.out.println("domingo");
        
        }
        else if (dia==2) {
        System.out.println("lunes");
        
        }
        else if (dia==3) {
        System.out.println("martes");
        
        }
        else if (dia==4) {
        System.out.println("miercoles");
        
        }
        else if (dia==5) {
        System.out.println("jueves");
        
        }
        else if (dia==6) {
        System.out.println("viernes");
        
        }
        else if (dia==7) {
        System.out.println("sabado");
        
        }
        else  {
        System.out.println("dia invalido");
        }
    }
    
}
