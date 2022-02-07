package Tarea1;

import java.util.Formatter;

public class Hora {
    private int hora;
    private int minuto;
    /* ---- CONSTRUCTOR ---- */
    public Hora (int hora, int minuto){
        setHora(hora);
        setMinuto(minuto);
    }
    /* ---- MÉTODOS ---- */
    public void inc(){
        // Incrementa la hora en un minuto
        setMinuto(getMinuto()+1);
    }

    @Override
    public String toString(){
        Formatter ftt = new Formatter();
        Formatter ftt2 = new Formatter();
        String cadena = String.valueOf(ftt.format("%02d", getHora()) + ":" + ftt2.format("%02d", getMinuto()));
        return cadena;
    }

    public int getHora() {
        return hora;
    }

    public void setHora(int hora) {
        if (hora>23){
            hora = hora%24;
        }
        this.hora = hora;
    }

    public int getMinuto() {
        return minuto;
    }

    public void setMinuto(int minuto) {
        if (minuto>59){
            minuto = minuto%60;
            setHora(getHora()+(minuto/60));
        }
        this.minuto = minuto;
    }
}
