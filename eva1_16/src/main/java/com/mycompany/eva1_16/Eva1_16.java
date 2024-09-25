/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva1_16;

import java.util.Scanner;

/**
 *
 * @author 52452
 */
public class Eva1_16 {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        
        
        
        char tipo;
        Scanner captu;
        captu=new Scanner(System.in);
        System.out.println("tipo de persona 'f'==fisica,'m'==moaral");
        tipo=captu.nextLine().charAt(0);
        if(tipo=='f'){
        System.out.println("persona fisica");
        
        }
        
        else{
        System.out.println("moral");
        }
        
    }
}
