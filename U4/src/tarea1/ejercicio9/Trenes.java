package tarea1.ejercicio9;

public class Trenes {
    private Locomotoras locomotora;
    private Vagones [] v2 = new Vagones[5];
    private Maquinistas maquinista;

        /* ------------- CONSTRUCTOR  --------------- */
    Trenes (Locomotoras locomotora, Vagones [] vagones, Maquinistas maquinista){
        this.locomotora = locomotora;
        this.v2 = vagones;
        this.maquinista = maquinista;
    }

    /* ------------- MÉTODOS  --------------- */

    public Locomotoras getLocomotora() {
        return locomotora;
    }

    public void setLocomotora(Locomotoras locomotora) {
        this.locomotora = locomotora;
    }

    public Vagones[] getV2() {
        return v2;
    }

    public void setV2(Vagones[] v2) {
        this.v2 = v2;
    }

    public Maquinistas getMaquinista() {
        return maquinista;
    }

    public void setMaquinista(Maquinistas maquinista) {
        this.maquinista = maquinista;
    }
}
