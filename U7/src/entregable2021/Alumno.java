package entregable2021;

import java.io.Serializable;

public class Alumno extends Clase implements Serializable {
    private String nombreAlumno, apellidos, dni;
    private Integer idAlumno;

    public Alumno (String nombreInstituto, Cursos curso, Letras letra, String nombreAlumno, String apellidosAlumno, String dni) {
        super(nombreInstituto, curso, letra);
        this.nombreAlumno = nombreAlumno;
        this.apellidos = apellidosAlumno;
        this.dni = dni;
        Instituto.setIdNuevoAlumno();
        this.idAlumno = Instituto.getNumeroDeAlumnos();
        addAlumno(this.idAlumno, this);
    }

    public void addAlumno(Integer idAlumno, Alumno alumno){
        Instituto.alumnos.put(idAlumno,alumno);
    }
    @Override
    public String toString() {
        return super.toString() + "Alumno "  + nombreAlumno +
                " " + apellidos + '\'' +
                ", dni : " + dni + '\'' +
                ", idAlumno : " + idAlumno;
    }

    public String getNombreAlumno() {
        return nombreAlumno;
    }

    public void setNombreAlumno(String nombreAlumno) {
        this.nombreAlumno = nombreAlumno;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public Integer getIdAlumno() {
        return idAlumno;
    }

    public void setIdAlumno(Integer idAlumno) {
        this.idAlumno = idAlumno;
    }

}
