package Tarea1Herencia;

public class Hora {
    private int hora;
    private int minuto;
    /* ---- CONSTRUCTOR ---- */
    public Hora (int hora, int minuto){
        this.hora = hora;
        this.minuto = minuto;
    }
    /* ---- MÉTODOS ---- */
    public void inc(){
        // Incrementa la hora en un minuto
        setMinuto(getMinuto()+1);
    }

    @Override
    public String toString(){
        String cadena = getHora() + ":" + getMinuto();
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
