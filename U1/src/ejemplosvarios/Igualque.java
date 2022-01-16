import java.util.Scanner;

public class Igualque {
    public static void main(String args[]) {
        Scanner teclado = new Scanner(System.in);
        final int CERO = 0;
        System.out.println("Escriba un número entero: ");
        int numero = teclado.nextInt();
        if (numero == CERO) {
            System.out.println("Igual a cero");
        }
        else if (numero > CERO) {
            System.out.println("Mayor de cero");
        }
        else {
            System.out.println("Menor que cero");
        }
    }
}
