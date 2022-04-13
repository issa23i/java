/**
 *Realiza un programa que pinte la letra U por pantalla hecha con asteriscos.
 * El programa pedirá la altura.
 * Fíjate que el programa inserta un espacio y pinta dos asteriscos menos en la base
 * para simular la curvatura de las esquinas inferiores.
 */
package U1tarea8b;

import java.util.Scanner;

public class E10 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce la altura del dibujo: ");
        int altura = teclado.nextInt();
        for (int i = 0; i <= altura -1; i++) {
            for (int j = 0; j <= altura +1; j++) {
                if( ( j == 0 && i < altura - 1)
                || (j == altura -1 && i < altura - 1)
                || (i == altura -1 && j > 0 && j < altura - 1)){
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
