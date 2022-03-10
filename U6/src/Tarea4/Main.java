package Tarea4;

public class Main {
    public static void main(String[] args) {
        try {
            Libro l1 = new Libro("Moratoria", "Paula Lago");
            Libro l2 = new Libro("Cadenas", "Umberto Flabio");
            Libro l3 = new Libro("Paused", "Moncariño Olvido");
            Libro l4 = new Libro("Never end the history", "Oligarca");
            Libro [] libros = {l1, l2, l3, l4};
            //l4.setTitulo("N3ver end the history");
            RegistroLibro registroLibro = new RegistroLibro(3);
            for (Libro l: libros
                 ) {
                registroLibro.registro(l.getTitulo(), l.getAutor());
            }
            System.out.println(registroLibro.toString());
            registroLibro.cargarRegistroAfichero();
            RegistroLibro rl = new RegistroLibro(10);
            rl.cargarRegistroDesdeFichero("registro.txt");
            System.out.println(rl.toString());
        } catch (ExcepcionLibro e) {
            System.out.println(e.getMessage());;
        }



    }
}
