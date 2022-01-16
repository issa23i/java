/**
 * Escribe un programa que muestre en tres columnas, el cuadrado
 * y el cubo de los 5 primeros números enteros a partir de uno que se introduce por teclado.
 */
package U1tarea8b;

import java.util.Scanner;
public class E2 {
    public static void main(String[] args) {
        int secuencia = 5;
        int num, cuadrado, cubo;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduzco un número: ");
        num = teclado.nextInt();
        for (int i = secuencia; i > 0 ; i--) {
            cuadrado = num * num;
            cubo = cuadrado * num;
            System.out.println( num + "  |  " +  cuadrado + "  |  " + cubo);
            num++;
        }
    }
}
