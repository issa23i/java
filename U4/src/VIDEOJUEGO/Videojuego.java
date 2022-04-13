package VIDEOJUEGO;

import java.util.Calendar;

public class Videojuego {
    private Calendar horaInicio;
    private Personaje personaje;
    private Escenario escenario;
    private static String ip = "172.740.002";

    /*--------- CONSTRUCTOR ------------*/

    public Videojuego (){
        this.horaInicio = Calendar.getInstance();
        this.personaje = new Personaje();
        this.escenario = new Escenario();
    }

    public Videojuego (Personaje person, Escenario scenne){
        this.horaInicio = Calendar.getInstance();
        this.personaje = person;
        this.escenario = scenne;
    }
    /*------------ MÉTODOS -----------------*/

    public void printEstadoPartida () {
        System.out.println("********** HORA INICIO **********");
        System.out.println(horaInicio.getTime());
        System.out.println("********** DATOS DEL PERSONAJE **********");
        getPersonaje().mostrarPersonaje();
        System.out.println("********** DATOS DEL ESCENARIO **********");
        getEscenario().mostrarEscenario();
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
