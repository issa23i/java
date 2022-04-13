/*
Utilizando vectores bidimensionales en la función, realizar la siguiente función para un juego de ajedrez:

public static boolean jaque(String posRey,String posReina)

Y nos devuelva si reina está en posición de jaque al rey.

La posiciones que recibe la función son posiciones de ajedrez: a5, h4,c8
 */
package Examen_AZUL;

public class Ej3 {
    public static void main(String[] args) {
        crearTablero();
        System.out.println(jaque("c6", "h1"));

    }
    public static boolean jaque(String posRey,String posReina){
        boolean resultado = false;
        String [][] tablero= crearTablero();
        // si coincide fila o columna
        if ( posRey.charAt(0) == posReina.charAt(0) || posRey.charAt(1) == posReina.charAt(1) ) {
            System.out.println("Jaque Mate");
            resultado = true;
        }

        for (int i = 0; i < tablero.length; i++) {
            for (int j = 0; j < tablero[i].length; j++) {
                if (posRey.equals(tablero[i][j]) ){ // encontrada la posición del rey en el tablero
                    for (int k = 0; k < tablero.length - 1; k++) { // nos movemos 7 posiciones en el tablero
                        if( (i+k < tablero.length && j+k < tablero[i].length) ){ // que no exceda el lenght de la matriz
                            // si la posición de la reina está en perpendicular + 7 celdas
                            if ( posReina.equals(tablero[i+k][j+k])){
                                System.out.println("Jaque Mate");
                                resultado = true;
                            }
                        }
                        if (i-k >= 0 && j-k >= 0) {
                            // si la posición de la reina está en perpendicular - 7 celdas
                            if (posReina.equals(tablero[i-k][j-k]) ) {
                                System.out.println("Jaque Mate");
                                resultado = true;
                            }
                        }
                    }
                }
            }
        }
        return resultado;
    }
    public static String [][] crearTablero (){
        String [][] resultado = new String [8][8];
        String [] filas = {"8", "7", "6", "5", "4", "3", "2", "1"};
        String [] columnas = {"a", "b", "c", "d", "e", "f", "g", "h"};
        for (int i = 0; i < resultado.length; i++) {
            for (int j = 0; j < resultado[i].length; j++) {
                resultado[i][j] = columnas[j].concat(filas[i]);
                System.out.print(resultado[i][j]);
            }
            System.out.println();
        }
        return resultado;
    }
}
