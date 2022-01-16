/**
 * Crea una función llamada "dibujarCuadrado3x3", que dibuje un cuadrado
 * formato por 3 filas con 3 asteriscos cada una.
 * Crea también un "main" para comprobar que funciona correctamente.
 */

package funciones;

public class Ejercicio_propuesto_9_1_2 {
    public static void main(String[] args) {
        final int FILAS = 3;
        dibujarCuadrado3x3(FILAS);
    }
    public static void dibujarCuadrado3x3 (int filas) {
        for (int i = 0; i < filas; i++) {
            System.out.println("***");
        }
    }
}
