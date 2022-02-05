package Tarea1Herencia;

import java.util.Formatter;

public class HoraExacta extends Hora {
private int segundos;

/* ----- CONSTRUCTOR ----- */
    public HoraExacta( int hora, int minutos, int segundos){
        super(hora,minutos);
        setSegundos(segundos);
    }

    /* ----- MÉTODOS ----- */

    @Override
    public void inc(){
        setSegundos(getSegundos()+1);
    }

    @Override
    public String toString(){
        Formatter ftt = new Formatter();
        String cadena = super.toString() + ":" +ftt.format("%02d", getSegundos());
        return cadena;
    }

    public int getSegundos() {
        return segundos;
    }

    public void setSegundos(int segundos) {
        if(segundos > 59) {
            super.inc();
            segundos = segundos%60;
        }
        this.segundos = segundos;
    }
}
