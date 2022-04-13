package Examen_ROJO;

import java.util.Arrays;

/**
 * Realiza un programa que calcule la estatura media, mínima y máxima en centímetros de personas de diferentes países.
 * El array que contiene los nombres de los paises es el siguiente: pais = {“España”, “Rusia”, “Japón”, “Australia”}.
 * Los datos sobre las estaturas se deben simular mediante un
 * array de 4 filas por 10 columnas con números aleatorios generados al azar entre 140 y 210.
 * Los decimales de la media se pueden despreciar. Los nombres de los países se deben mostrar utilizando
 * el array de países (no se pueden escribir directamente).
 */
public class EJ3 {
    public static void main(String[] args) {
        String[] paises = {"España", "Rusia", "Japón", "Australia"};
        int personasEstudio = 10;
        int[][] estaturas = rellenar(paises.length, personasEstudio);
        estaturaMedia(estaturas,paises);
    }
    public static int[][] rellenar(int paises, int personas){
        int [][] aleatorio = new int[paises][personas];
        for (int i = 0; i < aleatorio.length; i++) {
            for (int j = 0; j < aleatorio[i].length; j++) {
                // (int) (Math.random() * (max - min + 1) + min
                aleatorio[i][j] = (int) (Math.random() * (210-140+1) +140);
                System.out.print(aleatorio[i][j] + " ");
            }
            System.out.println();
        }
        return aleatorio;
    }
    public static void estaturaMedia(int[][] estaturas, String[] paises){
        int estaturaMedia;
        for (int i = 0; i < estaturas.length; i++) {
            estaturaMedia = 0;
            for (int j = 0; j < estaturas[i].length; j++) {
                estaturaMedia += estaturas[i][j];
            }
            estaturaMedia = estaturaMedia/estaturas[i].length;
            System.out.println("La estatura media de " + paises[i] + " es " + estaturaMedia);
        }
    }
}
