// Actividad 15: Definir una clase ListaOrdenada,
// que hereda de LinkedList, que permita la inserción ordenada.
// Codificar un método que inserte un nuevo elemento con el prototipo:
//
// void insertarOrdenado( E elemento)
package Tarea2;

import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;
import java.util.TreeSet;

public class ListaOrdenada extends LinkedList {
    private LinkedList<Integer> listaOrdenada = new LinkedList<>();
    public ListaOrdenada (LinkedList<Integer> listaOrdenada) {
        this.listaOrdenada = listaOrdenada;
    }
    public void insertarOrdenado ( Integer entero){
        this.listaOrdenada.add(entero);
        Collections.sort(this.listaOrdenada);
    }
}
