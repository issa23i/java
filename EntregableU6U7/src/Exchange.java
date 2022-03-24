
import java.io.*;
import java.util.*;

public class Exchange implements Serializable {
    private static final String fichero = "cotizaciones.dat";
    private TreeSet<Divisa> divisas;
    private TreeSet<ParCotizacion> parCotizacions;
    private Map<Divisa, Set<ParCotizacion>> mapa = new HashMap<>();

    public Exchange(TreeSet<Divisa> divisas, TreeSet<ParCotizacion> parCotizacions) {
        this.divisas = divisas;
        this.parCotizacions = parCotizacions;
    }

    public void guardarCotizaciones(){
        try (ObjectOutputStream out = new ObjectOutputStream( new FileOutputStream( fichero))){
            out.writeObject(mapa);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void recuperarCotizaciones(){
        try (ObjectInputStream in = new ObjectInputStream( new FileInputStream(fichero))){
            mapa = (Map<Divisa, Set<ParCotizacion>> ) in.readObject();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private List<Divisa> convertirALista (Set<Divisa> divisas){
        List<Divisa> divisaList = new ArrayList<>();
        divisaList  = divisas.stream().toList();
        return divisaList;
    }

    // mostrarDivisasOrdenadas() que muestra todas las divisas ordenadas por símbolo.
    public void mostrarDivisasOrdenadas(){
        List<Divisa> divisaList = new ArrayList<>();
        convertirALista(divisas).sort(new Comparator<Divisa>() {
            @Override
            public int compare(Divisa o1, Divisa o2) {
                return o1.getSimbolo().compareTo(o2.getSimbolo());
            }
        });
        Iterator<Divisa> it = convertirALista(divisas).iterator();
        while (it.hasNext()) {
            Divisa next =   it.next();
            System.out.println(next.toString());
        }
    }
//
//
    // obtenerCotizaciones(String simbolo) recibe como parámetro el símbolo de una divisa base,
    // y devuelve un conjunto de todos los pares de cotización asociados con ella.
    public TreeSet<ParCotizacion> obtenerCotizaciones(String simbolo){

        TreeSet<ParCotizacion> setParesCot = new TreeSet<>();
        Iterator<Divisa> it = convertirALista(divisas).iterator();
        while (it.hasNext()) {
            Divisa next = it.next();
            if (next.getSimbolo().equals(simbolo)) {
                if (mapa.containsKey(next)) {
                    setParesCot.addAll(mapa.get(next));
                }
            }
        }
        return setParesCot;
    }

    // mostrarCotizacionesAlAlzaUnaHora() que muestra todos los pares de cotización en los que
    // la divisa base tiene una cotización superior a 0. Es decir, que el porcentaje de variación en la última hora es mayor que cero.
    public void mostrarCotizacionesAlAlzaUnaHora(){
        // muestra Set<parCotizacion>
        Set<Map.Entry<Divisa,Set<ParCotizacion>>> setTmp = mapa.entrySet();
        Iterator<Map.Entry<Divisa, Set<ParCotizacion>>> it = setTmp.iterator();
        while (it.hasNext()) {
            Map.Entry<Divisa, Set<ParCotizacion>> next =  it.next();
            Iterator<ParCotizacion> itParC = next.getValue().iterator();
            while (itParC.hasNext()) {
                ParCotizacion parCotizacion =  itParC.next();
                if (parCotizacion.getVariacionPorcentual()>0){
                    System.out.println(parCotizacion.toString());
                }
            }
        }
    }


    // addCotizacion(ParCotizacion cotizacion) que añade un par de cotización con los que puede
    // operar nuestra Exchange
    public void addCotizacion(ParCotizacion cotizacion) {
        parCotizacions.add(cotizacion);
    }


    public Set<Divisa> getDivisas() {
        return divisas;
    }

    public void setDivisas(TreeSet<Divisa> divisas) {
        this.divisas = divisas;
    }

    public Set<ParCotizacion> getParCotizacions() {
        return parCotizacions;
    }

    public void setParCotizacions(TreeSet<ParCotizacion> parCotizacions) {
        this.parCotizacions = parCotizacions;
    }

    public Map<Divisa, Set<ParCotizacion>> getMapa() {
        return mapa;
    }

    public void setMapa(Map<Divisa, Set<ParCotizacion>> mapa) {
        this.mapa = mapa;
    }
}
