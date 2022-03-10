// Actividad 9: Implementar el método unión de dos conjuntos,
// que devuelva un nuevo conjunto con todos los elementos que pertenezcan,
// al menos, a uno de los dos conjuntos. Su prototipo es:
//
// Set union (Set conjunto1, Set conjunto2)

package Tarea2;

import java.util.Set;
import java.util.TreeSet;

public class Ejec1 {
    public static void main(String[] args) {
        Set<Integer> num1 = new TreeSet<>();
        Set<Integer> num2 = new TreeSet<>();

//        num1 = {1,23, 3}; --> ¿cómo se meten del tirón?
//        Integer [] enteros = {1,2,3,4,5,6};
//        num1.addAll(enteros);
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
        System.out.println(Setunion(num1,num2));


    }
    public static Set Setunion (Set conjunto1, Set conjunto2){
        conjunto1.addAll(conjunto2);
        return conjunto1;
    }
}
