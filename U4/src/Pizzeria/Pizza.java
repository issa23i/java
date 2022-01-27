package Pizzeria;

import java.util.Arrays;

public class Pizza {
 enum tamanyo {
     FAMILIAR,
     MEDIANA
 }
 private Ingrediente [] ingred;
 private tamanyo size;

         /*--------constructor------------*/

    public Pizza(Ingrediente[] ingred, tamanyo size ) {
        this.ingred = ingred;
        this.size = size ;
    }
    public Pizza(){
        this.ingred = new Ingrediente[3];
        this.size = tamanyo.FAMILIAR;
    }

    /*---------------- METODO DE CLASE --------*/

    static public void mostrarTamanyos(){
        System.out.println("Tamaños disponibles: ");
        for (tamanyo t: tamanyo.values()
             ) {
            System.out.print(t + " ");
        }
        System.out.println();
    }

    /*---------------- METODOS --------------*/

    public Ingrediente[] getIngred() {
        return ingred;
    }

    public void setIngred(Ingrediente[] ingred) {
        this.ingred = ingred;
    }

    public tamanyo getSize() {
        return size;
    }

    public void setSize(tamanyo size) {
        this.size = size;
    }

    public int contarIngredientes(){
        int resultado = getIngred().length;
        return resultado;
    }

    public boolean addIngrediente (Ingrediente ingredient){
        boolean anyadido = false;
        if (contarIngredientes()<3){
            this.ingred = Arrays.copyOf(getIngred(), contarIngredientes()+1);
            this.ingred[contarIngredientes()-1] = ingredient;
            anyadido = true;
        }
        return anyadido;
    }
    public void mostrarInfoPizza (){
        int totalCalorias = 0;
        System.out.println("Pizza " + this.size);
        System.out.println("Ingredientes: ");
        for (Ingrediente ing: getIngred()
             ) {
            System.out.println(ing.getStringIngrediente()+ " Calorías: "  + ing.getCaloriasCienGr());
            totalCalorias+=ing.getCaloriasCienGr();
        }
        System.out.println("Total ingredientes: " + contarIngredientes() + " - Total calorías: " + totalCalorias);
    }
}
