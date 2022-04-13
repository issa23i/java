package Tarea1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;

public class Ejec2 implements Comparator<Ejec1> {


    @Override
    public int compare(Ejec1 o1, Ejec1 o2) {
        return o1.getEnteroAleatorio() - o2.getEnteroAleatorio();
    }

    public static void main(String[] args) {
        int capacidadInicial = 20;
        ArrayList<Ejec1> numMenorde100 = new ArrayList<>(capacidadInicial);
        for (int i = 0; i < capacidadInicial; i++) {
            Ejec1 num = new Ejec1();
            numMenorde100.add(num);
            System.out.print(" " + num.toString());
        }
        System.out.println();
        Collections.sort(numMenorde100, new Ejec2());
        Collections.reverse(numMenorde100);
        Iterator<Ejec1> it = numMenorde100.iterator();
        while (it.hasNext()) {
            Ejec1 next =  it.next();
            System.out.print(" " + next.toString());
        }
    }
}
