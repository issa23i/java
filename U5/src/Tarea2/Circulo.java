package Tarea2;

public class Circulo extends Figura{
    private Double area;
    private Double radio;
    /* ----- CONSTRUCTOR ------ */
    public Circulo(Double radio){
        this.radio = radio;
        this.area = getArea();
    }
    @Override
    public String toString(){
        return "Radio: " + this.getRadio() + ", Area: " + this.getArea() ;
    }
    @Override
    public Double getArea() {
        setArea(Math.pow(radio,2));
        return this.area;
    }
    /* ------- GETTER AND SETTER ---------- */

    public void setArea(Double area) {
        this.area = area;
    }

    public Double getRadio() {
        return radio;
    }

    public void setRadio(Double radio) {
        this.radio = radio;
    }

}
