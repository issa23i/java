package VIDEOJUEGO;

public class Enemigo {
    enum tipoEnemigo {
        BuzzBomber,
        CrabMeat,
        Coconut,
        Chopper,
        MotoBug
    }
    private tipoEnemigo tipoE;
    private int vida;
    private int damage;

    /*----------- CONSTRUCTOR ---------------*/
    public Enemigo (tipoEnemigo tip){
        this.vida = 100;
        this.damage = 70;
    }
    public Enemigo (tipoEnemigo tip, int life, int damg) {
        this.tipoE = tip;
        this.vida = life;
        this.damage = damg;
    }
    /*-------------- MÉTODOS --------------*/

    public void restarVida ( int ataquePersonaje) {
        if (getVida() - ataquePersonaje < 0){
            setVida(0);
        } else {
            setVida(getVida() - ataquePersonaje);
        }
    }

    public int[] getEstado () {
        int[] estado = {getVida(), getDamage()};
        return estado;
    }

//    public tipoEnemigo enemigotipoRandom(){
//        int intRandom = (int) (Math.random() * (tipoEnemigo.values().length) + 1);
//        setTipoE(tipoEnemigo.values()[intRandom]);
//        return getTipoE();
//    }
    /*-------- MÉTODOS GETTER AND SETTER -------*/

    public tipoEnemigo getTipoE() {
        return tipoE;
    }

    public void setTipoE(tipoEnemigo tipoE) {
        this.tipoE = tipoE;
    }

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }
}
