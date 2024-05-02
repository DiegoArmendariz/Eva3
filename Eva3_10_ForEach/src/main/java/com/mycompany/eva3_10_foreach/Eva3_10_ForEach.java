/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva3_10_foreach;

/**
 *
 * @author diegd
 */
public class Eva3_10_ForEach {

    public static void main(String[] args) {
        String diasSemana[] = { "Domingo", "Lunes", "Martes", "Miercoles", "Jueves", "Viernes", "Sabado"};
        for (String dia : diasSemana) {
            System.out.println(dia);
        }
        int salario[] = {15, 100, 120, 150, 1232, 4000, 5430};
        for (int cant: salario)
            System.out.println("$" + cant);
        
        //---------
        //MESES DEL AÑO. IMPRIMIR CON FOR-EACH
        String meses[] = {"Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Sepetiembre", "Octubre", "Noviembre", "Diciembre"};
                for (String año : meses) {
                    System.out.println(año);
        }
        }
}
