/**
 * Utilizando vectores bidimensionales enla función,realizar la siguiente función para un juego de ajedrez:
 *
 * public static boolean jaque(String posRey,String posReina)
 *
 * Y nos devuelva si reina está en posición de jaque al rey.
 *
 * La posiciones que recibe la función son posiciones de ajedrez: a5, h4,c8
 *
 * Para recordar una imagen de un tablero con las posiciones:
 */

public class examen_azul_ej3 {
    public static void main(String[] args) {
        final int DIMENSION = 8;
        String[][] tablero = new String[DIMENSION][DIMENSION];
        String abc = "abcdefgh";
        String posReina = "d7";
        String posRey = "e6";
        int xReina=0;
        int yReina=0;
        int xRey = 0;
        int yRey = 0;
        //RELLENAR EL TABLERO
        for (int i = 0; i < tablero.length ; i++) {
            for (int j = 0; j < tablero.length; j++) {
                tablero[i][j] = abc.charAt(j) + String.valueOf(tablero.length - i);
                if (tablero[i][j].equals(posReina)){
                    xReina = i;
                    yReina = j;
                }
                if (tablero[i][j].equals(posRey)){
                    xRey = i;
                    yRey = j;
                }
            }
        }
        // DIAGONAL u HORIZONTAL
        for (int i = 0; i < 8; i++) {
            if ( (Math.abs((xReina - xRey)) == Math.abs((yReina - yRey))) || ((xReina == xRey || yReina == yRey))){
                System.out.println("jaque");
                break;
            }
        }
//        if(jaque(posRey, posReina, tablero)){
//            System.out.println("Jaque Mate");
//        }
//    }
//    public static boolean jaque(String posRey,String posReina, String[][] ajedrez){
//        //PROBAR SI ESTÁ EN LA MISMA FILA O LA MISMA COLUMNA
//        for (int i = 0; i < 2; i++) {
//            for (int j = 0; j < 2; j++) {
//
//                // SI COINCIDE FILA
//                if( ( Character.compare( posReina.charAt(i), posRey.charAt(i) ) == 0) ){
//                    return true;
//                    // SI COINCIDE COLUMNA
//                } else if ( ( Character.compare( posReina.charAt(j), posRey.charAt(j) ) == 0) ){
//                    return true;
//                }
//
//            }
//        }

    }
}
