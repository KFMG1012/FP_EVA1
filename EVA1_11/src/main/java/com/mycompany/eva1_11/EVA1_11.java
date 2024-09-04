/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva1_11;

import java.util.Scanner;

/**
 *
 * @author 52452
 */
public class EVA1_11 {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        //CONVERSIONES DE TEMPERATURA
        Double f,c,K;
        Scanner captu =new Scanner(System.in);
        System.out.println("intoduce los grados f");
        f= captu.nextDouble();
        c=f-32/1.8;//expresion
        System.out.println("Los grados centrigrados son "+c);
        System.out.println("intoduce los grados c");
        c= captu.nextDouble();
        f=c*1.8+32;
        System.out.println("los grados f son " +f);
        System.out.println("intoduce los grados");
        K=captu.nextDouble();
        c=K-273;
         System.out.println("Los grados celsius son "+c);
        
        
                
    }
}
