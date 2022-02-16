package Tarea1;

public class Lavadora extends Electrodomestico implements Comparable {
    private int carga;

    /* ---- CONSTRUCTOR ----- */
    public Lavadora () {
        super();
        this.carga = 5;
    }
    public Lavadora (int precio, int peso) {
        super(precio,peso);
        this.carga = 5;
    }
    public Lavadora (int carga){
        super();
        this.carga = carga;
    }
    /* ----- MÉTODOS ----- */
    @Override
    public int compareTo(Object o) {
        if ( !(o instanceof Lavadora)) return 0;
        Lavadora that = (Lavadora) o;
        return getCarga() - that.getCarga();
    }

    @Override
    public int getPrecioFinal() {
        super.getPrecioFinal();
        if(getCarga()>50){
            super.setPrecioBase(super.getPrecioBase()+50);
        }
        return super.getPrecioFinal();
    }

    public String toString(){
        String s = super.toString() + ", " + getCarga();
        return s;
    }


    /* ------ GETTER AND SETTER ---- */

    public int getCarga() {
        return carga;
    }

    public void setCarga(int carga) {
        this.carga = carga;
    }


}

