package Entregable21_22;

public class Construccion {
    public static void main(String[] args) {
        Material ladrillos = new Material("Ladrillos de Primera", "ladrillos del Sur, S.L.", 1100, 5);
        Material azulejos = new Material("Azulejos verde Sombrío", "Azulejos del Vinalopo, S.A", 625,12);
        Material cemento = new Material ("Cemento del bueno", "Cementos y Hormigoneras del Mediterráneo", 800, 6);
        Material ventanas = new Material ("Ventanas PVC", 30, 256);
        Material[] materialesVarios1 = {ladrillos, azulejos, cemento, ventanas};
        Material[] materialesVarios2 = {ladrillos,cemento};
        Manodeobra albanyiles = new Manodeobra("Constucciones constriSur, S.L.", "Enfoscado", 500, 6);
        Manodeobra carpinteros = new Manodeobra("Carpintería el Mueble. S.A.", "Instalación de carpintería experior", 300, 6);
        Vivienda.estancias[] estancias1 = {Vivienda.estancias.Balcon, Vivienda.estancias.Cocina, Vivienda.estancias.Comedor, Vivienda.estancias.Vestibulo};
        Vivienda.estancias[] estancias2 = {Vivienda.estancias.Comedor, Vivienda.estancias.Banyo, Vivienda.estancias.Banyo, Vivienda.estancias.Terraza};
        Vivienda.estancias[] estancias3 = {Vivienda.estancias.Dormitorio, Vivienda.estancias.Dormitorio, Vivienda.estancias.Banyo, Vivienda.estancias.Comedor, Vivienda.estancias.Cocina};
        Vivienda adosado1 = new Vivienda("Adosado", 110, estancias1);
        Vivienda adosado2 = new Vivienda("Adosado", 108, estancias2);
        Vivienda piso = new Vivienda("piso", 80, estancias3);
        Obra obra1 = new Obra(adosado1, materialesVarios1, albanyiles, Vivienda.estancias.Salon);
        Obra obra2 = new Obra(adosado2, materialesVarios1, carpinteros, Vivienda.estancias.Banyo);
        Obra obra3 = new Obra(piso, materialesVarios2, albanyiles, Vivienda.estancias.Comedor);

        /* ---------- PRUEBAS MÉTODOS ----------------*/
        // Material
        Material.setIva(0.10f);
        System.out.println(Material.getIva());
        ladrillos.setPrecioUnidad(-6);
        ladrillos.setUnidades(1100);
        ladrillos.mostrarInfo();
        // Mano de Obra
        albanyiles.mostrarInfo();
        // Vivienda
        Vivienda.mostrarEstanciasPosibles();
        adosado1.eliminarEstancia(2);
        adosado1.addEstancia(Vivienda.estancias.Dormitorio);
        adosado1.mostrarInfo();
        // Obra
        obra1.addMaterial(cemento);
        obra1.delMaterial(2);
        obra1.mostrarInfo();
    }
}
