/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva3_14_return_2;

import java.util.Scanner;

/**
 *
 * @author diegd
 */
public class Eva3_14_RETURN_2 {

    public static void main(String[] args) {
        Scanner captu = new Scanner(System.in);
        System.out.println("Base: ");
        int base = captu.nextInt();
        System.out.println("Pot: ");
        int pot = captu.nextInt();
        //calcular la potencia
        int resu = calcularPot(base, pot);
        System.out.println("El resultado es = " + resu);
    }
            //CREAR UNA FUNCION QUE CALCULE LA POTENCIA DE UNA VALOR ENTERO
    public static int calcularPot(int base, int potencia){
        //Necesitamos un ACUMULADOR
        int resu = 1;
        for (int i = 0; i < potencia; i++) {
            resu = resu * base;
        }
        return resu;
    }
}
