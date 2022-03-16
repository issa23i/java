package Tarea4;

public class Empleado extends Persona {
    double sueldo;

    public Empleado(String dni, String nombre, int edad, double estatura, double sueldo) {
        super(dni, nombre, edad, estatura);
        this.sueldo = sueldo;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }
}
