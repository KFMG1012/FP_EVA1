/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva1_6_entada_d_datos2;

import java.util.Scanner;

/**
 *
 * @author 52452
 */
public class EVA1_6_ENTADA_D_DATOS2 {

    public static void main(String[] args) {
        System.out.println("Hello World!");
                String nombre;
        String curp;
        int edad;
        double promedio;
        //CREAR NUESTRO SCANNER
        Scanner captu;
        captu = new Scanner(System.in);
        //CAPTURAR
        System.out.println("Seccion de impresion de datos");
           System.out.println("captura tu nombre");
        nombre = captu.nextLine();
        System.out.println("captura tu curp");
        curp= captu.nextLine();
         System.out.println("captura tu edad");
        edad= captu.nextInt();
         System.out.println("captura tu promedio");
         
        promedio= captu.nextDouble();
        System.out.println("nombre");
        System.out.println("curp");
        System.out.println("edad");
        System.out.println("promedio");
    }
}
