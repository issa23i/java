/**
 * Escribe un programa que diga si un número introducido por teclado es o no capicúa.
 * Los números capicúa se leen igual hacia delante y hacia atrás.
 * El programa debe aceptar números de cualquier longitud siempre que lo permita el tipo,
 * en caso contrario el ejercicio no se dará por bueno.
 * Se recomienda usar long en lugar de int ya que el primero admite números más largos.
 */

import java.util.Scanner;

public class Ej2 {
    public static void main(String args[]) {
        // Pedir número
        Scanner teclado = new Scanner(System.in);
        long numero;
        System.out.println("Escriba un número entero: ");
        numero = teclado.nextLong();
        long resto = 0;
        long rev = 0;
        long cociente = numero;
        while (cociente > 0) {
            resto = cociente % 10;
            cociente = cociente / 10;
            rev = (rev + resto) * 10;
            System.out.println("Cociente: " + numero + " resto: " + resto + " rev: " + rev);
        }
        rev = rev / 10;
        System.out.println("Cociente: " + cociente + " resto: " + resto + " rev: " + rev);
        System.out.println(cociente + "--" + rev);
        if (numero == rev) {
            System.out.println("El número es capicua");
        } else {
            System.out.println("El número no es capicua");
        }
    }
}
