/*
Crea la función de manejo de arrays que tenga la siguiente cabecera y
que haga lo que se especifica en los comentarios:

public int[] filtraCapicuas(int x[])
// Devuelve un array con todos los números capicúa que se encuentren
// en otro array que se pasa como parámetro. Obviamente el tamaño del
// array que se devuelve será menor o igual al que se pasa como
// parámetro.
Utiliza esta función en un programa para comprobar que funcionan bien.
Para que el ejercicio resulte más fácil, las repeticiones de números capicúa se conservan;
es decir, si en el array x el número 505 se repite 3 veces,
en el array devuelto también estará repetido 3 veces.
Si no existe ningún número capicúa en x, se devuelve un array con el número -1 como único elemento.
 */
package Examen_recuperacion;

import java.util.Arrays;

public class Ej4 {
    public static void main(String[] args) {
        int[] a = {3, 434, 506, 810010, 464, 363, 7, 10};
        filtraCapicuas(a);
    }
    public static int[] filtraCapicuas(int x[]){
        // Devuelve un array con todos los números capicúa que se encuentren
// en otro array que se pasa como parámetro. Obviamente el tamaño del
// array que se devuelve será menor o igual al que se pasa como
// parámetro.
        int contador = 1;
        int [] resultado = new int[contador];
        for (int n:x
             ) {
            if (esCapicua(n)){
                resultado[contador-1] = n;
                contador++;
                resultado = Arrays.copyOf(resultado, contador);
            }
        }
        // quitar el último
        resultado = Arrays.copyOf(resultado, contador-1);
        for (int i = 0; i < resultado.length; i++) {
            System.out.print(resultado[i] + " ");
        }
        return resultado;
    }
    public static boolean esCapicua (int x) {
        boolean resultado = false;
        // si no tiene tres dígitos no es capicua
        if (x < 100){
            return resultado;
        }
        // comprobar si es capicua
        int inicio, fin;
        fin = x % 10;
        while (x > 9) {
            x = x/10;
        }
        inicio = x % 10;
        if ( inicio == fin){
            resultado = true;
        }
        return resultado;
    }
}
