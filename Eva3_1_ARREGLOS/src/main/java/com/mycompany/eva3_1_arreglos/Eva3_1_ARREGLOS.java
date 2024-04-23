/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva3_1_arreglos;

/**
 *
 * @author diegd
 */
public class Eva3_1_ARREGLOS {

    public static void main(String[] args) {
        //lOS ARREGLOS EN JAVA SON OBJETOS.
        //TENEMOS QUE CREARLOS ANTES DE USARLOS
        //[] ---> MANERA LOS INDICES : arreglo [3] acceso a la posicion
        //declaracion= creacion (new) [tamaño del arreglo]
        int arreglo[] = new int[10];//un arreglo de lo enteros
        //atraves de indices:
        //conocen las posiciones de los valores:
        //PRIMER POSICION DE UN ARREGLOES CERO --> 0
        //ULTIMA POSICION DE UN ARREGLO ES --> N - 1, DONDE
        //N ES EL TAMAÑOS DEL ARREGLO
        arreglo[1] = 100;
        System.out.println("valor del arreglo [1] =" + arreglo [1]);
        System.out.println(arreglo);
        System.out.println(arreglo.length);
    }
}
