import java.util.Arrays;

public class Serie extends Multimedia implements Reproducible{
    private Integer num_temporada;
    private String [] capitulos;
    private Integer numCapitulos;

    /* -------- CONSTRUCTOR --------- */

    public Serie(String titulo, String autor, Integer anyo, Integer num_temporada, String[] capitulos) {
        super(titulo, autor, anyo);
        this.num_temporada = num_temporada;
        this.capitulos = capitulos;
    }

    /* --------- MÉTODOS ------------ */
    public void add_capitulo (String capitulo){
        //crece una posicion el Array
        capitulos = Arrays.copyOf(capitulos, capitulos.length+1);
        // el último es el pasado por parámetro
        capitulos[capitulos.length-1] = capitulo;
    }
    public boolean eliminar_capitulo(String capitulo) {
        boolean eliminado = false;
        // busca capitulo
        int indice = Arrays.binarySearch(getCapitulos(), capitulo);
        if (indice<0){
            return false;
        } else {
            // elimina capitulo
            String [] capis = Arrays.copyOf(getCapitulos(), getCapitulos().length-1); // creamos una copia con una posicion menos
            int contador = capis.length;
            while (contador > indice-1) {// empezando por el final, hasta el índice
                capis[contador-1] = getCapitulos()[contador];
                contador --;
            }
            setCapitulos(capis); // pasamos el nuevo Array
            eliminado = true;
        }
//        for (int i = 0; i < capitulos.length; i++) {
//            if (capitulos[i].equals(capitulo)){ // si coincide
//                // lo elimina
//                capitulos [i] = null;
//                eliminado = true;
//            }
//        }
        // devuelve boolean
        return eliminado;
    }

    @Override
    public String toString () {
       String s = super.toString() + "\nCapitulos : " ;
        for (String st:getCapitulos()
             ) {
            s += "\n  -  "  + st;
        }
        return s;
    }

    @Override
    public void dar_por_finalizado(){
        System.out.println("La serie" + getTitulo() + " de " + getAutor() + " ha sido visualizada ");
    }

    @Override
    public void play() {
        System.out.println("Reproduciendo serie " + getTitulo() + ", capítulo " + capituloRandom());
    }

    @Override
    public void pause() {
        System.out.println("Pausando serie " + getTitulo() + ", capítulo " + capituloRandom());
    }

    @Override
    public void stop() {
        System.out.println("Deteniendo serie " + getTitulo() + ", capítulo " + capituloRandom());
    }

    public String capituloRandom(){
        String capitulo;
        int n = capitulos.length;
        n = (int) (Math.random() * n + 1);
        return capitulos[n-1];
    }

    /* --------- GETTER AND SETTER -------*/

    public Integer getNum_temporada() {
        return num_temporada;
    }

    public void setNum_temporada(Integer num_temporada) {
        this.num_temporada = num_temporada;
    }

    public String[] getCapitulos() {
        return capitulos;
    }

    public void setCapitulos(String[] capitulos) {
        this.capitulos = capitulos;
    }

}
