/*
Escribe un programa que cambie un dígito dentro de un número dando la posición
y el valor nuevo. Las posiciones se cuentan de izquierda a derecha empezando por el 1.
Se recomienda usar long en lugar de int ya que el primero admite números más largos.
Suponemos que el usuario introduce correctamente los datos.

Ejemplo:

Por favor, introduzca un número entero positivo: 406783
Introduzca la posición dentro del número: 3
Introduzca el nuevo dígito: 1
El número resultante es 401783

 */
package Examen_recuperacion;

import java.util.Scanner;

public class Ej2 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int numero, pos, digito;
        System.out.println("Por favor, introduzca un número entero positivo: ");
        numero = teclado.nextInt();
        System.out.println("Introduzca la posición dentro del número: ");
        pos = teclado.nextInt();
        System.out.println("Introduzca el nuevo dígito: ");
        digito = teclado.nextInt();
        resultante(numero, pos, digito);
    }
    public static void resultante( int n, int p, int d){
        // convertir a cadena
        StringBuilder sb = new StringBuilder();
        int digito;
        while (n > 0 ){
            digito = n % 10 ;
            sb.append(digito);
            n = n /10;
        }
        // darle la vuelta y meter el número en la posicion
        char [] resultado = new char [sb.length()+1];
        for (int i = sb.length()-1; i >= 0; i--) {
            if ( i > p) {
                resultado[(sb.length()-1)-i] = sb.charAt(i);
            } else if (i == p){
                resultado[(sb.length()-1)-i] = (char) d;
            } else {
                resultado[(sb.length())-i] = sb.charAt(i);
            }
        }
        System.out.println(resultado);

    }
}
