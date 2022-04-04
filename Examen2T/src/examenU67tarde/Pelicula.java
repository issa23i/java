package examenU67tarde;

import java.io.Serializable;
import java.util.Objects;

public class Pelicula implements Comparable<Pelicula>, Serializable {
    private String titulo, pais, genero, director;
    private Integer anyo, idPelicula;
    private static Integer contadorPeliculas = 0;


    public Pelicula(String titulo, String pais, String genero, String director) {
        this.titulo = titulo;
        this.pais = pais;
        this.genero = genero;
        this.director = director;
        this.anyo = anyo;
        this.idPelicula = getId();
        contadorPeliculas++;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public static Integer getContador() {
        return contadorPeliculas;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public Integer getAnyo() {
        return anyo;
    }

    public void setAnyo(Integer anyo) {
        this.anyo = anyo;
    }

    public Integer getId() {
        return getContador();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Pelicula pelicula = (Pelicula) o;
        return getTitulo().equals(pelicula.getTitulo());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getTitulo());
    }

    @Override
    public String toString() {
        return "Película{" +
                "titulo='" + titulo + '\'' +
                ", pais='" + pais + '\'' +
                ", genero='" + genero + '\'' +
                ", director='" + director + '\'' +
                ", anyo=" + anyo +
                ", id=" + idPelicula +
                '}';
    }


    @Override
    public int compareTo(Pelicula o) {
        return this.getTitulo().compareTo(o.getTitulo());
    }
}
