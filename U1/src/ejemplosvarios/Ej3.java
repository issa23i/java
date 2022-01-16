/**
 * EJERCICIO 3 (Ej3.java)
 * Realiza un programa lea un número entero positivo de la pantalla y que lo pase a binario.
 */

import java.util.Scanner;

public class Ej3 {
    public static void main(String args[]) {
        // Recogemos el número por teclado
        Scanner teclado = new Scanner(System.in);
        System.out.println("Escriba un número entero positivo: ");
        long numero = teclado.nextLong();
        System.out.print("el número " + numero + " en binario es: ");
        // Inicializamos el divisor 2
        final int dos = 2;
        do {
            long resto = numero % dos;
            numero = numero / dos;
            System.out.print(resto);
        } while (numero > 0);
    }
}
