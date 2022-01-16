/**
 * Escribir un programa que solicite al usuario un número de tarjeta de crédito del
 * BANCO - ERESUNPRIMO y que valide lo siguiente:
 *
 * El formato del número que debe ser (incluyendo los guiones) así: 2222-3333-44-0123456789
 * En este formato los 4 primeros dígitos (2222) corresponde a la entidad, el BANCO - ERESUNPRIMO.
 *
 * Los 4 siguientes corresponden a la sucursal (3333).
 *
 * Los 2 siguiente al número de control  (44)
 *
 * Los 10 últimos corresponden el número de cuenta.
 *
 * Esos 10 últimos números en todas las cuentas del BANCO - ERESUNPRIMO deben ser un número primo.
 */
package examen_azul_2020;

import java.util.Scanner;

public class NumCuenta {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        boolean valido = false;
        while (!valido) {
            System.out.println("Introduzca un número de cuenta válido: ");
            String cuenta = teclado.next();

            if (!(
                    (cuenta.length() == 23)
                            && (cuenta.charAt(4) == '-')
                            && (cuenta.charAt(9) == '-')
                            && (cuenta.charAt(12) == '-'))) {
                valido = false;
            } else valido = true;
        }
    }
}
