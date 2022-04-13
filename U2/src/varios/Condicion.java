import java.util.Scanner;

public class Condicion {
    public static void main( String args[]) {
        Scanner teclado = new Scanner(System.in);
        /* EJERCICIO 5 - 2
        final int DOCE = 12;
        System.out.println("Introduzca un número: ");
        int numero = teclado.nextInt();
        if(DOCE==numero){
            System.out.println("Es doce");
        }
        else {
            System.out.println("No es correcto");
        }
        */

        /*
        // Ejercicio5-4: Crea un programa que pida al usuario dos números enteros y cuántos de ellos son pares.
         */
        int numeroUno, numeroDos;
        int cantidadPares = 0;
        System.out.println("Introduzca un número: ");
        numeroUno = teclado.nextInt();
        // Es par?
        if ((numeroUno % 2) == 0) {
            cantidadPares ++;
        }
        System.out.println("Introduzca un número: ");
        numeroDos = teclado.nextInt();
        if ((numeroDos % 2) == 0) {
            cantidadPares ++;
        }
        if (cantidadPares == 0) {
            System.out.println("De los números " + numeroUno + " y " + numeroDos + ", ninguno de ellos es par");
        }
        else if (cantidadPares == 1) {
            System.out.println("De los números " + numeroUno + " y " + numeroDos + ", uno de ellos es par");
        }
        else {
            System.out.println("De los números " + numeroUno + " y " + numeroDos + ", ambos son pares");
        }

    }

    public static class Ej5 {
        public static void main(String args[]) {
            // Datos por teclado
            Scanner teclado = new Scanner(System.in);
            String cadena = new String();
            System.out.println("Escribe una palabra: ");
            cadena = teclado.next();

            // Pasar a mayúsculas
            cadena = cadena.toUpperCase();

            // Hallar el largo de la cadena
            int largoCadena = cadena.length();

            // Máximo 10 caracteres
            final int MAXCADENA = 10;
            if (largoCadena>10) {
                cadena = cadena.substring(0,MAXCADENA);
                largoCadena = MAXCADENA;
            }

            // Cadena al revés
            String cadenaAlreves = "";
            for (int x = largoCadena-1; x >= 0; x--) {
                cadenaAlreves = cadenaAlreves + cadena.charAt(x);
            }
            // Rombo
            int altura = largoCadena * 2 -1;//altura 7 largoCadena 4
                for(int i= 0; i < largoCadena; i++) {
                    /**for(int j = 0; j < altura-i; j++) {*/
                    for(int j = 0; j < (altura/2) +5; j++) {
                            if ( (j == altura / 2) // print recta en la columna de la mitad
                                    || (i == altura / 2) //print recta en la fila de la mitad
                                    || (j == altura / 2 - i) // print la parte de arriba de la flecha
                                    || (j == i - altura / 2) // print la parte de abajo de la flecha
                                    || (i < altura / 2 && j < altura / 2 && j > altura / 2 - i) // rellena el hueco de arriba
                                    || (i > altura / 2 && j < altura / 2 && j > (i - altura /2 )) // rellena el hueco de abajo
                            ){ System.out.print("*");
                                /**for( int l = 0; l<i+1; l++){
                                    String n = "";
                                    n = n + cadena.charAt(l);
                                    System.out.print(n);
                                }
                                /**}  else if( j == altura -(altura/2)-i){ // el segundo cuadrante del rombo
                                }*/
                            } else { //si no, espacio
                                System.out.print(" ");
                            }

                    }
                    System.out.println();
                }






        }
    }
}

