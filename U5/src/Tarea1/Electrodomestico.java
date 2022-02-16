package Tarea1;

public class Electrodomestico {
    enum Colores {
        blanco,
        negro,
        rojo,
        azul,
        gris
    }
    enum ClasesEnergeticas {
        A,
        B,
        C,
        D,
        E,
        F
    }
    protected Integer precioBase;
    protected Colores color;
    protected ClasesEnergeticas claseEnergetica;
    protected Integer peso;

    /* ----- CONSTRUCTOR ---------- */

    public Electrodomestico () {
        this.precioBase = 100;
        this.color = Colores.blanco;
        this.claseEnergetica = ClasesEnergeticas.F;
        this.peso = 5;
    }
    public Electrodomestico ( int precio, int peso) {
        this.color = Colores.blanco;
        this.claseEnergetica = ClasesEnergeticas.F;
        this.precioBase = precio;
        this.peso = peso;
    }
    public Electrodomestico (int precio, Colores color, ClasesEnergeticas claseE, int peso){
        this.precioBase = precio;
        this.color = color;
        this.claseEnergetica = claseE;
        this.peso = peso;
    }

    /* -------- MÉTODOS ---------- */

    public int getPrecioFinal () {
        switch (getClaseEnergetica()){
            case A -> setPrecioBase(getPrecioBase()+100);
            case B -> setPrecioBase(getPrecioBase()+80);
            case C -> setPrecioBase(getPrecioBase()+60);
            case D -> setPrecioBase(getPrecioBase()+50);
            case E -> setPrecioBase(getPrecioBase()+30);
            case F -> setPrecioBase(getPrecioBase()+10);
        }
        if (getPeso()<30){
            setPrecioBase(getPrecioBase()+10);
        } else if ( getPeso() < 50) {
            setPrecioBase(getPrecioBase()+60);
        } else if ( getPeso() < 80 ) {
            setPrecioBase(getPrecioBase()+80);
        } else {
            setPrecioBase(getPrecioBase()+100);
        }
        return getPrecioBase();
    }

    @Override
    public String toString(){
        String s = " " + getColor() + ", " + getPeso() + ", " + getClaseEnergetica() + ", precio: " + getPrecioFinal();
        return s;
    }
    /* --------- GETTER AND SETTER ------- */

    public Integer getPrecioBase() {
        return precioBase;
    }

    public void setPrecioBase(Integer precioBase) {
        this.precioBase = precioBase;
    }

    public Colores getColor() {
        return color;
    }

    public void setColor(Colores color) {
        this.color = color;
    }

    public ClasesEnergeticas getClaseEnergetica() {
        return claseEnergetica;
    }

    public void setClaseEnergetica(ClasesEnergeticas claseEnergetica) {
        this.claseEnergetica = claseEnergetica;
    }

    public Integer getPeso() {
        return peso;
    }

    public void setPeso(Integer peso) {
        this.peso = peso;
    }
}
