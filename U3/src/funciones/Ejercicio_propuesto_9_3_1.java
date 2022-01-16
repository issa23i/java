/**
 * Crea una función que calcule el cubo de un número real (float) que se indique como parámetro.
 * El resultado deberá ser otro número real.
 * Probar esta función para calcular el cubo de 3.2 y el de 5.
 */
package funciones;

public class Ejercicio_propuesto_9_3_1 {
    public static void main(String[] args) {
        float uno =  3.2f;
        float dos = 5;
        calcularCubo(uno);
        calcularCubo(dos);
    }
    public static float calcularCubo (float x) {
        float resultado = x*x*x;
        System.out.println(resultado);
        return resultado;
    }
}
