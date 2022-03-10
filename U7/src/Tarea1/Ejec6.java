package Tarea1;

import org.w3c.dom.ls.LSOutput;

import java.util.LinkedHashSet;
import java.util.Scanner;

public class Ejec6 {
    public static void main(String[] args) {
        LinkedHashSet<String> nombres = new LinkedHashSet<>();
        Scanner sc = new Scanner(System.in);
        String nombre = "";
        do {
            System.out.println("Imprime un nombre (para finalizar escriba 'fin' : ");
            nombre = sc.nextLine();
            if (!nombre.equals("fin")) {
                nombres.add(nombre);
            }
        } while ( !(nombre.equals("fin")) );
        System.out.println(nombres.toString());
    }
}
