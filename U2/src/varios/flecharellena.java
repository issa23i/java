import java.util.Scanner;

public class flecharellena {
    public static void main(String args[]) {
        Scanner teclado = new Scanner(System.in);
        //pedir altura por teclado
        int altura = 0;
        // mientras NO se cumplan las condiciones impar y >=3
        while ( !( (altura % 2 != 0)  &&  (altura >=3 ) ) ){
            // pedir altura por teclado
            System.out.println("Escriba un número impar y mayor o igual que 3: ");
            //la altura de la figura, que debe ser un número impar mayor o igual que 3
            altura = teclado.nextInt();
        }
        System.out.println("Altura: " + altura);
        // iteracion
        for(int i= 0; i < altura; i++) {
            for(int j = 0; j < (altura/2) +5; j++) {
                if ( (j == altura / 2) // print recta en la columna de la mitad
                        || (i == altura / 2) //print recta en la fila de la mitad
                        || (j == altura / 2 - i) // print la parte de arriba de la flecha
                        || (j == i - altura / 2) // print la parte de abajo de la flecha
                        || (i < altura / 2 && j < altura / 2 && j > altura / 2 - i) // rellena el hueco de arriba
                        || (i > altura / 2 && j < altura / 2 && j > (i - altura /2 )) // rellena el hueco de abajo
                    ) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
