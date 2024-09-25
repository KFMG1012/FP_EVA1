/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva1_18;

import java.util.Scanner;

/**
 *
 * @author 52452
 */
public class Eva1_18 {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        int califa;
        Scanner captu;
        captu=new Scanner(System.in);
        califa=captu.nextInt();
        if(califa>=0 &&califa<=100){
        System.out.println("cali valida");
        }else
            {
            
            System.out.println("cali no valida");
            }
    }
}
