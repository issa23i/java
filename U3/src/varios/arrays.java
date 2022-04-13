import java.util.Scanner;
import java.util.Arrays;

public class arrays {
    public static void main(String[] args) {

        double[] dble1 = new double[5];
        double[] dble2 = {10, 23.5, 15, 7, 8.1};
        //IMPRIMIR
        System.out.println(dble2[0]); // 10
        System.out.println(Arrays.toString(dble2));
        //LONGITUD
        int num = dble2.length; // 5
        // IMPRIMIR ARRAY ENTERO
        for (int i = 0; i < dble2.length; i++) {
            System.out.println(dble2[i] + ", ");
        }
        // ASIGNAR VALORES
        int num2 = 4;
        double f = 4.6;
        Arrays.fill(dble1, 1); //
        Arrays.fill(dble1, 2, 4, 7); // {1, 1, 7, 7, 1}
        dble1[0] = 100;
        dble1[1] = f * 6;
        dble1[num2] = f - num2;
        // ASIGNAR VALORES CON BUCLE
        Scanner teclado = new Scanner(System.in);
        final int MAXIMA_LONGITUD = 6;
        int[] datos = new int[MAXIMA_LONGITUD];
        for (int i = 0; i < datos.length; i++) {
            System.out.println("Introduzca el dato: " + i + ": ");
            datos[i] = teclado.nextInt();
        }
        // SALIDA BUCLE FOR
        for (int i = datos.length - 1; i >= 0; i--) {
            System.out.println("El dato " + i + " vale " + datos[i]);
        }
        // BIDIMENSIONALES
        int[][] bid = new int[2][2];
        //IMPRIMIR BIDIMENSIONAL
        System.out.println(Arrays.deepToString(bid));
        // RECORRER BIDIMENSIONAL
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.println("El dato " + i + ", " + j + " vale " + bid[i][j]);
            }
        }
        // COMPARAR
        boolean esIgual = Arrays.equals(dble1, dble2); // false
        // ORDENAR
        Arrays.sort(dble2);
        //COPIAR
        double[] dble3 = Arrays.copyOf(dble2, dble2.length);
        // COPIAR RANGO
        dble3 = Arrays.copyOfRange(dble1, 1, 3);
        //BUSCAR
        int posicion = Arrays.binarySearch(dble2,4 );
        System.out.println(posicion);
        if (posicion < 0) {
            System.out.println("El elemento no está en el array");
        } else {
            System.out.println("El elemento está en la posición " + posicion);
        }

    }
        //FUNCIONES PARAMETRO ARRAY
        public static void funcion (int[] lista){
            for (int i = 0; i < lista.length; i++) {
                lista[i] = lista[i] + 1;
                System.out.print(lista[i] + ", ");
            }
        }
}
