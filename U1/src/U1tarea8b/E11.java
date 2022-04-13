/**
 * Realiza un programa que pinte una X hecha de asteriscos.
 * El programa debe pedir la altura.
 * Se debe comprobar que la altura sea un número impar mayor o igual a 3,
 * en caso contrario se debe mostrar un mensaje de error.
 */
package U1tarea8b;

import java.util.Scanner;

public class E11 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int altura = 0;
        while ((altura % 2 == 0) || (altura < 3)) {
            System.out.println("Introduzca la altura");
            altura = teclado.nextInt();
        }
        for (int i = 0; i < altura; i++) {
            for (int j = 0; j < altura + 1; j++) {
                if (j ==  i || j == altura - i - 1){
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
