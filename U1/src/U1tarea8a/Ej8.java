/**
 * Pedir un número y calcular su factorial.
 * Ejemplo: Factorial de 5:
 * 5! = 5x4x3x2x1 = 120
 */
package U1tarea8a;

import java.util.Scanner;

public class Ej8 {
    public static void main(String[] args) {
        double num = 0;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese un número para saber su factorial");
        num = teclado.nextInt();
        double factorial =  num;
        System.out.print(factorial + "! = " + factorial);
        for (double i = num -1; i > 0 ; i--) {
            System.out.print( "x" + i);
            factorial = factorial * i;
        }
        System.out.print( " = " + factorial);
    }
}
