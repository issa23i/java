/*
  Un restaurante nos ha encargado una aplicación para colocar a los clientes en
  sus mesas. En una mesa se pueden sentar de 0 (mesa vacía) a 4 comensales
  (mesa llena). Cuando llega un cliente se le pregunta cuántos son. De momento
  el programa no está preparado para colocar a grupos mayores a 4, por tanto, si
  un cliente dice por ejemplo que son un grupo de 6, el programa dará el mensaje
  “Lo siento, no admitimos grupos de 6, haga grupos de 4 personas
  como máximo e intente de nuevo”. Para el grupo que llega, se busca
  siempre la primera mesa libre (con 0 personas). Si no quedan mesas libres, se
  busca donde haya un hueco para todo el grupo, por ejemplo si el grupo es de
  dos personas, se podrá colocar donde haya una o dos personas. Inicialmente,
  las mesas se cargan con valores aleatorios entre 0 y 4. Cada vez que se sientan
  nuevos clientes se debe mostrar el estado de las mesas. Los grupos no se
  pueden romper aunque haya huecos sueltos suficientes. El funcionamiento del
  programa se ilustra a continuación:
 */
package Entregable_1920;

import java.util.Scanner;
import java.util.Arrays;

public class Entregable_1920_1 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int comensales;
        final int MAXCOMENSALES = 4;
        final int NUMMESAS = 10;
        int[][] mesas;

        mesas = obtenerMesas(NUMMESAS, MAXCOMENSALES);
        verMesas(mesas);

        do {
            boolean sentados = false;
            System.out.println("¿Cuántos comensales son? (Introduzca -1 para salir del programa)");
            comensales = teclado.nextInt();

            if (comensales > 4) {
                System.out.println("Lo siento, no admitimos grupos de " + comensales + ", haga grupos de 4 personas como máximo e intente de nuevo");
            } else if (comensales <= 0 && comensales != -1) {
                System.out.println("Introduzca un número de comensales mayor que 0");
            } else {
                // BUSCAR MESA
                boolean hayMesa = true;
                // BUSCAR PRIMERO UNA MESA VACÍA
                for (int j = 0; j < NUMMESAS; j++) {
                    if (mesas[1][j] == 0) {
                        mesas[1][j] = comensales;
                        sentados = true;
                        verMesas(mesas);
                        break;
                    }
                }
                while ( (!sentados) && hayMesa){
                    for (int j = 0; j < NUMMESAS; j++) {
                        int ocupacion = mesas[1][j];
                        if (ocupacion + comensales <= MAXCOMENSALES) {
                            mesas[1][j] = ocupacion + comensales;
                            sentados = true;
                            verMesas(mesas);
                            break;
                        }
                        // Si es el último registro de la matriz, no hay mesa
                        if (j == NUMMESAS -1){
                            System.out.println("Disculpe, no hay mesas disponibles, visítenos otro día o espere");
                            hayMesa = false;
                            break;
                        }
                    }
                }
            }
        } while (comensales != -1); // COMPROBAR SI SALIR DEL PROGRAMA (-1)
    }
    public static int[][] obtenerMesas(int numMesas, int numComensales){
        int[][] mesas = new int[2][numMesas];

        for (int i = 0; i < numMesas; i++) {
                mesas[0][i] = i+1;// ASIGNAR NÚMERO DE MESA
                //int getRandomValue = (int) (Math.random()*(max-min)) + min;
                mesas[1][i] = (int) (Math.random() * (numComensales + 1) );
            }
        return mesas;
    }

    public static void verMesas(int[][] mesas){
        for (int[] mesa: mesas
             ) {
            System.out.println(Arrays.toString(mesa));
        }

    }
}
