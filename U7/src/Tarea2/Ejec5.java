//Actividad 13: Implementar una función a la que se le pasen dos listas ordenadas
// y nos devuelva una única lista, fusión de las dos anteriores.
// Desarrollar el algoritmo de forma no destructiva, es decir,
// que las listas utilizadas como parámetros de entrada se mantengan intactas.
//

package Tarea2;

import java.util.ArrayList;

public class Ejec5 {
    public static void main(String[] args) {
        ArrayList<Integer> lista1 = new ArrayList<>();
        ArrayList<Integer> lista2 = new ArrayList<>();
        lista1.add(4);
        lista1.add(6);
        lista1.add(4);
        lista1.add(3);
        lista1.add(9);
        lista1.add(11);
        lista1.add(10);
        lista2.add(42);
        lista2.add(01);
        lista2.add(45);
        lista2.add(4);
        lista2.add(14);
        lista2.add(6);
        lista2.add(2);
        System.out.println(lista1.toString());
        System.out.println(lista2.toString());
        System.out.println(Fusionar(lista1, lista2));
    }
    public static ArrayList<Integer> Fusionar( ArrayList<Integer> lista1, ArrayList<Integer> lista2) {
        ArrayList<Integer> lista3 = new ArrayList<>();
        lista3 = lista1;
        lista3.addAll(lista2);
        return lista3;
    }
}
