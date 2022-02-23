package Tarea3;

import java.util.Arrays;

public class ColaLista extends ColaTabla{
    private Integer [] lista;
    private int largo;
    private Integer [] cola;
    private Integer enteroAleatorio, primero, ultimo;
    public ColaLista (){
        super();
        this.largo = 0;
        this.lista = new Integer[getLargo()];
    }

    public void anyadir(Integer entero){
        Integer [] l = Arrays.copyOf(lista, getLargo()+1);
        l[getLargo()] = entero;
        this.largo++;
    }

    @Override
    public Integer desencolar() {
        Integer resultado = getCola()[0];
        Integer [] temp = new Integer[getLenght()-1];
        for (int i = 0; i < getLenght()-1; i++) {
            temp[i] = getCola()[i+1];
        }
        setCola(temp);
        anyadir(resultado);
        return resultado;
    }
    public void imprimir(){
        System.out.println(lista.toString());
    }

    public int getLargo() {
        return this.largo;
    }

    public void setLargo(int largo) {
        this.largo = largo;
    }

    public Integer[] getLista() {
        return lista;
    }

    public void setLista(Integer[] lista) {
        this.lista = lista;
    }
}
