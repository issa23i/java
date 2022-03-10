// Actividad 10: Hacer lo mismo que en el ejercicio anterior con la intersección
// , formada por los elementos comunes a los dos conjuntos. Su prototipo es:


package Tarea2;

import java.util.Set;
import java.util.TreeSet;

public class Ejec2 {
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
        System.out.println(Setinterseccion(num1,num2));


    }
    public static Set<Integer> Setinterseccion (Set conjunto1, Set conjunto2){
        conjunto1.retainAll(conjunto2);
        return conjunto1;
    }

}
