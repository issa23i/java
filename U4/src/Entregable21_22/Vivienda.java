package Entregable21_22;

import java.util.Arrays;

public class Vivienda {
    enum estancias {
        Salon,
        Cocina,
        Banyo,
        Dormitorio,
        Terraza,
        Vestibulo,
        Comedor,
        Balcon
    }
    private String descrip;
    private int m2;
    private estancias[] distribucion;

    /*---------- CONTRUCTOR --------------*/
    public Vivienda (String descripcion, int metrosCuadrados, estancias[] listaEstancias ){
        this.descrip = descripcion;
        this.m2 = metrosCuadrados;
        this.distribucion = listaEstancias;
    }
    /*---------- MÉTODOS ---------------*/

    public void mostrarInfo() {
        System.out.println("DESCRIPCIÓN DE LA VIVIENDA : " + getDescrip());
        System.out.println("METROS CUADRADOS : " + getM2());
        System.out.println("ESTANCIAS DE LA VIVIENDA : ");
        for (estancias e: getDistribucion()
             ) {
            System.out.print(e + " ");
        }
    }

    public static void mostrarEstanciasPosibles (){
        for (estancias e: estancias.values()
             ) {
            System.out.println(e + " ");
        }
    }

    public void addEstancia( Vivienda.estancias nuevaEstancia){
        Vivienda.estancias[] estanc = Arrays.copyOf(getDistribucion(),getDistribucion().length+1);
        estanc[getDistribucion().length] = nuevaEstancia;
        setDistribucion(estanc);
    }

    public void eliminarEstancia (int indice){
        estancias [] est = Arrays.copyOf(getDistribucion(), getDistribucion().length -1);
        for (int i = 0; i < getDistribucion().length; i++) {
            if(i > indice) {
                est[i-1] = getDistribucion()[i];
            }
        }
        setDistribucion(est);
    }

    public String getDescrip() {
        return descrip;
    }

    public void setDescrip(String descrip) {
        this.descrip = descrip;
    }

    public int getM2() {
        return m2;
    }

    public void setM2(int m2) {
        this.m2 = m2;
    }

    public estancias[] getDistribucion() {
        return distribucion;
    }

    public void setDistribucion(estancias[] distribucion) {
        this.distribucion = distribucion;
    }
}
