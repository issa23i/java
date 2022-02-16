package Tarea2;

public class Tarea2 {
    public static void main(String[] args) {
      PilaTabla pl = new PilaTabla();
//        pl.Apilar(4);
//        pl.Apilar(2);
//        pl.Apilar(6);
//        pl.Desapilar();
//        pl.Desapilar();
//        pl.Desapilar();
//        pl.Desapilar();
//        pl.Desapilar();
//        System.out.println(pl.toString());
//        System.out.println(pl.getCima());
        for (int i = 0; i < 10; i++) {
            pl.Apilar(i);
        }
        System.out.println(pl.toString());
        while (pl.getCima() != -1 ) {
            System.out.print(pl.getCima() + " ");
            pl.Desapilar();
        }
        System.out.println(pl.toString());
    }
}
