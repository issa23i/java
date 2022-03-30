//De los médicos/as de los pacientes, deberemos guardar a su vez los siguiente datos:
//El nombre.
//Los apellidos.
//El número de colegiado.
//El hospital donde ejerce.
//La clase tiene que tener los siguientes métodos.
package EjercicioCovid;

import java.io.Serializable;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

public class Medico implements Serializable, Comparable<Medico> {
    private String nombreDr, apellidosDr, hospital;
    private Integer numColegiado;
    private Set<Paciente> pacientes;

    public Medico(String nombreDr, String apellidosDr, String hospital, Integer numColegiado) {
        this.nombreDr = nombreDr;
        this.apellidosDr = apellidosDr;
        this.hospital = hospital;
        this.numColegiado = numColegiado;
    }

    public String getNombreDr() {
        return nombreDr;
    }

    public void setNombreDr(String nombreDr) {
        this.nombreDr = nombreDr;
    }

    public String getApellidosDr() {
        return apellidosDr;
    }

    public void setApellidosDr(String apellidosDr) {
        this.apellidosDr = apellidosDr;
    }

    public String getHospital() {
        return hospital;
    }

    public void setHospital(String hospital) {
        this.hospital = hospital;
    }

    public Integer getNumColegiado() {
        return numColegiado;
    }

    public void setNumColegiado(Integer numColegiado) {
        this.numColegiado = numColegiado;
    }

    public Set<Paciente> getPacientes() {
        return pacientes;
    }

    public void setPacientes(Set<Paciente> pacientes) {
        this.pacientes = pacientes;
    }

    @Override
    public String toString() {
        return "Medico{" +
                "nombreDr='" + nombreDr + '\'' +
                ", apellidosDr='" + apellidosDr + '\'' +
                ", hospital='" + hospital + '\'' +
                ", numColegiado=" + numColegiado +
                '}';
    }

    @Override
    public int compareTo(Medico o) {
        return this.getNumColegiado()-o.getNumColegiado();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Medico)) return false;
        Medico medico = (Medico) o;
        return getNumColegiado().equals(medico.getNumColegiado());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getNumColegiado());
    }
}
