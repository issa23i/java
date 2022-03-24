package entregable2021;

import java.io.Serializable;

public abstract class Curso extends Instituto implements Serializable {
    private Cursos curson;
    public Curso(String nombre, Cursos curson) {
        super(nombre);
        this.curson = curson;
    }
    public abstract void addAlumno(Integer idAlumno, Alumno alumno);
    public abstract void addClase(String unidad, Clase clase);
    public abstract void mostrarAlumnosUnidad(String unidad);
    public abstract void addAlumnoUnidad(Alumno alumno);
    public void addCurso(Cursos curson, Curso curso) {
        Instituto.cursos.put(curson, curso);
    }
    @Override
    public String toString() {
        return super.toString() +
                "curso " + curson ;
    }

    public Cursos getCurso() {
        return curson;
    }

    public void setCurso(Cursos curso) {
        this.curson = curso;
    }


}
