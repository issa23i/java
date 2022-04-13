//  Abrir el archivo del ejercicio anterior, leer el double y mostrarlo por pantalla
package Tarea2;

import java.io.*;
import java.util.Scanner;

public class Ej2 {
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

        try(ObjectInputStream in = new ObjectInputStream(new FileInputStream("datos.dat"))){
            System.out.println(in.readDouble());
        } catch (IOException ioException) {
            ioException.printStackTrace();
        }
    }
}
