/**
 * Realizar un programa que  solicite al usuario un número entero y
 * que lo siga solicitando mientras ese número no sea positivo.
 *
 * Una vez hecho esto solicitará al usuario una posición de inicio y una posición de final y
 * mostrará el número habiéndole quitado todos los dígitos entre esas dos posiciones.
 * (Supondremos que el usuario es "bueno" y mete correctamente las posiciones y
 * que la primera posición es la posición 0.
 */
package examen_azul_2020;

import java.util.Scanner;

public class SaltarNumeros {
    public static void main(String[] args) {
        // datos
        Scanner teclado = new Scanner(System.in);
        long numero = 0;
        long resto = 0;
        int inicio, fin;
        while (numero < 1){
            System.out.println("Ingrese un número entero positivo: ");
            numero = teclado.nextLong();
        }
        long cociente = numero;
        numero = 0;
        System.out.println("Ingrese la posición de inicio: ");
        inicio = teclado.nextInt();
        System.out.println("Ingrese la posición fin: ");
        fin = teclado.nextInt();
        int digitos = 0;
        int posicion = 0;
        // darle la vuelta
        do {
            resto = cociente % 10;
            cociente = cociente /10;
            digitos++;
            numero = (numero * 10) + resto;
        } while (cociente != 0);
        cociente = numero;
        numero = 0;
        for (int i = digitos; i >= 0; i--) {
            resto = cociente % 10;
            cociente = cociente /10;
            posicion++;
            if( (posicion < inicio) || (posicion > fin) ) {
                numero = (numero * 10) + resto;
            }
        }
        numero = numero / 10;
        System.out.println("El número resultante es: " + numero);
    }
}
