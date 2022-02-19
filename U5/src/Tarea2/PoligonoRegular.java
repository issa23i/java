package Tarea2;

public class PoligonoRegular extends Figura{
    private Double area;
    private Double altura;
    private Double base;
    private Double lados;
    /* ----- CONSTRUCTOR ---- */
    public PoligonoRegular(Double base, Double altura, Double lados){

    }

    /* ----- METHODS ----- */
    @Override
    public Double getArea() {
        setArea(getBase()*getAltura()/2*getLados());
        return this.area;
    }

    /* ----- GETTER AND SETTER ---- */

    public void setArea(Double area) {
        this.area = area;
    }

    public Double getAltura() {
        return altura;
    }

    public void setAltura(Double altura) {
        this.altura = altura;
    }

    public Double getBase() {
        return base;
    }

    public void setBase(Double base) {
        this.base = base;
    }

    public Double getLados() {
        return lados;
    }

    public void setLados(Double lados) {
        this.lados = lados;
    }
}
