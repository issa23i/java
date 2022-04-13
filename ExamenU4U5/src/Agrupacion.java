public abstract class Agrupacion {
    private String nombre, autor, autorMusica, autorLetras, disfraz;
    protected static Integer numAgrupacion = 0;

    public Agrupacion (String nombre, String autor, String autorMusica, String autorLetras, String disfraz) {
        numAgrupacion++;
        this.nombre = nombre;
        this.autor = autor;
        this.autorMusica = autorMusica;
        this.autorLetras = autorLetras;
        this.disfraz = disfraz;
    }

    abstract void cantarlaPresentacion();
    abstract void hacertipo();

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getAutorMusica() {
        return autorMusica;
    }

    public void setAutorMusica(String autorMusica) {
        this.autorMusica = autorMusica;
    }

    public String getAutorLetras() {
        return autorLetras;
    }

    public void setAutorLetras(String autorLetras) {
        this.autorLetras = autorLetras;
    }

    public String getDisfraz() {
        return disfraz;
    }

    public void setDisfraz(String disfraz) {
        this.disfraz = disfraz;
    }

    public static Integer getNumAgrupacion() {
        return numAgrupacion;
    }

    public static void setNumAgrupacion(Integer numAgrupacion) {
        Agrupacion.numAgrupacion = numAgrupacion;
    }
}
