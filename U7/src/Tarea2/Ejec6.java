//Actividad 14: Implementar la función leeCadena con el siguiente prototipo:
//
//List<Character> leeCadena()
//Dicha función lee una cadena por teclado y nos la devuelve en una lista con un carácter en cada nodo.
package Tarea2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Ejec6 {
    public static void main(String[] args) {
        System.out.println(leeCadena());
    }
    public static List<Character> leeCadena(){
        Scanner sc = new Scanner(System.in);
        String cadena;
        System.out.println("Introduzca una cadena: ");
        cadena = sc.nextLine();
        List<Character> lista = new ArrayList<>();
        for (int i = 0; i < cadena.length(); i++) {
            lista.add(cadena.charAt(i));
        }
        return lista;
    }

}
