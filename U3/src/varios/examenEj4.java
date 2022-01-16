import java.util.Scanner;

/**
 * La tienda Carbonita Volando vende figuras personalizadas mediante impresión 3D.
 * Lo hace mediante un configurador online que permite calcular
 * el precio de cada figura dependiendo del peso total,
 * del tipo de material (ABS, PLA, Madera, flexible, etc.)
 * y de si se pide un posprocesado de la figura o no.
 * Las tarifas son las siguientes:
 * 0.2 céntimos por gramo si se hace con ABS
 * 0.3 céntimos por gramo si se hace con PLA
 * 0.5 céntimos por gramo si se hace con Madera
 * 0.7 céntimos por gramo si se hace con material flexible
 * Aplicar una posprocesado, implica incrementar el coste total de la figura en 3 euros adicionales,
 * independientemente del material y del tamaño de la figura.
 *
 * Si se pertenece al programa de fidelización Enjuto3D Premium, no se cobran los gastos de envío que son de 2 euros.
 *
 * Elabora un programa que pregunte por los datos necesarios y calcule el coste total de la figura.
 */
public class examenEj4 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double gramos =  0;
        double totalPieza = 0;
        int tipoMaterial = 0;
        int isPosprocesado = 0;
        int isEnjuto = 0;
        final double POSTPROCESADO = 3;
        final double ENVIO = 2;
        final double abs = 0.2;
        final double pla = 0.3;
        final double madera = 0.5;
        final double matFlex = 0.7;

        System.out.println("Bienvenido a Carbonita Volando");
        System.out.println("Introduzca el peso de su figura en gramos: ");
        gramos = teclado.nextFloat();
        System.out.println("Introduzca el tipo de material (1=ABS, 2=PLA, 3=Madera, 4=Flexible): ");
        tipoMaterial = teclado.nextInt();
        System.out.println("¿Quiere posprocesado? (1=si, 2=no): ");
        isPosprocesado = teclado.nextInt();
        System.out.println("¿Pertenece a Enjuto3D Premium? (1=si, 2=no): ");
        isEnjuto = teclado.nextInt();


        switch (tipoMaterial) {
            case 1:
                totalPieza = gramos * abs;
                break;
            case 2:
                totalPieza = gramos * pla;
                break;
            case 3:
                totalPieza = gramos * madera;
                break;
            case 4:
                totalPieza = gramos * matFlex;
                break;
            default:
                throw new IllegalStateException("Unexpected value: " + tipoMaterial);
        }

        if(isPosprocesado == 1) {
            totalPieza = totalPieza + 3;
        }
        if(isEnjuto != 1) {
            totalPieza = totalPieza + 2;
        }
        System.out.println("El coste total de la pieza es: "+ totalPieza+ "€");
    }
}
