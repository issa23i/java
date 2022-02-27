// Disponemos de dos ficheros perso1.txt y perso2.txt con nombres de personas (ambos ordenados).
// Realizar un programa que lea ambos ficheros y que cree un tercer fichero (todos.txt)
// con todos los nombres ordenados alfabéticamente.
package Tarea1;

import java.io.*;
import java.util.Arrays;

public class Ej8 {
    public static void main(String[] args) {
        String [] nombres = new String[0] ;
        String nombre = "";
        Integer contador = 0;
        try {
            BufferedReader br1 = new BufferedReader(new FileReader("perso1.txt"));
            BufferedReader br2 = new BufferedReader(new FileReader("perso2.txt"));
            while (nombre != null) {
                nombre = br1.readLine();
                if (nombre != null){
                    contador++;
                    nombres = Arrays.copyOf(nombres, contador);
                    nombres[contador-1] = nombre;
                }
            }
            br1.close();
            nombre = "";
            while (nombre != null) {
                nombre = br2.readLine();
                if (nombre != null){
                    contador++;
                    nombres = Arrays.copyOf(nombres, contador);
                    nombres[contador-1] = nombre;
                }
            }
            br2.close();
            Arrays.sort(nombres);
            BufferedWriter bw = new BufferedWriter(new FileWriter("perso3.txt",true));
            for (String s: nombres
                 ) {
                bw.write(s);
                bw.newLine();
            }
            bw.close();
        } catch (FileNotFoundException fileNotFoundException) {
            System.out.println(fileNotFoundException.toString());
        } catch (IOException ioException) {
            System.out.println("Hubo un error de lectura y/o escritura");
        }
    }
}
