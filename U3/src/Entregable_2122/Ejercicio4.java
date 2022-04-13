/*
  Desarrollar una función que se denomine insertarFilaEnMatriz. Dicha función tendrá el siguiente prototipo:

  public static String[][] insertarFilaEnMatriz(String[][] matriz, String[] fila, int pos)
  Recibirá como parámetro un vector bidimensional de Strings, un array unidimensional de Strings y una posición.
  Devolverá como resultado un array bidimensional en el que esté insertado como una nueva fila
  en la matriz el array en la posición que se indica.

  Se deberá imprimir la matriz antes y después de insertar la fila.

  NOTA: Las filas de la matriz deben tener el mismo número de elementos. No es necesario comprobarlo,
  como tampoco es necesario comprobar que la posición pasada es válida,
  se entenderá que el usuario pasa una posición válida.

  Ejemplo 1:

  matriz = {
        {"a","b","c"},
        {"d","e","f"},
        {"g","h","i"}
      }
  fila = {"j","k","l"}
  pos = 1
  El resultado de insertarFilaEnMatriz será:

  {
  {"a","b","c"},
  {"j","k","l"},
  {"d","e","f"},
  {"g","h","i"}
  }
 */
package Entregable_2122;

import java.util.Arrays;

public class Ejercicio4 {
    public static void main(String[] args) {
        String[][] matriz = {
                            {"a","b","c"},
                            {"d","e","f"},
                            {"g","h","i"}
                            };
        String[] fila = {"j","k","l"};
        int pos = 1;
        imprimir(matriz);
        System.out.println("Después de insertar: ");
        imprimir(insertarFilaEnMatriz(matriz,fila,pos));
    }
    public static String[][] insertarFilaEnMatriz(String[][] matriz, String[] fila, int pos){
        String[][] resultado = new String[matriz.length+1][fila.length];
        int contadorResultado = 0;
        int contadorMatriz = 0;
        for (String[] s: resultado
             ) {
            if(contadorResultado == pos){
                resultado[pos] = fila;
                contadorResultado++;
            } else {
                resultado[contadorResultado] = matriz[contadorMatriz];
                contadorMatriz++;
                contadorResultado++;
            }
        }
        return resultado;
    }
    public static void imprimir( String [][] m){
        for (String[] s:m
             ) {
            System.out.println(Arrays.toString(s));
        }
    }
}
