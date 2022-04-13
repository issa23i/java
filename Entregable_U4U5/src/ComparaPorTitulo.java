import java.util.Comparator;

public class ComparaPorTitulo implements Comparator {
    @Override
    public int compare(Object o1, Object o2) {
        String m1 = ((Multimedia) o1).getTitulo();
        String m2 = ((Multimedia) o2).getTitulo();
        return m1.compareTo(m2);
    }
}
