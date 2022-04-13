/**
 * Crea una función que dibuje en pantalla un rectángulo
 * del ancho y alto que se indiquen como parámetros.
 * Completa el programa con un "main" que permita probarla.
 */
package funciones;

public class Ejercicio_propuesto_9_2_2 {
    public static void main(String[] args) {
        int alto = 5;
        int ancho = 10;
        dibujarRectangulo(alto, ancho);
    }
    public static void dibujarRectangulo(int x, int y) {
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
