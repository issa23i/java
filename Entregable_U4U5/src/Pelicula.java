public class Pelicula extends Multimedia implements Reproducible{
    private Integer duracion;
    private String productora, pais;

    /* ---------- CONSTRUCTOR -------- */

    public Pelicula(String titulo, String autor, Integer anyo, Integer duracion, String productora, String pais) {
        super(titulo, autor, anyo);
        this.duracion = duracion;
        this.productora = productora;
        this.pais = pais;
    }

    /* ------- MÉTODOS ------------ */

    @Override
    public void dar_por_finalizado(){
        System.out.println("La película " + getTitulo() + " de " + getAutor() + " ha sido visualizada ");
    }

    @Override
    public void play() {
        System.out.println("Reproduciendo película "+ getTitulo());
    }

    @Override
    public void pause() {
        System.out.println("Pausando película "+ getTitulo());
    }

    @Override
    public void stop() {
        System.out.println("Deteniendo película "+ getTitulo());
    }

    @Override
    public String toString () {
        return super.toString() + "\nDuración : " + getDuracion() + "\nProductora : " + getProductora()+ "\nPais :  " + getPais();
    }
    /* ------ GETTER AND SETTER -------- */

    public Integer getDuracion() {
        return duracion;
    }

    public void setDuracion(Integer duracion) {
        this.duracion = duracion;
    }

    public String getProductora() {
        return productora;
    }

    public void setProductora(String productora) {
        this.productora = productora;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

}
