package Tarea2;

import java.util.Set;
import java.util.TreeSet;

public class Ejec3 {
    public static void main(String[] args) {
        Set<Integer> num1 = new TreeSet<>();
        Set<Integer> num2 = new TreeSet<>();

        num1.add(4);
        num1.add(6);
        num1.add(3);
        num1.add(5);
        num1.add(7);
        num2.add(16);
        num2.add(8);
        num2.add(33);
        num2.add(6);
        System.out.println(num1.toString());
        System.out.println(num2.toString());
        System.out.println(Setdiferencia(num1,num2));


    }
    public static Set<Integer> Setdiferencia (Set conjunto1, Set conjunto2){
        Set<Integer> num3 = new TreeSet<>();
        num3 = conjunto1;
        num3.removeAll(conjunto2);
        return num3;
    }

}
