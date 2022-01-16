/**
 * Realiza una programa que calcule las horas transcurridas entre dos horas de dos días de la semana.
 * No se tendrán en cuenta los minutos ni los segundos.
 * El día de la semana se puede pedir como un número (del 1 al 7) o como una cadena (de “lunes” a “domingo”).
 * Se debe comprobar que el usuario introduce los datos correctamente y que el segundo día es posterior al primero.
 */
package U1tarea8b;

import java.util.Scanner;

public class E8 {
    public static void main(String[] args) {
        int diaUno = 0;
        int diaDos = 0;
        final int DIAS_SEMANA = 7;
        int horaUno = 0;
        int horaDos = 0;
        final int HORAS_DIA = 24;
        int totalDias = 0;
        int totalHoras = 0;
        Scanner teclado = new Scanner(System.in);
        //  COMPROBAR QUE LOS DATOS SON CORRECTOS
        while (diaUno > DIAS_SEMANA || diaUno < 1) {
            System.out.println("Introduzco un día de la semana (del 1 al 7): ");
            diaUno = teclado.nextInt();
        }
        while (diaDos > DIAS_SEMANA || diaDos < diaUno) {
            System.out.println("Introduzco segundo día de la semana (del día antes introducido al 7): ");
            diaDos = teclado.nextInt();
        }
        totalDias = diaDos - diaUno;
        while (horaUno > HORAS_DIA || horaUno < 1) {
            System.out.println("Introduzco una hora del día (del 1 al 24): ");
            horaUno = teclado.nextInt();
        }
        while (horaDos > HORAS_DIA || horaDos < 1 || ( (totalDias == 0 && horaDos > horaUno) )) {
            System.out.println("Introduzco la hora del segundo día (del 1 al 24): ");
            horaDos = teclado.nextInt();
        }
        // CALCULAR
        totalHoras = 0;
        for (int i = 1; i <= DIAS_SEMANA; i++) {
            for (int j = 1; j <= HORAS_DIA; j++) {
               if ( (diaUno <= i ) && (diaDos > i ) ){
                    totalHoras++;
                }
            }
        }
        totalHoras = totalHoras + (HORAS_DIA - horaUno) - (HORAS_DIA - horaDos);
        System.out.println("El número total de horas es: " + totalHoras);
    }
}
