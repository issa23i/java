package Tarea2;

import Tarea1.PoligonoComparaColor;

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
//        Cliente c1 = new Cliente(22124555, "Perico", 22, 2400);
//        Cliente c2 = new Cliente (21888555, "Pepa", 22, 2100);
//        Cliente c3 = new Cliente(21120110, "Elena", 37, 16000);
//        Cliente c4 = new Cliente(22084777, "Andres", 37, 11100);
//        Cliente c5 = new Cliente(24888810, "Andres", 14, 1010);
//        Cliente [] clientes = {c1, c2, c3, c4, c5};
//        Arrays.sort(clientes);
//        for (Cliente c: clientes
//             ) {
//            System.out.println(c.toString());
//        }
//        ClienteComparaNombre cn = new ClienteComparaNombre();
//        System.out.println(cn.compare(c1,c2));
//        System.out.println(cn.compare(c4,c5));
//        ClienteComparaEdad ce = new ClienteComparaEdad();
//        System.out.println(ce.compare(c4,c5));
//        System.out.println(ce.compare(c1,c2));
        Figura Octa = new PoligonoRegular(4.0,3.0,8.0, PoligonoRegular.Colores.Rojo);
        Figura circ = new Circulo(2.2);
        Figura cuad = new Cuadrado(2.0,2.0,2.0, PoligonoRegular.Colores.Azul);
        Figura hexa = new PoligonoRegular(4.0,3.0,6.0, PoligonoRegular.Colores.Verde);
        Figura tria = new Triangulo(4.0, 2.0,1.0,PoligonoRegular.Colores.Amarillo);
        Figura fig [] = {circ,cuad,tria,hexa,Octa};
        System.out.println("------------------------------------");
        System.out.println("--------- SIN ORDEN ----------------");

        for (Figura f: fig
             ) {
            System.out.println(f);
        }
        System.out.println("------------------------------------");
        System.out.println("--------- ORDEN LADOS----------------");
        Arrays.sort(fig);
        for (Figura f: fig
        ) {
            System.out.println(f);
        }
        System.out.println("------------------------------------");
        System.out.println("--------- ORDEN COLOR ----------------");
        PoligonoComparaColor pcc = new PoligonoComparaColor();
        Arrays.sort(fig, pcc);
        for (Figura f: fig
        ) {
            System.out.println(f);
        }
    }
}
