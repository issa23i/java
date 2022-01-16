/**
 * Escribe un programa que lea una lista de diez números y determine cuántos son positivos, y cuántos son negativos.
 */
package U1tarea8b;

import java.util.Scanner;

public class E4 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int numeros = 10;
        int numero;
        int positivos = 0;
        int negativos = 0;
        while (numeros > 0){
            System.out.println("Escriba un número: ");
            numero = teclado.nextInt();
            if (numero < 0){
                negativos++;
            } else if ( numero > 0) {
                positivos++;
            } // si no, sería igual a 0 y no sería ni positivo ni negativo, sería neutro.
            numeros--;
        }
        System.out.println("En su lista hay: " + positivos + " y " + negativos + " negativos.");
    }
}
