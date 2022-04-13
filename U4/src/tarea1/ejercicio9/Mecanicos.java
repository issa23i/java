package tarea1.ejercicio9;

public class Mecanicos {
    private String nombreCompleto;
    private long telefono;
    private enum enumEspecialidad {
            frenos,
            hidráulica
    }
    private enumEspecialidad esp;

        /* ------------- CONSTRUCTOR  --------------- */
    Mecanicos (String nombreCompleto, long telefono, enumEspecialidad esp){
        this.nombreCompleto = nombreCompleto;
        this.telefono = telefono;
        this.esp = esp;
    }

    /* ------------- MÉTODOS  --------------- */

    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }

    public long getTelefono() {
        return telefono;
    }

    public void setTelefono(long telefono) {
        this.telefono = telefono;
    }

    public enumEspecialidad getEsp() {
        return esp;
    }

    public void setEsp(enumEspecialidad esp) {
        this.esp = esp;
    }
}
