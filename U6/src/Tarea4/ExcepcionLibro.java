package Tarea4;

public class ExcepcionLibro extends Exception {
    private String s;

    public ExcepcionLibro(String s) {
        super();
        this.s = s;
    }

    @Override
    public String getMessage() {
        return "Se ha pasado un número como parámetro en " + s;
    }
}
