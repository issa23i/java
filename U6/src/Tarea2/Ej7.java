// Escribir por teclado una frase y guardarla en un archivo binario.
// A continuación, recuperarla del archivo y mostrarla por pantalla.

package Tarea2;

import java.io.*;
import java.util.Scanner;

public class Ej7 {
    public static void main(String[] args)  {

        Scanner sc = new Scanner(System.in);
        String frase = "";
        String archivo = "frase.bin";
        System.out.println("Escriba una frase: ");
        frase = sc.nextLine();

        // escribir

        try (ObjectOutputStream  out = new ObjectOutputStream (new FileOutputStream(archivo))){
            out.writeObject(frase);
        } catch (FileNotFoundException fileNotFoundException) {
            System.out.println(fileNotFoundException.toString());
        } catch (IOException e) {
            // e.printStackTrace(); // esto que te pone el Intellij que es??
            System.out.println(e.toString());
        }

        // vaciar variable
        frase = "";
        // leer

        try (ObjectInputStream in = new ObjectInputStream( new FileInputStream(archivo))) {
            frase = (String) in.readObject();
        } catch (FileNotFoundException fileNotFoundException) {
            System.out.println(fileNotFoundException.toString());
        } catch (IOException e) {
            // e.printStackTrace(); // esto que te pone el Intellij que es??
            System.out.println(e.toString());
        } catch (ClassNotFoundException e) {
            System.out.println("clase no encontrada");
        }
        System.out.println(frase);
    }
}
