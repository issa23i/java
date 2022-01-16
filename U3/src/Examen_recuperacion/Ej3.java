/*
Realiza un programa que pida 10 números por teclado y que los almacene en un array.
A continuación, se mostrará el contenido de ese array
junto al índice (0 – 9) utilizando para ello una tabla.

Seguidamente el programa pasará los primos a las primeras posiciones, desplazando
el resto de números (los que no son primos) de tal forma que no se pierda ninguno.
Al final se debe mostrar el array resultante.


 */
package Examen_recuperacion;

import java.util.Scanner;

public class Ej3 {
    public static void main(String[] args) {
        final int TOTALN = 10;
        int [][] tabla = new int [2][TOTALN];
        int [][] tablaOrdenada = new int [2][TOTALN];
        Scanner teclado = new Scanner(System.in);
        int contador = 1;
        while (contador <= TOTALN) {
            System.out.println("Introduzca un número entero positivo: ");
            tabla[1][contador-1] = teclado.nextInt();
            contador++;
        }
        // primero los primos
        int contadorMas = 0;
        for (int i = 0; i < TOTALN; i++) {
            tablaOrdenada[0][i] = i;
            if ( esPrimo(tabla[1][i]) ){
                tablaOrdenada[1][contadorMas] = tabla[1][i];
                contadorMas++;
            }
        }
        // al final los no primos
        int contadorMenos = TOTALN-1;
        for (int i = TOTALN-1; i >= 0 ; i--) {
            if (!esPrimo(tabla[1][i]) ){// no es primo
                tablaOrdenada[1][contadorMenos] = tabla[1][i];
                contadorMenos--;
            }
        }
        for (int i = 0; i < tablaOrdenada[1].length; i++) {
            System.out.print(tablaOrdenada[0][i] + " ");
        }
        System.out.println();
        for (int i = 0; i < tablaOrdenada[1].length; i++) {
            System.out.print(tablaOrdenada[1][i] + " ");
        }
    }
    public static boolean esPrimo(int e){
        boolean primo = true;

        for (int i = 2; i < e; i++) {
            if( e % i == 0 ){
                primo = false;
                return primo;
            }
        }
        return primo;
    }
}
