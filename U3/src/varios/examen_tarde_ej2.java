/*
Realiza un programa que genere 10 números aleatorios entre 12 y 89
y que los almacene en un array. A continuación,
se mostrará el contenido de ese array junto al índice (0 – 9)
utilizando para ello otro array adicional
(o bien utilizando originalmente un array bidimensional, como se prefiera).
Seguidamente el programa pasará los números pares a las primeras posiciones,
conservando el orden, desplazando el resto de números (los impares)
de tal forma que no se pierda ninguno y se conserve el orden entre ellos.
Al final se debe mostrar el array resultante junto con el índice.

Ejemplo:

Array original:
[0, 1, 2, 3, 4, 5, 6, 7, 8, 9]
[54, 63, 83, 47, 13, 69, 63, 80, 56, 47]

Array nuevo:
[0, 1, 2, 3, 4, 5, 6, 7, 8, 9]
[54, 80, 56, 63, 83, 47, 13, 69, 63, 47]
 */

public class examen_tarde_ej2 {
    public static void main(String[] args) {
        final int DIEZ = 10;
        int[][] a = new int[2][DIEZ];



        // rellenar lista aleatoriamente e indice auto incremento
        for (int i = 0; i < DIEZ; i++) {
            // indice auto incremento
            a[0][i] = i;
            // lista aleatoria
            a[1][i] = (int) (Math.random() * (89 - 12 + 1) + 12);
        }
        mostrarLista(a);
        // ordenar pares - impares
        int[][] temp = new int[2][DIEZ];
        temp[0] = a[0];
        int contador = 0;
        for (int i = 0; i < DIEZ; i++) {
            if (a[1][i] % 2 == 0) { // si es par
                temp[1][contador] = a[1][i];
                contador ++;
            }
        }
        for (int i = 0; i < DIEZ; i++) {
            if (a[1][i] % 2 != 0) { // si es impar
                temp[1][contador] = a[1][i];
                contador ++;
            }
        }
        mostrarLista(temp);
    }
    public static void mostrarLista ( int [][] m) {
        // mostrar la cabecera
        System.out.println("indice | lista");
        // mostrar lista ORDENADA
        for (int i = 0; i < m[1].length; i++) {
            System.out.println("   " + m[0][i] + "       " + m[1][i] );
        }
    }
}
