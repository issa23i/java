/**
 * Realizar un programa que dibuja flechas señalando hacia la izquierda.
 * Se solicitará al usuario la altura de la flecha que deberá ser impar y mayor o igual que tres.
 * En caso de no ser así se seguirá solicitando la altura:
 *
 * El "palito" de la flecha será siempre de 5 caracteres "*"
 */

package examen_azul_2020;

import java.util.Scanner;

public class DibujoFlecha {
    public static void main(String[] args) {
        // conseguir altura
        Scanner teclado = new Scanner(System.in);
        int altura = 0;
        while ( (altura < 3) || (altura % 2 == 0) ){
            System.out.println("Introduce la altura de la flecha, debe ser mayor o igual que tres e impar: ");
            altura = teclado.nextInt();
        }
        // flecha
        for (int i = 0; i <= altura-1; i++) {
            for (int j = 0; j < (altura / 2) + 1 + 5; j++) {
                if (
                        (   (j >= altura / 2 -i)  &&  (j <= altura / 2) && (j >= i - altura / 2) ) // flecha arriba
                        || ( i == (altura / 2) ) // línea horizontal

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
