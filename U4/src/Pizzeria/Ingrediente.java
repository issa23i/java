package Pizzeria;

public class Ingrediente {
    private String ingrediente;
    private int caloriasCienGr;

    /* constructor sobrecargado */

    public Ingrediente (String ingrediente, int caloriasCienGr) {
        this.ingrediente = ingrediente;
        this.caloriasCienGr = caloriasCienGr;
    }
    public Ingrediente(){
        this.ingrediente = "Queso";
        this.caloriasCienGr = 250;
    }
    /*  */

    /*   getter and setter */

    public String getIngrediente() {
        return ingrediente;
    }

    public void setIngrediente(String ingrediente) {
        this.ingrediente = ingrediente;
    }

    public int getCaloriasCienGr() {
        return caloriasCienGr;
    }

    public void setCaloriasCienGr(int caloriasCienGr) {
        this.caloriasCienGr = caloriasCienGr;
    }

    public String getStringIngrediente() {
        String s = this.ingrediente;
        return s;
    }
}
