/**
 * Ahora que se acerca la notería de Navidad queremos saber si un número va a proporcionar suerte a un usuario.
 * Solicitaremos a un usuario cuáles son sus 3 números favoritos y para calcular
 * si un número le va a dar suerte dicho número tendrá más ocurrencias de esos números que de los demás.
 */
package u1entregable2021;

import java.util.Scanner;

public class loteria {
    public static void main(String[] args) {
        int n1, n2, n3, cociente, resto;
        int digitos = 0;
        int suerte = 0;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduzca sus tres números favoritos: ");
        System.out.println("primer número: ");
        n1 = teclado.nextInt();
        System.out.println("segundo número: ");
        n2 = teclado.nextInt();
        System.out.println("tercer número: ");
        n3 = teclado.nextInt();
        System.out.println("Introduzca su número de la lotería: ");
        cociente = teclado.nextInt();
        do {
            resto = cociente % 10;
            cociente = cociente / 10;
            digitos++;
            if ( resto == n1 || resto == n2 || resto == n3){
                suerte ++;
            }
        } while (cociente != 0);
        if ( suerte > digitos /2) {
            System.out.println("Este número te va a dar suerte");
        } else {
            System.out.println("Este número no te va a dar suerte");
        }

    }
}
