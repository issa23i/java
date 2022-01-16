package u1entregable2021;

import java.time.LocalTime;
import java.util.Scanner;

public class reloj_con_localtime {
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
            System.out.println(LocalTime.of(horas, minutos, segundos));
        }

    }
}
