package Tarea2;

import java.util.Comparator;

public class ClienteComparaEdad implements Comparator {
    @Override
    public int compare(Object o1, Object o2) {
        Cliente c1 = (Cliente) o1;
        Cliente c2 = (Cliente) o2;
        return c1.getEdad()-c2.getEdad();
    }
}
