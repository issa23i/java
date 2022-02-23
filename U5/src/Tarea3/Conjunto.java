package Tarea3;

import java.util.Arrays;
import java.util.Objects;

public class Conjunto {
    private Integer [] conjunto;
    private Integer largo;

    /* ---- CONSTRUCTOR ------ */

    public Conjunto(){
        this.largo = 10; // ¿en qué momento se almacena esta variable? al declararla??, o al construir el objeto???
        this.conjunto = new Integer[this.largo]; // ¿puedo utilizar aguí en vez de this.largo , getLargo()???
        // qué sería más correcto semánticamente?
    }
    public Conjunto(Integer largo){
        this.largo = largo;
        this.conjunto = new Integer[this.largo];
    }

    /* ---- MÉTODOS ---- */

    public void insertarNum(){
        EnteroAleatorio entA = new EnteroAleatorio();
        Integer num = entA.getEnteroA(); // si esta variable cambia, por ejemplo con setEnteroA(), la próxima ocurrencia de num lo tendrá en cuenta?
        // setEnteroA();
        // la variable num ha cambiado ???? o es necesario num = entA.getEnteroA()??
        setLargo(getLargo()+1);
        Integer [] tmp = Arrays.copyOf(getConjunto(), getLargo());
        while (repetido(num)){
            entA.setEnteroA();
            num = entA.getEnteroA(); // es necesaria esta sentencia?? o con la anterior ya cambia num???
        }
        tmp[getLargo()-1] = num;
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
        Integer [] tmp = Arrays.copyOf(getConjunto(),getLargo());  // estudiar Arrays.compare
        for (Integer n:otroConjunto
             ) {
            if ( ! repetido(n) ){
                setLargo(getLargo()+1);
                tmp = Arrays.copyOf(getConjunto(), getLargo());
                tmp[getLargo()-1] = n;
            }
        }
    }

    public void eliminarNum ( Integer num){
        if ( ! repetido(num)) return; // es correcto semánticamente??
        Integer indice = Arrays.binarySearch(getConjunto(),num);
        Integer [] tmp = Arrays.copyOf(getConjunto(),getLargo());
        for (int i = 0; i < getLargo(); i++) {
            if (i < indice) {
                tmp[i] = getConjunto()[i];
            } else {
                tmp[i] = getConjunto()[i+1]
            }
        }
    }
    /* ---- GETTER AND SETTER --------- */

    public Integer[] getConjunto() {
        return conjunto;
    }

    public void setConjunto(Integer[] conjunto) {
        this.conjunto = conjunto;
    }

    public Integer getLargo() {
        return largo;
    }

    public void setLargo(Integer largo) {
        this.largo = largo;
    }
}
