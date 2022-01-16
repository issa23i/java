import java.util.Scanner;

public class Impar {
    public static void main (String args[]) {
        Scanner teclado = new Scanner(System.in);
        int numero;
        System.out.println("Introduzca un número: ");
        numero = teclado.nextInt();
        if ((numero % 2) == 0) {
            System.out.println("Es par");
        }
        else {
            System.out.println("Es impar");
        }

    }
}
