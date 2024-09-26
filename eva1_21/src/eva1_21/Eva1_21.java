/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_21;

import java.util.Scanner;

/**
 *
 * @author 52452
 */
public class Eva1_21 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int m;
        
        Scanner captu;
        captu=new Scanner(System.in);
        System.out.println("");
        m=captu.nextInt();
        captu.nextLine();
        if(m==1){System.out.println("enero");}
        else if (m==2){  System.out.println("febrero");}
      else if (m==3){  System.out.println("marzo");}
        else if (m==4){  System.out.println("abril");}
        else if (m==5){  System.out.println("mayo");}
        else if (m==6){  System.out.println("junio");}
        else if (m==7){  System.out.println("julio");}
        else if (m==8){  System.out.println("agosto");}
        else if (m==9){  System.out.println("septiembre");}
        else if (m==10){  System.out.println("octubre");}
        else if (m==11){  System.out.println("noviembre");}
        else if (m==12){  System.out.println("diciembre");}
        else {  System.out.println("es incorrecto");}
    }
    
    
}
