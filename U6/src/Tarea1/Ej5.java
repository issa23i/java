//Actividad5: En el archivo numeros.txt disponemos de una serie de números (uno por cada línea).
//Diseñar un programa que procese el fichero y nos muestre el menor y el mayor.

package Tarea1;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;

public class Ej5 {
    public static void main(String[] args) {
        String archivo = "numeros.txt";
        Integer [] numeros = new Integer[0];
        Integer contador = 0;
        String numero="";
        try{
            BufferedReader br = new BufferedReader(new FileReader(archivo));
            while (numero != null) {
                numero = br.readLine();
                if (numero != null) {
                    numeros = Arrays.copyOf(numeros, numeros.length +1);
                    numeros[contador] = Integer.valueOf(numero);
                    contador++;
                }
            }
            br.close();
        } catch (IOException ioException){
            System.out.println("No se pudo leer el archivo");
        }
        Arrays.sort(numeros);
        for (Integer num: numeros
             ) {
            System.out.println(num + " ");
        }
        System.out.println("El número mayor es: "+ numeros[numeros.length-1] + "\nEl número menor es: " + numeros[0]);
    }

}
