/**
 * Escribe un programa que sea capaz de insertar un dígito dentro de un número
 * indicando la posición. El nuevo dígito se colocará en la posición indicada y el
 * resto de dígitos se desplazará hacia la derecha. Las posiciones se cuentan de
 * izquierda a derecha empezando por el 1. Suponemos que el usuario introduce
 * correctamente los datos. Se recomienda usar long en lugar de int ya que el
 * primero admite números más largos.
 */
package u1entregableultimo;

import java.util.Scanner;

public class InsertarDigito {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        long num = 0;
        long inserta = 0;
        long posicion = 0;
        do { // PEDIR NÚMERO
            System.out.println("Por favor, introduzca un número entero positivo:");
            num = teclado.nextLong();
        } while (num < 1); // mientras no sea entero positivo

        long cociente = num;
        num = 0;
        long resto = 0;
        int digitos = 0;
        int contador = 0;

        do { // CONTAR DÍGITOS Y DAR LA VUELTA AL NÚMERO
            resto = cociente % 10;
            cociente = cociente / 10;
            digitos++;
            num = num * 10 + resto;
        } while (cociente != 0);

        do { // PEDIR POSICION DONDE SE QUIERE INSERTAR
            System.out.println("Introduzca la posición donde quiere insertar: ");
            posicion = teclado.nextLong();
        } while (posicion > digitos || posicion < 1); // MIENTRAS QUE LA POSICIÓN SEA NEGATIVA o CERO, O MAYOR QUE EL NÚMERO DE DÍGITOS



        do { // PEDIR NUMERO A INSERTAR
            System.out.println("Introduzca el dígito que quiere insertar:");
            inserta = teclado.nextLong();
        } while (inserta < 0 || inserta > 9); // MIENTRAS SEA NEGATIVO O TENGA MÁS DE DOS DÍGITOS

        cociente = num;
        num = 0;
        do { // VOLVER A DAR LA VUELTA E INSERTAR EL NUEVO DÍGITO
            resto = cociente % 10;
            cociente = cociente / 10;
            if (contador + 1 == posicion) { // SI LA POSICIÓN SIGUIENTE ES LA POSICIÓN DESEADA
                num = num * 10 + inserta;
            }
            contador ++;
            num = num * 10 + resto;
        } while (cociente != 0);

        // MOSTRAR RESULTADO EN PANTALLA
        System.out.println("El número resultante es " + num );
    }
}
