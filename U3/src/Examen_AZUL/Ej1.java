/*
  Implementa la función aleatorioDeArray con la cabecera que se muestra a continuación:

  public static int aleatorioDeArray(int[] a)
  Esta función debe devolver un número del array escogido al azar entre todos los disponibles.

  Por ejemplo, si a = {111, 222, 333, 444}, aleatorioDeArray(a) podría devolver
  el 111, el 222, el 333 o el 444. Si b = {52, 37}, aleatorioDeArray(b) podría devolver el 52 o el 37.

  Utiliza la función en un programa deprueba.
 */
package Examen_AZUL;

public class Ej1 {
    public static void main(String[] args) {
        int[] a = {111, 222, 333, 444};
        int[] b = {52, 37};
        System.out.println(aleatorioDeArray(a));
        System.out.println(aleatorioDeArray(b));
    }
    public static int aleatorioDeArray(int[] a){
        int dado = (int) (Math.random() * (a.length) );
        int resultado = 0;
        for (int i = 0; i < a.length; i++) {
            if (i == dado) {
                resultado = a[dado];
                return resultado;
            }
        }
        return resultado;
    }
}
