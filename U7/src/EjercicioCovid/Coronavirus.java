package EjercicioCovid;


import java.io.Serializable;
import java.util.Objects;
import java.util.Set;

public abstract class  Coronavirus implements Serializable, Comparable<Coronavirus> {
    private Set<Paciente> contagiados;
    private static final String VIRUS = "SARS-COV2";
    private static final String ORIGEN = "WUHAN";

    public Coronavirus(Set<Paciente> contagiados) {
        this.contagiados = contagiados;
    }

    public Set<Paciente> getContagiados() {
        return contagiados;
    }

    public void setContagiados(Set<Paciente> contagiados) {
        this.contagiados = contagiados;
    }

    @Override
    public String toString() {
        return "Coronavirus{" +
                "contagiados=" + contagiados +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Coronavirus)) return false;
        Coronavirus that = (Coronavirus) o;
        return Objects.equals(getContagiados(), that.getContagiados());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getContagiados());
    }
}
