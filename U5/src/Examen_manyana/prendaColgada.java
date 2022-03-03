package Examen_manyana;

public class prendaColgada extends Prenda{
    private float altura;

    public prendaColgada(float precio, float peso, String nombre, String codigoBarras, float altura) {
        super(precio, peso, nombre, codigoBarras);
        this.altura = altura;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }
}
