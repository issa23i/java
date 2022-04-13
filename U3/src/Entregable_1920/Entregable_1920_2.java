/*
  Escribe un programa que pida 20 números enteros. Estos números se deben
  introducir en un array de 4 filas por 5 columnas. El programa mostrará las
  sumas parciales de filas y columnas igual que si de una hoja de cálculo se
  tratara. La suma total debe aparecer en la esquina inferior derecha.
 */
package Entregable_1920;


public class Entregable_1920_2 {
    public static void main(String[] args) {
        int[][] tabla;
        tabla = rellenarTabla();
        sumatorio(tabla);
    }
    public static int[][] rellenarTabla() {
        int[][] tabla1 = new int[5][6];
        for (int i = 0; i < tabla1.length -1; i++) {
            for (int j = 0; j < tabla1[i].length -1; j++) {
                //int getRandomValue = (int) (Math.random()*(max-min)) + min;
                int getRandomValue = (int) (Math.random()*(100 -10) +10);
                tabla1[i][j] = getRandomValue;
                // Comprobar
                System.out.print(getRandomValue + " ");
            }
            System.out.println("| ");
        }
        System.out.println("---------------|");
        return tabla1;
    }

    public static void sumatorio( int [][] aSumar){
        int [] sumaY = new int[aSumar[0].length];
        int numFilas = aSumar.length;
        int x = 0;
        int total = 0;
        for (int i = 0; i < numFilas; i++) {
            if( (numFilas - 1 ) == i ){// Si es el último de la columna
                System.out.println("-------------------------");
                total += sumaY[aSumar[i].length - 1];
                sumaY[aSumar[i].length - 1] = 0;
            }
            for (int j = 0; j < aSumar[i].length; j++) {
                sumaY[j] += aSumar[i][j];
                if( (numFilas - 1 ) == i ) { // Si es el último de la columna
                    if (j == aSumar[i].length -1) { // Si además es el último de fila
                        System.out.println("| " + total);
                    } else {
                        System.out.print(sumaY[j] + " ");
                    }
                } else if ( aSumar[i][j] == aSumar[i][(aSumar[i].length)-1] ) { // Si es el último de la fila
                    System.out.print("| ");
                    System.out.print(x);
                    total += x;
                    x = 0;
                } else { // Si no es el último de la fila, ni el último de la columna, se añade al x (fila)
                    x += aSumar[i][j];
                    System.out.print(aSumar[i][j] + "  ");
                }
            }
            System.out.println();
        }
    }
}
