import java.util.Scanner;

/**
 * Realiza un programa que diga los dígitos que aparecen
 * y los que no aparecen en un número entero introducido por teclado.
 * El orden es el que se muestra en los ejemplos. Utiliza
 * el tipo long para que el usuario pueda introducir números largos.
 */
public class examenEj2 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        long num = 0;
        long cociente = 0;
        long resto = 0;
        System.out.println("Introduzca un número : ");
        num = teclado.nextLong();
        System.out.print("Dígitos que aparecen en el número: ");
        for (int i = 0; i < 10; i++) {
            cociente = num;
            while (cociente != 0) {
                resto = cociente % 10;
                cociente = cociente / 10;
                if (resto == i) {
                    System.out.print(" " + i);
                }
            }
        }
    }
}
