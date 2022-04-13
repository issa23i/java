package tarea1.ejercicio10;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduzca los segundos a sumar: ");
        int n = teclado.nextInt();
        Hora hora = introducirHora();
        System.out.println(horaResultante(hora,n));
    }
    public static Hora introducirHora(){
        int s,m,h;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduzca una hora: ");
        h = teclado.nextInt();
        System.out.println("Introduzca unos minutos: ");
        m = teclado.nextInt();
        System.out.println("Introduzca unos segundos: ");
        s = teclado.nextInt();
        return new Hora(h,m,s);
    }

    public static String horaResultante( Hora h, int n){
        String resultado;
        int sec;
        int min = 0;
        int hor = 0;

        h.setSegundos(h.segundos + n);
        sec = h.getSegundos();
        if(sec >= 60){
            min = sec / 60;
            sec = sec % 60;
        }
        min += h.getMinutos();
        if(min >= 60){
            hor = min / 60;
            min = min % 60;
        }
        hor += h.getHora();
        if(hor >= 24){
            hor = hor -24;
        }
        resultado = String.valueOf(hor).concat(":").concat(String.valueOf(min).concat(":").concat(String.valueOf(sec)));

        return resultado;
    }
}
