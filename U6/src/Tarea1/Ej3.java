//Actividad3: Crear un programa que duplique el conenido de un fichero. Realizar dos versiones:
//Duplicaremos el fichero original.txt en uno que se llame copia.txt
//Pedir el nombre del fichero fuente y duplicarlo en un fichero
// con el mismo nombre con el prefijo "copia_de".


package Tarea1;

import java.io.*;
import java.util.Scanner;

public class Ej3 {
    public static void main(String[] args) {
        duplicarFichero("original.txt");
    }
    public static void duplicarFichero (String ficheroFuente) {
        Scanner sc = new Scanner(System.in);
        try {
            BufferedReader br = new BufferedReader(new FileReader(ficheroFuente));
            String texto = "";
            String sigLinea = br.readLine();
            while (sigLinea != null) {
                texto += sigLinea;
                sigLinea = br.readLine();
            }
            br.close();
            String destino = "copia_de_" + ficheroFuente;
            BufferedWriter bw = new BufferedWriter(new FileWriter(destino, false));
            bw.write(texto);
            bw.write(texto);
            bw.close();
        } catch (IOException ioex) {
            System.out.println("No se pudo completar el proceso");
        }
    }
}
