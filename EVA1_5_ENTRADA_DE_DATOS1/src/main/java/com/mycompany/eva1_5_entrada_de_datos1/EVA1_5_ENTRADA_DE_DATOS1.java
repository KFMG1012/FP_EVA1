/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva1_5_entrada_de_datos1;

import java.util.Scanner;

/**
 *
 * @author 52452
 */
public class EVA1_5_ENTRADA_DE_DATOS1 {

    public static void main(String[] args) {
        System.out.println("Hello World!");
         String nombre;
                        //CAPTURA DE DATOS DEL TECLADO:
                        //SCANNER-- HERRAMIENTA (CLASE)
                        Scanner captu; //INCORPORAR LA HERRAMIENTA AL CÒDIGO
                        //NO EXISTE, HAY QUE CREARLA
                        captu = new Scanner (System.in);

                        
                        //DARLE LA INSTRUCION AL USUARIO
                        System.out.println("introduce tu nombre completo: ");
                        //Capturar
                        nombre = captu.nextLine();//CAPTURAMOS TODO EL TEXTO
                                                  //HASTA QUE PRECIONA LA TECLA"ENTER"
                        //IMPRIMIR LOS DATOS:
                        System.out.println("DATOS CPTURADOS----------------");
                          System.out.println(nombre);
    }
}
