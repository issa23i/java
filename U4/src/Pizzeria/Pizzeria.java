package Pizzeria;

import java.util.Arrays;

public class Pizzeria {
    Pedido [] pedidos;

    /*constructor sobrecargado capacidad inicial de array */

    public Pizzeria (Pedido[] pedidos){
        this.pedidos = pedidos;
    }
    public Pizzeria(){
        this.pedidos = new Pedido[5];
    }

    /*----------- MÉTODOS -----------*/
    public void addPedido(Pedido pedido){
        if(pedidos[pedidos.length-1] == null){
            this.pedidos[pedidos.length-1] = pedido;
        } else {
            this.pedidos = Arrays.copyOf(pedidos, pedidos.length +1);
            this.pedidos[pedidos.length-1] = pedido;
        }
    }

    public void mostrarPedidos(){
        for (Pedido ped: this.pedidos
             ) {
            ped.imprimirPedido();
        }
    }

    public int numPedidos(){
         return  this.pedidos.length;
    }

    public Pedido[] getPedidos() {
        return this.pedidos;
    }

    public void setPedidos(Pedido[] pedidos) {
        this.pedidos = pedidos;
    }
}
