package Examen_ROJO;
/*
  Crear una función unirMatrices que reciba dos matrices bidimensionales de cadenas
  y devuelva la unión de las dos matrices.

  Si la matrices no tiene la misma dimensión deberá devolver un vector bidimensional vacio.

  Ejemplo1:

  HOLA	PERRO	C++
  ADIOS	GATO	PYTHON
  HASTA LUEGO	VACA	JAVA
  BD	SOBRESALIENTE	PEPE
  LM	NOTABLE	MANUEL
  PROG	APROBADO	ROSA
  El resultado de unir estas dos matrices será:

  HOLA	PERRO	C++	BD	SOBRESALIENTE	PEPE
  ADIOS	GATO	PYTHON	LM	NOTABLE	MANUEL
  HASTA LUEGO	VACA	JAVA	PROG	APROBADO	ROSA
  Ejemplo2:

  HOLA	PERRO	C++
  ADIOS	GATO	PYTHON
  HASTA LUEGO	VACA	JAVA
  BD	SOBRESALIENTE
  LM	NOTABLE
  PROG	APROBADO
  El resultado de unir estas dos matrices será:

  {}
 */
public class EJ4 {
    public static void main(String[] args) {
        String[][] matriz1 = { {"uno", "dos", "tres"}, {"cuatro", "cinco", "seis"}, {"siete", "ocho", "nueve"} };
        String[][] matriz2 = { {"casa", "piso", "zulo"}, {"coche", "moto", "bici"}, {"viaje", "estancia", "habitación"} };
        String[][] union = unirMatrices(matriz1, matriz2);
    }
    public static String[][] unirMatrices( String[][] v1, String[][] v2){
        String[][] x = new String[v1.length][v1.length * 2];
        if (v1.length == v2.length) {
            for (int i = 0; i < v1.length; i++) {
                for (int j = 0; j < v1[i].length; j++) {
                    x[i][j]= v1[i][j];
                    System.out.print(x[i][j] + " ");
                }
                for (int j = 0; j < v2[i].length; j++) {
                    x[i][j + v1.length]= v2[i][j];
                    System.out.print(x[i][j + v1.length] + " ");
                }
                System.out.println();
            }
        }
        return x;
    }
}
