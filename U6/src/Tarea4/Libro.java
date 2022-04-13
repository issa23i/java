package Tarea4;

public class Libro implements Comparable<Libro> {
    private String titulo;
    private String autor;

    public Libro(String titulo, String autor) throws ExcepcionLibro {
        if (contieneNumero(titulo)) {
            throw (new ExcepcionLibro(titulo));
        } else if (contieneNumero(autor)) {
            throw (new ExcepcionLibro(autor));
        }
        this.titulo = titulo;
        this.autor = autor;
    }

    public boolean contieneNumero(String s){
        boolean contiene = false;
        if( (s.contains("1")) || (s.contains("2")) || (s.contains("3")) || (s.contains("4")) || (s.contains("5"))
                || (s.contains("6")) || (s.contains("7")) || (s.contains("8"))
                || (s.contains("9")) || (s.contains("0")) ) {
            contiene = true;
        }
        return contiene;
    }


    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) throws ExcepcionLibro {
        if (contieneNumero(titulo)) {
            throw (new ExcepcionLibro(titulo));
        }
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) throws ExcepcionLibro {
        if (contieneNumero(autor)) {
            throw (new ExcepcionLibro(autor));
        }
        this.autor = autor;
    }

    @Override
    public String toString() {
        return titulo + ": " + autor ;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Libro libro = (Libro) o;
        return titulo.equals(libro.titulo) && autor.equals(libro.autor);
    }

    @Override
    public int compareTo(Libro o) {
        return this.getTitulo().compareTo(o.getTitulo());
    }
}
