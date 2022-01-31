package VIDEOJUEGO;

public class Main {
    public static void main(String[] args) {
        Personaje jugador1 = new Personaje(Personaje.tipoPersonaje.Tails, 10.2f,4,6);
        jugador1.mostrarPersonaje();
        Enemigo.tipoEnemigo [] tiposE = {Enemigo.tipoEnemigo.CrabMeat, Enemigo.tipoEnemigo.Coconut, Enemigo.tipoEnemigo.Chopper, Enemigo.tipoEnemigo.MotoBug};


        // crear dos partidas
        Videojuego partida1 = new Videojuego();

        Enemigo enemigo1 = partida1.getEscenario().newEnemigo();
        Enemigo enemigo2 = partida1.getEscenario().newEnemigo();
        Enemigo enemigo3 = partida1.getEscenario().newEnemigo();
        Enemigo enemigo4 = partida1.getEscenario().newEnemigo();
        Enemigo enemigo5 = partida1.getEscenario().newEnemigo();
        Enemigo [] enemigos = {enemigo1, enemigo2, enemigo3, enemigo4, enemigo5};
        Escenario escenario = new Escenario(800, 1920,62,4, tiposE, enemigos);

        Videojuego partida2 = new Videojuego(jugador1, escenario);
        partida2.printEstadoPartida();
        partida2.getEscenario().deleteEnemigo(3);
        partida2.printEstadoPartida();

    }
}
