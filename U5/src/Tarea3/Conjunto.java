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
        while (equals(num)){
            entA.setEnteroA();
            num = entA.getEnteroA();
        }
        tmp[getIndice()] = num;
        setIndice(getIndice()+1);
        setConjunto(tmp);
    }

    @Override
    public boolean equals(Object obj){
        Integer num = (Integer) obj;
        boolean repetido = false;
        for (Integer n: getConjunto()
        ) {
            repetido = Objects.equals(n, num);
            if (repetido){
                return repetido;
            }

        }
        return repetido;
    }

    public Integer [] quitarRepetidos (Integer [] conjunto){
        for (int i = 0; i < conjunto.length; i++) {
            for (int j = 0; j < conjunto.length; j++) {
                if (i != j) {
                    if (conjunto[i] == conjunto[j]){
                        eliminarNum(conjunto[i],conjunto);
                        setIndice(8);
                        conjunto = Arrays.copyOf(getConjunto(),getLargo()-1);
                        setConjunto(conjunto);
                    }
                }
            }
        }
        return conjunto;
    }
    public void insertarConj(Integer [] otroConjunto){
        Integer [] tmp = Arrays.copyOf(getConjunto(), getLargo());
        for (Integer n:otroConjunto) {
            if ( ! equals(n) ){
                if (getIndice() < getLargo()-1){
                } else {
                    if(tmp.length-1 < getIndice()){
                        tmp = Arrays.copyOf(tmp, tmp.length+1);
                    }
                }
                tmp[getIndice()] = n;
                setIndice(getIndice()+1);
            }
        }
       setConjunto(tmp);
       setConjunto(quitarRepetidos(getConjunto()));
    }

    public void eliminarNum ( Integer num, Integer [] conjunto){
        if ( (! equals(num)) || num == null) return;
        Integer indice = Arrays.binarySearch(conjunto,num);
        Integer [] tmp = new Integer[getLargo()];
        for (int i = 0; i < getLargo()-1; i++) {
            if (i < indice) {
                tmp[i] = conjunto[i];
            } else {
                tmp[i] = conjunto[i+1];
            }
        }
        setIndice(getIndice()-1);
        tmp[getIndice()] = null;
        setConjunto(tmp);
    }

    public void eliminarConjunto ( Integer [] otroConjunto){
        for (Integer n:otroConjunto
             ) {
            if (equals(n)){
                eliminarNum(n, otroConjunto);
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

    public void setConjunto(Integer[] conj) {
        this.conjunto = conj;
    }

    public Integer getLargo() {
        return getConjunto().length;
    }
}
