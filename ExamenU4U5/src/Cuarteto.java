public class Cuarteto extends AgrupacionOficial implements Callejera{
    private String nombre, autor, autorMusica, autorLetras, disfraz;
    private Integer numBandurrias, numGuitarras, puntosObtenidos, numMiembros;

    public Cuarteto(String nombre, String autor, String autorMusica, String autorLetras, String disfraz, Integer numBandurrias, Integer numGuitarras, Integer puntosObtenidos, Integer numMiembros) {
        super(nombre, autor, autorMusica, autorLetras, disfraz);
        this.nombre = nombre;
        this.autor = autor;
        this.autorMusica = autorMusica;
        this.autorLetras = autorLetras;
        this.disfraz = disfraz;
        this.numBandurrias = numBandurrias;
        this.numGuitarras = numGuitarras;
        this.puntosObtenidos = puntosObtenidos;
        this.numMiembros = numMiembros;
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



    public Integer getNumBandurrias() {
        return numBandurrias;
    }

    public void setNumBandurrias(Integer numBandurrias) {
        this.numBandurrias = numBandurrias;
    }

    public Integer getNumGuitarras() {
        return numGuitarras;
    }

    public void setNumGuitarras(Integer numGuitarras) {
        this.numGuitarras = numGuitarras;
    }

    public Integer getPuntosObtenidos() {
        return puntosObtenidos;
    }

    public void setPuntosObtenidos(Integer puntosObtenidos) {
        this.puntosObtenidos = puntosObtenidos;
    }

    public Integer getNumMiembros() {
        return numMiembros;
    }

    public void setNumMiembros(Integer numMiembros) {
        this.numMiembros = numMiembros;
    }
    @Override
    public String toString(){
        return getNombre() + ", " + getAutor() + ", " + getAutorLetras() + ", " + getDisfraz() + ", " + getNumGuitarras() + ", " + getNumMiembros() + ", " + getPuntosObtenidos();
    }

    @Override
    public void cantarlaPresentacion() {
        System.out.println("Cantando la presentación del cuarteto " + getNombre());
    }

    @Override
    public void hacertipo() {
        System.out.println("El Cuarteto " + getNombre() + ", va de " + getDisfraz());
    }


    @Override
    public void amo_a_escucha() {

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
}
