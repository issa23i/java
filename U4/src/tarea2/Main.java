package tarea2;

public class Main {
    public static void main(String[] args) {
        Integer [] pruebaLista = {0, 1, 2, 3, 4, 5};
        Integer [] pruebaLista2 = {9, 8, 7, 6 , 0, 10};

        PilaTabla pila = new PilaTabla(pruebaLista);

        // probar metodo apilar
        for (Integer x: pila.apilar(1596)
        ) {
            System.out.print(x.toString() + " ");
        }
        System.out.println();

//        Lista lista = new Lista(pruebaLista);
//        Lista lista2 = new Lista(pruebaLista2);
//
//        // probar metodo insertarNumPrincipio
//        for (Integer x: lista.insertarNumPrincipio(23)
//        ) {
//            System.out.print(x.toString() + " ");
//        }
//        System.out.println();
//
//        // probar metodo insertarNumFinal
//        for (Integer x: lista.insertarNumFinal(66)
//        ) {
//            System.out.print(x.toString() + " ");
//        }
//        System.out.println();
//
//        // probar metodo insertarNumIndice
//        for (Integer x: lista.insertarNumIndice(6,3)
//             ) {
//            System.out.print(x.toString() + " ");
//        }
//        System.out.println();
//
//        // probar metodo insertarListaAlFinal
//        for (Integer x: lista.insertarListaAlFinal(lista2)
//        ) {
//            System.out.print(x.toString() + " ");
//        }
//        System.out.println();
//
//        // probar metodo eliminarElementoIndice
//        for (Integer x: lista.eliminarElementoIndice(3)
//        ) {
//            System.out.print(x.toString() + " ");
//        }
//        System.out.println();
//
//        // probar metodo getElementoLista
//        System.out.println(lista.getElementoLista(0));
//
//        // probar metodo getIndiceElementoLista
//        System.out.println(lista.getIndiceElementoLista(183));
    }
}
