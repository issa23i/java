package Tarea3;

import java.util.Arrays;
import java.util.Comparator;

public class T3 {
    public static void main(String[] args) {
//        EnteroAleatorio enteroAleatorio = new EnteroAleatorio();
//        Integer [] tablaEnterosAleatorios = enteroAleatorio.setEnterosA();
//        System.out.println("Sin ordenar");
//        System.out.println(enteroAleatorio.toString());
//        Arrays.sort(tablaEnterosAleatorios);
//        System.out.println("Ordenada");
//        System.out.println(enteroAleatorio.toString());
//        Arrays.sort(tablaEnterosAleatorios, Comparator.reverseOrder());
//        System.out.println("Ordenada al revés");
//        System.out.println(enteroAleatorio.toString());

//        ColaTabla ct = new ColaTabla();
//        System.out.println("ColaTabla");
//        System.out.println(ct);
//        System.out.println("ColaTabla Encolar");
//        ct.encolar(3);
//        System.out.println(ct);
//        System.out.println("ColaTabla Desencolar");
//        ct.desencolar();
//        System.out.println(ct);

        Conjunto c = new Conjunto(7);
        c.insertarNum();
        c.insertarNum();
        System.out.println(c.toString());
        c.insertarNum();
        c.insertarNum();
        System.out.println(c.toString());
        Integer [] ns= {3,16,15,16,25,38,36,45};
        c.insertarConj(ns);
        System.out.println(c.toString());
    }
}
