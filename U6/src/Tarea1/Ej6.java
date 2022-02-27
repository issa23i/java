// Un libro de firmas es útil para recoger todas las personas que han pasado por un determinado lugar.
// Crear una aplicación que permita mostrar el libro de firmas o insertar un nuevo nombre
// (comprobando que no se encuentre repetido). Llamaremos al fichero firmas.txt.
package Tarea1;

import java.io.*;
import java.util.Arrays;
import java.util.Scanner;

public class Ej6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nombreFichero = "firmas.txt";
        String [] firmas = new String[0];
        String firma = "";
        Integer contador = 0;
        try {
            BufferedWriter bw = new BufferedWriter(new FileWriter(nombreFichero,true));
            System.out.println("Firme aquí: ");
            firma = sc.nextLine();
            bw.newLine();
            bw.write(firma);
            bw.close();
            BufferedReader br = new BufferedReader(new FileReader(nombreFichero));
            while (firma!=null){
                firma = br.readLine();
                if (firma!=null) {
                    contador++;
                    firmas = Arrays.copyOf(firmas, contador);
                    firmas[contador-1] = firma;
                }
            }
            br.close();
        } catch (IOException ioException){
            System.out.println("No se pudo acceder al fichero " + nombreFichero);
        }
        for (String s:firmas
             ) {
            System.out.println(s);
        }

    }
}
