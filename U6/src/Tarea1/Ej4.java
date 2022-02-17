///*
//Actividad4: Realizar un programa que lea un fichero de texto llamado carta.txt,
//tenemos que contar los caracteres, las líneas y las palabras.
//Para facilitar el procesamiento supondremos que cada palabra está separada de otra
// por un único espacio en blanco.
// */
package Tarea1;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Ej4 {
    public static void main(String[] args) {
        String fichero = "carta.txt";
        int lineas = 0;
        int caracteres = 0;
        int palabras = 0;
        try{
            BufferedReader br = new BufferedReader(new FileReader(fichero));
            String txt = "";
            String linea = br.readLine();
            while (linea != null) {
                txt += linea;
                for (char c : linea.toCharArray()) {
                    if (Character.isWhitespace(c)) {
                        palabras++;
                    } else {
                        caracteres++;
                    }
                }
                lineas++;
                linea = br.readLine();
            }
        } catch (IOException ioException) {
            System.out.println("No se pudo leer el fichero");
        }
        System.out.println("Caracteres : " + caracteres + " palabras : " + palabras + " lineas : " + lineas);
    }
}
