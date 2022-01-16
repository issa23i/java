package Examen_ROJO;

import java.util.Arrays;

/**
 * Define la función esta  con la siguiente cabecera:
 *
 * public static boolean esta(int[] vector, int num)
 *
 * Que nos devuelva si un elemento está en un vector(array) unidimensional.
 *
 * Usar dicho elemento para construir la siguiente función:
 *
 * public static int[] unirSinRepetidos(int v1[],int[] v2)
 *
 * Que una los dos vectores pero sin elementos repetidos.
 * Usar dicha función en el método main mostrando el vector resultado por pantalla.
 *
 * Ejemplo1:
 *
 * v1 = {1,2,3}
 *
 * v2 = {4,5,6}
 *
 * El resultado de unirSinRepetidos() será:
 *
 * {1,2,3,4,5,6}
 *
 * Ejemplo2:
 *
 * v1 = {1,2,3}
 *
 * v2 = {3,2,5}
 *
 * El resultado de unirSinRepetidos() será:
 *
 * {1,2,3,5}
 */

public class EJ1 {
    public static void main(String[] args) {
        int[] v1 = {1,2,3};
        int[] v2 = {3,2,5};
        System.out.println(Arrays.toString(unirSinRepetidos(v1,v2)));
    }

    public static boolean esta(int[] vector, int num){
        Arrays.sort(vector);
        if (Arrays.binarySearch(vector,num) >= 0 ){
            return true;
        }
        return false;
    }
    public static int[] unirSinRepetidos(int v1[],int[] v2){
        int contador = 0;
        int[] resultado = new int[v1.length + v2.length];
        for (int i = 0; i < v1.length; i++) {
            if(esta(v2, v1[i])) {
                resultado = Arrays.copyOf(resultado, resultado.length-1);
            } else {
                resultado[contador] = v1[i];
                contador++;
            }
        }
        for (int i = 0; i < v2.length; i++) {
            resultado[contador] = v2[i];
            contador++;
        }
        return resultado;
    }
}
