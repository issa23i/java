package Entregable21_22;

public class Material {
    private String descrip;
    private String proveed;
    private int unidades;
    private int precioUnidad;
    private static float iva = 0.12f;

    /* -------- CONSTRUCTOR ---------------*/
    public Material (String descripcion, String proveedor, int unidadesNecesarias, int precioPorUnidad){
        this.descrip = descripcion;
        this.proveed = proveedor;
        if(unidadesNecesarias < 0) {
            this.unidades = 0;
        } else if ( unidadesNecesarias > 1000) {
            this.unidades = 1000;
        } else {
            this.unidades = unidadesNecesarias;
        }
        this.unidades = unidadesNecesarias;
        if (precioPorUnidad < 0){
            this.precioUnidad = 0;
        } else if(precioPorUnidad > 100000){
            this.precioUnidad = 100000;
        } else {
            this.precioUnidad = precioPorUnidad;
        }
    }

    public Material (String descripcion,  int unidadesNecesarias, int precioPorUnidad){
        this.descrip = descripcion;
        this.proveed = "";
        if(unidadesNecesarias < 0) {
            this.unidades = 0;
        } else if ( unidadesNecesarias > 1000) {
            this.unidades = 1000;
        } else {
            this.unidades = unidadesNecesarias;
        }
        this.unidades = unidadesNecesarias;
        if (precioPorUnidad < 0){
            this.precioUnidad = 0;
        } else if(precioPorUnidad > 100000){
            this.precioUnidad = 100000;
        } else {
            this.precioUnidad = precioPorUnidad;
        }
    }

    /* -------- MÉTODOS ----------------*/
    public static float getIva (){
        return iva;
    }
    public static void setIva (float nuevoIva){
        iva = nuevoIva;
    }

    public void mostrarInfo() {
        System.out.println("DESCRIPCIÓN : " + getDescrip());
        System.out.println("PROVEEDRO : " + getProveed());
        System.out.println("IVA : " + getIva());
        System.out.println("UNIDADES : " + getUnidades());
        System.out.println("PRECIO POR UNIDAD: " + getPrecioUnidad());
    }

    public String getDescrip() {
        return descrip;
    }

    public void setDescrip(String descrip) {
        this.descrip = descrip;
    }

    public String getProveed() {
        return proveed;
    }

    public void setProveed(String proveed) {
        this.proveed = proveed;
    }

    public int getUnidades() {
        return unidades;
    }

    public void setUnidades(int unidades) {
        if(unidades < 0) {
            this.unidades = 0;
        } else if ( unidades > 1000) {
            this.unidades = 1000;
        } else {
            this.unidades = unidades;
        }
    }

    public int getPrecioUnidad() {
        return precioUnidad;
    }

    public void setPrecioUnidad(int precioUnidad) {
        if (precioUnidad < 0){
            this.precioUnidad = 0;
        } else if(precioUnidad > 100000){
            this.precioUnidad = 100000;
        } else {
            this.precioUnidad = precioUnidad;
        }
    }
}
