package Tarea1;

import com.sun.source.tree.Tree;

import java.util.*;

public class Ejec8 {
    public static void main(String[] args) {
        ArrayList<String> nombres = new ArrayList<>();
//        nombres = {"ernesto" , "juan", "pedro"};
        nombres.add("ernesto");
        nombres.add("juan");
        nombres.add("irene");
        nombres.add("jucnca");
        nombres.add("juan");
        nombres.add("carlos");
        System.out.println(nombres.toString());
        nombres = devolverNoRepetidos(nombres);
        System.out.println(nombres.toString());
    }
    protected static ArrayList<String> devolverNoRepetidos(ArrayList<String> lista) {
        Collection<String> collection = new LinkedHashSet<>(lista);
        ArrayList<String> listab = new ArrayList<>(collection);
        return listab;
    }

}
