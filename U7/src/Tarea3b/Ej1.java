// Crea un HashMap cuya clave sea un Integer,
//y cuyos valores sean los nombres de algunos de tus compañeros.
//La clave ha de calcularse mediante un método que reciba un String que represente el dni,
//y devuelva la suma de sus dígitos.
//46221877D -> 4+6+2+2+1+8+7+7=37
//Una vez guardados los elementos, deben mostrarse todos los elementos (clave-valor) del HasMap.
package Tarea3b;

import java.util.HashMap;

public class Ej1 {


    public static void main(String[] args) {
        HashMap<Integer, String> compas = new HashMap<>();
        String dni = "22000000";
        compas.put(getDni(dni), "Alberto");
        compas.put(getDni("24655555"), "Juan Andrés ");
        compas.put(getDni("10008000"), "io");
        compas.put(getDni("89959676"), "Isabel");
        System.out.println(compas);
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
