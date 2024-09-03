/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva1_7_tu_carro;

import java.util.Scanner;

/**
 *
 * @author 52452
 */
public class EVA1_7_TU_CARRO {

    public static void main(String[] args) {
        System.out.println("Hello World!");
              String marca;
        String modelo;
        int ano;
        double precio;
        //CREAR NUESTRO SCANNER
        Scanner captu;
        captu = new Scanner(System.in);
        //CAPTURAR
               System.out.println("Seccion de impresion de datos");
           System.out.println("captura la marca del carro:");
        marca = captu.nextLine();
        System.out.println("captura el modelo del auto:");
        modelo= captu.nextLine();
         System.out.println("captura el año del carro:");
        ano= captu.nextInt();
         System.out.println("captura el precio del auto:");
        precio= captu.nextDouble();
        System.out.println("marca");
        System.out.println("modelo");
        System.out.println("ano");
        System.out.println("precio");
    }
}
