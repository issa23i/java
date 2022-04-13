/*
  Crea la función de manejo de arrays que tenga la siguiente cabecera y que haga
  lo que se especifica en los comentarios:

  public int[] filtraCon7(int x[]) // Devuelve un array con todos los números
                                   // que contienen el 7 (por ej. 7, 27, 782)
                                   // que se encuentren en otro array que se
                                   // pasa como parámetro. El tamaño del array
                                   // que se devuelve será menor o igual al
                                  // que se pasa como parámetro.

  Utiliza esta función en un programa para comprobar que funcionan bien. Para
  que el ejercicio resulte más fácil, las repeticiones de números que contienen
  7 se conservan; es decir, si en el array x el número 875 se repite 3 veces, en
  el array devuelto también estará repetido 3 veces. Si no existe ningún número
  que contiene 7 en el array x, se devuelve un array con el número -1 como único
  elemento.
 */
package Entregable_1920;

import java.util.Arrays;

public class Entregable_1920_3 {
    public static void main(String[] args) {
        int[] lista1 = {5, 6, 7, 8, -10};
        int[] lista2 = {3, 4, 11, 56, 100, 23, 65, 66};
        filtraCon7(lista1);
        filtraCon7(lista2);
    }
    public static int[] filtraCon7(int x[]) {
        int[] lista = {-1};
        int positionSiete = Arrays.binarySearch(x, 7);
        // comprobar
        System.out.println(positionSiete);
        if (positionSiete < 0) { // si el siete no está en el array pasado por parámetro
            // comprobar
            System.out.println(Arrays.toString(lista));
            return lista;
        } else {
            lista = x;
        }
        // comprobar
        System.out.println(Arrays.toString(lista));
        return lista;
    }
}
