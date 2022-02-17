package Tarea2;

import java.util.Comparator;

public class Cliente implements Comparable {
    private Integer dni;
    private String nombre;
    private Integer edad;
    private Integer saldo;

    /* ------- CONSTRUCTOR --------- */
    public Cliente ( Integer dni, String nombre, Integer edad, Integer saldo){
        this.dni = dni;
        this.nombre = nombre;
        this.edad = edad;
        this.saldo = saldo;
    }


    /* -------- MÉTODOS ------------- */
    @Override
    public boolean equals(Object objeto){
        Cliente c = (Cliente) objeto;
        return this.getDni().equals(c.getDni());
    }

    @Override
    public String toString(){
        String s = "DNI: " + getDni() + "\nNOMBRE: " + getNombre() + "\nEDAD: " + getEdad() + "\nSALDO: " + getSaldo();
        return s;
    }

    @Override
    public int compareTo(Object o) {
        Cliente c = (Cliente) o;
        if (!(c instanceof Cliente))return 0;
        return this.getDni()-c.getDni();
    }
    /* --------- GETTER AND SETTER ---------- */

    public Integer getDni() {
        return dni;
    }

    public void setDni(Integer dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    public Integer getSaldo() {
        return saldo;
    }

    public void setSaldo(Integer saldo) {
        this.saldo = saldo;
    }


}
