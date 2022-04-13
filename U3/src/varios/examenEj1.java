import java.util.Scanner;

/**
 * Escribe un programa que pinte por pantalla las letras AB.
 * El usuario debe introducir la altura que deberá ser mayor que 3 e impar.
 * Las letras estarán separadas por dos espacios
 */
public class examenEj1 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int altura = 0;
        do {
            System.out.println("Introduzca la altura: ");
            altura = teclado.nextInt();
        }while ( altura % 2 == 0 || altura < 3);
        for (int i = 0; i < altura; i++) {
            for (int j = 0; j < (altura * 2) + altura; j++) {
                if (
                        (j == altura - i)
                                ||(j == altura + i)
                                ||( (j >= altura - i) && (j <= altura + i) && (i == (altura / 2) + 1))
                                ||(j == (altura * 2) + 2)
                                ||( (i == 0) && (j >(altura * 2)+ 1) && (j > (altura * 2) + 2))
                ) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
