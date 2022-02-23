package Tarea3;

import java.util.Arrays;
import java.util.Objects;

public class Conjunto {
    private Integer [] conjunto;
    private Integer largo;
    private Integer indice;

    /* ---- CONSTRUCTOR ------ */

    public Conjunto(){
        this.indice = 0;
        this.largo = 10;
        this.conjunto = new Integer[largo];

    }
    public Conjunto(Integer largo){
        this.indice = 0;
        this.largo = largo;
        this.conjunto = new Integer[largo];
    }

    /* ---- MÉTODOS ---- */

    public void insertarNum(){
        EnteroAleatorio entA = new EnteroAleatorio();
        Integer num = entA.getEnteroA();
        Integer [] tmp;
        if (getIndice() < getLargo()-1){
            tmp = Arrays.copyOf(getConjunto(), getLargo());
        } else {
            tmp = Arrays.copyOf(getConjunto(), getLargo()+1);
        }
        while (repetido(num)){
            entA.setEnteroA();
            num = entA.getEnteroA();
        }
        tmp[getIndice()] = num;
        setIndice(getIndice()+1);
        setConjunto(tmp);
    }

    public Boolean repetido(Integer num){
        boolean repetido = false;
        for (Integer n: getConjunto()
             ) {
            repetido = Objects.equals(n, num);
        }
        return repetido;
    }

    public void insertarConj(Integer [] otroConjunto){
        Integer [] tmp = Arrays.copyOf(getConjunto(), getLargo());;

        for (Integer n:otroConjunto) {
            if ( ! repetido(n) ){
                if (getIndice() < getLargo()-1){
                } else {
                    tmp = Arrays.copyOf(tmp, tmp.length+1);
                }
                tmp[getIndice()] = n;
                setIndice(getIndice()+1);
            }
        }
        setConjunto(tmp);
    }

    public void eliminarNum ( Integer num){
        if ( ! repetido(num)) return;
        Integer indice = Arrays.binarySearch(getConjunto(),num);
        Integer [] tmp = new Integer[getLargo()];
        for (int i = 0; i < getLargo()-1; i++) {
            if (i < indice) {
                tmp[i] = getConjunto()[i];
            } else {
                tmp[i] = getConjunto()[i+1];
            }
        }
        setIndice(getIndice()-1);
        tmp[getIndice()] = null;
        setConjunto(tmp);
    }

    public void eliminarConjunto ( Integer [] otroConjunto){
        for (Integer n:otroConjunto
             ) {
            if (repetido(n)){
                eliminarNum(n);
            }
        }
    }

    @Override
    public String toString(){
        String s = "";
        for (Integer n:getConjunto()
             ) {
            s += n + " ";
        }
        s += "\n";
        return s;
    }
    /* ---- GETTER AND SETTER --------- */

    public Integer getIndice() {
        return indice;
    }

    public void setIndice(Integer indice) {
        this.indice = indice;
    }

    public Integer[] getConjunto() {
        return this.conjunto;
    }

    public void setConjunto(Integer[] conjunto) {
        this.conjunto = conjunto;
    }

    public Integer getLargo() {
        return getConjunto().length;
    }

    public void setLargo(Integer largo) {
        this.largo = largo;
    }
}
