package Tarea3;

public class EnteroAleatorio implements Comparable{
    private Integer [] enterosA;
    private Integer enteroA;
    private final int RANGO = 100;
    private final int LONGITUDTABLA = 20;
    public EnteroAleatorio (){
        this.enteroA = setEnteroA();
    }

    public Integer[] getEnterosA() {
        return enterosA;
    }

    public Integer[] setEnterosA() {
        this.enterosA = new Integer[getLONGITUDTABLA()];
        for (int i = 0; i < getLONGITUDTABLA(); i++) {
            enterosA[i] = setEnteroA();
        }
        return this.enterosA;
    }

    public Integer getEnteroA() {
        return enteroA;
    }

    public int setEnteroA() {
        this.enteroA = (int) (Math.random() * getRANGO());
        return this.enteroA;
    }

    public int getRANGO() {
        return RANGO;
    }

    public int getLONGITUDTABLA() {
        return LONGITUDTABLA;
    }

    @Override
    public int compareTo(Object o) {
        int otro = !(o instanceof Integer)? 0:(int)o;
        return this.getEnteroA();
    }
    @Override
    public String toString(){
        String s = "";
        for (Integer ent: this.enterosA
        ) {
            s += ent + " ";
        }
        return s;
    }
}
