package entregable2021;

public class Main  {
    public static void main(String[] args) {
        Alumno a1, a2, a3, a4, a5, a6, a7, a8, a9, a10;
        a1 = new Alumno("IES ALIXAR", Instituto.Cursos.primero, Instituto.Letras.A, "Isabelica", "Pastora Soler", "44585555D");
        a2 = new Alumno("IES ALIXAR", Instituto.Cursos.primero, Instituto.Letras.A, "Puri", "Cuesta", "95333666X");
        a3 = new Alumno("IES ALIXAR", Instituto.Cursos.primero, Instituto.Letras.A, "Chenoa", "Salamanca", "41010202E");
        a4 = new Alumno("IES ALIXAR", Instituto.Cursos.primero, Instituto.Letras.A, "Carmelita", "Cantaora", "78333333T");
        a5 = new Alumno("IES ALIXAR", Instituto.Cursos.primero, Instituto.Letras.A, "Andres", "Jimenez Villanueva", "21212020Y");
        a6 = new Alumno("IES ALIXAR", Instituto.Cursos.primero, Instituto.Letras.A, "Ines", "Osborne San Francisco", "85200000V");
        a7 = new Alumno("IES ALIXAR", Instituto.Cursos.primero, Instituto.Letras.A, "Andoniio", "Del Toro", "88888999M");
        a8 = new Alumno("IES ALIXAR", Instituto.Cursos.segundo, Instituto.Letras.C, "Pepe", "Yañez Yagüe", "54444222B");
        a9 = new Alumno("IES ALIXAR", Instituto.Cursos.segundo, Instituto.Letras.B, "José", "Llanos Balboa", "58888999G");
        a10 = new Alumno("IES NAVARRO SANTAFE", Instituto.Cursos.primero, Instituto.Letras.A, "Orto", "Piedra", "23222555C");

         a1.mostrarTodosAlumnosOrdenados();
         a2.obtenerUnidadAlumno(7);
        a3.addCurso(Instituto.Cursos.tercero, a3);
        System.out.println(a3.toString());
        a4.mostrarAlumnosUnidad("primeroA");
        a5.addAlumnoUnidad(a9);
        System.out.println(a9.toString());

    }
}
