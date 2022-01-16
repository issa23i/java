import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Main {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        /*
	// U1: Tarea 2
        // Ejercicio2-1: Crea un programa en Java que escriba en pantalla el producto de dos números prefijados

        float numUno, numDos, resultado;
        numUno = 8;
        numDos = 6;
        resultado = numUno * numDos;
        System.out.println(resultado);

        // Ejercicio2-2: Crea un programa que muestre el resto de dividir dos números prefijados.
        resultado = numUno % numDos;
        System.out.println(resultado);

        // Ejercicio2-3: Crea un programa que calcule y muestre la división de dos números enteros introducidos por el usuario.
        System.out.println("Ingresa un número: ");
        numUno = teclado.nextFloat();
        System.out.println("Ingresa otro número: ");
        numDos = teclado.nextFloat();
        resultado = numUno / numDos;
        System.out.println(resultado);

        // Ejercicio2-4: Crea un programa que pida al usuario una longitud en millas (por ejemplo, 3) y calcule su equivalencia en metros (1 milla = 1609 m).
        float millas;
        final int METROSXMILLAS = 1609;
        System.out.println("Ingrese el número de millas: ");
        millas = teclado.nextFloat();
        resultado = millas * METROSXMILLAS;
        System.out.println(resultado);

        // Ejercicio2-5: Crea un programa que pida al usuario una temperatura en grados centígrados y calcule (y muestre)
        // a cuántos grados Fahrenheit equivalen (F = 9*C/5 + 32).
        float grados;
        System.out.println("Ingrese el número de grados centígrados: ");
        grados = teclado.nextFloat();
        float fahrenheit = (9 * grados / 5 + 32);
        System.out.print("La temperatura en Fahrenheit es: "+ fahrenheit);


        //U1: Tarea 3- Operaciones básicas y Tipos de datos

        //Ejercicio3-1: Crea un programa que calcule y muestre la suma de dos números
        // de dos cifras (de tipo byte) que introduzca el usuario.
        Scanner teclado = new Scanner(System.in);
        byte numUno, numDos;
        int resultadoSuma;

        System.out.println("Escriba un número entero de dos dígitos: ");
        numUno = teclado.nextByte();
        System.out.println("Escriba otro número entero de dos dígitos: ");
        numDos = teclado.nextByte();
        resultadoSuma = numUno + numDos;
        System.out.println("El resultado es: " + resultadoSuma);

        //Ejercicio3-2: Crea un programa que pida al usuario su año de nacimiento y el año actual (usando datos de tipo short)
        // y halle la diferencia de ambos para obtener su edad.
        short yearBorn, yearActual;
        int edad;
        System.out.println("Escriba el año de su nacimiento: ");
        yearBorn = teclado.nextShort();
        System.out.println("Escriba el año actual: ");
        yearActual = teclado.nextShort();
        edad = yearActual - yearBorn;
        System.out.println("Su edad es: " + edad);

        // Ejercicio3-3: Crea un programa que calcule y muestre la división de
        // dos números reales de doble precisión introducidos por el usuario.
        double numReal1, numReal2, divisionReal;
        System.out.println("Escriba un número real: ");
        numReal1 = teclado.nextDouble();
        System.out.println("Escriba otro número real: ");
        numReal2 = teclado.nextDouble();
        divisionReal = numReal1 / numReal2;
        System.out.println("El resultado de la división de números reales es: " + divisionReal);

        // Ejercicio3-4: Crea un programa que pida al usuario una longitud en millas (por ejemplo, 3)
        // y calcule su equivalencia en kilómetros, usando datos de tipo float (1 milla = 1.609 km).
        float millas, kilometros;
        final float KILOMETROSXMILLA = 1609;
        System.out.println("Escriba el número de millas: ");
        millas = teclado.nextFloat();
        kilometros = millas * KILOMETROSXMILLA;
        System.out.println("El número total de kilómetros es: " + kilometros);


        // U1: Tarea 4 - Tipos de datos. Conversión de tipos

        // Actividad 4.1 - El tipo short permite almacenar valores comprendidos entre -32768 y 32767.
        // Realiza un programa que muestre si el rango de valores de un tipo se comporta de forma cíclica.
        // Es decir, que muestre el valor máximo de una variable de tipo short,
        // y muestre también qué ocurre si sumamos 1 a esa variable.
        System.out.println("short\t" + Short.MIN_VALUE + "\t" + Short.MAX_VALUE);
        final short MAXSHORTVALUE = Short.MAX_VALUE;
        int shortMasUno = MAXSHORTVALUE + 1;
        System.out.println(shortMasUno);

        // Actividad 4.2 - Necesitamos una aplicación que calcule la media aritmética de dos notas enteras.
        // Hay que tener en cuenta que la media puede contener decimales.
        float nota1, nota2, media;
        System.out.println("Escriba la nota 1: ");
        nota1 = teclado.nextFloat();
        System.out.println("Escriba la nota 2: ");
        nota2 = teclado.nextFloat();
        media = (nota1 + nota2) / 2;
        System.out.println("La media es: " + media);

        // Actividad 4.3 - Modificar el ejercicio anterior para que muestre la parte entera de la media de tres notas decimales
        float nota3;
        int mediaEntera;
        System.out.println("Escriba la nota 3: ");
        nota3 = teclado.nextFloat();
        mediaEntera = (int)( nota1 + nota2 + nota3 ) / 3;
        System.out.println("La media entera es: " + mediaEntera);

        // Actividad 4.4 - Sería interesante disponer de un programa que pida como entrada un número decimal
        // y lo muestre redondeando al entero más próximo. ej: 2,3 -> 2      4,8 -> 5
        float numDecimal;
        int numEntero;
        System.out.println("Ingrese un número decimal: ");
        numDecimal = teclado.nextFloat();
        numEntero = Math.round(numDecimal);
        System.out.println("el número entero es: " + numEntero);

        // Actividad 4.5 - Escribe un programa que muestre la hora actual
        LocalDateTime miHoraLocal = LocalDateTime.now();
        DateTimeFormatter miFormatoHora = DateTimeFormatter.ofPattern("HH:mm:ss");
        String fechaFormateada = miHoraLocal.format(miFormatoHora);
        System.out.println("Son las " + fechaFormateada);

        */

        // U1: Tarea 5a - Comprobación de Condiciones

        // Ejercicio5-1: Crea un programa que pida un número entero al usuario y diga
        // si es positivo (mayor que cero) o si, por el contrario, no lo es (usando "else").
        int numEntero;
        System.out.println("Ingrese un número entero: ");
        numEntero = teclado.nextInt();
        if (numEntero > 0) {
            System.out.println("Es positivo");
        }
        else {
            System.out.println("No lo es");
        }


    }
}
