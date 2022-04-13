package Examen_ROJO;

import java.util.Arrays;

/**
 * Define la función convierteArrayEnString con la siguiente cabecera:
 * public static String convierteArrayEnString(int[] a)
 * Esta función toma como parámetro un array que contiene números y devuelve
 * una cadena de caracteres con esos números. Por ejemplo, si a = { }, con-
 * vierteArrayEnString(a) devuelve “”; si a = { 8 }, convierteArrayEnString(a)
 * devuelve “8”; si a = { 6, 2, 5, 0, 1 }, convierteArrayEnString(a) devuelve
 * “62501”.
 *
 * Usar dicha función en el método main mostrando el resultado por pantalla.
 */

public class EJ2 {
    public static void main(String[] args) {
        int[] a = { 6, 2, 5, 0, 1 };
        System.out.println(convierteArrayEnString(a));
    }
    public static String convierteArrayEnString(int[] a){
        StringBuilder sb = new StringBuilder();
        for (int n:a
             ) {
            sb.append(n);
        }
        return sb.toString();
    }
}
