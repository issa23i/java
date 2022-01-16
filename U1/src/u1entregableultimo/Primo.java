/**
 * Escribe un programa que pida un número entero positivo por teclado y que
 * muestre a continuación los 5 números consecutivos a partir del número
 * introducido (incluyendo él mismo). Al lado de cada número se debe indicar
 * si se trata de un primo o no.
 */
package u1entregableultimo;

import java.util.Scanner;

public class Primo {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        final int nVeces = 5; // VECES QUE CUENTA
        //  PEDIR DATOS
        int num, siguiente;
        boolean primo;
        do {
            System.out.println("Inserte un número entero positivo: ");
            num = teclado.nextInt();
        } while (num < 1);
        for (int i = 0; i < nVeces; i++) { // REPETIR CINCO VECES AUMENTANDO LA CIFRA EN 1
            primo = true;
            siguiente = num + i;
            System.out.print(siguiente + " " );
            for (int j = num -1 ; j > 1; j--) { // VERIFICAR SI ES DIVISIBLE
                if ( (siguiente % j == 0)) {
                    primo = false;
                }
            }
            if (primo) {
                System.out.println("es primo");
            } else {
                System.out.println("no es primo");
            }
        }
    }
}
