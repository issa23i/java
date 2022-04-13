/**
 * Escribe un programa que pinte por pantalla un par de calcetines,
 * de los que se ponen al lado del árbol de Navidad para que Papá Noel deje sus regalos.
 * El usuario debe introducir la altura. Suponemos que el usuario introduce una altura mayor o igual a 4.
 * Observa que la talla de los calcetines y la distancia
 * que hay entre ellos (dos espacios) no cambia, lo único que varía es la altura.
 * Ejemplo 1:
 * Introduzca la altura de los calcetines: 6
 *
 * ***      ***
 * ***      ***
 * ***      ***
 * ***      ***
 * ******  ******
 * ******  ******
 */
package u1entregable2021;

import java.util.Scanner;

public class calcetines {
    public static void main(String[] args) {
        // La anchura del dibujo siempre es la misma
        final int ancho = 15;
        // entrada de datos
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduzca la altura (mayor o igual que 4): ");
        int altura = teclado.nextInt();

        // dibujar
        for (int i = 0; i <= altura ; i++) {
                // hasta altura -2 tubo del calcetin
                if (i <= altura -2) {
                    // tres , cinco espacios y tres
                    System.out.println("***     ***");
                } else {
                    System.out.println("******  ******");
                }
        }
    }
}
