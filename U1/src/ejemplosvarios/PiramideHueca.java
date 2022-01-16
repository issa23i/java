public class PiramideHueca {
    public static void main (String args[]){
        final int ALTURA = 8;
        for (int i=0; i<ALTURA; i++) {
            for (int j=0; j<(ALTURA*2)-1; j++) {
                if (j == (ALTURA -1) - i || j == (ALTURA - 1) + i){
                    System.out.print("@");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.print("\n");
        }
        for(int i=0; i<(ALTURA*2)-1; i++){
            System.out.print("@");
        }

    }
}
