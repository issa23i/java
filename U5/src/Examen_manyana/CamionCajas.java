package Examen_manyana;

/// clase sin terminar, ejercicio sin termninar

public class CamionCajas extends Vehiculo implements Camion{
    private Caja [] carga;

    public CamionCajas(String matricula, float cargaMax, Conductor conductor, Caja [] carga) {
        super(matricula, cargaMax, conductor);
        this.carga = carga;
    }

    public boolean addCaja(Caja caja){
        return  true;
    }

    @Override
    public void descargar() {
        this.carga = new Caja[0];
    }
}
