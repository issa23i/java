package ejemplosvarios;
/**
 * EJERCICIO 1 (Clase Ej1.java)
 *
 * Calcula la nota de un trimestre de la asignatura Programación. El programa pedirá las tres notas que ha sacado
 * el alumno en los tres primeros controles.
 * Si la media de los dos controles da un número mayor o igual a 5, el alumno está aprobado y se mostrará la media
 * y la nota correspondiente .Atendiendo a esa media el alumno tendrá las siguientes notas:
 *
 * Suficiente si la media en mayor o igual que 5 y menor que 6.
 * Bien si la media es mayor o igual que 6 y menor que 7.
 * Notable si la media es mayor o igual que 7 y menor que 9.
 * Sobresaliente en culaquier otro caso.
 * En caso de que la media sea un número menor que 5, el alumno habrá tenido que hacer el examen de recuperación
 * que se califica como apto o no apto, por tanto se debe preguntar al usuario ¿Cuál
 * ha sido el resultado de la recuperación? (apto/no apto). Si el resultado de la recuperación es apto,
 * la nota será un 5; en caso contrario, se mantienela nota media anterior.
 */

import java.util.Scanner;

public class Ej1 {
    public static void main(String args[]) {
        // Inicialización
        float nota1, nota2, nota3, media;
        boolean apto = false;
        boolean aprobado = false;
        // Pedir datos
        Scanner teclado = new Scanner(System.in);
        float numero;
        System.out.println("Introduzca la nota 1: ");
        nota1 = teclado.nextFloat();
        System.out.println("Nota del primer control:" + nota1);
        System.out.println("Introduzca la nota 2: ");
        nota2 = teclado.nextFloat();
        System.out.println("Nota del primer control:" + nota1);
        System.out.println("Introduzca la nota 3: ");
        nota3 = teclado.nextFloat();
        System.out.println("Nota del primer control:" + nota1);
        // Nota media
        media = ( nota1 + nota2 + nota3 ) / 3;
        // Mostrar nota final
        if (media >= 5) {
            System.out.print("Tu nota de Programación es: " + media + " - ");
            aprobado = true;
        }
        if (media >= 5 && media < 6) {
            System.out.println("APROBADO");
        } else if (media >= 6 && media < 7) {
            System.out.println("BIEN");
        } else if (media >= 7 && media < 8) {
            System.out.println("NOTABLE");
        } else if (!aprobado) { // Preguntar apto / no apto
            System.out.println("¿Ha superado la prueba de recuperación? APTO/ NO APTO ");
            String esApto = teclado.next();
            if ( esApto.equals("APTO") || esApto.equals("apto") || esApto.equals("Apto") ) {
                System.out.println("\"Tu nota de Programación es: 5 - APROBADO");
            } else {
                System.out.println("Su nota media es: " + media);
            }
        } else {
            System.out.println("Su nota final es SOBRESALIENTE");
        }
    }
}
