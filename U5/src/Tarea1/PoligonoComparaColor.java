package Tarea1;

import Tarea2.Circulo;
import Tarea2.PoligonoRegular;

import java.util.Comparator;

public class PoligonoComparaColor extends PoligonoRegular implements Comparator {

    @Override
    public int compare(Object o1, Object o2) {
        if( (o1 instanceof PoligonoRegular) &&
             (o2 instanceof PoligonoRegular) ) {
            PoligonoRegular pr1 = (PoligonoRegular) o1;
            PoligonoRegular pr2 = (PoligonoRegular) o2;
            return pr1.getColor().toString().compareTo(pr2.getColor().toString());
        }
        return 0;
    }
}
