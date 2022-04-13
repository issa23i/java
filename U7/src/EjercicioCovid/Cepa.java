// código de la cepa (que es un carácter y es único)
package EjercicioCovid;

import java.io.Serializable;
import java.util.Objects;

public class Cepa implements Serializable, Comparable<Cepa> {

    private Character letraCepa;

    public Cepa( Character letraCepa) {
        this.letraCepa = letraCepa;
    }

    public Character getLetraCepa() {
        return letraCepa;
    }

    public void setLetraCepa(Character letraCepa) {
        this.letraCepa = letraCepa;
    }

    @Override
    public String toString() {
        return "Cepa{" +
                "letraCepa=" + letraCepa +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Cepa)) return false;
        if (!super.equals(o)) return false;
        Cepa cepa = (Cepa) o;
        return Objects.equals(getLetraCepa(), cepa.getLetraCepa());
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), getLetraCepa());
    }

    @Override
    public int compareTo(Cepa o) {
        return this.getLetraCepa().compareTo(o.getLetraCepa());
    }
}