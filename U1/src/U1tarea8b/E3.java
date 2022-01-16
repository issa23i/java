/**
 * Escribe un programa que muestre los n primeros términos de la serie de Fibonacci.
 * El primer término de la serie de Fibonacci es 0, el segundo es 1
 * y el resto se calcula sumando los dos anteriores,
 * por lo que tendríamos que los términos son 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144...
 * El número n se debe introducir por teclado.
 */
package U1tarea8b;

import java.util.Scanner;

public class E3 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduzca un número: ");
        int n = teclado.nextInt() - 2;
        long f = 0;
        long anterior = 0;
        long nuevo = 1;
        System.out.print("Serie Fibonacci: " + anterior + ", " + nuevo + ", ");
        while (n > 0){
            f = anterior + nuevo;
            anterior = nuevo;
            nuevo = f;
            n--;
            if (n == 0) {
                System.out.print(f + "...");
            } else {
                System.out.print(f + ", ");
            }
        }
    }
}
