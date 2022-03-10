package Tarea1;

import java.util.ArrayList;

public class Ejec1 implements Comparable<Ejec1> {

    private Integer enteroAleatorio;
    private Integer menorque;

    public Ejec1() {
        this.menorque = 99;
        this.enteroAleatorio = (int) (Math.random()*menorque);
    }
    public Ejec1 (Integer menorque) {
        this.menorque = menorque;
        this.enteroAleatorio = (int) (Math.random()*menorque);
    }

    public Integer getEnteroAleatorio() {
        return enteroAleatorio;
    }

    @Override
    public String toString(){
        return this.enteroAleatorio.toString();
    }


    public static void main(String[] args) {
        int capacidadInicial = 20;
        ArrayList<Ejec1> numMenorde100 = new ArrayList<>(capacidadInicial);
        for (int i = 0; i < capacidadInicial; i++) {
            Ejec1 num = new Ejec1();
            numMenorde100.add(num);
            System.out.println(num.toString());
        }
    }

    @Override
    public int compareTo(Ejec1 o) {
        return this.getEnteroAleatorio()-o.getEnteroAleatorio();
    }
}
