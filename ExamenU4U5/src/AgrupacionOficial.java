import java.util.Arrays;

public abstract class AgrupacionOficial extends Agrupacion {

    private String nombre, autor, autorMusica, autorLetras, disfraz;
    Integrante [] integrantes;

    public AgrupacionOficial(String nombre, String autor, String autorMusica, String autorLetras, String disfraz, Integrante [] integrantes) {
        super(nombre, autor, autorMusica, autorLetras, disfraz);
        this.integrantes = integrantes;
    }

    @Override
    void cantarlaPresentacion() {

    }

    @Override
    void hacertipo() {

    }
     public void insertar_integrante(Integrante i){
        integrantes = Arrays.copyOf(integrantes, integrantes.length + 1);
        integrantes[integrantes.length-1] = i;
     }
      public boolean eliminar_integrante(Integrante i){
        boolean esta = false;
        if (indiceIntegrante(i) < 0) {
            return esta;
        } else {
            esta = true;
        }
        Integrante [] tmp = Arrays.copyOf(integrantes, integrantes.length-1);
          for (int j = 0; j < integrantes.length-1; j++) {
              if (j >= indiceIntegrante(i)){
                  tmp[j] = integrantes[j+1];
              } else {
                  tmp[j] = integrantes[j];
              }
          }
          return esta;
      }

      public int indiceIntegrante(Integrante i){
          return Arrays.binarySearch(integrantes, i);
      }

      abstract void caminito_del_falla();
}
