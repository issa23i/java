package tarea1;

public class Bombilla {
    private boolean bombillaEncendida;
    private boolean fusibleOK;
    private boolean interruptor;
    private boolean corriente;

    /*------------ CONSTRUCTOR ---------------*/

    Bombilla (boolean fusibleOKIs, boolean interruptorIs, boolean corrienteIs){
        this.fusibleOK = fusibleOKIs;
        this.interruptor = interruptorIs;
        this.corriente = corrienteIs;
        if (this.fusibleOK && this.interruptor && this.corriente){
            this.bombillaEncendida = true;
        }
    }
    /*------------- MÉTODOS -------------------*/

    public boolean isBombillaEncendida() {
        return bombillaEncendida;
    }

    public void setFusibleRepair (){
        this.fusibleOK = true;
        this.bombillaEncendida = this.interruptor;
    }
    public void  setFusibleDown (){
        this.fusibleOK = false;
        this.bombillaEncendida = false;
    }
    public void setBombillaEncendida(boolean bombillaEncendida) {
        this.interruptor = true;
        this.bombillaEncendida = bombillaEncendida;
    }

    public boolean isInterruptor() {
        return interruptor;
    }

    public void setInterruptor(boolean interruptor) {
        this.interruptor = interruptor;
        if (fusibleOK && corriente && this.interruptor){
            this.bombillaEncendida = true;
        }
    }

    public boolean isCorriente() {
        return corriente;
    }

    public void setCorriente(boolean corriente) {
        this.corriente = corriente;
    }
}
