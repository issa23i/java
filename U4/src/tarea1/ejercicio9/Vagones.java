package tarea1.ejercicio9;

class Vagones {
    private int capacidadMaxima;
    private int capacidadActual;
    private String tipoMercancia;

        /* ------------- CONSTRUCTOR  --------------- */
    Vagones (int capacidadMaxima, int capacidadActual, String tipoMercancia){
        this.capacidadMaxima = capacidadMaxima;
        this.capacidadActual = capacidadActual;
        this.tipoMercancia = tipoMercancia;

    }

    /* ------------- MÉTODOS  --------------- */

    public int getCapacidadMaxima() {
        return capacidadMaxima;
    }

    public void setCapacidadMaxima(int capacidadMaxima) {
        this.capacidadMaxima = capacidadMaxima;
    }

    public int getCapacidadActual() {
        return capacidadActual;
    }

    public void setCapacidadActual(int capacidadActual) {
        this.capacidadActual = capacidadActual;
    }

    public String getTipoMercancia() {
        return tipoMercancia;
    }

    public void setTipoMercancia(String tipoMercancia) {
        this.tipoMercancia = tipoMercancia;
    }
}
