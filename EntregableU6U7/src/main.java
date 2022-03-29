
import java.util.TreeSet;

/*
Elabora en el programa principal los objetos necesarios para probar la aplicación.
Deberás crear al menos 5 divisas, 3 de ellas criptomonedas y las otras dos fiat.
Crea los pares suficientes para que se pueda realizar una serie de cotizaciones.
 */
public class main {

    public static void main(String[] args) {
        Divisa d1 = new Fiat("euro", "e", "francia");
        Divisa d2 = new Fiat("dolar", "$", "EEUU");
        Divisa d3 = new Fiat("Yuan", "Y", "China");
        Divisa d4 = new Criptomoneda("Ethereum", "Et", 12400.0, 12500.33, 3, "12/01/2022");
        Divisa d5 = new Criptomoneda("Bitcoin", "B", 15360.22, 14000.300, 6, "22/02/2022");
        ParCotizacion par1 = new ParCotizacion(d1,d4,12.3,1.22);
        ParCotizacion par2 = new ParCotizacion(d2, d5, 125.22, 3.22);
        ParCotizacion par3 = new ParCotizacion(d3,d5, 125.66, 200.0);
        TreeSet<Divisa> divisas = new TreeSet<>();
        TreeSet<ParCotizacion> parCotizacions = new TreeSet<>();
        divisas.add(d1);
        divisas.add(d2);
        divisas.add(d3);
        divisas.add(d4);
        divisas.add(d5);
        parCotizacions.add(par1);
        parCotizacions.add(par2);
        parCotizacions.add(par3);
        Exchange exchange = new Exchange(divisas, parCotizacions);
        exchange.mostrarDivisasOrdenadas();
        exchange.obtenerCotizaciones("e");
        exchange.getParCotizacions();
        exchange.getDivisas();
    }
}
