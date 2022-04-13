package Examen_manyana;

public class Prenda {
    private float precio, peso;
    private String nombre, codigoBarras;
    private static Integer numPrenda;

    public Prenda(float precio, float peso, String nombre, String codigoBarras) {
        this.precio = precio;
        this.peso = peso;
        this.nombre = nombre;
        this.codigoBarras = codigoBarras;
        numPrenda++;
    }

    public static Integer getNumPrenda() {
        return numPrenda;
    }

    public static void setNumPrenda(Integer numPrenda) {
        Prenda.numPrenda = numPrenda;
    }

    @Override
    public String toString(){
        return "La prenda "+ numPrenda+ " - " + nombre + " | " +codigoBarras + " | " + "PVP " + precio + "Peso " + peso;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCodigoBarras() {
        return codigoBarras;
    }

    public void setCodigoBarras(String codigoBarras) {
        this.codigoBarras = codigoBarras;
    }
}
