/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva1_17;

import java.util.Scanner;

/**
 *
 * @author 52452
 */
public class EVA1_17 {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        String usu,pwd;
        int contraseña;
        Scanner captu;
        captu=new Scanner (System.in);
        System.out.println("ingresa el nombre de usuario");
        usu=captu.nextLine();
         System.out.println("ingresa el la contraseña");
        pwd=captu.nextLine();
        if(usu.equals("admi")&& pwd.equals("1234"))
        {
        System.out.println("acceso consedido");
        
        }
      else{}
        System.out.println("acceso denegado");
    }
}
