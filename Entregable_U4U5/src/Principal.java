import java.util.Arrays;

public class Principal {
    public static void main(String[] args) { // en el constructor leido se pasa o se entiende no leido???
        Pelicula peli1 = new Pelicula("It", "Spielberg", 2005, 125, "Magallanes","EEUU" );
        Pelicula peli2 = new Pelicula("El tren", "Spielberg", 2007, 125, "Magallanes","EEUU" );
        Pelicula peli4 = new Pelicula("Rambo", "Spielberg", 2005, 125, "Magallanes","EEUU" );
        Pelicula peli5 = new Pelicula("La tormenta", "Spielberg", 2010, 125, "Magallanes","EEUU" );

        String [] capitulos1 = {"No mires atrás", "Vulcano", "Honor"};
        String [] capitulos2 = {"No me va a dar tiempo", "buscando a Nemo", "Encontrados", "La Sirenita", "Adiós, Baby, adiós", "El Tren"};
        String capitulo = "Fieras";
        Serie serie = new Serie("El cuento de la criada", "un autor", 2016,3,capitulos1);
        Serie serie2 = new Serie("Succesion", "pues otro autor", 2020, 3, capitulos2);

        Libro libro1 = new Libro("La Biblia", "Anónimo", -800, "La Iglesia", "134815BB" , 800);
        Libro libro2 = new Libro("La patria en el bolsillo", "Joaquim Bosch", 2022, "Fuga", "846864BBA",210);

        Multimedia multimedia1;
        Multimedia multimedia2;
        multimedia1 = peli4;
        multimedia2 = peli5;
        Multimedia [] multimedias = {multimedia1, multimedia2};


        /* ------ PRUEBAS --------- */
        peli1.dar_por_finalizado();
        serie.add_capitulo(capitulo);
        System.out.println(serie.toString());
        serie2.eliminar_capitulo("Encontrados");
        serie2.pause();
        serie2.play();
        serie2.stop();
        peli1.play();
        peli1.pause();
        peli2.stop();
        System.out.println(serie.capituloRandom());
        System.out.println(serie2.toString());
        multimedia1.compareTo(multimedia2);
        Catalogo catalogo = new Catalogo(multimedias);
        System.out.println(catalogo.numero_de_elementos());
        catalogo.add_multimedia(peli2);
        System.out.println(catalogo.toString());
        System.out.println("--- por  id -------");
        catalogo.ordenar_por_id();
        System.out.println(catalogo.toString());
        System.out.println("--- por  año -------");
        catalogo.ordenar_por_anyo();
        System.out.println(catalogo.toString());
        System.out.println("--- por  titulo -------");
        catalogo.ordenar_por_titulo();
        System.out.println(catalogo.toString());
        System.out.println("--- eliminar -------");
        catalogo.eliminar_multimedia(multimedia2);
        System.out.println(catalogo.toString());


    }
}
