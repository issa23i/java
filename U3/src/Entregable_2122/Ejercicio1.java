/*
  Crea una función llamada palabraAhorcado que reciba como parámetros dos cadenas
  (la cadena a adivinar y el resultado parcial) y un carácter a buscar en la cadena a adivinar.
  Debe devolver el resultado de encontrar ese character en la cadena a adivinar.

  La función tendrá el siguiente prototipo:

  public static String palabraAhorcado(String cadena_a_adivinar, String resultado_parcial, char letra)
  En el programa principal, se debe pedir al usuario que introduzca una palabra a adivinar
  y un carácter a buscar en la cadena. Se pedirá caracteres hasta que se consiga adivinar la palabra completa.

  NOTA: La palabra a adivinar no contendrá tildes ni caracteres extraños,
  además será en minúsculas para simplificar el ejercicio.

  Ejemplo:

  palabraAhorcado("programacion","------------",'o') debe devolver "--o-------o-"
  palabraAhorcado("programacion","--o-------on",'a') debe devolver "--o--a-a--on"
  palabraAhorcado("hola","----",'x') debe devolver "----"
 */
package Entregable_2122;

import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        char letrita;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduzca la palabra a adivinar: ");
        StringBuilder resuelta = new StringBuilder(teclado.next());
        StringBuilder sinResolver = new StringBuilder();
        // Rellenar con "_" el largo de la palabra resuelta
        for (int i = 0; i < resuelta.length(); i++) {
            sinResolver.append('_');
        }
        // comprobar
        System.out.println(sinResolver);

        do {
            System.out.println("Escriba introduzca una letra");
            // cogemos la primera letra de la cadena introducida
            letrita = teclado.next().charAt(0);
            sinResolver = new StringBuilder(palabraAhorcado(resuelta.toString(),sinResolver.toString(),letrita));
            // comprobación
            System.out.println(sinResolver.toString());
        } while ( !((sinResolver.toString()).equals((resuelta.toString()))) );
        System.out.println("¡¡¡ Enhorabuena, has ganado !!!");
    }
    public static String palabraAhorcado(String cadena_a_adivinar, String resultado_parcial, char letra){
        StringBuilder palabra = new StringBuilder(cadena_a_adivinar);
        StringBuilder parcial = new StringBuilder(resultado_parcial);
        for (int i = 0; i < cadena_a_adivinar.length(); i++) {
            if(palabra.charAt(i) == letra){
                parcial.setCharAt(i,letra);
            }
        }
        return parcial.toString();
    }
}
