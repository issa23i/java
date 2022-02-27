//  Pedir números enteros positivos por consola
//  y guardarlos en un fichero binario hasta que se introduzca un número negativo.
//  Leer del fichero todos los enteros guardados y mostrarlos por pantalla.
package Tarea2;

import java.io.*;
import java.util.Arrays;
import java.util.Scanner;

public class Ej3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Integer entero = 0;
        Integer [] enteros = new Integer[0];
        Integer contador = 0;
        // escribir
        try(ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("numeros.dat"))){
            do {
                System.out.println("Introduzca un número entero: \nPara finalizar, introduzca un número negativo");
                entero = sc.nextInt();
                out.writeInt(entero);
            } while (entero>=0);
        } catch (FileNotFoundException fileNotFoundException) {
            System.out.println(fileNotFoundException.toString());
        } catch (IOException ioException) { // aunque intellij se esté quejando, ¿es más correcto así?
            System.out.println(ioException.toString());
        }
        // leer
        try (ObjectInputStream in = new ObjectInputStream( new FileInputStream("numeros.dat"))){
            while (true) {
                entero = in.readInt();
                contador++;
                enteros = Arrays.copyOf(enteros, contador);
                enteros[contador-1] = entero;
            }
        } catch (FileNotFoundException fileNotFoundException) {
            System.out.println(fileNotFoundException.toString());
        } catch (EOFException eofException) {
            System.out.println("Fin del archivo");
        } catch (IOException ioException) {
            System.out.println("No pudo ser leído el archivo. Excepción: "+ ioException.toString() + " - " +
                    "Mensaje excepción: " + ioException.getMessage());
        }
        for ( Integer n: enteros
             ) {
            System.out.println(n.toString() + " ");
        }
    }
}
