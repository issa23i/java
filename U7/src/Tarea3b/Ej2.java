// Añada al programa anterior la siguiente funcionalidad.
//El programa pedirá al usuario un dni, calculará la clave que ha de consultar,
//comprobará que dicha clave existe, y, en tal caso, mostrará el valor asociado a esa clave en el HashMap.
package Tarea3b;

import java.util.HashMap;
import java.util.Scanner;

public class Ej2 {
    public static void main(String[] args) {
        HashMap<Integer, String> compas = new HashMap<>();
        Scanner sc = new Scanner(System.in);

        String dni = "22000000";
        compas.put(getDni(dni), "Alberto");
        compas.put(getDni("24655555"), "Juan Andrés ");
        compas.put(getDni("10008000"), "io");
        compas.put(getDni("89959676"), "Isabel");

        System.out.println("Introduzca un número de dni a buscar: ");
        dni = sc.nextLine();
        Integer clave =

        System.out.println(compas);
    }


    static Integer getDni (String dni) {
        Integer resultado = 0;
        char [] c = dni.toString().toCharArray();
        for ( char caracter : c
        ) {
            Integer n = Character.getNumericValue(caracter);
            resultado += n;
        }
        return resultado;
    }
}
