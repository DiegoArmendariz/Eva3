/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva3_13_return;

import java.util.Scanner;


/**
 *
 * @author diegd
 */
public class Eva3_13_RETURN {

    public static void main(String[] args) {
        Scanner captu = new Scanner(System.in);
        System.out.println("Valor 1: ");
        int val1 =  captu.nextInt();
        System.out.println("Valor 2: ");
        int val2 = captu.nextInt();
        //llamar la funcion
        //1.Guardar el resultado: conveniete 
        //int resu = sumar(val1, val2);
        //System.out.println("La suma = " + resu);
        //2. Usar directamente el resultado de la funcion
        //cuando solo usan el resultado una vez
        System.out.println("La suma es = " + sumar(val1, val2));
        //3. Ignorar el resultado
        sumar(val1, val2);
    }
    public static int sumar(int num1, int num2){
            int resu = num1 + num2;
            
            return resu;//Es la ultima instruccion del metodo despues del 
                        //return no puede haber mas instrucciones.
    }
}
