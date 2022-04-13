/*
Crea una función con la siguiente cabecera:

public String convierteEnPalabras(int n)
Esta función convierte los dígitos del número n
en las correspondientes palabras y lo devuelve
todo en una cadena de caracteres.
 Por ejemplo, el 470213 convertido a palabras sería:

cuatro, siete, cero, dos, uno, tres
Utiliza esta función en un programa para comprobar que funciona bien.
Desde la función no se debe mostrar nada por pantalla,
solo se debe usar print desde el programa principal.
Fíjate que hay una coma detrás de cada palabra salvo al final.
 */

public class examen_tarde_ej4 {
    public static void main(String[] args) {
        int n = 12345;
        System.out.println(convierteEnPalabras(n));
    }
    public static String convierteEnPalabras(int n){
        int[] numeros = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        String[] numletras = {"cero", "uno", "dos", "tres", "cuatro", "cinco", "seis", "siete", "ocho", "nueve"};
        String resultado = "";
        // recorrer el numero
        int temporal = n;
        int imprimir = 0;
        while(temporal!=0){
            temporal= n / 10;
            imprimir = n % 10;
            // devolver la palabra
            String s = "";
            for (int i = 0; i < numeros.length; i++) {
                if (imprimir == numeros[i]) {
                    s=  numletras[i];
                    resultado.concat(s);

                }
            }
            if(temporal!=0){
                resultado.concat(", ");
            }

        }
        return resultado;
    }
}
