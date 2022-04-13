// Crea una clase llamada Traductor, que contenga un atributo llamado "diccionario"
// de tipo HashMap y se comporte de esta forma:
//
//Al crear el objeto Traductor, el atributo diccionario debe ser cargado con la información
// de un archivo de texto cuyo nombre se le pasará por parámetro al constructor.
// Este archivo debe contener varias palabras en español y su traducción al inglés,
// de tal forma que las palabras en español sean la clave, y las que estén en inglés, el valor.
// Por ejemplo:
//
//hola, hello
//
//mundo, world
//
//gracias, thanks
//
//adios, bye
//
//Crear un método que reciba una palabra o una frase, y devuelva la cadena traducida al inglés.

package Tarea3b;

import java.io.*;
import java.util.HashMap;

public class Ej4 {
    public static void main(String[] args) {
        // crear archivo binario traductor
        String archivo = "traslate.txt";
        try {
            BufferedWriter out = new BufferedWriter(new FileWriter(archivo));
            out.write("Hola, Hello");
            out.newLine();
            out.write("mundo, world");
            out.newLine();
            out.write("gracias, thanks");
            out.newLine();
            out.write("adiós, bye");
            out.close();
        } catch (FileNotFoundException e) {
            System.out.println("Archivo " + archivo + " no encontrado.");
        } catch (IOException e) {
            System.out.println("No se pudo escribir en el archivo " + archivo);
        }
        Traductor traduceme = new Traductor(archivo);
        System.out.println(traduceme.traducir());
    }
}
