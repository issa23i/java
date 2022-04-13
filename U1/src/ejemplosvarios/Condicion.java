import java.util.Scanner;

public class Condicion {
    public static void main( String args[]) {
        Scanner teclado = new Scanner(System.in);
        /* EJERCICIO 5 - 2
        final int DOCE = 12;
        System.out.println("Introduzca un número: ");
        int numero = teclado.nextInt();
        if(DOCE==numero){
            System.out.println("Es doce");
        }
        else {
            System.out.println("No es correcto");
        }
        */

        /*
        // Ejercicio5-4: Crea un programa que pida al usuario dos números enteros y cuántos de ellos son pares.
         */
        int numeroUno, numeroDos;
        int cantidadPares = 0;
        System.out.println("Introduzca un número: ");
        numeroUno = teclado.nextInt();
        // Es par?
        if ((numeroUno % 2) == 0) {
            cantidadPares ++;
        }
        System.out.println("Introduzca un número: ");
        numeroDos = teclado.nextInt();
        if ((numeroDos % 2) == 0) {
            cantidadPares ++;
        }
        if (cantidadPares == 0) {
            System.out.println("De los números " + numeroUno + " y " + numeroDos + ", ninguno de ellos es par");
        }
        else if (cantidadPares == 1) {
            System.out.println("De los números " + numeroUno + " y " + numeroDos + ", uno de ellos es par");
        }
        else {
            System.out.println("De los números " + numeroUno + " y " + numeroDos + ", ambos son pares");
        }

    }
}

