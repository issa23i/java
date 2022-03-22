package Tarea4;

import java.io.*;
import java.util.*;

// preguntas :

// linea 24 es incorrecto? en el ejercicio hecho en clase se declara
// o es así ?? static Map mapaEmp = new LinkedHashMap();

// cuando sale en gris los throws es que realmente no hacen falta? líneas 25, 29, 35...

// excepcion 109 hay que capturarla y poner throws ? las dos cosas?
// porque no funcionan las excepciones¿¿ 109 y 149

public class GestionEmpleados implements Serializable {

    /* -------- ATRIBUTOS --------- */

    static String archivo = "empleados.dat";
    static LinkedHashMap<String, Empleado> mapaEmpleados = new LinkedHashMap<>();

    /* ------- CONSTRUCTOR --------- */

    public GestionEmpleados( )  throws FileNotFoundException, ClassNotFoundException, IOException {
        menu();
    }

    public static void main(String[] args) throws IOException, ClassNotFoundException, FileNotFoundException {
        GestionEmpleados gest = new GestionEmpleados();
    }

    /* ------- MÉTODOS --------- */

    public void menu () throws FileNotFoundException, ClassNotFoundException, IOException {
        int entradaTeclado = 0;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("Introduzca una de las siguientes opciones: ");
            System.out.println("1 - Cargar empleados de fichero");
            System.out.println("2 - Insertar empleados ");
            System.out.println("0 - Terminar entrada de empleados ");
            entradaTeclado = sc.nextInt();
            switch (entradaTeclado) {
                case 1 -> leerArchivo();
                case 2 -> mapaEmpleados = introducirEmpleados();
                default -> {
                }
            }
        } while (mapaEmpleados.isEmpty() && entradaTeclado != 0);

        do {
            entradaTeclado = 0;

            System.out.println("Introduzca una de las siguientes opciones: ");
            System.out.println("1 - Modificar empleado ");
            System.out.println("2 - Visualizar listado ");
            System.out.println("3 - Borrar empleado ");
            System.out.println("4 - Guardar archivo ");
            System.out.println("0 - Salir");
            entradaTeclado = sc.nextInt();
            switch (entradaTeclado){
                case 1:
                    String dni = teclearDNI();
                    if (buscarEmpleado(dni)){
                        modificarEmpleado(dni);
                    }
                    break;
                case 2:
                    visualizarListado();
                    break;
                case 3:
                    borrarEmpleados();
                    break;
                case 4:
                    escribirArchivo();
                    break;
                case 0:
                    entradaTeclado = 0;
                default:
                    break;
            }
        } while (!mapaEmpleados.isEmpty() && entradaTeclado != 0);
        visualizarListado();
    }

    private String teclearDNI (){
        Scanner sc1 = new Scanner(System.in);
        String dni = "";
        System.out.println("Introduzca el dni del empleado a buscar: ");
        dni = sc1.nextLine();
        return dni;
    }

    private boolean buscarEmpleado(String dni) {
        boolean existe = false;
        if (dni.isEmpty()) {
            System.out.println("El dni introducido no es válido o está vacío");
            return false;
        } else if (mapaEmpleados.containsKey(dni)) {
            existe = true;
            return true;
        } else {
            System.out.println("El dni introducido no existe en la lista de empleados");
            return existe;
        }
    }

    public void modificarEmpleado (String dni ) throws InputMismatchException{
        String nombre;
        int edad;
        double estatura, sueldo;
        Empleado e = mapaEmpleados.get(dni);
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduzca el nombre del empleado: ");
        nombre = sc.nextLine();
        e.setNombre(nombre);
        try {
            System.out.println("Introduzca la edad del empleado:  ");
            edad = sc.nextInt();
            e.setEdad(edad);
        } catch (InputMismatchException noVale) {
            System.out.println("El dato introducido es incorrecto");
            edad = 0;
        }
        try {
            System.out.println("Introduzca la estatura (en metros) del empleado: ");
            estatura = sc.nextDouble();
            e.setEstatura(estatura);
        } catch (InputMismatchException noVale) {
            System.out.println("El dato introducido es incorrecto");
            estatura = 0;
        }
        try {
            System.out.println("Introduzca el salario del empleado: ");
            sueldo = sc.nextDouble();
            e.setSueldo(sueldo);
        } catch (InputMismatchException noVale) {
            System.out.println("El dato introducido es incorrecto");
            sueldo = 0;
        }
        mapaEmpleados.put(dni,e);
        //// Mapaempleados.put(dni) no lo mete nuevo, lo machaca y modifica
        escribirArchivo();
        visualizarListado();
    }

    public LinkedHashMap<String, Empleado> introducirEmpleados() throws InputMismatchException{
        Scanner sc = new Scanner(System.in);
        boolean exit = false;
        int salir = 1;
        String dni, nombre;
        int edad;
        double estatura, sueldo;
        while ( !exit )  {
            System.out.println("Introduzca el dni del empleado: ");
            dni = sc.nextLine();
            System.out.println("Introduzca el nombre del empleado: ");
            nombre = sc.nextLine();
            try {
                System.out.println("Introduzca la edad del empleado:  ");
                edad = sc.nextInt();
            } catch (InputMismatchException noVale) {
                System.out.println("El dato introducido es incorrecto");
                edad = 0;
            }
            try {
                System.out.println("Introduzca la estatura (en metros) del empleado: ");
                estatura = sc.nextDouble();
            } catch (InputMismatchException noVale) {
                System.out.println("El dato introducido es incorrecto");
                estatura = 0;
            }
            try {
                System.out.println("Introduzca el salario del empleado: ");
                sueldo = sc.nextDouble();
            } catch (InputMismatchException noVale) {
                System.out.println("El dato introducido es incorrecto");
                sueldo = 0;
            }
            Empleado e = new Empleado(dni, nombre, edad, estatura, sueldo);
            mapaEmpleados.put(dni, e);
            System.out.println(("Introduzca 0 para salir, o cualquier otra número para continuar introduciendo empleados"));
            salir = sc.nextInt();
            if (salir == 0) {
                exit = true;
            }
        }
        escribirArchivo();
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
        Set<Map.Entry<String, Empleado>> entradas = mapaEmpleados.entrySet();
         Iterator<Map.Entry<String, Empleado>> it = entradas.iterator();
        while (it.hasNext()) {
            Map.Entry<String, Empleado> next =  it.next();
            System.out.println(next.getValue());
        }
        // otra forma de hacerlo:
        // Set<Map.Entry<String, Empleado>> entradas = MapaEmpleados.entrySet();
        //    Iterator<Map.Entry<String, Empleado>> it = entradas.iterator();
        //
        //    while (it.hasNext()) {
        //      Map.Entry<String, Empleado> entrada = it.next();
        //      System.out.println(entrada.getValue());
        //    }
    }

    public void borrarEmpleados ( ) throws FileNotFoundException, IOException {
        String dni ="";
        boolean exit = false;
        Scanner sc = new Scanner(System.in);
        while (! exit ) {
            System.out.println("Escriba el dni del empleado que desee eliminar, o pulse ('*') para salir");
            dni = sc.nextLine();
            if (dni.equals("*")){
                return;
            } else if(buscarEmpleado(dni)) {
                mapaEmpleados.remove(dni);
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
