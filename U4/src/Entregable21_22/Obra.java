package Entregable21_22;

import java.util.Arrays;
import java.util.Calendar;

public class Obra {
    private Vivienda vivienda;
    private Material [] materiales;
    private Manodeobra manodeobra;
    private Vivienda.estancias estancia;
    private Calendar fecha = Calendar.getInstance();

    /*-------- CONSTRUCTOR --------------*/
    public Obra (Vivienda nombreVivienda, Material[] listaMateriales, Manodeobra manodeObra, Vivienda.estancias estancia){
        this.vivienda = nombreVivienda;
        this.materiales = listaMateriales;
        this.manodeobra = manodeObra;
        this.estancia = estancia;
    }

    /*---------- MÉTODOS ------------*/
    public void addMaterial(Material nuevoMaterial){
        Material [] mat = Arrays.copyOf(getMateriales(), getMateriales().length + 1);
        mat[getMateriales().length] = nuevoMaterial;
        setMateriales(mat);
    }

    public void delMaterial (int indice){
        Material [] mat = Arrays.copyOf(getMateriales(), getMateriales().length -1);
        for (int i = 0; i < getMateriales().length; i++) {
            if(i > indice) {
                mat[i-1] = getMateriales()[i];
            }
        }
        setMateriales(mat);
    }

    public void mostrarInfo(){
        getVivienda().mostrarInfo();
        for (Material m: materiales
             ) {
            System.out.println("Material: ");
            m.mostrarInfo();
        }
        getManodeobra().mostrarInfo();
        System.out.println(getEstancia().toString());
        System.out.println(getFecha().getTime());
    }

    public Vivienda getVivienda() {
        return vivienda;
    }

    public void setVivienda(Vivienda vivienda) {
        this.vivienda = vivienda;
    }

    public Material[] getMateriales() {
        return materiales;
    }

    public void setMateriales(Material[] materiales) {
        this.materiales = materiales;
    }

    public Manodeobra getManodeobra() {
        return manodeobra;
    }

    public void setManodeobra(Manodeobra manodeobra) {
        this.manodeobra = manodeobra;
    }

    public Vivienda.estancias getEstancia() {
        return estancia;
    }

    public void setEstancia(Vivienda.estancias estancia) {
        this.estancia = estancia;
    }

    public Calendar getFecha() {
        return fecha;
    }

    public void setFecha(Calendar fecha) {
        this.fecha = fecha;
    }
}
