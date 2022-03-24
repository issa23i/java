import java.io.Serializable;

public class ParCotizacion implements Serializable {
    private Divisa divisaBase, divisaCotizada;
    private Double precio, variacionPorcentual;

    public ParCotizacion(Divisa divisaBase, Divisa divisaCotizada, Double precio, Double variacionPorcentual) {
        this.divisaBase = divisaBase;
        this.divisaCotizada = divisaCotizada;
        this.precio = precio;
        this.variacionPorcentual = variacionPorcentual;
    }

    public Divisa getDivisaBase() {
        return divisaBase;
    }

    public void setDivisaBase(Divisa divisaBase) {
        this.divisaBase = divisaBase;
    }

    public Divisa getDivisaCotizada() {
        return divisaCotizada;
    }

    public void setDivisaCotizada(Divisa divisaCotizada) {
        this.divisaCotizada = divisaCotizada;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    public Double getVariacionPorcentual() {
        return variacionPorcentual;
    }

    public void setVariacionPorcentual(Double variacionPorcentual) {
        this.variacionPorcentual = variacionPorcentual;
    }
}
