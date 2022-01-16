/**
 * Desarrollar una función que se denomine insertarEnVector con el siguiente prototipo:
 *
 * public static int[] insertarEnVector(int[] v1, int [] v2, int pos)
 * Recibirá como parámetros dos vectores de enteros y una posición.
 * Devolverá un vector de enteros que contenga el primer array con el segundo array insertado
 * de manera completa a partir de la posición dada. Si la posición es menor que 0,
 * el vector devuelto deberá contener el primer array. Si la posición es mayor que la longitud del primer array,
 * el vector devuelto deberá contener el segundo array. Si la posición es igual a la longitud del primer array,
 * el vector devuelto deberá contener el primer array con el segundo array insertado al final.
 * Probar dicha función en el método Main.
 *
 * Ejemplo 1:
 *
 * v1 = {1,2,3,4,5,6}
 * v2 = {4,9,12,5,7}
 * pos = 2
 * El resultado de insertarEnVector será:
 *
 * {1,2,4,9,12,5,7,3,4,5,6}
 * Ejemplo 2:
 *
 * v1 = {6,12,8,9,3,13}
 * v2 = {13,11,4,8,6,1}
 * pos = -1
 * El resultado de insertarEnVector será:
 *
 * {6,12,8,9,3,13}
 * Ejemplo 3:
 *
 * v1 = {6,12,8,9,3,13}
 * v2 = {13,11,4,8,6,1}
 * pos = 7
 * El resultado de insertarEnVector será:
 *
 * {13,11,4,8,6,1}
 */
package Entregable_2122;

import java.util.Arrays;

public class Ejercicio2 {
    public static void main(String[] args) {
       int[] v1 = {6,12,8,9,3,13};
       int[] v2 = {13,11,4,8,6,1};
       int pos = 7;
       int[] resultado = insertarEnVector(v1,v2,pos);
        for (int x:resultado
             ) {
            System.out.print(x + "  ");
        }
    }
    public static int[] insertarEnVector(int[] v1, int [] v2, int pos){
        int largov1 = v1.length;
        int largov2 = v2.length;
        int[] x = new int[largov1+largov2];
        if (pos<0){ // Si la posición es menor que 0
            // el vector devuelto deberá contener el primer array
            x = v1;
        } else if(pos > v1.length) { // Si la posición es mayor que la longitud del primer array
            // el vector devuelto deberá contener el segundo array.
            x = v2;
        } else if(pos == v1.length) { // Si la posición es igual a la longitud del primer array
            // el vector devuelto deberá contener el primer array con el segundo array insertado al final
            for (int i = 0; i < x.length; i++) {
                if (i < largov1) {
                    x[i] = v1[i];
                } else {
                    x[i] = v2[i-largov1];
                }
            }
        } else {
            for (int i = 0; i < x.length; i++) {
                if (i < pos) {
                    x[i] = v1[i];
                } else if (i >= pos && i < x.length - largov2+1) {
                    x[i] = v2[i-pos];
                } else {
                    x[i] = v1[i-largov2];
                }
            }
        }
        return x;
    }
}
