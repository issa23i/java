package Tarea1;

import java.util.Arrays;

abstract public class Instrumento {

    enum notasEscala {
        DO,
        RE,
        MI,
        FA,
        SOL,
        LA,
        SI
    }
    private static final int MAX_NOTAS = 100;
    private String [] notas;
    /* ---- CONSTRUCTOR ---- */

    public Instrumento (String [] notas) {
        setNotas(notas);
    }

    /* ----- MÉTODOS ----- */

    public abstract void interpretar();

    public void add(String nota){
        String [] cpy = getNotas();
        if (getNotas().length < MAX_NOTAS) {
            cpy = Arrays.copyOf(getNotas(), getNotas().length+1);
            cpy[getNotas().length] = nota;
        }
        setNotas(cpy);
    }

    public String[] getNotas() {
        return notas;
    }

    public void setNotas(String[] notas) {
        this.notas = notas;
    }
}