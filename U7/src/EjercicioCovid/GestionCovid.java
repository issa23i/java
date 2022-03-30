//Usar dicha clase y todos sus métodos en la la clase Main. Deberéis tener, al menos, 3 cepas, 10 pacientes y 3 médicos
//        (combinados de la manera que queráis).
package EjercicioCovid;

import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class GestionCovid {
    public static void main(String[] args) {
        Cepa c1, c2, c3;
        c1 = new Cepa('a');
        c2 = new Cepa('b');
        c3 = new Cepa('c');

        Medico m1, m2, m3;
        m1 = new Medico("Andres", "Guapo", "Maria Auxiliadora", 123456);
        m2 = new Medico("Ignasi", "Grau", "Virgen de los Lirios", 123457);
        m3 = new Medico("Javier", "Grande", "Maria Auxiliadora", 123458);

        Paciente p1, p2, p3, p4, p5, p6, p7, p8, p9, p10;
        p1 = new Paciente("Pepito Grillo", m1, 3, 0.94, true, c1);
        p2 = new Paciente("Andreu Buenafuente", m1, 54, 80.94, true, c1);
        p3 = new Paciente("Javier Gallego", m1, 46, 75.94, true, c1);
        p4 = new Paciente("Ignacio Escolar", m1, 49, 73.94, true, c1);
        p5 = new Paciente("Antonio Maestre", m1, 44, 70.94, true, c1);
        p6 = new Paciente("Susana Griso", m3, 56, 63.94, true, c1);
        p7 = new Paciente("Juan Vallés", m3, 55, 80.94, true, c1);
        p9 = new Paciente("Olga Rodríguez", m3, 36, 66.94, true, c1);
        p10 = new Paciente("Elisa Beni", m2, 58, 75.94, true, c1);
        p8 = new Paciente("Angels Barceló", m2, 46, 66.94, true, c1);

        Map<Cepa, Set<Paciente>> mapaContagiados = new TreeMap<>();

        Set<Paciente> pacientes = new HashSet<>();
        pacientes.add(p1);
        pacientes.add(p2);
        pacientes.add(p3);
        m1.setPacientes(pacientes);
        pacientes.add(p3);
        pacientes.add(p4);
        pacientes.add(p5);
        pacientes.add(p6);
        m2.setPacientes(pacientes);
        pacientes.clear();
        pacientes.add(p7);
        pacientes.add(p8);
        pacientes.add(p9);
        pacientes.add(p3);
        pacientes.add(p4);
        pacientes.add(p10);
        mapaContagiados.put(c1,pacientes);



        Coronavirus coronavirus = new Coronavirus();

        coronavirus.addPaciente(c1,p1);
        coronavirus.addPaciente(c2,p2);
        coronavirus.addPaciente(c3,p3);
        coronavirus.addPaciente(c1,p4);
        coronavirus.addPaciente(c1,p5);
        coronavirus.addPaciente(c1,p6);
        coronavirus.addPaciente(c1,p7);
        coronavirus.addPaciente(c1,p8);
        coronavirus.addPaciente(c2,p9);
        coronavirus.addPaciente(c3,p10);
        System.out.println(coronavirus.getMapaContagiados());
        coronavirus.darDeAltaPaciente(p1);
        coronavirus.pacidentesDeUnDoctor(m1);
        coronavirus.pacientesporEdad(c2);
        coronavirus.pacientesporPeso(c2);
        coronavirus.guardarPacientes();
        coronavirus.cargarPacientes();


    }
}
