/**
 * Lo mismo que el 5 pero la pirámide hueca
 */
package U1tarea8b;

import java.util.Scanner;

public class E6 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce la altura de la prirámide: ");
        int altura = teclado.nextInt();
        System.out.println("Introduce el caracter para dibujar la pirámide");
        String caracter = teclado.next();
        for (int i = 0; i < altura ; i++) {
            for (int j = 0; j < (altura * 2) -1 ; j++) {
                if ( (j == altura - i -1) || (j == altura + i -1) || (i == altura -1 ) ){
                    System.out.print(caracter);
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
