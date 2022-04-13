public class strings {
    public static void main(String[] args) {
        String s1 = "proba";
        String s2 = s1 + " proba";
        String s3 = s1 + s2 + " losmicrófonos";
        //  LENGTH
        System.out.println(s3 + " longitud: " + s3.length());
        // INDEXOF
        s2.indexOf("r"); // 1
        // LASTINDEXOF
        s2.lastIndexOf("r"); // 7
        // CHARTAT
        s2.charAt(7); // r
        // SUBSTRING
        String s4 = s3.substring(2,4); // ob
        // TOUPPERCASE - TOLOWERCASE
        s4 = s1.toLowerCase(); //  proba
        s4 = s1.toUpperCase(); // PROBA
        // EQUALS
        boolean b = s1.equals(s2); // false
        // EQUALSINGNORECASE
        b = s1.equalsIgnoreCase(s4); // True
        // COMPARETO - COMPARETOIGNORECASE
        int num = s1.compareTo(s4); // numero negativo // 0 si es igual
        num = s1.compareToIgnoreCase(s4);
        // VALUEOF
        num = 4;
        s1.valueOf(num); // "4"
        // STRINGBUFFER - STRINGBUILDER
        StringBuilder stbld = new StringBuilder();
        stbld.insert(0, "hola caracola");// añade cadena desde posición 0
        stbld.delete(0,5);// " caracola"
        stbld.deleteCharAt(6); //"caracola"
        stbld.replace(7,8," "); // "caracol "
        stbld.substring(0,5); // "cara"
        String cadena = stbld.toString(); // retorna un string
        // COMPARAR RENDIMIENTO STRINGBUFFER - STRINGBUILDER
        final int num_iteraciones = 1000000;

        // StringBuffer
        StringBuffer sbuffer = new StringBuffer();
        long inicio = System.currentTimeMillis();
        for (int i = 0; i < num_iteraciones; i++) {
            sbuffer.append("Elefante");
        }
        long fin = System.currentTimeMillis();
        System.out.println("Tiempo del StringBuffer: " + (fin - inicio));

        // StringBuilder
        StringBuilder sbuilder = new StringBuilder();
        inicio = System.currentTimeMillis();
        for (int i = 0; i < num_iteraciones; i++) {
            sbuilder.append("Elefante");
        }
        fin = System.currentTimeMillis();
        System.out.println("Tiempo del StringBuilder: " + (fin - inicio));

        // String
        String string = "";
        inicio = System.currentTimeMillis();
        for (int i = 0; i < num_iteraciones; i++) {
            string += "Elefante";
        }
        fin = System.currentTimeMillis();
        System.out.println("Tiempo del String: " + (fin - inicio));
    }
}
