package tarea1;
/*
SDEFM - sintonizador digital de emisoras FM
 */
public class SDEFM {
    private static final float MHzMin = 80;
    private static final float MHzMax = 108;
    private static final float MHzIntervalo = 0.5f;
    public float display;

    /*------------ CONSTRUCTOR --------------*/

    SDEFM(){
        this.display = MHzMin;
    }

    /*-------------- MÉTODOS ----------------*/

    public void up (){
        if( (this.display + MHzIntervalo) > MHzMax) {
            this.display = MHzMin;
        } else {
            this.display += MHzIntervalo;
        }
    }
    public void down (){
        if( (this.display - MHzIntervalo) < MHzMin){
            this.display = MHzMax;
        } else {
            this.display -= MHzIntervalo;
        }
    }

    public float getDisplay() {
        return display;
    }
}
