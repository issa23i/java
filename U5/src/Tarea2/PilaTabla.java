package Tarea2;

import java.util.Arrays;

public class PilaTabla implements Pila{
    private Integer[] numeros;
    private int cima;

    /* ----- CONSTRUCTOR --------- */
    public PilaTabla (){
        this.numeros = new Integer[10];
        cima = -1;
    }

    /* -------- MÉTODOS ---------- */


    /* -------- GETTER AND SETTER ------- */

    public Integer[] getNumeros() {
        return numeros;
    }

    public void setNumeros(Integer[] numeros) {
        this.numeros = numeros;
    }

    public int getCima() {
        return cima;
    }

    public void setCima(int cima) {
        this.cima = cima;
    }

    @Override
    public void Apilar(Integer num) {
        if (cima+1 >= getNumeros().length){
            setNumeros(Arrays.copyOf(getNumeros(),getNumeros().length+10));
        }
        setCima(getCima()+1);
        getNumeros()[getCima()] = num;
    }

    @Override
    public Integer Desapilar() {
        if(getCima()<=-1){
            return null;
        }
        Integer r = getNumeros()[getCima()];
        getNumeros()[getCima()] = null;
        setCima(getCima()-1);
        return r;
   }

   @Override
    public String toString(){
        String s = "";
       for (Integer n: getNumeros()
            ) {
           s = s + n + " ";
       }
       return s;
   }
}
