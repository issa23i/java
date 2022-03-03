public class Romancero extends Agrupacion implements Callejera{
    private String nombre, autor, autorMusica, autorLetras, disfraz, tematicaCartelon;

    public Romancero(String nombre, String autor, String autorMusica, String autorLetras, String disfraz, String tematicaCartelon) {
        super(nombre, autor, autorMusica, autorLetras, disfraz);
        this.nombre = nombre;
        this.autor = autor;
        this.autorMusica = autorMusica;
        this.autorLetras = autorLetras;
        this.disfraz = disfraz;
        this.tematicaCartelon = tematicaCartelon;
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

    public String getTematicaCartelon() {
        return tematicaCartelon;
    }

    public void setTematicaCartelon(String tematicaCartelon) {
        this.tematicaCartelon = tematicaCartelon;
    }

    @Override
    public String toString(){
        return getNombre() + ", " + getAutor() + ", " + getAutorLetras() + ", " + getDisfraz() +  ", " + getTematicaCartelon();
    }

    @Override
    public void cantarlaPresentacion() {
        System.out.println("Cantando la presentación del Romancero" + getNombre());
    }

    @Override
    public void hacertipo() {
        System.out.println("El Romancero " + getNombre() + ", va de " + getDisfraz());
    }

    @Override
    public void amo_a_escucha() {

    }
}

