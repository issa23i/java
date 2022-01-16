/**
 * Crea una función que devuelva la primera letra de una cadena de texto.
 * Probar esta función para calcular la primera letra de la frase "Hola".
 */
package funciones;

public class Ejercicio_propuesto_9_3_3 {
    public static void main(String[] args) {
        String hola = "hola";
        primeraLetra(hola);
    }
    public static char primeraLetra (String s){
        return s.charAt(0);
    }
}
