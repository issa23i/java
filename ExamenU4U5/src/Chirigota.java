public class Chirigota extends AgrupacionOficial implements  Callejera{
    private String nombre, autor, autorMusica, autorLetras, disfraz;
    private Integer  puntosObtenidos, numCuples;
    Integrante [] integrantes;

    public Chirigota(String nombre, String autor, String autorMusica, String autorLetras, String disfraz, Integer numBandurrias, Integer numGuitarras, Integer puntosObtenidos, Integer numCuples, Integrante [] integrantes) {
        super(nombre, autor, autorMusica, autorLetras, disfraz, integrantes);
        this.nombre = nombre;
        this.autor = autor;
        this.autorMusica = autorMusica;
        this.autorLetras = autorLetras;
        this.disfraz = disfraz;
        this.puntosObtenidos = puntosObtenidos;
        this.numCuples = numCuples;
    }

    @Override
    public String getNombre() {
        return nombre;
    }

    @Override
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String getAutor() {
        return autor;
    }

    @Override
    public void setAutor(String autor) {
        this.autor = autor;
    }

    @Override
    public String getAutorMusica() {
        return autorMusica;
    }

    @Override
    public void setAutorMusica(String autorMusica) {
        this.autorMusica = autorMusica;
    }

    @Override
    public String getAutorLetras() {
        return autorLetras;
    }

    @Override
    public void setAutorLetras(String autorLetras) {
        this.autorLetras = autorLetras;
    }

    @Override
    public String getDisfraz() {
        return disfraz;
    }

    @Override
    public void setDisfraz(String disfraz) {
        this.disfraz = disfraz;
    }


    public Integer getPuntosObtenidos() {
        return puntosObtenidos;
    }

    public void setPuntosObtenidos(Integer puntosObtenidos) {
        this.puntosObtenidos = puntosObtenidos;
    }

    public Integer getNumCuples() {
        return numCuples;
    }

    public void setNumCuples(Integer numCuples) {
        this.numCuples = numCuples;
    }

    @Override
    public String toString(){
        return getNombre() + ", " + getAutor() + ", " + getAutorLetras() + ", " + getDisfraz() + ", " + getNumCuples() + ", " + getPuntosObtenidos();
    }

    @Override
    public void cantarlaPresentacion() {
        System.out.println("Cantando la presentación de la Chirigota " + getNombre());
    }

    @Override
    public void hacertipo() {
        System.out.println("La Chirigota " + getNombre() + ", va de " + getDisfraz());
    }

    @Override
    public void insertar_integrante(Integrante i) {

    }

    @Override
    public boolean eliminar_integrante(Integrante i) {
        return false;
    }

    @Override
    public void caminito_del_falla() {

    }

    @Override
    public void amo_a_escucha() {

    }
}
