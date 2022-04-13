package Tarea1;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Ej1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca un nombre de archivo: ");
        String file = sc.nextLine();
        if (file.isEmpty()){
            file = "prueba.txt";
        }
        try {
            BufferedReader br = new BufferedReader(new FileReader(file));
            String texto = "";
            String sigLinea = br.readLine();
            while (sigLinea != null){
                texto += sigLinea;
                sigLinea = br.readLine();
            }
            br.close();
            System.out.println(texto);
        } catch (IOException ioEx) {
            System.out.println("No se pudo leer el archivo");
        }
    }
}
