/**
 * Realizar un programa que  solicite al usuario un número entero y que lo siga solicitando mientras ese número no sea positivo.
 *
 * Una vez hecho esto solicitará al usuario una posición de inicio y una posición de final
 * y mostrará el número habiéndole quitado todos los dígitos entre esas dos posiciones.
 * (Supondremos que el usuario es "bueno" y mete correctamente las posiciones y que la primera posición es la posición 0.
 *
 * Ejemplo 1:
 *
 * Introduce el número: 1234567
 *
 * Posición inicial: 2
 *
 * Posición final: 4
 *
 * El número resultante es: 1267
 *
 * Ejemplo 2:
 *
 * Introduce el número: 123456789
 *
 * Posición Inicial: 5
 *
 * Posición final: 7
 *
 * El número resultante es: 123459
 *
 * NOTA: NO SE PUEDEN UTILIZAR FUNCIONES DE CADENAS
 */
package entregable_t1;

import java.util.Scanner;

public class ejercicio2 {
    public static void main(String args[]) {
        // introducir datos
        Scanner teclado = new Scanner(System.in);
        int numero = 0;
        while (numero < 0) {
            System.out.println("Introduce un número entero positivo: ");
            numero = teclado.nextInt();
        }
        System.out.println("Sé bueno y marca la posicion 0 como inicio: ");
        int posicion1 = teclado.nextInt();
        if (posicion1 != 0) {
            System.out.println("No eres bueno, pero me da igual, la primera posición es 0");
            posicion1 = 0;
        }
        System.out.println("Marca la posición final");
        int posicion2 = teclado.nextInt();

        int resto = 0;
        int cociente = 0;
        int resultado = 0;
        int contador = 0;
        // bucle hasta que se alcance la posición
        for (int i = posicion2; i > posicion1; i--) {
            resto = numero % 10;
            resultado = numero / 10;
        }
    }
}
