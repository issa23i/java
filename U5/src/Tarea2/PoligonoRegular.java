package Tarea2;

public class PoligonoRegular extends Figura implements Comparable{
    public enum Colores {
        Azul,
        Verde,
        Rojo,
        Amarillo
    }
    public Colores color;
    private Double area;
    private Double altura;
    private Double base;
    private Double lados;
    private int contadorPoligonos;
    /* ----- CONSTRUCTOR ---- */
    public PoligonoRegular(Double base, Double altura, Double lados, Colores color){
        setBase(base);
        setAltura(altura);
        setLados(lados);
        setColor(color);
        this.area = getArea();
        setContadorPoligonos();
    }
    public PoligonoRegular(){
        this.base = 10.0;
        this.altura = 10.0;
        this.lados = 10.0;
        this.color = Colores.Azul;
        setContadorPoligonos();
    }
    /* ----- METHODS ----- */
    @Override
    public String toString(){
        return "Longitud del lado: " + this.getBase()+ ", Apotema: " + this.getAltura() +
                ", Lados: " + this.getLados() + ", Area: " + this.getArea() + ", Color: " +
                this.getColor();
    }
    @Override
    public int compareTo(Object o) {
        if ( !(o instanceof PoligonoRegular) ) return 0;
        return this.getLados().intValue() -(((PoligonoRegular) o).getLados()).intValue();
    }
    @Override
    public Double getArea() {
        setArea(this.getBase()*this.getAltura()/2*this.getLados());
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
        if (this instanceof Triangulo) return ((Triangulo) this).LADOSTRIANGULO;
        if (this instanceof Cuadrado) return ((Cuadrado) this).LADOSCUADRADO;
        return lados;
    }

    public Colores getColor() {
        return color;
    }

    public void setColor(Colores color) {
        this.color = color;
    }

    public void setLados(Double lados) {
        if (this instanceof Triangulo) {
            this.lados = ((Triangulo) this).LADOSTRIANGULO;
        } else if (this instanceof Cuadrado) {
            this.lados = ((Cuadrado) this).LADOSCUADRADO;
        } else {
            this.lados = lados;
        }
    }

    public int getContadorPoligonos() {
        return contadorPoligonos;
    }

    public void setContadorPoligonos() {
        this.contadorPoligonos++;
    }
}
