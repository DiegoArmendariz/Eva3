/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva3_8_5d;

/**
 *
 * @author diegd
 */
public class Eva3_8_5D {

    public static void main(String[] args) {
        int dimension[][][][][] = new int[10][15][16][11][5];
        for (int i = 0; i < dimension.length; i++){
           for (int j = 0; j < dimension[i].length; j++){
              for (int k = 0; k < dimension[i][j].length; k++){
                 for (int a = 0; a < dimension[i][j][k].length; a++){
                   for (int s = 0; s < dimension[i][j][k][a].length; s++){
                       dimension[i][j][k][a][s] = (int) (Math.random() * 100);
                   }
                 }
              }
           }
        }
        for (int i = 0; i < dimension.length; i++){
           for (int j = 0; j < dimension[i].length; j++){
              for (int k = 0; k < dimension[i][j].length; k++){
                 for (int a = 0; a < dimension[i][j][k].length; a++){
                   for (int s = 0; s < dimension[i][j][k][a].length; s++){
                       System.out.println("[" + dimension [i][j][k][a][s] + "]");
                     }  
                    }
                   }
           }
        }
    }              
}
