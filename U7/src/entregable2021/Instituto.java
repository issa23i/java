package entregable2021;

import java.io.*;
import java.util.*;

public abstract class Instituto implements Serializable {

    enum Cursos {
        primero,
        segundo,
        tercero,
        cuarto
    }
    enum Letras {
        A,
        B,
        C,
        D,
        E
    }
    private String nombre;
    protected static Integer idNuevoAlumno = 0;
    private final String FICHERO = "alumnos.dat";
    protected static TreeMap<Integer, Alumno> alumnos = new TreeMap<>();
    protected static TreeMap<String, Clase> clases = new TreeMap<>();
    protected static TreeMap<Cursos, Curso> cursos = new TreeMap<>();
    public Instituto(String nombre) {
        this.nombre = nombre;
    }
    public abstract void addCurso(Cursos curson, Curso curso);
    public abstract void addAlumno(Integer idAlumno, Alumno alumno);
    public abstract void addClase(String unidad, Clase clase);
    public abstract void mostrarAlumnosUnidad(String unidad);
    public abstract void addAlumnoUnidad(Alumno alumno);
    public void guardarAlumnos(){
        try(ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(FICHERO))){
            out.writeObject(alumnos);
        } catch (IOException fileNotFoundException) {
            fileNotFoundException.printStackTrace();
        }
    }
    public void cargarAlumnos() {
        try (ObjectInputStream in = new ObjectInputStream( new FileInputStream(FICHERO))){
            setAlumnos((TreeMap<Integer, Alumno>) in.readObject());
        } catch (IOException | ClassNotFoundException fileNotFoundException) {
            fileNotFoundException.printStackTrace();
        }
    }
    public void mostrarTodosAlumnosOrdenados(){
        ArrayList<Alumno> alnos = new ArrayList<Alumno>(alumnos.values());
      //  alnos.sort(new ComparaAlumnoApellido());
        Iterator<Alumno> it = alnos.iterator();
        while (it.hasNext()) {
            Alumno next =  it.next();
            System.out.println(next.toString());
        }
    }

    public void obtenerUnidadAlumno(Integer idAlumno) {
        if (buscarAlumnoPorId(idAlumno)){ // si existe
            Alumno a = alumnos.get(idAlumno);
            System.out.println(a.toString());
        }
    }

    private boolean buscarAlumnoPorId (Integer idAlumno) {
        return alumnos.containsKey(idAlumno);
    }

    @Override
    public String toString() {
        return "Instituto " +
                nombre + '\'' ;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getFICHERO() {
        return FICHERO;
    }

    protected static Integer getNumeroDeAlumnos() {
        return idNuevoAlumno;
    }

    protected static void setIdNuevoAlumno() {
        Instituto.idNuevoAlumno++;
    }

    public static TreeMap<Integer, Alumno> getAlumnos() {
        return alumnos;
    }

    public static void setAlumnos(TreeMap<Integer, Alumno> alumnos) {
        Instituto.alumnos = alumnos;
    }

    public static TreeMap<String, Clase> getClases() {
        return clases;
    }

    public static void setClases(TreeMap<String, Clase> clases) {
        Instituto.clases = clases;
    }

    public static TreeMap<Cursos, Curso> getCursos() {
        return cursos;
    }

    public static void setCursos(TreeMap<Cursos, Curso> cursos) {
        Instituto.cursos = cursos;
    }
}
