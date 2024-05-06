/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva3_12_metodos;

/**
 *
 * @author diegd
 */
public class Eva3_12_METODOS {

    public static void main(String[] args) {
        //invocar metodo --> llamada --> call
        mostrarMensaje("Hola Mundo cruel!!");
        mostrarMuchosMensajes("Hola!!", 5);
         }
    //public static ---> para materia de POO
    //void --> (tipo de dato) valor que regresa el metodo
    //void --> no regresa nada
    //nombre del metodo --> indificador valido
    //                      empezar en minuscula, deber ser verbo
    //() <---- parametros del metodo (argumentos) ---> valores que necesita para funcionar.
    // Las llaves {} ---> son bloque de codigo
    public static void  mostrarMensaje(String mensaje) {//encabezado (nombre del metodo
        //cuerpo del metodo: aqui va nuestro codigo
        System.out.println(mensaje);
    }
    public static void mostrarMuchosMensajes(String mensaje, int veces){
        for (int i = 0; i < veces; i++) {
            System.out.println(mensaje);
        }
    }
}
