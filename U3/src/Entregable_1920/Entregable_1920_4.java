/*
  Define la función convierteArrayEnString con la siguiente cabecera:
  public static String convierteArrayEnString(int[] a)
  Esta función toma como parámetro un array que contiene números y devuelve
  una cadena de caracteres con esos números. Por ejemplo, si a = { }, con-
  vierteArrayEnString(a) devuelve “”; si a = { 8 }, convierteArrayEnString(a)
  devuelve “8”; si a = { 6, 2, 5, 0, 1 }, convierteArrayEnString(a) devuelve
  “62501”.
 */
package Entregable_1920;

public class Entregable_1920_4 {
    public static void main(String[] args) {
        int[] numeros = {8, 16, 18, 100};
        int[] vacio = {};
        convierteArrayEnString(numeros);
        convierteArrayEnString(vacio);
    }
    public static String convierteArrayEnString(int[] a){
        StringBuilder s = new StringBuilder();
        for (int x: a
             ) {
            s.append(x);
        }
        // comprobar
        System.out.println(s);
        return s.toString();
    }
}
