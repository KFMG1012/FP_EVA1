/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_24;

import java.util.Scanner;

/**
 *
 * @author 52452
 */
public class Eva1_24 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner captu;
        captu=new Scanner(System.in);
        int cali;
        System.out.println("dame tu promedio");
        cali=captu.nextInt();
        //MODULO para calcular el residuo
        //int modulo=5%4
        //System.out.prointln(MODULO);
       if(cali  <=100 && cali>=90){    System.out.println("tu cali es A+");}
       else if(cali <=89 && cali >=80){    System.out.println("tu cali es B");}
        else if(cali <=79 && cali >=70){    System.out.println("tu cali es C");}
       else if(cali <=69 && cali >=60){    System.out.println("tu cali es D");}
         else if(cali >=0 && cali <=59){    System.out.println("tu cali es F");}
        
        
    }
    
}
