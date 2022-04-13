/**
 * Realiza el control de acceso a una caja fuerte. La combinación será un número de 4 cifras.
 * El programa nos pedirá la combinación para abrirla. Si no acertamos,
 * se nos mostrará el mensaje “Lo siento, esa no es la combinación”
 * y si acertamos se nos dirá “La caja fuerte se ha abierto satisfactoriamente”.
 * Tendremos cuatro oportunidades para abrir la caja fuerte.
 */
package U1tarea8b;
import java.util.Random;
import java.util.Scanner;

public class E1 {
    public static void main(String[] args) {
        // generar clave aleatoria
        int clave = 0;
        while (clave < 1) {
            Random r = new Random();
            clave = (r.nextInt() % 10000);
        }
        // entrada de datos por teclado
        Scanner teclado = new Scanner(System.in);
        int intento, intentos;
        intentos = 4;
        for (int i = intentos; i > 0; i--) {
            System.out.println("Introduzca la combinación de 4 dígitos");
            intento = teclado.nextInt();
            if (intento == clave) {
                System.out.println("La caja se ha abierto satisfactoriamente");
                return; // salir del for si hay ocurrencia
            } else {
                System.out.println("Lo siento, esa no es la combinación. Le quedan " + (i -1) + " intentos.");
            }
        }

    }
}
