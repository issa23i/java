package Tarea1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;

public class Ejec4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String frase;
        System.out.println("Inserte una frase: ");
        frase = sc.nextLine();
        ArrayList<String> palabras = new ArrayList<>();
        int indexFinPalabra = 0;
        while (indexFinPalabra >= 0){
            String palabra;
            indexFinPalabra =  frase.indexOf(" ");
            if (indexFinPalabra < 0 ){
                palabra = frase;
            } else {
                palabra = frase.substring(0,indexFinPalabra);
            }
            int largo = frase.length();
            frase = frase.substring(indexFinPalabra +1 , largo );
            System.out.println(palabra);
            palabras.add(palabra);
        }
        Iterator<String> it = palabras.iterator();
        while (it.hasNext()) {
            String next =  it.next();
            System.out.print ( next + "    ");
        }

    }


}
