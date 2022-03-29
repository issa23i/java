import java.io.Serializable;

public class Criptomoneda extends Divisa implements Serializable {
    private Double precio, volumenTrsc;
    private Integer ranking;
    private String fecha;

    public Criptomoneda(String nombre, String simbolo, Double precio, Double volumenTrsc, Integer ranking, String fecha) {
        super(nombre, simbolo);
        this.precio = precio;
        this.volumenTrsc = volumenTrsc;
        this.ranking = ranking;
        this.fecha = fecha;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    public Double getVolumenTrsc() {
        return volumenTrsc;
    }

    public void setVolumenTrsc(Double volumenTrsc) {
        this.volumenTrsc = volumenTrsc;
    }

    public Integer getRanking() {
        return ranking;
    }

    public void setRanking(Integer ranking) {
        this.ranking = ranking;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    @Override
    public String toString() {
        return super.toString() + "Criptomoneda{" +
                "precio=" + precio +
                ", volumenTrsc=" + volumenTrsc +
                ", ranking=" + ranking +
                ", fecha='" + fecha + '\'' +
                '}';
    }
}
