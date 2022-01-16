/**
 * Realizar un programa que dado un número que se solicita la usuario por consola eliminará de ese número de ese
 * número todos los 0 y todos los 8 indicando adicionalmente cuántos números ha eliminado.
 * Deberá solicitar el número mientras que el número introducido no sea positivo.
 */
package u1entregable2021;

import java.util.Scanner;

public class eliminar_digitos {
    public static void main(String[] args) {
        // entrada de datos
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce un número: ");
        long numero = teclado.nextInt();

        // descuartizar número
        long cociente = numero;
        numero = 0;
        long resto = 0;
        int contador = 0; // numero de digitos una vez quitados los 0 y los 8
        int contador2 = 0; // número de dígitos quitados.
        do { //descuartizar el número
            resto = cociente % 10;
            cociente = cociente / 10;

            if ((resto != 0) && (resto != 8)) { // si no es ni 8 ni 0
                numero = (numero * 10) + resto;
                contador++;
            } else {
                contador2++; //numeros quitados
            }
        } while (cociente !=0);
        resto = 0;
        cociente = numero;
        numero = 0;
        while (contador>=0){ // darle otra vez la vuelta
            resto = cociente % 10;
            cociente = cociente / 10;
            numero = (numero * 10) + resto;
            contador--;
        }
        numero = numero/10;
        // resultado
        System.out.println("El número resultante es: " + numero);
        System.out.println("Hemos eliminado " + contador2 + " dígitos.");
    }
}
