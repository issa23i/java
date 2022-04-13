/**
 * Crea una función "esPrimo",
 * que reciba un número y devuelva el valor booleano "true" si es un número primo
 * o "false" en caso contrario.
 */
package funciones;

public class Ejercicio_propuesto_9_3_5 {
    public static void main(String[] args) {
        int numero = 29;
        esPrimro(numero);
    }
    public static boolean esPrimro(int num) {
        boolean loes = true;
        for (int i = 2; i < num; i++) {
            if(num%i == 0){
                loes = false;
            }
        }
        System.out.println(loes);
        return loes;
    }
}
