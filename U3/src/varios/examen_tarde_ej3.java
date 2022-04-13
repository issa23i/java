/*
Ejercicio 3
Desarrolla dos funciones para trabajar con cadenas. La primera tendrá la siguiente cabecera:

public static String[] invertir(String cadena)
Recibe una cadena (String), y devuelve esa cadena invertida
y en mayúsculas pero colocada en un array (una letra por posición)

Ejemplo:

invertir("hola") debe devolver [ "A","L","O","H"]
La segunda función tendrá la siguiente cabecera:

public static String[] desplazarVocales(String cadena)
Recibe una cadena (String), y devuelve esa misma cadena con las vocales desplazadas una posición:

a -> e
e -> i
i -> o
o -> u
u -> a
y colocada en un vector (una letra por posición)

Ejemplo:

desplazarVocales("hola") debe devolver ["h","u","l","e"]
 */

import java.util.Arrays;

public class examen_tarde_ej3 {
    public static void main(String[] args) {
        String s = "hola";
        System.out.println(Arrays.toString(invertir(s)));
        System.out.println(Arrays.toString(desplazarVocales(s)));
    }
    public static String[] invertir(String cadena) {
        String[] s = new String[cadena.length()];
        for (int i = 0; i < cadena.length(); i++) {
            s[i] =  cadena.substring(i, i+1);
        }
        return s;
    }
    public static String[] desplazarVocales(String cadena){
        String[] vocales = {"a", "e", "i", "o", "u", "a"};
        String [] resultado = new String[cadena.length()];
        String tmp = cadena;
        for (int i = 0; i < vocales.length-1; i++) {
            for (int j = 0; j < cadena.length(); j++) {
                if ( (vocales[i]).equals(String.valueOf(cadena.charAt(j)) )){
                    // reemplaza la vocal que coincide por la siguiente vocal
                    tmp = tmp.replace(String.valueOf(cadena.charAt(j)),vocales[i+1]);
                }
            }
        }
        for (int i = 0; i < tmp.length(); i++) {
            resultado[i] = tmp.substring(i,i+1);
        }
        return resultado;
    }
}
