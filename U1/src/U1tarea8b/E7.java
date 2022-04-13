/**
 * Realiza un programa que pida un número por teclado y que luego muestre ese número al revés.
 */
package U1tarea8b;

import java.util.Scanner;

public class E7 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese un número: ");
        long num = teclado.nextLong();
        long cociente = num;
        num = 0;
        long resto = 0;
        do {
            resto = cociente % 10;
            cociente = cociente / 10;
            num = num * 10 + resto;
        } while (cociente != 0);
        System.out.println("Su número al revés es : " + num);
    }
}
