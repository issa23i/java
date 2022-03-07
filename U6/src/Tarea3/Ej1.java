// Crea una excepción propia, y lánzala cuando, en la clase Cliente,
// intente dársele un valor negativo o mayor de 100 al atributo edad.
// Además, otra excepción debe lanzarse cuando el cliente intente crearse con una edad menor de 18,
// puesto que no podemos dar servicio a clientes menores de edad. Pruébalo en una main,


package Tarea3;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.time.LocalDateTime;

public class Ej1 {
    private String nombreFichero;
    private Integer edad;
    private LocalDateTime ahora;

    public Ej1(Integer edad){
        this.edad = edad;
        this.nombreFichero = ahora.getDayOfMonth() + "_" + ahora.getMonth() + "_" + ahora.getYear() + "_" +
                            ahora.getHour() + "_" + ahora.getMinute() + "_" + ahora.getSecond() + "_error.log";
    }

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) throws excepcionCliente {
        if (edad < 18 || edad > 100) {
            excepcionCliente excCliente = new excepcionCliente(edad);
            try (ObjectOutputStream out = new ObjectOutputStream( new FileOutputStream(getNombreFichero()))){
                out.writeObject(excCliente.getMessage());
                throw excCliente;
            } catch (excepcionCliente | FileNotFoundException es) {
                es.getMessage();
            } catch (IOException e) {
                e.getMessage();
            }
        }
        this.edad = edad;
    }

    public String getNombreFichero() {
        return nombreFichero;
    }

    public static void main(String[] args) {

    }
}
