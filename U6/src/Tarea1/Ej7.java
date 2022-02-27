// En LINUX disponemos de un comando "more", al que se le pasa un fichero
// y lo muestra poco a poco (cada 24 líneas).
// Implementar un programa que funcione de forma similar.

package Tarea1;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Ej7 {
    public static void main(String[] args) {
        String linea = "";
        String archivo = "more.txt";
        Integer contador = 0;
        Scanner sc = new Scanner(System.in);
        try {
            FileReader fr = new FileReader(archivo);
            BufferedReader br = new BufferedReader(fr);
            while(linea!=null && contador<24) {
                linea = br.readLine();
                if (linea!=null){
                    System.out.println(linea);
                    contador++;
                }
                if (contador >= 24){
                    System.out.println("pulse Intro para ver más registros...");
                    sc.nextLine();
                    System.out.println();
                    contador = 0;
                }
            }
        } catch (FileNotFoundException fileNotFoundException) {
            System.out.println("El archivo no se encuentra o no existe");
        } catch (IOException ioException) {
            ioException.printStackTrace();
            System.out.println("El archivo está vacío o no existe, no pudo ser leído");
        }
    }

}
