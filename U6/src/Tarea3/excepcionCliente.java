package Tarea3;

public class excepcionCliente extends Exception {
    private Integer edad;
    public excepcionCliente ( Integer edad) {
        super();
        this.edad = edad;

    }
    @Override
    public String getMessage(){
        String mensaje = "";
        if ( !(this.edad > 0 && this.edad <= 100) ) {
            mensaje = "La edad debe estar comprendida entre 1 y 100 años";
        } else if ( this.edad < 18 ){
            mensaje = "La edad debe ser mayor de 18";
        }
        return mensaje;
    }
}
