/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva3_19_referencia;

/**
 *
 * @author diegd
 */
public class Eva3_19_REFERENCIA {

    public static void main(String[] args) {
    int [] arreglo = new int[5]; 
    int x = 100;
        System.out.println("Antes de llamar al metodo. x = " + x);
        sumarUno(x);// Le estoy enviando una copia de la x
        System.out.println("Despues de llamr al metodo. x = " + x);
        System.out.println("---------------------------------");
        for ( int i = 0; i < arreglo.length; i++){
            System.out.println("[" + arreglo[i] + "]");
        }
        System.out.println("");
        modificarArreglo(arreglo);
        for (int i = 0; i < arreglo.length; i++) {
            System.out.println("[" + arreglo[i] + "]");
        }
    }
    
    public static void sumarUno(int valor){
        System.out.println("antes de la operancion. Valor: " + valor);
        valor = valor + 1;
        System.out.println("Despues de la operacion. Valor: " + valor);
    }
    
    public static void modificarArreglo(int [] arreglo){
        for (int  i = 0; i < arreglo.length; i++){
        arreglo[i] = (int)(Math.random() * 100);
    }
    }
}
