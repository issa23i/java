/**
 * Diseñar un programa que muestre, para cada número introducido por teclado,
 * si es par, si es positivo, y su cuadrado.
 * El proceso terminará cuando el número introducido por teclado sea 0.
 */
package U1tarea8a;

import java.util.Scanner;

public class Ej1 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int num = 0;
        int cuadrado = 0;
        do {
            System.out.println("Para salir del programa, pulse 0.");
            System.out.println("Introduce un número: ");
            num = teclado.nextInt();
            if (num == 0) {
                return;
            }
            System.out.println("El número " + num + " es:");
            if (num % 2 == 0){
                System.out.println(" - Par.");
            } else {
                System.out.println(" - Impar.");
            }
            if (num > 0){
                System.out.println(" - Positivo.");
            } else {
                System.out.println(" - Negativo.");
            }
            cuadrado = num * num;
            System.out.println(" - El cuadrado de " + num + " es " + cuadrado);
        } while (num !=0);
    }
}
