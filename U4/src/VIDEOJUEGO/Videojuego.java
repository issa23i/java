package VIDEOJUEGO;

import java.util.Calendar;

public class Videojuego {
    private Calendar horaInicio;
    private Personaje personaje;
    private Escenario escenario;
    private String ip;

    /*--------- CONSTRUCTOR ------------*/

    public Videojuego (Escenario scenne, String ip){
        this.horaInicio = Calendar.getInstance();
        this.personaje = new Personaje();
        this.escenario = scenne;
        this.ip = ip;
    }

    public Videojuego (Personaje person, Escenario scenne, String ip){
        this.horaInicio = Calendar.getInstance();
        this.personaje = person;
        this.escenario = scenne;
        this.ip = ip;
    }
    /*------------ MÉTODOS -----------------*/

    public void printEstadoPartida () {
        System.out.println("Hora de inicio: " + horaInicio.getTime());
        System.out.println("********** DATOS DEL PERSONAJE **********");
        getPersonaje().mostrarPersonaje();

    }

    /*------------- MÉTODOS GETTER AND SETTER -------------*/

    public Calendar getHoraInicio() {
        return horaInicio;
    }

    public void setHoraInicio(Calendar horaInicio) {
        this.horaInicio = horaInicio;
    }

    public Personaje getPersonaje() {
        return personaje;
    }

    public void setPersonaje(Personaje personaje) {
        this.personaje = personaje;
    }

    public Escenario getEscenario() {
        return escenario;
    }

    public void setEscenario(Escenario escenario) {
        this.escenario = escenario;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }
}
