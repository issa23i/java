//Actividad 12: Escribir el método incluido(),
// que devuelve true si todos los elementos del primer conjunto pertenecen al segundo
// y false si hay algún elemento del primero que no pertenezca al segundo. Su prototipo es:
//
//boolean incluido(Set conjunto1, Set conjunto2)
package Tarea2;

import java.util.Set;
import java.util.TreeSet;

public class Ejec4 {
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
        num2.add(4);
        num2.add(6);
        num2.add(3);
        num2.add(5);
        num2.add(7);
        System.out.println(num1.toString());
        System.out.println(num2.toString());
        System.out.println(Incluido(num1,num2));


    }
    public static boolean Incluido (Set conjunto1, Set conjunto2){
        return conjunto2.containsAll(conjunto1);
    }
}
