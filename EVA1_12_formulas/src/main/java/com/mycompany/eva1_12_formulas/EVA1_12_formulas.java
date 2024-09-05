/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva1_12_formulas;

import java.util.Scanner;

/**
 *
 * @author 52452
 */
public class EVA1_12_formulas {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        Double t,d,a,vi;
        Scanner captu =new Scanner(System.in);
        System.out.println("dame la velocidad inicial");
        vi=captu.nextDouble();
        System.out.println("dame el tiempo");
        t=captu.nextDouble();
        System.out.println("dame la aceleracion");
        a=captu.nextDouble();
        d=(vi*t)+(a*(t*t)/2.0);
        System.out.println("dame la distancia "+d);
        
    }
}
