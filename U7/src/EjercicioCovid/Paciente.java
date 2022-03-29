// El nombre del paciente.
//La edad (un entero, no hace falta que sea una fecha de nacimiento).
//El peso del paciente.
//Si tienen o no tienen todas las vacunas requeridas.
//El médico/a que sigue su tratamiento
//Y por supuesto la cepa con la que se infectó.
package EjercicioCovid;

import java.io.Serializable;
import java.util.Objects;

public class Paciente implements Serializable, Comparable<Paciente>{
    private String nombrePaciente;
    private Medico doctor;
    private Integer edad;
    private Double peso;
    private boolean vacunado;
    private Cepa cepa;

    public Paciente(String nombrePaciente, Medico doctor, Integer edad, Double peso, boolean vacunado, Cepa cepa) {
        this.nombrePaciente = nombrePaciente;
        this.doctor = doctor;
        this.edad = edad;
        this.peso = peso;
        this.vacunado = vacunado;
        this.cepa = cepa;
    }

    public String getNombrePaciente() {
        return nombrePaciente;
    }

    public void setNombrePaciente(String nombrePaciente) {
        this.nombrePaciente = nombrePaciente;
    }

    public Medico getDoctor() {
        return doctor;
    }

    public void setDoctor(Medico doctor) {
        this.doctor = doctor;
    }

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    public Double getPeso() {
        return peso;
    }

    public void setPeso(Double peso) {
        this.peso = peso;
    }

    public boolean isVacunado() {
        return vacunado;
    }

    public void setVacunado(boolean vacunado) {
        this.vacunado = vacunado;
    }

    public Cepa getCepa() {
        return cepa;
    }

    public void setCepa(Cepa cepa) {
        this.cepa = cepa;
    }

    @Override
    public String toString() {
        return "Paciente{" +
                "nombrePaciente='" + nombrePaciente + '\'' +
                ", doctor=" + doctor +
                ", edad=" + edad +
                ", peso=" + peso +
                ", vacunado=" + vacunado +
                ", cepa=" + cepa +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Paciente)) return false;
        Paciente paciente = (Paciente) o;
        return getNombrePaciente().equals(paciente.getNombrePaciente());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getNombrePaciente());
    }

    @Override
    public int compareTo(Paciente o) {
        return this.getNombrePaciente().compareTo(o.getNombrePaciente());
    }
}
