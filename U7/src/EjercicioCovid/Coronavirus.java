package EjercicioCovid;


import java.io.Serializable;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

public abstract class  Coronavirus implements Serializable, Comparable<Cepa> {
    private Map<Cepa, Set<Paciente>> contagiados;
    private static final String VIRUS = "SARS-COV2";
    private static final String ORIGEN = "WUHAN";


    //    Un método addPaciente() que recibe como parámetros la cepa y un posible infectado (paciente)
//    y que añadirá a la estructura de datos el paciente con la cepa determinada
//    o mostrará un mensaje de error en caso de que estemos intentando introducir
//    en el conjunto de pacientes infectados por una cepa concreta un paciente que no se haya infectado de esa cepa.
//
    public void addPaciente (Cepa cepa, Paciente paciente) {

    }

//    El método darDeAltaPaciente() que recibe como parámetro un paciente y lo da de alta,
//    borrándolo de la estructura de datos que contienen los datos de los infectados.
//    En caso de que el paciente no se encuentre, deberá mostrar el siguiente mensaje "No se ha encontrado el paciente".
//
//    El método pacientesDeUnDoctor() que mostrará por pantalla todos los pacientes
//(sean de la cepa que sean) de un médico/a determinado. Este método recibe como parámetro
//    el número de colegiado y mostrará el mensaje "Este médico/a no lleva ningún paciente"
//    en caso de que el médico/a no tenga ningún paciente de esta epidemia.
//    El método pacientesporPeso() que mostrará la lista de pacientes de una cepa, que se recibe como parámetro,
//    ordenados por peso de manera decreciente.
//
//    El método pacientesporEdad() que mostrará la lista de pacientes de una cepa, que se recibe como parámetro,
//    ordenados por edad de manera decreciente
//
//    Cuando hay un epidemia, las infecciones de los pacientes se realizan en varios días, y para no perder los datos de todos los pacientes,
//    debemos también de tener dos métodos en la clase:
//
//    cargarPacientes() que leerá todos los pacientes desde el fichero binario "pacientes.dat"
//    y los colocará en la estructura de datos.
//
//    guardarPacientes() que escribirá todos los pacientes en el fichero "pacientes.dat".


    public Map<Cepa, Set<Paciente>> getContagiados() {
        return contagiados;
    }

    public void setContagiados(Map<Cepa, Set<Paciente>> contagiados) {
        this.contagiados = contagiados;
    }
}
