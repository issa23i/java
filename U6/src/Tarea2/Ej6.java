// En un fichero binario, sabemos que se ha guardado una serie de números double, pero no sabemos cuántos.
// Implementar un programa que los lea todos y los muestre por pantalla.

package Tarea2;

import java.io.*;
import java.util.Scanner;

public class Ej6 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(System.in);
        double db = 0;
        double [] dbs;
        Integer n = 0;
        String binario = "doubles2.bin";
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
        // escribir
        try (ObjectOutputStream objectInputStream= new ObjectOutputStream(new FileOutputStream(binario))) {
            for (double doble: dbs
                 ) {
                objectInputStream.writeDouble(doble);
            }
            objectInputStream.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        // leer
        try (ObjectInputStream objectInputStream = new ObjectInputStream( new FileInputStream(binario))) {
            while (true) {
                System.out.println(objectInputStream.readDouble());
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (EOFException eofException) {
            System.out.println("ya no quedan doubles");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
