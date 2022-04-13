/**
 * Escribe un programa que diga cuántos dígitos pares y cuántos dígitos impares
 * hay dentro de un número. Se recomienda usar long en lugar de int ya que el
 * primero admite números más largos.
 */
package u1entregableultimo;

import java.util.Scanner;

public class contarImpares {
    public static void main(String[] args) {
        long num = 0;
        do { //pedir datos
            Scanner teclado = new Scanner(System.in);
            System.out.println("Por favor, introduzca un número entero positivo: ");
            num = teclado.nextLong();

        } while (num <1); // mientras no sea entero positivo
        long cociente = num;
        long resto = 0;
        num = 0;
        int par = 0;
        int impar = 0;
        do { // separar dígitos
            resto = cociente % 10;
            cociente = cociente / 10;
            if ( resto % 2 == 0) {
                par++;
            } else {
                impar++;
            }
        } while (cociente != 0);
        System.out.println(" El número de pares es de: " + par);
        System.out.println(" El número de impares es de: " + impar);
    }
}
