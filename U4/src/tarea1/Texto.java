package tarea1;

import java.util.Arrays;

public class Texto {
    private int longitud;
    private String cadena;

    /*---------- CONSTRUCTOR -------------*/
    Texto (int largo, String frase) {
        this.longitud = largo;
        this.cadena = frase;
    }
    /*---------- MÉTODOS -------------*/

    public void addCaracterFinal(char a){
        // Permite añadir un carácter al final,
        // siempre y cuando exista espacio disponible
        StringBuilder sb = new StringBuilder(this.cadena);
        if (this.cadena.length() < this.longitud ) {
            sb.append(a);
        }
        this.cadena = sb.toString();
    }

    public void addCaracterPrincipio(char a){
        // Permite añadir un carácter al principio,
        // siempre y cuando exista espacio disponible
        StringBuilder sb = new StringBuilder();
        if (this.cadena.length() < this.longitud ) {
            sb.append(a);
            for (int i = 0; i < this.cadena.length(); i++) {
                sb.append(this.cadena.charAt(i));
            }
        }
        this.cadena = sb.toString();
    }

    public void addStringPrincipio (String s){
        if(s.length() + this.cadena.length() <= this.longitud){
            StringBuilder sb = new StringBuilder();
            if (this.cadena.length() < this.longitud ) {
                sb.append(s);
                for (int i = 0; i < this.cadena.length(); i++) {
                    sb.append(this.cadena.charAt(i));
                }
            }
            this.cadena = sb.toString();
        }
    }

    public void addStringFinal ( String s ) {
        if(s.length() + this.cadena.length() <= this.longitud){
            StringBuilder sb = new StringBuilder(this.cadena);
            if (this.cadena.length() < this.longitud ) {
                sb.append(s);
            }
            this.cadena = sb.toString();
        }
    }

    public int contarVocalesMayusculas (){
        int resultado = 0;
        String vocalesMayusculas = "AEIOUÁÉÍÓÚ";
        Character c = ' ';
        for (int i = 0; i < this.cadena.length(); i++) {
            c = this.cadena.charAt(i);
            for (int j = 0; j < vocalesMayusculas.length(); j++) {
                if (c.equals(vocalesMayusculas.charAt(j))) {
                    resultado ++;
                }
            }
        }
        return resultado;
    }

    public int contarVocalesMinusculas (){
        int resultado = 0;
        String vocalesMinusculas = "aeiouáéíóú";
        Character c = ' ';
        for (int i = 0; i < this.cadena.length(); i++) {
            c = this.cadena.charAt(i);
            for (int j = 0; j < vocalesMinusculas.length(); j++) {
                if (c.equals(vocalesMinusculas.charAt(j))) {
                    resultado ++;
                }
            }
        }
        return resultado;
    }

    public int getLongitud() {
        return longitud;
    }

    public void setLongitud(int longitud) {
        this.longitud = longitud;
    }

    public String getCadena() {
        return cadena;
    }

    public void setCadena(String cadena) {
        this.cadena = cadena;
    }
}
