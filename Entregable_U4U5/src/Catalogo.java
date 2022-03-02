import java.util.Arrays;

public class Catalogo {
    private Multimedia [] productos;

    /* ------ CONSTRUCTOR ------- */

    public Catalogo(Multimedia[] productos) {
        this.productos = productos;
    }

    /* -------- MÉTODOS ------------ */
    public Integer numero_de_elementos(){
        return getProductos().length;
    }

    public void add_multimedia(Multimedia elemento) {
        // añadir un nuevo espacio en el Array
        setProductos(Arrays.copyOf(getProductos(), numero_de_elementos()+1));
        // añadir al final
        getProductos()[numero_de_elementos()-1] = elemento;
    }

    public boolean eliminar_multimedia(Multimedia elemento) {
        // elimina el elemento multimedia que se le pasa
        boolean eliminado = false;

//        for (int i = 0; i < productos.length; i++) {
//            if (productos[i].equals(elemento)){ // si coincide
//                // lo elimina
//                productos [i] = null;
//                eliminado = true;
//            }
//        }
        // busca capitulo
        int indice = Arrays.binarySearch(getProductos(), elemento);
        if (indice<0){
            return false;
        } else {
            // elimina capitulo
            Multimedia [] multis = Arrays.copyOf(getProductos(), getProductos().length-1); // creamos una copia con una posicion menos
            int contador = multis.length;
            while (contador > indice-1) {// empezando por el final, hasta el índice
                multis[contador-1] = getProductos()[contador];
                contador --;
            }
            setProductos(multis); // pasamos el nuevo Array
            eliminado = true;
        }
        // devuelve boolean
        return eliminado;
    }
    public void ordenar_por_id(){
        Arrays.sort(getProductos());
    }

    public void ordenar_por_anyo(){
        ComparaPorAnyo compAnyo = new ComparaPorAnyo();
        Arrays.sort(getProductos(), compAnyo);
    }

    public void ordenar_por_titulo(){
        ComparaPorTitulo compTitulo = new ComparaPorTitulo();
        Arrays.sort(getProductos(),compTitulo);
    }

    @Override
    public String toString(){
        String s = "";
        for (Multimedia m: getProductos()
             ) {
            s += "\n" + m.toString();
        }
        return s;
    }

      /* ---------- GETTER AND SETTER ---------- */

    public Multimedia[] getProductos() {
        return productos;
    }

    public void setProductos(Multimedia[] productos) {
        this.productos = productos;
    }
}
