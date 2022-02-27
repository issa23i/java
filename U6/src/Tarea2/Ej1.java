// Pedir un double por consola y guardarlo en un archivo binario.
package Tarea2;

import java.io.*;
import java.util.Scanner;

public class Ej1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Double db;
        System.out.println("Introduzca un valor double: ");
        db = sc.nextDouble();
        try(ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("datos.dat"))){
            out.writeDouble(db);
        } catch (IOException ioException){
            System.out.println(ioException.toString());
        }

    }

}
