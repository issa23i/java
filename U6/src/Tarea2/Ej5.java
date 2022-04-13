package Tarea2;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Ej5 {
    public static void main(String[] args) throws FileNotFoundException {
        String fichero = "doubles.bin";
        double [] dbs = new double[0];
        try (ObjectInputStream in = new ObjectInputStream ( new FileInputStream(fichero))){
            dbs = (double[]) in.readObject();
        } catch (FileNotFoundException fileNotFoundException) {
            System.out.println("No se encontró el archivo "  + fileNotFoundException.toString());
        }  catch (ClassNotFoundException classNotFoundException) {
            System.out.println("No se encontró la clase del objeto" + classNotFoundException.toString());
        }  catch (IOException e) {
            System.out.println("No se pudo leer el fichero " + e.toString());
        }
        for (double db : dbs
             ) {
            System.out.println(db);
        }
    }
}
