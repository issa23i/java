/*
Implementa una función con nombre nEsimo que busque el número que hay dentro de un array bidimensional
en la posición n-ésima contando de izquierda a derecha y de arriba abajo, como si se estuviera leyendo.
El primer elemento es el 0.

Si la posición donde se busca no existe en el array, la función debe devolver -1.

Se debe entregar tanto el código de la función como el código de prueba que la usa.
Rellenaremos los arrays de manera aleatorio con números entre 10 y 100 (ambos incluidos).

La cabecera de la función es la siguiente: public static int nEsimo(int[][] n, int posicion)
 */
package Examen_AZUL;

public class Ej4 {
    public static void main(String[] args) {
        int filas = 4;
        int columnas = 6;
        int posicion = 8;
        System.out.println(nEsimo(rellenarMatriz(filas,columnas),posicion));
    }
    public static int[][] rellenarMatriz(int filas, int columnas){
        // rellenar con números aleatorios una matriz, con unas dimensiones dadas como argumentos
        int [][] resultado = new int[filas][columnas];
        for (int i = 0; i < resultado.length; i++) {
            for (int j = 0; j < resultado[i].length; j++) {
                resultado[i][j] =  (int) (Math.random() * (100-10+1)+10);
                System.out.print(resultado[i][j] + " ");
            }
            System.out.println();
        }
        return resultado;
    }
    public static int nEsimo(int[][] n, int posicion){
        int resultado = 0;
        int control = 0;
        for (int i = 0; i < n.length; i++) {
            for (int j = 0; j < n[i].length; j++) {
                if (posicion == control){
                    resultado = n[i][j];
                    return resultado;
                }
                control++;
            }
            System.out.println();
        }
        if (posicion > control || posicion < 0){
            resultado = -1;
        }
        return resultado;
    }
}
