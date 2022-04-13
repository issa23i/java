/**
 * Crea una función que devuelva la primera letra de una cadena de texto.
 * Probar esta función para calcular la última letra de la frase "Hola".
 */
package funciones;

public class Ejercicio_propuesto_9_3_4 {
    public static void main(String[] args) {
        String hola = "hola";
        ultimaLetra(hola);
    }
    public static char ultimaLetra (String s){
        return s.charAt(s.length()-1);
    }
}
