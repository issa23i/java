package Tarea3b;

import java.io.*;
import java.util.*;

public class Traductor {

    private HashMap<String, String> diccionario;
    private String archivo, palabra, frase;

    /* ----- CONSTRUCTOR ------ */

    public Traductor ( String archivo) {
        this.diccionario = new HashMap<>();
        this.archivo = archivo;
        try {
            BufferedReader in = new BufferedReader( new FileReader(archivo));
            String linea = in.readLine();
            while (linea != null) {
                String clave = linea.split(",")[0];
                String valor = linea.split(",")[1];
                diccionario.put(clave,valor);
                linea = in.readLine();
            }
            in.close();
        } catch (FileNotFoundException e) {
            System.out.println("No se ha encontrado el archivo " + archivo);
        } catch (IOException e) {
            System.out.println("El archivo " + archivo + " no pudo ser leído.");
        }

    }

    /* ----- MÉTODOS ----- */

    public HashMap<String, String> traducir () {
        HashMap<String, String> traducido = new HashMap<>();
        String [] palabras = leerFrase();
        for (String s : palabras
             ) {
            traducido.put(s, diccionario.get(s));
        }
        return traducido;
    }

    private String traducirPalabra (String palabra) {
        return diccionario.get(palabra);
    }

    private String [] leerFrase ( ){
        String [] palabras ;
        String frase = "";
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca una frase o palabra a traducir: ");
        frase = sc.nextLine();
        palabras = separarPalabras(frase);
        return palabras;
    }

    private String [] separarPalabras (String frase ) {
        String [] palabras = frase.split(" ");
        if ( frase.isBlank()) {
            palabras = null;
        }
        return palabras;
    }

    /* ----- GETTER AND SETTER ----- */

    public HashMap<String, String> getDiccionario() {
        return diccionario;
    }

    public void setDiccionario(HashMap<String, String> diccionario) {
        this.diccionario = diccionario;
    }

    public String getArchivo() {
        return archivo;
    }

    public void setArchivo(String archivo) {
        this.archivo = archivo;
    }

    public String getFrase() {
        return frase;
    }

    public void setFrase(String frase) {
        this.frase = frase;
    }
}
