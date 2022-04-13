package Entregable21_22;

public class Manodeobra {
    private String nombreEmpresa;
    private String descripTrabajo;
    private int horas;
    private int numObreros;

    /*----------- CONTRUCTOR ---------*/
    public Manodeobra (String empresa, String trabajo, int totalHoras, int numeroObreros) {
        this.nombreEmpresa = empresa;
        this.descripTrabajo = trabajo;
        this.horas = totalHoras;
        this.numObreros = numeroObreros;
    }

    /* ----------- MÉTODOS -----------*/

    public void mostrarInfo() {
        System.out.println("NOMBRE DE LA EMPRESA : " + getNombreEmpresa());
        System.out.println("DESCRIPCIÓN DEL TRABAJO : " + getDescripTrabajo());
        System.out.println("HORAS NECESARIAS : " + getHoras());
        System.out.println("NÚMERO DE OBREROS NECESARIOS : " + getNumObreros());
    }

    public String getNombreEmpresa() {
        return nombreEmpresa;
    }

    public void setNombreEmpresa(String nombreEmpresa) {
        this.nombreEmpresa = nombreEmpresa;
    }

    public String getDescripTrabajo() {
        return descripTrabajo;
    }

    public void setDescripTrabajo(String descripTrabajo) {
        this.descripTrabajo = descripTrabajo;
    }

    public int getHoras() {
        return horas;
    }

    public void setHoras(int horas) {
        this.horas = horas;
    }

    public int getNumObreros() {
        return numObreros;
    }

    public void setNumObreros(int numObreros) {
        this.numObreros = numObreros;
    }
}
