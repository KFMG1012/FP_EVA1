/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_25;

import java.util.Scanner;

/**
 *
 * @author 52452
 */
public class Eva1_25 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double ano;
        double divi;
        
       Scanner captu;
       captu=new Scanner(System.in);
        System.out.println("dame el año");
       ano=captu.nextDouble();
       double modulo=ano%4;
       divi=ano/4;
       System.out.println(divi);
       modulo=ano/100;
       System.out.println(modulo);
        modulo=ano/400;
        System.out.println(modulo);
       
    }
    
}
