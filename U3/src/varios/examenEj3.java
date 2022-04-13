import java.util.Random;
import java.util.Scanner;

/**
 * Desarrolla un programa que genere una clave criptográfica mediante números aleatorios
 * para cifrar otro número introducido por el usuario. Se generará una clave distinta
 * para cada una de las cifras del número introducido por el usuario. Las diferentes
 * claves criptográficas generadas se comprenderán entre 1000 y 10000 (siendo este último no incluido).
 * Por cada cifra del número, se sumará al total de cifras sumadas de su clave criptográfica.
 * El número final se obtendrá de sumar todos los resultados parciales.
 * Abajo se detalla un ejemplo para su mejor comprensión.
 */



public class examenEj3 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduzca un número: ");
        int numUser = teclado.nextInt();
        int cociente = numUser;
        int resto = 0;
        int contador = 0;
        int delReves = 0;
/**
        while (cociente != 0) {
            resto = cociente % 10;
            cociente = cociente / 10;
            contador++;
            delReves = resto * 10;
            System.out.println(delReves);
        }
        */
        while (cociente != 0) {
            resto = cociente % 10;
            cociente = cociente / 10;

            Random r = new Random(resto);
            int clave = r.nextInt(10 * 1000);
            System.out.println("La clave criptográfica generada para " + resto + " es: " + clave);
        }

    }
}
