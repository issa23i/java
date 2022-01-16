/*
Escribe un programa que, dada una posición en un tablero de ajedrez, nos diga
a qué casillas podría saltar un alfil que se encuentra en esa posición. Como se
indica en la figura, el alfil se mueve siempre en diagonal. El tablero cuenta con
64 casillas. Las columnas se indican con las letras de la “a” a la “h” y las filas
se indican del 1 al 8.
Introduzca la posición del alfil: d5
El álfil puede moverse a las siguientes posiciones:
h1 a2 g2 b3 f3 c4 e4 c6 e6 b7 f7 a8 g8
 */
package Entregable_DG;


public class EJ1 {
    public static void main(String[] args) {
        String posAlfil = "d5";
        String[] columnas = {"a", "b", "c", "d", "e", "f", "g", "h"};
        String[] filas = {"8", "7", "6", "5", "4", "3", "2", "1"};
        final int LONGITUD = 8;
        String [][] TABLERO = rellenarTablero(LONGITUD, filas, columnas);
        System.out.print("los movimientos del alfil son: ");
        movimientosAlfil(posAlfil,TABLERO);
    }
    public static String [] movimientosAlfil (String posicionActual, String [][] tablero ){
        int posX = 0;
        int posY = 0;
        String [] resultado = new String[(tablero.length -1)* 2];
        int contador = 0;
        // encontrar la posición exacta del String en la matriz
        for (int i = 0; i < tablero.length; i++) {
            for (int j = 0; j < tablero[i].length; j++) {
                if( tablero[i][j].equals(posicionActual)){
                    posX = i;
                    posY = j;
                }
            }
        }
        // encontrar coincidencias en el trayecto del alfil
        for (int i = 0; i < tablero.length; i++) {
            for (int j = 0; j < tablero[i].length; j++) {
                if ( Math.abs(i - posX) == Math.abs(j - posY) ||  Math.abs(i + posX) == Math.abs(j + posY)  ){
                    resultado[contador] = tablero[i][j];
                    System.out.print(resultado[contador] + " ");
                    contador ++;
                }
            }
        }
        return resultado;
    }
    public static String [][] rellenarTablero (int longitud, String[] filas, String[] columnas) {
        String [][] tablero = new String[longitud][longitud];
        for (int i = 0; i < longitud; i++) {
            for (int j = 0; j < longitud ; j++) {
                tablero[i][j] = columnas[i].concat(filas[j]);
                System.out.print(tablero[i][j] + " ");
            }
            System.out.println();
        }
        return tablero;
    }
}
