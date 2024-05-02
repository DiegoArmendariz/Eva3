/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva3_9_arreglos;

/**
 *
 * @author diegd
 */
public class Eva3_9_ARREGLOS {

    public static void main(String[] args) {
       String diasSemana[] = { "Domingo", "Lunes", "Martes", "Miercoles", "Jueves", "Viernes", "Sabado"};
        char vocales[] = {'a','e','i','o','u' };
        System.out.println("Tamaño del arreglo diasSemana =" + diasSemana.length);
        System.out.println("Tamaño del arreglo diasSemana =" + vocales.length);
        
        for (int i = 0; i < diasSemana.length; i++){
            System.out.println(diasSemana[i]);
        }
        for (int i = 0; i < vocales.length; i++){
            System.out.println(vocales[i]);
        }
        System.out.println("");
        String menu[] = {"Archivos", "Nueva Factura", "Modificar", "Salir"};
        for (int i = 0; i < menu.length; i++){
            System.out.println(i + " - " + menu[i]);
        }
    }
}
