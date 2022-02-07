package Tarea1;

public class Caja {
    enum Unidades {
        cm,
        m
    }
    private double ancho;
    private double alto;
    private double fondo;
    private String etiqueta;
    private Unidades u;

    /* --- CONSTRUCTOR --- */
    public Caja(double ancho, double alto, double fondo, Unidades u){
        setAncho(ancho);
        setAlto(alto);
        setFondo(fondo);
        setU(u);
    }

    /* ---- MÉTODOS --- */

    @Override
    public String toString(){
        String resultado;
        if (getEtiqueta()== null){
            resultado = getAncho() + ", " + getAlto() + ", " + getFondo() + ", " + getU();
        } else {
            resultado = getAncho() + ", " + getAlto() + ", " + getFondo() + ", " + getU() + " - " + getEtiqueta();
        }
        return resultado;
    }

    public double getVolumen (){
        double m3;
        if(u==Unidades.cm){
            m3 = (getAlto()*getAncho()*getFondo())/100;
        } else {
            m3 = getAlto()*getAncho()*getFondo();
        }
        return m3;
    }

    public double getAncho() {
        return ancho;
    }

    public void setAncho(double ancho) {
        this.ancho = ancho;
    }

    public double getAlto() {
        return alto;
    }

    public void setAlto(double alto) {
        this.alto = alto;
    }

    public double getFondo() {
        return fondo;
    }

    public void setFondo(double fondo) {
        this.fondo = fondo;
    }

    public String getEtiqueta() {
        return etiqueta;
    }

    public void setEtiqueta(String etiqueta) {
        this.etiqueta = etiqueta;
    }

    public Unidades getU() {
        return u;
    }

    public void setU(Unidades u) {
        this.u = u;
    }
}
