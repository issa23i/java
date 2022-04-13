package tarea1;

public class CuentaCorriente {
    private static Banco banco;
    private int saldo;
    private int limite_de_descubrimiento;
    public String nombre;
    String dni;

    CuentaCorriente (String nombre, String dni){
        this.nombre = nombre;
        this.dni = dni;
        this.saldo = 0;
        this.limite_de_descubrimiento = -50;
    }

    public static void setBanco (Banco bn){ banco = bn; }
    public static void cambiarBanco (Banco bn){
        banco = bn;
    }
    public void showInfo (){
        System.out.println(banco.getNOMBRE());
        System.out.println(banco.getDireccionCentral());
        System.out.println("Capital: " + banco.getCapital() + "€");
        System.out.println("Saldo " + this.saldo);
        System.out.println("Límite de descubierto " + this.limite_de_descubrimiento);
        System.out.println("Cliente " + this.nombre);
        System.out.println(this.dni);
    }

    public int getSaldo() {
        return saldo;
    }

    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }

    public int getLimite_de_descubrimiento() {
        return limite_de_descubrimiento;
    }

    public void setLimite_de_descubrimiento(int limite_de_descubrimiento) {
        this.limite_de_descubrimiento = limite_de_descubrimiento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public static String getNombreBanco (){
        return banco.getNOMBRE();
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
