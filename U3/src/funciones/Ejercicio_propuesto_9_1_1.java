/**
 * Crea una función llamada "borrarPantalla", que borre la pantalla dibujando 25 líneas en blanco.
 * No debe devolver ningún valor. Crea también un "main" que permita probarla.
 */
package funciones;

public class Ejercicio_propuesto_9_1_1 {
    public static void main(String[] args) {
        int lineasEnBlanco = 25;
        for (int i = 0; i < lineasEnBlanco; i++) {
            borrarPantalla();
        }
    }

    public static void borrarPantalla() {
        System.out.println("");
    }
}

