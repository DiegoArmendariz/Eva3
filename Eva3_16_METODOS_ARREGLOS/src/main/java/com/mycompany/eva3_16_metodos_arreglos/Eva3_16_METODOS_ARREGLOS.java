/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva3_16_metodos_arreglos;

/**
 *
 * @author diegd
 */
public class Eva3_16_METODOS_ARREGLOS {

    public static void main(String[] args) {
     int [] datos = new int[10];
     datos = llenar(datos);//Madamos el arreglo, nos lo devuelve lleno
     imprimir(datos);//imprime los valores del arreglo
        System.out.println("");
        
     int [] datos2 = new int[15];
     datos2 = llenar(datos);//Mandamos el arreglo, nos lo devuelve lleno
     imprimir(datos2);//Imprime los valores del arreglo
    }
    
    public static void imprimir(int[] arreglo){
        for(int i = 0; i < arreglo.length; i++){
            System.out.println("[" + arreglo[i] + "]");
        }
    }
    
    public static int[] llenar(int[] arreglo){
         for (int i = 0; i < arreglo.length; i++){
         arreglo[i] = (int)(Math.random() * 100);
     }
         return arreglo;
    }
}
