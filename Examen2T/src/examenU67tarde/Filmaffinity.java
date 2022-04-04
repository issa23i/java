package examenU67tarde;

import java.io.*;
import java.util.*;

public class Filmaffinity {
    private Map<Pelicula, Set<Actor>> mapaPeliActores;
    private Map<Actor, Set<Actor>> mapaActorPelis;
    private List<Actor> actores;
    private List<Pelicula> peliculas;
    private static final String ARCHIVO = "filmaffinity.dat";

    public Filmaffinity(Map<Pelicula, Set<Actor>> mapaPeliActores, Map<Actor, Set<Actor>> mapaActorPelis, List<Actor> actores, List<Pelicula> peliculas) {
        this.mapaPeliActores = mapaPeliActores;
        this.mapaActorPelis = mapaActorPelis;
        this.actores = actores;
        this.peliculas = peliculas;
    }

    public Filmaffinity(){};

    //    public void addPeliculaActor(Pelicula p, Actor a):
//    añade una película a todas las estructuras necesarias anteriores,
//    y añade un actor a todas las estructuras anteriores necesarias.
    public void addPeliculaActor(Pelicula p, Actor a) {
        actores.add(a);
        peliculas.add(p);
        Set<Actor> acto = new HashSet<>();
        Iterator<Map.Entry<Pelicula, Set<Actor>>> it = mapaPeliActores.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry<Pelicula, Set<Actor>> next =  it.next();
            if (next.equals(p)){
                acto = next.getValue();
            }
        }
        Set<Actor> pel = new HashSet<>();
        Iterator<Map.Entry<Pelicula, Set<Actor>>> itp = mapaPeliActores.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry<Pelicula, Set<Actor>> next =  it.next();
            if (next.equals(p)){
                pel = next.getValue();
            }
        }
        Set<Actor> tmpP = mapaActorPelis.get(a);
        try {
            acto.add(a);
            pel.add(p);
            mapaPeliActores.put(p,acto);
            mapaActorPelis.put(a,pel);
        } catch (NullPointerException nullPointerException) {
            System.out.println("El mapa aún está vacío");
        }

    }


//    public List<Actor> getActores(Pelicula p):
//    devuelve una lista con los actores que han participado en la Película p,
//    ordenada alfabéticamente por el apellido del actor.
    public List<Actor> getActores(Pelicula p) {
        List<Actor> tmp = new ArrayList<>();
        tmp.addAll(mapaPeliActores.get(p));
        return tmp;
    }


//    public List<Pelicula> getPeliculas(Actor a):
//    devuelve una lista con las películas en las que ha participado el Actor a,
//    ordenadas alfabéticamente en orden inverso por el título.

    public List<Actor> getPeliculas(Actor a) {
        List<Actor> tmp = new ArrayList<>();
        tmp.addAll(mapaActorPelis.get(a));
        return tmp;
    }

//    public Pelicula getPelicula(String titulo):
//    devuelve la película que coincide con el título pasado.

    public Pelicula getPelicula(String titulo){
        Pelicula p = null;
        Iterator<Pelicula> it = peliculas.iterator();
        while (it.hasNext()) {
            Pelicula next =  it.next();
            if (next.getTitulo().equals(titulo)){
                p = next;
            }
        }
        return p;
    }

//    public void removePelicula(String titulo):
//    elimina la película que coincide con el título pasado de todas las estructuras.

    public void removePelicula(String titulo){
        Pelicula p = buscarPeli(titulo);

        Iterator<Map.Entry<Pelicula, Set<Actor>>> itMapaPelis = mapaPeliActores.entrySet().iterator();
        while (itMapaPelis.hasNext()) {
            Map.Entry<Pelicula, Set<Actor>> next =  itMapaPelis.next();
            if(next.equals(p)){
                mapaPeliActores.remove(p);
            }
        }

        Iterator<Map.Entry<Actor, Set<Actor>>> itMapaActores = mapaActorPelis.entrySet().iterator();
        while (itMapaActores.hasNext()) {
            Map.Entry<Actor, Set<Actor>> next =  itMapaActores.next();
            Set<Pelicula> pelis = new TreeSet<>(next.getValue());
            pelis.remove(p);
        }

        peliculas.remove(p);

    }

    public Pelicula buscarPeli (String titulo) {
        Pelicula p = null;
        Iterator<Pelicula> it = peliculas.iterator();
        while (it.hasNext()) {
            Pelicula next =  it.next();
            if (next.getTitulo().equals(titulo)){
                p = next;
            }
        }
        return p;
    }

//    public Actor getActor(String nombre, String apellido):
//    devuelve el actor que coincide con el nombre y el apellido pasado.
//    Cada día se añaden nuevas películas y nuevos actores.
//    Por tanto, es necesario guardar las 4 estructuras de datos en un fichero binario
//    para su posterior carga al día siguiente. La clase Filmaffinity debe tener por tanto los siguientes métodos:

    public Actor getActor(String nombre, String apellido){
        Actor a = null;
        Iterator<Actor> it = actores.iterator();
        while (it.hasNext()) {
            Actor next =  it.next();
            if(next.getNombre().equals(nombre) && next.getApellido().equals(apellido)){
                a = next;
            }
        }
        return a;
    }


//    public void guardarDatos() que guarde todos los datos en un fichero binario filmaffinity.dat.

    public void guardarDatos() {
        try (ObjectOutputStream out = new ObjectOutputStream( new FileOutputStream(ARCHIVO))){
            out.writeObject(actores);
            out.writeObject(peliculas);
            out.writeObject(mapaActorPelis);
            out.writeObject(mapaPeliActores);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

//    public void cargarDatos() que cargue todos los datos desde el fichero binario filmaffinity.dat.

    public void cargarDatos() {
        try (ObjectInputStream in = new ObjectInputStream(  new FileInputStream(ARCHIVO))){
            actores = (List<Actor>) in.readObject();
            peliculas = (List<Pelicula>) in.readObject();
            mapaActorPelis = (Map<Actor, Set<Pelicula>>) in.readObject();
            mapaPeliActores = (Map<Pelicula, Set<Actor>>) in.readObject();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }  catch (ClassNotFoundException e) {
            e.printStackTrace();
        }  catch (IOException e) {
            e.printStackTrace();
        }
    }


    public Map<Pelicula, Set<Actor>> getMapaPeliActores() {
        return mapaPeliActores;
    }

    public void setMapaPeliActores(Map<Pelicula, Set<Actor>> mapaPeliActores) {
        this.mapaPeliActores = mapaPeliActores;
    }

    public Map<Actor, Set<Actor>> getMapaActorPelis() {
        return mapaActorPelis;
    }

    public void setMapaActorPelis(Map<Actor, Set<Actor>> mapaActorPelis) {
        this.mapaActorPelis = mapaActorPelis;
    }

    public List<Actor> getActores() {
        return actores;
    }

    public void setActores(List<Actor> actores) {
        this.actores = actores;
    }

    public List<Pelicula> getPeliculas() {
        return peliculas;
    }

    public void setPeliculas(List<Pelicula> peliculas) {
        this.peliculas = peliculas;
    }
}
