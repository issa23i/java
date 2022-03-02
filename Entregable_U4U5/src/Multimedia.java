abstract class Multimedia implements Comparable {
    private String titulo, autor;
    private Integer anyo;
    private Integer numId;
    protected static Integer id = 0;

    /* ------ CONTRUCTOR -------- */
    public Multimedia(String titulo, String autor, Integer anyo){
        id++;
        this.numId  = getId();
        this.titulo = titulo;
        this.autor = autor;
        this.anyo = anyo;
    }

    /* --------- MÉTODOS --------- */
    abstract void dar_por_finalizado();

    @Override
    public String toString () {
        return "Id: " + getNumId() + "\nTítulo : " + getTitulo() + "\nAutor :  " + getAutor() +
                "\nAño :  " + getAnyo() ;
    }

    @Override
    public int compareTo(Object ob) { // comparar por id
        Multimedia that = (Multimedia) ob;
        return this.getNumId().compareTo(that.getNumId());
    }
    /* ------- GETTER AND SETTER ---- */

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public Integer getAnyo() {
        return anyo;
    }

    public void setAnyo(Integer anyo) {
        this.anyo = anyo;
    }

    public static Integer getId() {
        return id;
    }

    public Integer getNumId() {
        return numId;
    }
}
