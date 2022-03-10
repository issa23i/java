package Tarea4;

import java.io.*;

public class RegistroLibro {
    private Libro [] libros;
    private Integer numLibros;
    private Integer maxLibros;

    public RegistroLibro (Integer maxLibros){
        this.libros = new Libro[maxLibros];
        setMaxLibros(maxLibros);
        this.numLibros = 0;
    }

    public void cargarRegistroDesdeFichero(String fichero) {
        String titulo, autor;
        int indiceDosPuntos;
        try {
            BufferedReader br = new BufferedReader(new FileReader(fichero));
            String entrada = br.readLine();
            while (entrada != null && cuantoEspacioQueda()>0){ // mientras queden entradas y el Array aún no esté lleno
                // separar de la entrada, el título del autor. Formato Título: Autor
                if (entrada.indexOf(":") >= 0){
                    indiceDosPuntos = entrada.indexOf(":");
                    titulo = entrada.substring(0,indiceDosPuntos);
                    autor = entrada.substring(indiceDosPuntos+2);
                    if (!buscarLibro(titulo)) {
                        if (!this.registro(titulo, autor)){ // si no puede ser insertado, salir del método
                            br.close();
                            return;
                        }
                    }
                }
                entrada = br.readLine();
            }
            br.close();
        } catch (FileNotFoundException e) {
            System.out.println("El archivo " + fichero + " no se encuentra, ha sido movido, renombrado o eliminado");
        } catch (ExcepcionLibro excepcionLibro) {
            excepcionLibro.getMessage();
        } catch (IOException ioException) {
            System.out.println("El archivo " + fichero + " no pudo ser leído correctamente");
        }
    }

    public void cargarRegistroAfichero( String fichero){
        String titulo, autor;
        try {
            BufferedWriter bw = new BufferedWriter( new FileWriter(fichero));
            for (Libro l: libros
                 ) {
                if (l != null) {
                    titulo = l.getTitulo();
                    autor = l.getAutor();
                    bw.write(titulo + ": " + autor);
                    bw.newLine();
                }
            }
        } catch (IOException e) {
            System.out.println("El archivo " + fichero + " no se encuentra, ha sido movido, renombrado o eliminado");
        }
    }

    public void cargarRegistroAfichero(){
        String fichero = "registro.txt";
        try {
            BufferedWriter bw = new BufferedWriter( new FileWriter(fichero));
            for (Libro l: libros
            ) {
                if (l != null) {
                    bw.write(l.toString());
                    bw.newLine();
                }
            }
            bw.close();
        } catch (IOException e) {
            System.out.println("El archivo " + fichero + " no se encuentra, ha sido movido, renombrado o eliminado");
        }
    }

    public boolean registro ( String titulo, String autor) throws ExcepcionLibro {
        boolean registrado = false;
        if (cuantoEspacioQueda()>0) { // si cabe
            libros[numLibros] = new Libro (titulo, autor);
            numLibros++;
            registrado = true;
        }
        return registrado;
    }

    public boolean buscarLibro (String titulo){
        boolean encontrado = false;
        for (Libro l: libros
             ) {
            if (l != null) {
                if (titulo.equals(l.getTitulo())){
                    encontrado = true;
                }
            }
        }
        return  encontrado;
    }

    private int cuantoEspacioQueda () {
        return  this.getMaxLibros()-this.getNumLibros();
    }

    public Libro[] getLibros() {
        return libros;
    }

    private void setLibros(Libro[] libros) {
        this.libros = libros;
        this.setMaxLibros(this.libros.length);
        this.setNumLibros(this.getMaxLibros());
        for (Libro l: this.libros
             ) {
            if (l == null) {
                this.numLibros--;
            }
        }
    }

    public Integer getNumLibros() {
        return numLibros;
    }

    private void setNumLibros(Integer numLibros) {
        this.numLibros = numLibros;
    }

    public Integer getMaxLibros() {
        return maxLibros;
    }

    private void setMaxLibros(Integer maxLibros) {
        this.maxLibros = maxLibros;
    }

    @Override
    public String toString() {
        String s = "";
        for (Libro l : libros
             ) {
            if (l == null){
                return s;
            }
            s += l.toString() + "\n";
        }
        return s;
    }
}
