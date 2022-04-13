package Tarea2;

public class Triangulo extends PoligonoRegular{
    protected static final Double LADOSTRIANGULO = 1.0;
    /* -------- CONSTRUCTOR ------------ */

    public Triangulo(Double base, Double altura, Double lados, Colores color) {
        super(base,altura,lados,color);
    }
    @Override
    public String toString(){
        return "Base: " + this.getBase()+ ", Altura: " + this.getAltura() + ", Area: " + this.getArea() + ", Color: " +
                this.getColor();
    }

}
