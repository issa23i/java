import java.util.Comparator;

public class ComparaPorAnyo implements Comparator {
    @Override
    public int compare(Object o1, Object o2) {
        Multimedia m = (Multimedia) o1;
        Multimedia m2 = (Multimedia) o2;
        return m.getAnyo() - m2.getAnyo();
    }
}
