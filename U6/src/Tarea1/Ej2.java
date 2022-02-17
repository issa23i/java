//Diseñar una aplicación que pida al usuario su nombre y edad.
// Estos datos deben guardarse en el fichero "datos.txt".
// Si este fichero existe, debe borrarse su contenido, y en caso de no existir, debe crearse.
package Tarea1;

import java.io.*;
import java.util.Scanner;

public class Ej2 {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            System.out.println("Introduzca nu nombre: ");
            String nombre = sc.nextLine();
            System.out.println("Introduzca su edad");
            String edad = sc.nextLine();
            String file = "datos.txt";
            BufferedWriter bw = new BufferedWriter(new FileWriter(file, false));
            BufferedReader br = new BufferedReader(new FileReader(file));
            bw.newLine();
            bw.write("" + nombre + " " + edad);
            bw.close();
            String texto = "";
            String leer = br.readLine();
            while (leer != null){
                texto += leer;
                leer = br.readLine();
            }
            System.out.println(texto);
        } catch (IOException ioex) {
            System.out.println("No se pudo escribir el archivo");
        }

    }
}
