package entregable2021;

import java.util.Comparator;

public class ComparaAlumnoApellido implements Comparator<Alumno> {

    @Override
    public int compare(Alumno o1, Alumno o2) {
        return o1.getApellidos().compareTo(o2.getApellidos());
    }
}
