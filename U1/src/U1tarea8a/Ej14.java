/**
 * Pedir un número n y dibujar un triángulo rectángulo
 * de n elementos de lado, utilizando para ello asteriscos (*).
 */
package U1tarea8a;

import java.util.Scanner;

public class Ej14 {
    public static void main(String[] args) {
        int lado = 0;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese longitud del lado: ");
        lado = teclado.nextInt();
        for (int i = 0; i < lado ; i++) {
            for (int j = 0; j < lado; j++) {
                if ( j < lado - i ) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
