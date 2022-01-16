/*
  Realiza un programa que muestre por pantalla un array bidimensional
  con tantas filas y columnas como indique el usuario.
  Deberá rellenarse la matriz con números aleatorios entre 14 y 78 (ambos incluidos).

  A continuación, el programa debe insertar en un array pares los números
  que se encuentran en la intersección de las filas pares con las columnas pares.
  Se hace lo mismo para el array impares con los números que se encuentran
  en la intersección de las filas impares con las columnas impares.

  Finalmente se debe mostrar la matriz de números, el array de números pares,
  el de números impares, y la suma, media y máximo y mínimo de cada uno de los arrays pares e impares.

  Ejemplo 1:

  Introduce el número de filas: 5
  Introduce el número de columnas: 8

  Matriz:
  [69, 17, 51, 49, 28, 45, 38, 28]
  [67, 78, 60, 44, 78, 47, 18, 40]
  [38, 48, 15, 67, 65, 56, 34, 51]
  [42, 52, 27, 75, 39, 14, 57, 63]
  [47, 22, 61, 26, 63, 46, 50, 31]

  Pares:
  [69, 51, 28, 38, 38, 15, 65, 34, 47, 61, 63, 50]

  Impares:
  [78, 44, 47, 40, 52, 75, 14, 63]

  Suma de pares: 559
  Suma de impares: 413
  Media de pares: 46
  Media de impares: 51
  Máximo de pares: 69
  Mínimo de pares: 15
  Máximo de impares: 78
  Mínimo de impares: 14
 */
package Entregable_2122;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        int filas = pedirNumero();
        int columnas = pedirNumero();
        System.out.println("La matriz es: ");
        int[][] matriz = rellenar(filas, columnas);
        System.out.println("Los números de la posición par son: ");
        int [] pares = pares(matriz);
        System.out.println("\n" + "Los números de la posición impar son: ");
        int [] impares = impares(matriz);
        System.out.println("\n" + "La suma de los número pares es: ");
        suma(pares);
        System.out.println("La suma de los número impares es: ");
        suma(impares);
        System.out.println("El máximo de los pares es: ");
        maximo(pares);
        System.out.println("El mínimo de los pares es: ");
        minimo(pares);
        System.out.println("El máximo de los impares es: ");
        maximo(impares);
        System.out.println("El mínimo de los impares es: ");
        minimo(impares);
    }
    public static int pedirNumero() {
        Scanner teclado = new Scanner(System.in);
        int x = 0;
        while (x <= 0) {
            System.out.println("Escriba un número entero positivo");
            x = teclado.nextInt();
        }
        return x;
    }
    public static int [][] rellenar (int f, int c) {
        int [][] resultado = new int[f][c];
        for (int i = 0; i < f; i++) {
            for (int j = 0; j < c; j++) {
                resultado[i][j] = (int) (Math.random()*(78-14+1)+14);
                System.out.print(resultado[i][j] + " ");
            }
            System.out.println();
        }
        return resultado;
    }
    public static int[] pares (int[][] m){
        int[] resultado = new int[0];
        int contador = 0;
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                if (i % 2 == 0){
                    if (j % 2 == 0){
                        contador++;
                        resultado = Arrays.copyOf(resultado, contador);
                        resultado[contador-1]= m[i][j];
                        System.out.print(resultado[contador-1] + " ");
                        contador++;
                    }
                }
            }
        }
        return resultado;
    }
    public static int[] impares (int[][] m){
        int[] resultado = new int[0];
        int contador = 0;
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                if (i % 2 != 0){
                    if (j % 2 != 0){
                        contador++;
                        resultado = Arrays.copyOf(resultado,contador);
                        resultado[contador-1]= m[i][j];
                        System.out.print(resultado[contador-1] + " ");
                    }
                }
            }
        }
        return resultado;
    }
    public static void suma (int[] x){
        int resultado = 0;
        for (int j : x) {
            resultado += j;
        }
        System.out.println(resultado);
    }
    public static void maximo (int[] m){
        int resultado = m[0];
        for (int j : m) {
            if (j > resultado) {
                resultado = j;
            }
        }
        System.out.println(resultado);
    }
    public static void minimo (int[] m){
        int resultado = m[0];
        for (int j : m) {
            if ((j < resultado) && (j != 0)) {
                resultado = j;
            }
        }
        System.out.println(resultado);
    }
}
