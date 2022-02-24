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
        // busca capitulo
        for (int i = 0; i < productos.length; i++) {
            if (productos[i].equals(elemento)){ // si coincide
                // lo elimina
                productos [i] = null;
                eliminado = true;
            }
        }
        // devuelve boolean
        return eliminado;
    }

    public void ordenar_por_anyo(){
        ComparaPorAnyo compAnyo = new ComparaPorAnyo();
        Arrays.sort(getProductos(), compAnyo);
    }

    public void ordenar_por_titulo(){
        Arrays.sort(getProductos());
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
