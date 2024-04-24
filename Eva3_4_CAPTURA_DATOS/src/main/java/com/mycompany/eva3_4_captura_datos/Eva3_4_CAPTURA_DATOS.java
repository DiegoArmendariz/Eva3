/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva3_4_captura_datos;

import java.util.Scanner;

/**
 *
 * @author diegd
 */
public class Eva3_4_CAPTURA_DATOS {

    public static void main(String[] args) {
        int cant;
        Scanner captu = new Scanner(System.in);
        System.out.println("Cuantos nombres vas a capturar?");
        cant = captu.nextInt();
        String[] listaNombre = new String[cant];
        captu.nextLine();
        //HAY QUE PRENGUTAR CADA NOMBRE:
        for (int i = 0; i < listaNombre.length; i++){
            System.out.println("Nombre #" + (i + 1) + ": ");
            listaNombre[i] = captu.nextLine();
        }
        for (int i = 0; i < listaNombre.length; i++){
            System.out.println(listaNombre[i]);
        }
    }
}
