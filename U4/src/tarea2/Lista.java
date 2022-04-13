package tarea2;

import java.util.Arrays;

public class Lista {
    private Integer [] numeros;

    /* ------------------ CONSTRUCTOR -------------- */

    //Dos constructores, uno por defecto que cree la tabla con capacidad para 10 números,
    // y otro al que se le pasa como argumento el tamaño inicial de la tabla.
    Lista (){
        this.numeros = new Integer[10];
    }
    Lista (Integer [] numeros){
        this.numeros = numeros;
    }


    /* ----------------- METODOS ------------------ */

    public Integer[] insertarNumFinal(int num){
        // Insertar un número al final de la lista.
        Integer[] resultado;
        resultado = Arrays.copyOf(getNumeros(), getLenghtLista()+ 1);
        resultado[getLenghtLista()] = num;
        return resultado;
    }

    public Integer[] insertarNumPrincipio(int num){
        // Insertar un número al principio de la lista.
        Integer[] resultado;
        resultado = Arrays.copyOf(getNumeros(), getLenghtLista()+ 1);
        resultado[0] = num;
        for (int i = 1; i < resultado.length; i++) {
            resultado[i] = getNumeros()[i-1];
        }
        return resultado;
    }

    public int getLenghtLista(){
        //Obtener el número de elementos insertados en la lista.
        int resultado = this.numeros.length;
        return resultado;
    }

    public Integer [] insertarNumIndice ( int num, int indice){
        // Insertar un número en un lugar de la lista cuyo índice se pasa como parámetro
        Integer [] resultado;
        resultado = Arrays.copyOf(getNumeros(), getLenghtLista() + 1);
        for (int i = 0; i < resultado.length; i++) {
            if(i<indice){
                resultado[i] = getNumeros()[i];
            } else if (i==indice){
                resultado[i] = num;
            } else {
                resultado[i] = getNumeros()[i-1];
            }
        }
        return resultado;
    }

    public Integer[] insertarListaAlFinal(Lista lista2){
        // Añadir al final de la lista los elementos de otra lista que se pasa como parámetro
        Integer[] resultado;
        resultado = Arrays.copyOf(getNumeros(), getLenghtLista() + lista2.getLenghtLista());
        for (int i = 0; i < resultado.length; i++) {
            if (i<getLenghtLista()){
                resultado[i] = getNumeros()[i];
            } else {
                resultado[i] = lista2.getNumeros()[i-getLenghtLista()];
            }
        }
        return resultado;
    }

    public Integer[] eliminarElementoIndice(int ind){
        // Eliminar un elemento cuyo índice en la lista se pasa como parámetro
        Integer [] resultado;
        resultado = Arrays.copyOf(getNumeros(), getLenghtLista()-1);
        for (int i = 0; i < resultado.length; i++) {
            if (i<ind){
                resultado[i] = getNumeros()[i];
            } else {
                resultado[i] = getNumeros()[i+1];
            }
        }
        return resultado;
    }

    public int getElementoLista ( int indice){
        // Obtener el elemento cuyo índice se pasa como parámetro
        int x = getNumeros()[indice];
        return x;
    }

    public int getIndiceElementoLista (int elemento){
        // Buscar un número en la lista, devolviendo el índice del primer lugar
        // donde se encuentre. Si no está, devolver -1.
        int indice = Arrays.binarySearch(getNumeros(), elemento);
        if (indice < 0){
            indice = -1;
        }
        return indice;
    }

    public void imprimirLista(){
        // Representar la lista con una cadena de caracteres
        for (Integer x: getNumeros()
        ) {
            System.out.print(x.toString() + " ");
        }
        System.out.println();

    }
    public Integer[] getNumeros() {
        return numeros;
    }

    public void setNumeros(Integer[] numeros) {
        this.numeros = numeros;
    }

}
