/*
  Implementa la función aleatorioDeArray con la cabecera que se muestra a
  continuación:
  public static int aleatorioDeArray(int[] a)
  Esta función debe devolver un número del array escogido al azar entre todos
  los disponibles. Por ejemplo, si a = {111, 222, 333, 444}, aleatorioDeArray(a)
  podría devolver el 111, el 222, el 333 o el 444. Si b = {52, 37}, aleatorio-
  DeArray(b) podría devolver el 52 o el 37. Utiliza la función en un programa de
  prueba.
 */
package Entregable_1920;

public class Entregable_1920_5 {
    public static void main(String[] args) {
        int[] a = {111, 222, 333, 444};
        int[] b = {52, 37};
        aleatorioDeArray(a);
        aleatorioDeArray(b);
    }
    public static int aleatorioDeArray( int[] x) {
        int aleatorio;
        int rango = x.length;
        //int getRandomValue = (int) (Math.random()*(max-min)) + min;
        aleatorio = (int) (Math.random()*rango);
        System.out.println(x[aleatorio]);
        return x[aleatorio];
    }
}
