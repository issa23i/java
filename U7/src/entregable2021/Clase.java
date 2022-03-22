package entregable2021;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.TreeMap;

public abstract class Clase extends Curso implements Serializable {

    private Letras letra;
    String unidad;
    public Clase(String nombre, Cursos curso, Letras letra ) {
        super(nombre, curso);
        this.letra = letra;
        this.unidad = super.getCurso().toString().concat(getLetra().toString());
        addClase(this.unidad, this);
    }
    public abstract void addAlumno(Integer idAlumno, Alumno alumno);
    public void addAlumnoUnidad(Alumno alumno){
        alumno.setCurso(this.getCurso());
        alumno.setLetra(this.getLetra());
    }
    public void addClase(String unidad, Clase clase){
        Instituto.clases.put(unidad, clase);
    }
    public void mostrarAlumnosUnidad(String unidad){
        TreeMap<String,Clase> mapa =  Instituto.getClases();
        if (mapa.containsKey(unidad)){
            System.out.println(mapa.values().toString());
        }
    }
    @Override
    public String toString() {
        return super.toString() +
                " " + letra ;
    }

    public Letras getLetra() {
        return letra;
    }

    public void setLetra(Letras letra) {
        this.letra = letra;
    }

}
