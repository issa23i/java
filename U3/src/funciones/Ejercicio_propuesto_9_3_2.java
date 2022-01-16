/**
 * Crea una función que calcule el menor de dos números enteros que recibirá como parámetros.
 * El resultado será otro número entero.
 */
package funciones;

public class Ejercicio_propuesto_9_3_2 {
    public static void main(String[] args) {
        int uno = 5;
        int dos = 7;
        minimo(uno, dos);
    }
    public static int minimo( int x, int y) {
        if(x>y){
            return y;
        } else {
            return x;
        }
    }
}
