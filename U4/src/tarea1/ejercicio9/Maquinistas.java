package tarea1.ejercicio9;

public class Maquinistas {

    private String nombreCompleto;
    private String dni;
    private int sueldoMes;
    private String rango;

    /* ------------- CONSTRUCTOR  --------------- */
    Maquinistas (String nombreCompleto, String dni, int sueldoMes, String rango ) {
        this.nombreCompleto = nombreCompleto;
        this.dni = dni;
        this.sueldoMes = sueldoMes;
        this.rango = rango;
    }

    /* ------------- MÉTODOS  --------------- */

    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public int getSueldoMes() {
        return sueldoMes;
    }

    public void setSueldoMes(int sueldoMes) {
        this.sueldoMes = sueldoMes;
    }

    public String getRango() {
        return rango;
    }

    public void setRango(String rango) {
        this.rango = rango;
    }
}
