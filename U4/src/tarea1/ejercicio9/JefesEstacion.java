package tarea1.ejercicio9;

public class JefesEstacion {
    private String nombreCompleto;
    private long dni;

        /* ------------- CONSTRUCTOR  --------------- */
    JefesEstacion (String nombreCompleto, long dni){
        this.nombreCompleto = nombreCompleto;
        this.dni = dni;
    }

    /* ------------- MÉTODOS  --------------- */

    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }

    public long getDni() {
        return dni;
    }

    public void setDni(long dni) {
        this.dni = dni;
    }
}
