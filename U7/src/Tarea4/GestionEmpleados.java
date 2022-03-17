package Tarea4;

import java.io.*;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Scanner;

public class GestionEmpleados {

    /* -------- ATRIBUTOS --------- */

    static String archivo = "empleados.dat";
    static LinkedHashMap<String, Empleado> mapaEmpleados = new LinkedHashMap<>();

    /* ------- CONSTRUCTOR --------- */

    public GestionEmpleados( )  throws FileNotFoundException, ClassNotFoundException, IOException {
        String entradaTeclado = "";
        Scanner sc = new Scanner(System.in);
        System.out.println("¿Quiere insertar los empleados por fichero ('f')? ¿O insertar la lista de empleados ('i')");
        entradaTeclado = sc.next();
        if (entradaTeclado.equals("f")) {
            leerArchivo();
        } else if (entradaTeclado.equals("i")) {
            mapaEmpleados= introducirEmpleados();
        }
        ... // quitar de aquí el menu
    }

    /* ------- MÉTODOS --------- */

    public void modificarEmpleado (String dni ) {
        String nombre;
        int edad;
        double estatura, sueldo;
        Empleado e = mapaEmpleados.get(dni);
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduzca el nombre del empleado: ");
        nombre = sc.nextLine();
        e.setNombre(nombre);
        System.out.println("Introduzca la edad del empleado:  ");
        edad = sc.nextInt();
        e.setEdad(edad);
        System.out.println("Introduzca la estatura (en metros) del empleado: ");
        estatura = sc.nextDouble();
        e.setEstatura(estatura);
        System.out.println("Introduzca el salario del empleado: ");
        sueldo = sc.nextDouble();
        e.setSueldo(sueldo);

    }

    public LinkedHashMap<String, Empleado> introducirEmpleados() {
        Scanner sc = new Scanner(System.in);
        boolean exit = false;
        String salir = " ";
        String dni, nombre;
        int edad;
        double estatura, sueldo;
        Empleado e;
        while ( !exit )  {
            System.out.println("Introduzca el dni del empleado: ");
            dni = sc.nextLine();
            System.out.println("Introduzca el nombre del empleado: ");
            nombre = sc.nextLine();
            System.out.println("Introduzca la edad del empleado:  ");
            edad = sc.nextInt();
            System.out.println("Introduzca la estatura (en metros) del empleado: ");
            estatura = sc.nextDouble();
            System.out.println("Introduzca el salario del empleado: ");
            sueldo = sc.nextDouble();
            e = new Empleado(dni, nombre, edad, estatura, sueldo);
            mapaEmpleados.put(dni, e);
            System.out.println(("Introduzca ('x') para salir, o cualquier otra tecla para continuar introduciendo empleados"));
            salir = sc.nextLine();
            if (salir.contains("x")) {
                exit = true;
            }
        }
        visualizarListado();
        return mapaEmpleados;
    }

    public void leerArchivo () {
        try (ObjectInputStream in= new ObjectInputStream( new FileInputStream(getArchivo()))){
            mapaEmpleados = (LinkedHashMap<String, Empleado>) in.readObject();
        } catch (FileNotFoundException e) {
            System.out.println("El archivo "+ getArchivo() + " no se encuentra");
        }  catch (ClassNotFoundException e) {
            System.out.println("El archivo " + getArchivo() + " no contiene una lista de empleados");
        } catch (IOException e) {
            System.out.println("El archivo "+ getArchivo() + " no pudo ser leído");
        }
    }

    public void escribirArchivo (){
        try ( ObjectOutputStream out = new ObjectOutputStream( new FileOutputStream(archivo)) ) {
            out.writeObject(mapaEmpleados);
        } catch (FileNotFoundException e) {
            System.out.println("El archivo "+ getArchivo() + " no se encuentra");
        } catch (IOException e) {
            System.out.println("El archivo "+ getArchivo() + " no pudo ser leído");
        }
    }

    public void visualizarListado (){
        Iterator<String> it = mapaEmpleados.keySet().iterator();
        while (it.hasNext()) {
            String next =  it.next();
            System.out.println(mapaEmpleados.get(next).toString());
        }
    }

    public void borrarEmpleados ( ) throws FileNotFoundException, IOException {
        String dni ="";
        boolean exit = false;
        Scanner sc = new Scanner(System.in);
        while (! exit ) {
            System.out.println("Escriba el dni del empleado que desee eliminar, o pulse ('*') para salir");
            dni = sc.nextLine();
            if (dni.contains("*")) {
                exit = true;
            } else {
                for (String s: mapaEmpleados.keySet()
                ) {
                    if (s.equals(dni)){
                        mapaEmpleados.remove(dni);
                    }
                }
            }
        }
        escribirArchivo();
        visualizarListado();
    }

    /* -------- GETTERS AND SETTERS ---------- */

    public static String getArchivo() {
        return archivo;
    }

    public static void setArchivo(String archivo) {
        GestionEmpleados.archivo = archivo;
    }

    public static LinkedHashMap<String, Empleado> getMapaEmpleados() {
        return mapaEmpleados;
    }

}
