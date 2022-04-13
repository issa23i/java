
public class Coro extends AgrupacionOficial {
        private String nombre, autor, autorMusica, autorLetras, disfraz;
        private Integer numBandurrias, numGuitarras, puntosObtenidos;

        public Coro(String nombre, String autor, String autorMusica, String autorLetras, String disfraz, Integer numBandurrias, Integer numGuitarras, Integer puntosObtenidos) {
            super(nombre, autor, autorMusica, autorLetras, disfraz);
            this.nombre = nombre;
            this.autor = autor;
            this.autorMusica = autorMusica;
            this.autorLetras = autorLetras;
            this.disfraz = disfraz;
            this.numBandurrias = numBandurrias;
            this.numGuitarras = numGuitarras;
            this.puntosObtenidos = puntosObtenidos;
        }
        @Override
        public String toString(){
            return getNombre() + ", " + getAutor() + ", " + getAutorLetras() + ", " + getDisfraz() + ", " + getNumGuitarras() + ", " + getPuntosObtenidos();
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

    @Override
    public void cantarlaPresentacion() {
        System.out.println("Cantando la presentación del Coro " + getNombre());
    }

    @Override
    public void hacertipo() {
        System.out.println("El coro " + getNombre() + ", va de " + getDisfraz());
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


