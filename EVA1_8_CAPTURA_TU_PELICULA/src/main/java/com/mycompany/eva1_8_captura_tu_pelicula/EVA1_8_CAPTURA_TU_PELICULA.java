/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva1_8_captura_tu_pelicula;

import java.util.Scanner;

/**
 *
 * @author 52452
 */
public class EVA1_8_CAPTURA_TU_PELICULA {

    public static void main(String[] args) {
        System.out.println("Hello World!");
             String nombre;
        String Genero;
        int Duracion;
        String Reparto;
        String Clasificacion;
        //CREAR NUESTRO SCANNER
        Scanner captu;
        captu = new Scanner(System.in);
        //CAPTURAR
               System.out.println("Seccion de impresion de datos");
           System.out.println("captura el nombre de la pelicula:");
        nombre = captu.nextLine();
        System.out.println("captura el Genero de la pelicula:");
        Genero= captu.nextLine();

         System.out.println("captura el reparto:");
         Reparto = captu.nextLine();  
         System.out.println("captura la clasificacion:");
        Clasificacion = captu.nextLine();
          System.out.println("captura la duracion:");
        Duracion = captu.nextInt();        
        System.out.println(nombre);
        System.out.println(Genero);
        System.out.println(Reparto);
        System.out.println(Clasificacion);
        System.out.println(Duracion);
    }
}
