/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva3_3_indice_erroneo;

/**
 *
 * @author diegd
 */
public class Eva3_3_INDICE_ERRONEO {

    public static void main(String[] args) {
        int datos[] = new int[10];
        datos[10] = 100;//ERROR EN TIEMPOP DE EJECUCION: El indice qo no existe
        System.out.println("El valor en datos[10] = " + datos[10]);
        
    }
}
