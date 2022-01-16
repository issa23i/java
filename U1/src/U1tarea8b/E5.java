/**
 * Realiza un programa que pinte una pirámide por pantalla.
 * La altura se debe pedir por teclado.
 * El carácter con el que se pinta la pirámide también se debe pedir por teclado.
 */
package U1tarea8b;

import java.util.Scanner;

public class E5 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce la altura de la prirámide: ");
        int altura = teclado.nextInt();
        System.out.println("Introduce el caracter para dibujar la pirámide");
        String caracter = teclado.next();
        for (int i = 0; i < altura; i++) {
            for (int j = 0; j < (altura * 2) +1; j++) {
                if ( (j >= altura - i) && (j <= altura + i) ) {
                    System.out.print(caracter);
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
