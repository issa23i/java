public class Libro extends Multimedia{
    String editorial, isbn;
    Integer paginas;

    /* ---- CONSTRUCTOR -------------- */
    public Libro(String titulo, String autor, Integer anyo, String editorial, String isbn, Integer paginas) {
        super(titulo, autor, anyo);
        this.editorial = editorial;
        this.isbn = isbn;
        this.paginas = paginas;
    }

    /* ---------- MÉTODOS --------- */
    @Override
    public void dar_por_finalizado(){
        System.out.println("El libro" + getTitulo() + " de " + getAutor() + " ha sido leído. ");
    }

    @Override
    public String toString () {
        return super.toString() + "\nEditorial : " + getEditorial()+ "\nISBN : " + getIsbn()+ "\nPáginas :  " + getPaginas();
    }

    /* -------- GETTER AND SETTER ---------- */

    public String getEditorial() {
        return editorial;
    }

    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public Integer getPaginas() {
        return paginas;
    }

    public void setPaginas(Integer paginas) {
        this.paginas = paginas;
    }
}
