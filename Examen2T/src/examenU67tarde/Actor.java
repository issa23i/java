package examenU67tarde;

import java.io.Serializable;
import java.util.Objects;

public class Actor implements Comparable<Actor>, Serializable {
    private String nombre, apellido, nacionalidad;
    private static Integer contadorActores = 0;
    private Integer idActor;

    public Actor(String nombre, String apellido, String nacionalidad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.nacionalidad = nacionalidad;
        this.idActor = getIdActor();
        contadorActores++;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    public static Integer getContadorActores() {
        return contadorActores;
    }

    public Integer getIdActor() {
        return getContadorActores();
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Actor actor = (Actor) o;
        return getNombre().equals(actor.getNombre()) && getApellido().equals(actor.getApellido());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getNombre(), getApellido());
    }

    @Override
    public String toString() {
        return "Actor{" +
                "nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", nacionalidad='" + nacionalidad + '\'' +
                ", idActor=" + idActor +
                '}';
    }

    @Override
    public int compareTo(Actor o) {
        String nombreApellidosT  = this.getNombre() + " " + this.getApellido();
        String nombreApellidosO = o.getNombre() + " " + o.getApellido();
        return nombreApellidosT.compareTo(nombreApellidosO);
    }
}
