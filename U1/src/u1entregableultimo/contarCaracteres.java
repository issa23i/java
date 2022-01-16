/**
 * Dada una cadena mostrar por pantalla la cantidad de espacios, haches y vocales
 * abiertas tiene, independientemente de que sean mayúsculas, minúsculas o acentuadas.
 * Las vocales abiertas son a, e, o.
 */
package u1entregableultimo;

import java.util.Scanner;

public class contarCaracteres {
    public static void main(String[] args) {
        String comprobar = "hH aeo"; // caracteres a commprobar
        Scanner teclado = new Scanner(System.in);
        System.out.println("Escriba una frase: ");
        String frase = teclado.nextLine(); // lee la siguiente línea
        int ocurrencias = 0;
        for (int i = frase.length() -1; i >= 0 ; i--) { // para cada caracter de la frase
            for (int j = 0; j < comprobar.length(); j++) { // para cada caracter a comprobar
                if ( frase.substring(i, i+1).equals(comprobar.substring(j, j+1))) {
                    ocurrencias++;
                }
            }
        }
        System.out.println("La cantidad de espacios, haches y vocales abiertas es " + ocurrencias);
    }
}
