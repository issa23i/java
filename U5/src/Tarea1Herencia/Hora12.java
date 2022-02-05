package Tarea1Herencia;

import java.util.Formatter;

public class Hora12 extends Hora {
    enum franjas {
        am,
        pm
    }
    private franjas franja;
    /* ---- CONSTRUCTOR ----- */
    public Hora12 (int hora, int minutos, franjas franjaHoraria){
        super(hora,minutos);
        this.franja = franjaHoraria;
    }
    /* ---- MÉTODOS ----- */

    @Override
    public void setHora(int hora) {
        super.setHora(hora);
        int h = super.getHora();
        if (h > 12){
            setFranja(franjas.pm);
            super.setHora(h%12);
        } else {
            setFranja(franjas.am);
        }
    }

    @Override
    public String toString(){
        Formatter ftt = new Formatter();
        Formatter ftt2 = new Formatter();
        String cadena = ftt.format("%02d", getHora())  + ":" + ftt2.format("%02d", getMinuto()) + " " + franja;
        return cadena;
    }

    public franjas getFranja() {
        return franja;
    }

    public void setFranja(franjas franja) {
        this.franja = franja;
    }
}
