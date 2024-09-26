/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva.pkg1_19;

import java.util.Scanner;

/**
 *
 * @author 52452
 */
public class Eva1_19 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int km;
        int m;
        Scanner captu;
        captu=new Scanner(System.in);
        System.out.println("dame los kilometros del vehiculo");
        km=captu.nextInt();
        System.out.println("dame los meses");
         m=captu.nextInt();
        
        if(km>=5000 || m>=6)  {
    
      System.out.println("camio de aceite");
    }
        else{
        System.out.println("no cambiar");
        }
    }
    
}
