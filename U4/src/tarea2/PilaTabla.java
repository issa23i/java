package tarea2;

import java.util.Arrays;

public class PilaTabla {
    Integer [] pila;

    /*------------- CONSTRUCTOR ------------------*/

    PilaTabla (Integer [] pila) {this.pila = pila;}


    /*------------- METODOS ---------------------*/

    public Integer[] apilar(int numero){
        // APILAR
        Integer [] resultado;
        resultado = Arrays.copyOf(getPila(), getPila().length + 1);
        resultado[getPila().length]=numero;
        return resultado;
    }

    public Integer [] desapilar (){
        // DESAPILAR
        Integer [] resultado;
        resultado = Arrays.copyOf(getPila(), getPila().length-1);
        return resultado;
    }

    // CIMA
    public Integer cima (){
        Integer resultado = getPila()[getPila().length-1];
        return resultado;
    }

    /*------------ GETTER AND SETTER --------------*/
    public Integer[] getPila() {
        return pila;
    }

    public void setPila(Integer[] pila) {
        this.pila = pila;
    }


}
