package VIDEOJUEGO;

import java.util.Arrays;

public class Escenario {
    private int pixAltura;
    private int pixLongitud;
    private int anillos;
    private int gemas;
    private Enemigo.tipoEnemigo[] tiposEnemigos;
    private Enemigo[] enemigos;


    /*---------- CONSTRUCTOR ------------*/

    public Escenario (){
        this.pixAltura = 100;
        this.pixLongitud = 100;
        this.anillos = 500;
        this.gemas = 2;
        this.enemigos = new Enemigo[10];
        this.tiposEnemigos = new Enemigo.tipoEnemigo[]{Enemigo.tipoEnemigo.BuzzBomber, Enemigo.tipoEnemigo.Coconut};
    }

    public Escenario (int altura, int longitud, int numAnillos, int numGemas, Enemigo.tipoEnemigo [] tipos, Enemigo [] enemigos) {
        this.pixAltura = altura;
        this.pixLongitud = longitud;
        this.anillos = numAnillos;
        this.gemas = numGemas;
        this.tiposEnemigos = tipos;
        this.enemigos = enemigos;
    }


    /*--------- MÉTODOS --------------*/
    public int getNumTipos() {
        return getTiposEnemigos().length;
    }

    public int getNumEnemigos () {
        return getEnemigos().length;
    }

    public Enemigo newEnemigo (){
        // obtener aleatoriamiente un índice para el array de tipos de Enemigos
        int tipoRandom = (int) (Math.random() * (getNumTipos() - 1 + 1) + 1);
        Enemigo.tipoEnemigo tipoEnemigo = getTiposEnemigos()[tipoRandom];
        // Nuevo enemigo
        Enemigo enemigo = new Enemigo(tipoEnemigo);
        return enemigo;
    }

    public void addEnemigo(Enemigo ene) {
        // Comprobar que el Array de enemigos no esté lleno
        if (getNumEnemigos() < 10 ){
            this.enemigos = Arrays.copyOf( getEnemigos(), getNumEnemigos() +1);
            getEnemigos()[getNumEnemigos()-1] = ene;
        }
    }

    public void deleteEnemigo (int indice) {
        Enemigo [] ene = getEnemigos();
        for (int i = 0; i < getNumEnemigos()-1; i++) {
            if(indice >= i) {
                ene[i] = getEnemigos()[i+1];
            }
        }
        setEnemigos(ene);
    }

    public int[] getInfoEscenario () {
        int [] estadoEscenario = {getPixAltura(), getPixLongitud(), getAnillos(), getGemas()};
        return estadoEscenario;
    }

    public void mostrarEscenario () {
        System.out.println("Altura (píxeles): " + getPixAltura());
        System.out.println("Longitud (pixeles): " + getPixLongitud());
        System.out.println("Número de anillos: " + getAnillos());
        System.out.println("Número de Gemas: " + getGemas());
        //tipos de enemigos
        System.out.println("Tipos de enemigos: ");
        for (int i = 0; i < getTiposEnemigos().length ; i++) {
            System.out.print(getTiposEnemigos()[i] + " ");
        }
        //lista enemigos
        System.out.println("Lista de enemigos: ");
        for (Enemigo e: getEnemigos()
             ) {
            System.out.print(e+ " ");
        }
    }

    /*--------- MÉTODOS GETTER AND SETTER --------*/

    public int getPixAltura() {
        return pixAltura;
    }

    public void setPixAltura(int pixAltura) {
        this.pixAltura = pixAltura;
    }

    public int getPixLongitud() {
        return pixLongitud;
    }

    public void setPixLongitud(int pixLongitud) {
        this.pixLongitud = pixLongitud;
    }

    public int getAnillos() {
        return anillos;
    }

    public void setAnillos(int anillos) {
        this.anillos = anillos;
    }

    public int getGemas() {
        return gemas;
    }

    public void setGemas(int gemas) {
        this.gemas = gemas;
    }

    public Enemigo.tipoEnemigo[] getTiposEnemigos() {
        return tiposEnemigos;
    }

    public void setTiposEnemigos(Enemigo.tipoEnemigo[] tiposEnemigos) {
        this.tiposEnemigos = tiposEnemigos;
    }

    public Enemigo[] getEnemigos() {
        return enemigos;
    }

    public void setEnemigos(Enemigo[] enemigos) {
        this.enemigos = enemigos;
    }
}