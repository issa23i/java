/**
 * Realiza un programa que pinte por pantalla un rombo hueco hecho con
 * asteriscos. El programa debe pedir la altura. Se debe comprobar que la altura
 * sea un número impar mayor o igual a 3, en caso contrario se debe mostrar un
 * mensaje de error y volverlo a pedir hasta que sea correcto.
 */
package u1entregableultimo;

import java.util.Scanner;

public class rombo {
    public static void main(String[] args) {
        // leer datos
        Scanner teclado = new Scanner(System.in);
        int altura = 0;
        do {
            System.out.println("Inserte un número impar mayor o igual a 3: ");
            altura = teclado.nextInt();
            if ((altura < 3) || (altura % 2 == 0)) {
                System.out.println("El número introducido no es correcto.");
            }
        } while ((altura < 3) || (altura % 2 == 0)); // mientras sea par o menor que 3

        // dibujar
        for (int i = 0; i < altura; i++) {
            for (int j = 0; j < altura; j++) {
                if(
                        j == altura / 2 - i
                        || j == altura / 2 + i
                        || j == i - altura / 2
                        || j == (altura / 2 - i) + altura -1
                ) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
