// Crea una excepción propia, y lánzala cuando, en la clase Cliente,
// intente dársele un valor negativo o mayor de 100 al atributo edad.
// Además, otra excepción debe lanzarse cuando el cliente intente crearse con una edad menor de 18,
// puesto que no podemos dar servicio a clientes menores de edad. Pruébalo en una main,

package Tarea3;

public class Ej1 {
    Integer edad;
    public Ej1(Integer edad){
        this.edad = edad;
    }

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    public static void main(String[] args) {

    }
}
