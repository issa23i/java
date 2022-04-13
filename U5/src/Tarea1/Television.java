package Tarea1;

public class Television extends Electrodomestico{
    private Integer resolucion;
    private boolean tdt;

    /* -------- CONSTRUCTOR ----------- */
    public Television (){
        super();
        this.resolucion = 20;
        this.tdt = false;
    }
    public Television (Integer precio, Integer peso) {
        super(precio, peso);
        this.resolucion = 20;
        this.tdt = false;
    }
    public Television(Integer resolucion, boolean tdt){
        super();
        this.resolucion = resolucion;
        this.tdt = tdt;
    }
    /* -------- MÉTODOS ---------- */

    @Override
    public int getPrecioFinal(){
        int total = super.getPrecioFinal();
        if (resolucion > 40){
            total = (int)(Math.round(total + (total * 0.30)));
        }
        if (tdt){
            total = total + 50;
        }
        return total;
    }

    @Override
    public String toString (){
        String s = super.toString() + ", " + getResolucion() + ", " + getResolucion();
        return s;
    }

    /* --------- GETTER AND SETTER ------------ */

    public Integer getResolucion() {
        return resolucion;
    }

    public void setResolucion(Integer resolucion) {
        this.resolucion = resolucion;
    }

    public boolean isTdt() {
        return tdt;
    }

    public void setTdt(boolean tdt) {
        this.tdt = tdt;
    }
}
