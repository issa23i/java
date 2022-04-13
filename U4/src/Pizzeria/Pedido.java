package Pizzeria;

import java.util.Calendar;

public class Pedido {
    Pizza pizza;
    Calendar momento;

    /* contructor sobrecargado*/

    public Pedido (){// Pizza más solicitada
        Ingrediente i1 = new Ingrediente("Jamón Ibérico", 200);
        Ingrediente i2 = new Ingrediente();
        Ingrediente[] ingredientes = {i1,i2};
        this.pizza = new Pizza();
        pizza.setIngred(ingredientes);
        pizza.setSize(Pizza.tamanyo.FAMILIAR);
        this.momento = Calendar.getInstance();
    }

    public Pedido (Pizza pizza){
        this.pizza = pizza;
        this.momento = Calendar.getInstance();
    };

    /*---------- MÉTODOS ------------*/

    public Pizza getPizza() {
        return pizza;
    }

    public void setPizza(Pizza pizza) {
        this.pizza = pizza;
    }

    public Calendar getMomento() {
        return momento;
    }

    public void setMomento(Calendar momento) {
        this.momento = momento;
    }

    public void imprimirPedido(){
        this.pizza.mostrarInfoPizza();
        System.out.println(this.momento.getTime());
    }
}
