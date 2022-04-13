// Recorre el Map anterior, extrayendo cada pareja clave-valor,
// y mostrándolas, de tal forma que se escriban los datos así:
//
//La clave 37 está asociada al nombre "Pedro Gonzalez Jimenez".

package Tarea3b;

import java.util.*;

public class Ej3 {

    public static void main(String[] args) {
        HashMap<Integer, String> compas = new HashMap<>();
        Scanner sc = new Scanner(System.in);

        String dni = "22000000";
        compas.put(getDni(dni), "Alberto");
        compas.put(getDni("24655555"), "Juan Andrés ");
        compas.put(getDni("10008000"), "io");
        compas.put(getDni("89959676"), "Isabel");

//        System.out.println("Introduzca un número de dni a buscar: ");
//        dni = sc.nextLine();
//        Integer clave = getDni(dni);

        System.out.println(compas);

        recorrerHashMap(compas);
    }

    public static void recorrerHashMap (HashMap mapa) {
        Set<Integer> coleccion = mapa.keySet();
        Iterator<Integer> it = coleccion.iterator();
        while (it.hasNext()) {
            Integer next =  it.next();
            System.out.println("La clave " + next  + " está asociada al nombre: " + mapa.get(next) + ".");
        }
    }


    static Integer getDni (String dni) {
        Integer resultado = 0;
        char [] c = dni.toString().toCharArray();
        for ( char caracter : c
        ) {
            Integer n = Character.getNumericValue(caracter);
            resultado += n;
        }
        return resultado;
    }
}
