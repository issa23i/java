package Tarea3;


import java.util.ArrayList;

public class ColaLista {
    private ArrayList<Integer> lista;
    private int largo;
    public ColaLista (){
        this.largo = 0;
        this.lista = new ArrayList<Integer>(largo);
    }

    public void anyadir(Integer entero){
        lista.add(entero);
        largo++;
    }
    public void imprimir(){
        System.out.println(lista.toString());
    }
    public ArrayList<Integer> getLista() {
        return lista;
    }

    public void setLista(ArrayList<Integer> lista) {
        this.lista = lista;
    }

    public int getLargo() {
        return this.largo;
    }

    public void setLargo(int largo) {
        this.largo = largo;
    }
}
