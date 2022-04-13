package u1entregable2021;

import java.util.Scanner;

public class reloj {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduzca horas");
        int horas = teclado.nextInt();
        System.out.println("Introduzca minutos");
        int minutos = teclado.nextInt();
        System.out.println("Introduzca segundos");
        int segundos = teclado.nextInt();
        System.out.println("Introduzca segundos a incrementar");
        int segundosMas = teclado.nextInt();

        System.out.println("Aumentando la hora...");
        for (int i = 0; i <= segundosMas; i++) {
            segundos++;
            if (segundos >= 60){
               segundos = segundos - 60;
               minutos++;
            }
            if (minutos >= 60) {
                minutos = minutos - 60;
                horas++;
            }
            if (horas>=24){
                horas = horas -24;
            }
            System.out.println(horas +":"+ minutos +":"+ segundos);
        }
    }
}
