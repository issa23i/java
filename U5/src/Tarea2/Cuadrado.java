package Tarea2;

public class Cuadrado extends PoligonoRegular{
    protected static final Double LADOSCUADRADO = 2.0;
    public Cuadrado(Double base, Double altura, Double lados, Colores color) {
        super(base, altura, lados, color);
    }
    public Cuadrado(){
        super();
    };
    @Override
    public String toString(){
        return "Longitud de lado uno: " + this.getBase()+ ", Longitud de lado dos: " + this.getAltura() + ", Area: " + this.getArea() + ", Color: " +
                this.getColor();
    }
}
