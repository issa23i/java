/**
 * EJERCICIO 4 (Ej4.java)
 *
 * Crear programa que pinte una flecha doble hacia la izquierda.
 * Se pide al usuario la altura de la figura, que debe ser un número impar mayor o igual que 3.
 * La distancia entre cada flecha de asteriscos es siempre de 5 espacios.
 * Si la altura introducida por el usuario no es un número impar mayor o igual que 3,
 * el programa debe mostrar un mensaje de error.
 */

import java.util.Scanner;

public class Ej4 {
    public static void main(String args[]) {
        Scanner teclado = new Scanner(System.in);
        //pedir altura por teclado
        int altura = 0;
        // mientras NO se cumplan las condiciones impar y >=3
        while ( !( (altura % 2 != 0)  &&  (altura >=3 ) ) ){
            // pedir altura por teclado
            System.out.println("Escriba un número impar y mayor o igual que 3: ");
            //la altura de la figura, que debe ser un número impar mayor o igual que 3
            altura = teclado.nextInt();
        }
        System.out.println("Altura: " + altura);
        // iteracion
        for(int i= 0; i < altura; i++) {
            for(int j = 0; j < (altura/2) +5; j++) {
                if ( (j == altura / 2 - i) // print la parte de arriba de la flecha
                        || (j == i - altura / 2) // print la parte de abajo de la flecha
                   ) {
                    System.out.print("*    *");
                } else { //si no, espacio
                    System.out.print(" ");
                }
            }
            System.out.println(); // salto de línea
        }


    }
}
