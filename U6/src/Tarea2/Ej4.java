// Pedir un entero n por consola. A continuación,
// pedir n números double, que iremos guardando en una tabla.
// Guardar la tabla en un archivo binario.

package Tarea2;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.Scanner;

public class Ej4 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(System.in);
        double db = 0;
        double [] dbs;
        Integer n = 0;
        String binario = "doubles.bin";
        System.out.println("inserte el número de elementos de la tabla");
        n = sc.nextInt();
        dbs = new double[n];
        do {
            System.out.println("Inserte un numero");
            db = sc.nextDouble();
            // insertar en la tabla
            dbs[dbs.length-n] = db;
            n--;

        } while (n != 0);
        try(ObjectOutputStream out = new ObjectOutputStream( new FileOutputStream(binario))){
            out.writeObject(db);
        } catch (FileNotFoundException fileNotFoundException) {
            System.out.println("No se encontró el archivo" + fileNotFoundException.toString());
        } catch (IOException e) {
            System.out.println("No se pudo guardar en el archivo" + e.toString());
        }
    }


}
