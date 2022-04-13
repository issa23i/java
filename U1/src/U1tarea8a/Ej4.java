/**
 *Realizar un aplicación que genere un número aleatorio entre 1 y 100.
 * El jugador debe ir probando números tratando de acertarlo.
 * El programa debe indicar "mayor" o "menor"
 * según el número secreto sea mayor o menor que el introducido por el usuario.
 * El proceso finaliza cuando el usuario acierta o cuando se rinde (introduciendo un -1).
 */
package U1tarea8a;

import java.util.Scanner;
import java.util.Random;
import java.util.stream.IntStream;

public class Ej4 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        Random r = new Random();
        System.out.println("");
            int num = r.nextInt(100);
        System.out.println(num);
    }
}
