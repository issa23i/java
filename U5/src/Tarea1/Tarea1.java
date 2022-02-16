package Tarea1;

import java.util.Arrays;

public class Tarea1 {
    public static void main(String[] args) {
//        Hora h1 = new Hora(8,5);
//        Hora12 h12 = new Hora12(42,65, Hora12.franjas.am);
//        HoraExacta he = new HoraExacta(15, 16, 103);
//        System.out.println(h1.toString());
//        System.out.println(h12.toString());
//        System.out.println(he.toString());
//
//        Caja caja = new Caja(12, 15, 6, Caja.Unidades.m);
//        System.out.println(caja.toString());
//Electrodomestico [] electrodomesticos = new Electrodomestico[10];
//electrodomesticos[0] = new Lavadora(800, 150);
//electrodomesticos[1] = new Lavadora();
//electrodomesticos[2] = new Lavadora(8);
//electrodomesticos[3] = new Television(511, 57);
//electrodomesticos[4] = new Television(1185, 75);
//electrodomesticos[5] = new Television(75, true);
//electrodomesticos[6] = new Television(75, false);
//electrodomesticos[7] = new Television();
//electrodomesticos[8] = new Electrodomestico();
//electrodomesticos[9] = new Electrodomestico(810, Electrodomestico.Colores.gris, Electrodomestico.ClasesEnergeticas.C,110);
//        for (Electrodomestico e: electrodomesticos
//             ) {
//            System.out.println(e.getPrecioFinal());
//        }
        Lavadora [] lavadoras = new Lavadora[10];
        lavadoras[0] = new Lavadora(800, 150);
        lavadoras[1] = new Lavadora();
        lavadoras[2] = new Lavadora(7);
        lavadoras[3] = new Lavadora(810, 150);
        lavadoras[4] = new Lavadora(6);
        lavadoras[5] = new Lavadora(9);
        lavadoras[6] = new Lavadora(800, 160);
        lavadoras[7] = new Lavadora(10);
        lavadoras[8] = new Lavadora(800,200);
        lavadoras[9] = new Lavadora(700, 150);
        Arrays.sort(lavadoras);
        for (Lavadora l:lavadoras
             ) {
            System.out.println(l.toString());
        }
        System.out.println("--------------");
        ComparaLavadora c = new ComparaLavadora();
        Arrays.sort(lavadoras,c);
        for (Lavadora l:lavadoras
        ) {
            System.out.println(l.toString());
        }


  }

}