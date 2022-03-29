import java.io.Serializable;

public class Divisa implements Serializable {
    private String nombre, simbolo;
    private static Integer id = 0;

    public Divisa(String nombre, String simbolo) {
        this.nombre = nombre;
        this.simbolo = simbolo;
        id++;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getSimbolo() {
        return simbolo;
    }

    private void setSimbolo(String simbolo) {
        this.simbolo = simbolo;
    }

    public static Integer getId() {
        return id;
    }

    public static void setId(Integer id) {
        Divisa.id = id;
    }

    @Override
    public String toString() {
        return "Divisa{" +
                "nombre='" + nombre + '\'' +
                ", simbolo='" + simbolo + '\'' +
                '}';
    }
}
