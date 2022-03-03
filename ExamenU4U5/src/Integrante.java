public class Integrante {
    private Integer numParticipante, edad;
    private String nombre, localidad;

    public Integrante(Integer numParticipante, Integer edad, String nombre, String localidad) {
        this.numParticipante = numParticipante;
        this.edad = edad;
        this.nombre = nombre;
        this.localidad = localidad;
    }

    @Override
    public String toString(){
        return "Integrante número " + getNumParticipante() + ", nombre: " + getNombre() + ", edad: " + getEdad() + "localidad: " + getLocalidad();
    }

    public Integer getNumParticipante() {
        return numParticipante;
    }

    public void setNumParticipante(Integer numParticipante) {
        this.numParticipante = numParticipante;
    }

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getLocalidad() {
        return localidad;
    }

    public void setLocalidad(String localidad) {
        this.localidad = localidad;
    }
}
