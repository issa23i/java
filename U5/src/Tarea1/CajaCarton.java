package Tarea1;

public class CajaCarton extends Caja {

    public CajaCarton(double ancho, double alto, double fondo, Unidades u) {
        super(ancho, alto, fondo, Unidades.cm);
    }
    @Override
    public double getVolumen () {
        return super.getVolumen() * 0.8;
    }
}
