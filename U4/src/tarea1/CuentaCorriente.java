package tarea1;

public class CuentaCorriente {
    private int saldo;
    private int limite_de_descubrimiento;
    private String nombre;
    private String dni;

    public void crearCuenta (String nombre, String dni){
        this.saldo = 0;
        this.limite_de_descubrimiento = -50;
    }

    public boolean sacarDinero (int dinero){
        boolean resultado;
        if (this.saldo - dinero < limite_de_descubrimiento){
            System.out.println("No es posible realizar la operación, alcanzado límite de descubierto");
            resultado = false;
        } else {
            this.saldo -= dinero;
            System.out.println("Operación realizada con éxito");
            resultado = true;
        }
        return resultado;
    }

    public void ingresarDinero ( int dinero){
        this.saldo += dinero;
        System.out.println("Operación realizada con éxito");
    }

    public void mostrarInfo (){
        System.out.println("Nombre: " + this.nombre + "\n DNI: " + this.dni + "\n saldo: " + this.saldo);
    }
}
