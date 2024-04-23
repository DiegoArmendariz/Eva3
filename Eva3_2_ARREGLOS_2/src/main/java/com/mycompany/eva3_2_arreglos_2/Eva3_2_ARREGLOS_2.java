/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva3_2_arreglos_2;

/**
 *
 * @author diegd
 */
public class Eva3_2_ARREGLOS_2 {

    public static void main(String[] args) {
     //JAVA: 0 primero elemntos
     //      N - 1 ultimo elemento
     //N --> TOTAL DE ELEMENTOS ALMANENADOS EN EL ARREGLO
     
     //vamos a crear un arreglo y llenarlo de valores aleatorio.
     //int datos[], x, y; --> SOLO datos ES UN ARREGLO.
     //int[] datos, x, y; --> TODA LAS VARIABLES SON ARREGLOS.
     
     int datos[] = new int[100];
     
     //asignar valorea aleatoria entre 0 y 99,(1 -100)
     for(int i = 0; i < datos.length; i++){
        datos[i] = (int)(Math.random() * 100);//0 - 99
     }
     //imprimir los elemntos del arreglo
        for(int i = 0; i < datos.length; i++){
            System.out.print("[" + datos[i] + "]");
        }
    }
}
