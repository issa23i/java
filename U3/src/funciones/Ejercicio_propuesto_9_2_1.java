/**
 * Crea una función que dibuje en pantalla un cuadrado del ancho (y alto)
 * que se indique como parámetro. Completa el programa con un "main" que permita probarla.
 */
package funciones;

public class Ejercicio_propuesto_9_2_1 {
    public static void main(String[] args) {
        int ancho = 6;
        dibujarCuadrado(ancho);
    }
    public static void dibujarCuadrado (int x) {
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < x; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
