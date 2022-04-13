/*
Crea una función con la siguiente cabecera:

public static boolean esPuntoDeSilla(int x[][], int i, int j)
Que devuelve true si un número en una determinada posición de una matriz,
es punto de silla. El punto de silla cumple la condición de ser el mínimo en su fila
y máximo en su columna.

Desde el programa principal se debe pedir al usuario un número de filas
y de columnas, y generar una matriz de números enteros aleatorios entre 11
y 1003 con el tamaño introducido por el usuario. Llamará a la función para comprobar
si cada uno de sus elementos es punto de silla.
 */

import java.util.Scanner;
import java.util.Arrays;

public class examen_tarde_ej1 {
    public static void main(String[] args) {
        int x;
        int y;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduzca el eje x de la matriz: ");
        x = teclado.nextInt();
        System.out.println("Introduzca el eje y de la matriz: ");
        y = teclado.nextInt();
        int[][] matriz = rellenarMatriz(x,y);
        int uno = 4;
        int dos = 3;
        System.out.print("¿ es puntosilla ? : " + isPuntoSilla(matriz,uno,dos));
    }
    public static boolean isPuntoSilla (int[][] matriz, int a, int b){
        boolean esPuntoSilla;
        int[] columnaMinimos = new int[matriz.length];
        int comprobar = matriz[a][b];
        System.out.println(comprobar);
        int [][] ordenada = matriz;
        for (int i = 0; i < ordenada.length; i++) {
            // ordenar matriz
            Arrays.sort(ordenada[i]);
            // la primera columna son los mínimos de su fíla matriz[i][0]
            columnaMinimos[i] = ordenada[i][0];
        }
        //ordenar la columna
        Arrays.sort(columnaMinimos);
        // el punto se silla es el máximo de la columna de mínimos
        esPuntoSilla = columnaMinimos[columnaMinimos.length-1] == comprobar;
        return  esPuntoSilla;
    }
    public static int[][] rellenarMatriz ( int filas, int columnas){
        int[][] m = new int[filas][columnas];
        //  rellenar matriz aleatoriamente
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                m[i][j] = (int) (Math.random()*(1003-11+1)+11);
                System.out.print(m[i][j] + " ");
            }
            System.out.println();
        }
        return m;
    }
}
