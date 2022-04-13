public class Comparsa extends AgrupacionOficial{
    private String nombre, autor, autorMusica, autorLetras, disfraz, empresaAtrezzo;
    private Integer puntosObtenidos;

    public Comparsa(String nombre, String autor, String autorMusica, String autorLetras, String disfraz, String empresaAtrezzo, Integer puntosObtenidos) {
        super(nombre, autor, autorMusica, autorLetras, disfraz);
        this.nombre = nombre;
        this.autor = autor;
        this.autorMusica = autorMusica;
        this.autorLetras = autorLetras;
        this.disfraz = disfraz;
        this.empresaAtrezzo = empresaAtrezzo;
        this.puntosObtenidos = puntosObtenidos;
    }
    @Override
    public String toString(){
        return getNombre() + ", " + getAutor() + ", " + getAutorLetras() + ", " + getDisfraz() + ", " + getEmpresaAtrezzo() + ", " + getPuntosObtenidos();
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



    public String getEmpresaAtrezzo() {
        return empresaAtrezzo;
    }

    public void setEmpresaAtrezzo(String empresaAtrezzo) {
        this.empresaAtrezzo = empresaAtrezzo;
    }

    public Integer getPuntosObtenidos() {
        return puntosObtenidos;
    }

    public void setPuntosObtenidos(Integer puntosObtenidos) {
        this.puntosObtenidos = puntosObtenidos;
    }

    @Override
    public void cantarlaPresentacion() {
        System.out.println("Cantando la presentación de la Comparsa " + getNombre());
    }

    @Override
    public void hacertipo() {
        System.out.println("La Comparsa " + getNombre() + ", va de " + getDisfraz());
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
