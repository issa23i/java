package tarea1.ejercicio9;

public class Locomotoras {
    private String matricula;
    private int potenciaMotor;
    private int anyoFabricacion;
    private Mecanicos mecanico;

        /* ------------- CONSTRUCTOR  --------------- */
    Locomotoras ( String matricula, int potenciaMotor, int anyoFabricacion, Mecanicos mecanico){
        this.matricula = matricula;
        this.potenciaMotor = potenciaMotor;
        this.anyoFabricacion = anyoFabricacion;
        this.mecanico = mecanico;
    }

    /* ------------- MÉTODOS  --------------- */

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public int getPotenciaMotor() {
        return potenciaMotor;
    }

    public void setPotenciaMotor(int potenciaMotor) {
        this.potenciaMotor = potenciaMotor;
    }

    public int getAnyoFabricacion() {
        return anyoFabricacion;
    }

    public void setAnyoFabricacion(int anyoFabricacion) {
        this.anyoFabricacion = anyoFabricacion;
    }

    public Mecanicos getMecanico() {
        return mecanico;
    }

    public void setMecanico(Mecanicos mecanico) {
        this.mecanico = mecanico;
    }
}
