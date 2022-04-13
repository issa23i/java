/*
Crear una función insertarValor que:

Reciba como parámetros un vector de enteros, un valor y una posición
Devuelva como resultado un vector en el que habremos insertado el valor que le hemos pasado en la posición indicada.
De esta manera el vector resultado tendrá un elemento más.
En caso de que la posición exceda los límites del vector deberá mostrar
un error por pantalla y devolver el mismo vector recibido.
Realizar una llamada a la función mostrando el vector resultado.

Ejemplo:

v = { 1 , 2 , 3 , 4 , 5 }

v1 = invertarValor(v,8,3)

Entonces v1 será {1,2,3,8,4,5}
 */

package Examen_AZUL;

public class Ej2 {
    public static void main(String[] args) {
        int [] v = { 1 , 2 , 3 , 4 , 5 };
        int [] v1 = inventarValor(v,8,3);
        System.out.println();
        for (int i:v1
             ) {
            System.out.print(i + " ");
        }
    }
    public static int[] inventarValor(int[] v, int num, int pos) {
       int [] resultado = v;
       if( (resultado.length -1) >= pos && pos >= 0) { // límites del vector
           resultado[pos] = num;
           return resultado;
       } else {
           System.out.println("La posición indicada excede los límites del vector");
           return resultado;// En caso de que la posición exceda los límites del vector
       }
    }

}
