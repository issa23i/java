package tarea1;

public class Banco {
    private String NOMBRE;
    private long capital;
    private String direccionCentral;

    /*---------- CONSTRUCTOR ----------*/
    Banco (final String nom, String direccion) {
        this.direccionCentral = direccion;
        this.capital = 5200000;
        NOMBRE = nom;
    }
    Banco (long capi, String direccion){
        this.capital = capi;
        this.direccionCentral = direccion;
    }
    /*---------- MÉTODOS ----------*/

    public long getCapital() {
        return capital;
    }

    public void setCapital(long capital) {
        this.capital = capital;
    }

    public String getDireccionCentral() {
        return direccionCentral;
    }

    public void setDireccionCentral(String direccionCentral) {
        this.direccionCentral = direccionCentral;
    }

    public String getNOMBRE() {
        return NOMBRE;
    }
}
