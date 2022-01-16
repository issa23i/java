/*
Realiza un programa que rellene un array de 6 filas por 10 columnas con
números enteros positivos comprendidos entre 0 y 1000 (ambos incluidos). A
continuación, el programa deberá dar la posición tanto del máximo como del
mínimo. NOTA IMPORTANTE: Los números no pueden repetirse.
 */
package Entregable_DG;

public class EJ2 {
    public static void main(String[] args) {
        final int FILAS = 6;
        final int COLUMNAS = 10;
        int [][] matriz = rellenarMatriz (FILAS,COLUMNAS);
        maxYmin (matriz);
    }
    static public int [][] rellenarMatriz ( int f, int c){
        int [][] resultado = new  int[f][c];
        for (int i = 0; i < resultado.length; i++) {
            for (int j = 0; j < resultado[i].length; j++) {
                resultado[i][j] = (int) (Math.random()* (1000 + 1));
                System.out.print(resultado[i][j] + " ");
            }
            System.out.println();
        }
        return resultado;
    }
    static public int [] maxYmin ( int [][] m){
        int [] resultado = new int[2];
        int max = 0;
        int min = 1000;
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                if (max <= m[i][j]){
                    max = m[i][j];
                }
                if (min >= m[i][j]){
                    min = m[i][j];
                }
            }
        }

        System.out.println("El máximo es: " + max + ". El mínimo es: " + min);
        return resultado;
    }
}
