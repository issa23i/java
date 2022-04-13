package Tarea1;

import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.TreeSet;

public class Ejec7 {
    public static void main(String[] args) {
        TreeSet<String> nombres = new TreeSet<>();
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
