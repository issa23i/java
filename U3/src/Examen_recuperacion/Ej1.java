/*
Realiza un programa que pinte por pantalla una pecera con un pececito dentro.

Se debe pedir al usuario el ancho y el alto de la pecera,
que como mínimo serán de 4 unidades.
No hay que comprobar que los datos se introducen correctamente;
podemos suponer que el usuario los introduce bien.
Dentro de la pecera hay que colocar de forma aleatoria un pececito,
que puede estar situado en cualquiera de las posiciones que quedan en el hueco que forma el rectángulo.

Ejemplo:

Por favor, introduzca la altura de la pecera (como mínimo 4): 4

Ahora introduzca la anchura (como mínimo 4): 7
 */
package Examen_recuperacion;

import java.util.Scanner;

public class Ej1 {
    public static void main(String[] args) {
        int alto, ancho;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Por favor, introduzca la altura de la pecera (como mínimo 4): ");
        alto = teclado.nextInt();
        System.out.println("Ahora introduzca la anchura (como mínimo 4): ");
        ancho = teclado.nextInt();
        dibujarPecera(alto, ancho);
    }
    static public void dibujarPecera( int alt, int anch){
        int tmp = (alt - 2) * ( anch - 2) ; // rango donde puede ir el pececito
        int pececito =  (int) (Math.random() * (tmp + 1));
        tmp = 0; // usamos variable como contador
        String [][] m = new String[alt][anch];
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                if( (i == 0 || i == alt-1)
                || (j == 0 || j == anch - 1) ){
                    m[i][j] = "*";
                } else if( !(pececito == tmp) ){ // si NO toca pececito
                    m[i][j] = " ";
                    tmp ++;
                } else {
                    m[i][j] = "&";
                    tmp ++;
                }
                System.out.print(m[i][j]);
            }
            System.out.println();
        }
    }
}
