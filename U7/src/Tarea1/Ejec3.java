package Tarea1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class Ejec3 {
    public static void main(String[] args) {
        Integer largo = 10;
        ArrayList<Ejec1> num = new ArrayList<>(largo);
        for (int i = 0; i < largo; i++) {
            Ejec1 numero = new Ejec1(10);
            num.add(numero);
            Collections.sort(num, new Ejec2());
            Collections.reverse(num);
        }
        Iterator<Ejec1> it = num.iterator();
        while (it.hasNext()) {
            Ejec1 next =  it.next();
            System.out.print(" " + next.toString());
        }
    }

}
