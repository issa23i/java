package Tarea1;

import java.util.*;

public class Ejec5 {
    public static void main(String[] args) {

        Collection<Ejec1> numerosAleatorios = new TreeSet<>();
        ArrayList<Ejec1> lista = new ArrayList<>();
        int largo = 20;
        for (int i = 0; i < largo; i++) {
            Ejec1 num = new Ejec1();
            numerosAleatorios.add(num);
            lista.clear();
            lista.addAll(numerosAleatorios);
            Collections.reverse(lista);
        }
        System.out.println(lista.toString());
    }
}

