package VIDEOJUEGO;

public class Personaje {
    enum tipoPersonaje {
        Sonic,
        Tails,
        Knuckles
    }
    private tipoPersonaje tipoP;
    private float velocidad;
    private int damagePunyo;
    private int damagePatada;

    /*--------- CONSTRUCTOR -------------*/
    public Personaje (){
        this.tipoP = tipoPersonaje.Sonic;
        this.velocidad = 100.0f;
        this.damagePunyo = 100;
        this.damagePatada = 200;
    }
    public Personaje (tipoPersonaje tip, float vel, int dPunyo, int dPatada){
        this.tipoP = tip;
        this.velocidad = vel;
        this.damagePunyo = dPunyo;
        this.damagePatada = dPatada;
    }
    /*----------- MÉTODOS ------------*/
    public void mostrarPersonaje () {
        System.out.println("Personaje: " + getTipo().toString());
        System.out.println("Velocidad: " + getVelocidad());
        System.out.println("Daño Puño: " + getDamagePunyo());
        System.out.println("Daño Patada: " + getDamagePatada());
    }

    /*----------- MÉTODOS GETTER AND SETTER ------------*/

    public tipoPersonaje getTipo() {
        return tipoP;
    }

    public void setTipo(tipoPersonaje tipo) {
        this.tipoP = tipo;
    }

    public float getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(float velocidad) {
        this.velocidad = velocidad;
    }

    public int getDamagePunyo() {
        return damagePunyo;
    }

    public void setDamagePunyo(int damagePunyo) {
        this.damagePunyo = damagePunyo;
    }

    public int getDamagePatada() {
        return damagePatada;
    }

    public void setDamagePatada(int damagePatada) {
        this.damagePatada = damagePatada;
    }
}
