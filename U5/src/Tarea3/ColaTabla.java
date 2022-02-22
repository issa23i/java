package Tarea3;

import java.util.Arrays;

public class ColaTabla extends EnteroAleatorio {
    private Integer [] cola;
    private Integer enteroAleatorio, primero, ultimo;
    private ColaLista cl;
    public ColaTabla () {
        super();
        this.enteroAleatorio = getEnteroAleatorio();
        this.cola = super.setEnterosA();
        this.primero = getPrimero();
        this.ultimo = getUltimo();
        this.cl = new ColaLista();
    }

    public void Encolar (){
        Integer [] temp = Arrays.copyOf(this.getCola(), this.getLenght() + 1);
        Integer tp = super.setEnteroA();
        temp[this.getLenght()] = tp;
        this.setCola(temp);
        cl.anyadir(tp);
    }

    public void Desencolar (){
        Integer [] temp = new Integer[getLenght()-1];
        for (int i = 0; i < getLenght()-1; i++) {
            temp[i] = getCola()[i+1];
        }
        setCola(temp);
    }

    public void printColaLista(){
        cl.imprimir();
    }
    public int getLenght(){
        return getCola().length;
    }

    public Integer[] getCola() {
        return this.cola;
    }

    public void setCola(Integer[] cola) {
        this.cola = cola;
    }

    public Integer getEnteroAleatorio() {
        return super.getEnteroA();
    }

    public void setEnteroAleatorio(Integer enteroAleatorio) {
        this.enteroAleatorio = enteroAleatorio;
    }

    public Integer getPrimero() {
        return cola[0];
    }

    public void setPrimero(Integer primero) {
        this.primero = primero;
    }

    public Integer getUltimo() {
        return cola[getLONGITUDTABLA()-1];
    }

    public void setUltimo(Integer ultimo) {
        this.ultimo = ultimo;
    }
    @Override
    public String toString(){
        String s = "";
        for (Integer ent: this.getCola()
        ) {
            s += ent + " ";
        }
        return s;
    }
}
