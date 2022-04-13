package Examen_manyana;

public class Caja {
    private Integer id;
    private final int CAPACIDAD = 5;
    private final Prenda [] prendas = new Prenda[CAPACIDAD];
    private int prendasContenido;

    public Caja (Integer id) {
        this.prendasContenido = 0;
        this.id = id;
    }

    public boolean addPrenda(Prenda prenda) {
        // añade una prenda
        // método boolean de control para asegurarse que realmente se ha metido
        boolean anyadida = false;
        for (int i = 0; i < CAPACIDAD; i++) {
            // recorre la lista hasta que encuentra un hueco null
            if (prendas[i] == null) {
                prendas[i] = prenda;
                return true;
            }
        }
        return anyadida;
    }

    public boolean addPrendas(Prenda [] prendas) {
        // Primero se asegura que caben con el método caben()
        // Después se asegura que una a una han sido metidas en la caja, como segundo método de control
        boolean anyadidas = false;
        if (caben(prendas)) {
            for (Prenda p : prendas
                 ) {
                if (addPrenda(p)) {
                    anyadidas = true;
                } else {
                    anyadidas = false;
                    System.out.println(p.toString() + " no pudo ser añadida");
                }
            }
        }
        return false;
    }

    public boolean caben(Prenda [] prendas) {
        // primer método de control para asegurarse que caben
        if (prendas.length + prendasContenido > getCAPACIDAD()) {
            System.out.println("Coja otra caja, en esta no caben ese número de prendas");
            return false;
        } else {
            return true;
        }
    }

    public Integer getId() {
        return id;
    }

    private void setId(Integer id) {
        this.id = id;
    }

    public int getCAPACIDAD() {
        return CAPACIDAD;
    }

    public Prenda[] getPrendas() {
        return this.prendas;
    }

    public int getPrendasContenido() {
        return prendasContenido;
    }

    private void setPrendasContenido(int prendasContenido) {
        this.prendasContenido = prendasContenido;
    }
}
