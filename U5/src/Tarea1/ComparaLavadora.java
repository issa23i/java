package Tarea1;

import java.util.Comparator;

public class ComparaLavadora implements Comparator {
    @Override
    public int compare(Object o1, Object o2) {
        Lavadora lava1 = (Lavadora) o1;
        Lavadora lava2 = (Lavadora) o2;
        int resultado = lava1.getPrecioFinal() - lava2.getPrecioFinal();
        return resultado;
    }
}
