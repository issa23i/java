package Tarea2;

import java.util.Arrays;

public class Tarea2 {
    public static void main(String[] args) {
      PilaTabla pl = new PilaTabla();
//        pl.Apilar(4);
//        pl.Apilar(2);
//        pl.Apilar(6);
//        pl.Desapilar();
//        pl.Desapilar();
//        pl.Desapilar();
//        pl.Desapilar();
//        pl.Desapilar();
//        System.out.println(pl.toString());
//        System.out.println(pl.getCima());
//        for (int i = 0; i < 10; i++) {
//            pl.Apilar(i);
//        }
//        System.out.println(pl.toString());
//        while (pl.getCima() != -1 ) {
//            System.out.print(pl.getCima() + " ");
//            pl.Desapilar();
//        }
//        System.out.println(pl.toString());
        Cliente c1 = new Cliente(22124555, "Perico", 22, 2400);
        Cliente c2 = new Cliente (21888555, "Pepa", 22, 2100);
        Cliente c3 = new Cliente(21120110, "Elena", 37, 16000);
        Cliente c4 = new Cliente(22084777, "Andres", 37, 11100);
        Cliente [] clientes = {c1, c2, c3, c4};
        Arrays.sort(clientes);
        for (Cliente c: clientes
             ) {
            System.out.println(c.toString());
        }
    }
}
