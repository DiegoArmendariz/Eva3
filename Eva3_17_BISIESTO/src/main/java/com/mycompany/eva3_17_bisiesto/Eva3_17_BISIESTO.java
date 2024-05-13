/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva3_17_bisiesto;

import java.util.Scanner;

/**
 *
 * @author diegd
 */
public class Eva3_17_BISIESTO {

    public static void main(String[] args) {
        Scanner captu = new Scanner(System.in);
        System.out.println("Que año va evaluar:");
        int año = captu.nextInt();
        if(esbisiesto(año))
            System.out.println("Si es año bisiesto");
        else 
            System.out.println("No es año bisiesto");
    }
public static boolean  esbisiesto(int año ){
    int resi = año % 4;
    int resi100 = año % 100;
    int resi400 = año % 400;
    
    if ((resi == 0) && ((resi100 != 0) || (resi400 == 0)))
        return true;
    else
        return false;
}
}
