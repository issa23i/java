import java.io.Serializable;

public class Fiat extends Divisa implements Serializable , Comparable<Fiat>{
    private String pais;

    public Fiat(String nombre, String simbolo, String pais) {
        super(nombre, simbolo);
        this.pais = pais;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    @Override
    public String toString() {
        return super.toString() + " Fiat{" +
                "pais='" + pais + '\'' +
                '}';
    }

    @Override
    public int compareTo(Fiat o) {
        return this.getNombre().compareTo(o.getNombre());
    }
}
