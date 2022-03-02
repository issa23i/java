package Tarea2;

import java.util.Comparator;

public class comparaEnteros implements Comparator {
    @Override
    public int compare(Object o1, Object o2) {
        Integer n1 = (int) o1;
        Integer n2 = (int) o2;
        return n1 - n2;
    }
}
