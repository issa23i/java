/**
 * Realiza un programa que pinte la letra L por pantalla hecha con asteriscos.
 * El programa pedirá la altura.
 * El palo horizontal de la L tendrá una longitud de la mitad (división entera entre 2) de la altura más uno.
 */
package U1tarea8b;

import java.util.Scanner;

public class E9 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Indique la altura del dibujo: ");
        int altura = teclado.nextInt();
        for (int i = 0; i < altura; i++) {
            for (int j = 0; j < (altura / 2); j++) {
                if( ( j == 0) || (i == altura -1) ) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
