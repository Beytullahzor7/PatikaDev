package Arrays;

public class MatrisTranspoz {
    public static void main(String[] args) {
        int[][] matris = {{2, 3, 4}, {5, 6, 4}};
        System.out.println("Matris: ");
        for(int i=0; i<matris.length; i++){
            for(int j=0; j<=matris.length; j++){
                System.out.print(" "+matris[i][j]);
            }
            System.out.println();
        }

        System.out.println("Transpoze: ");
        for (int i = 0; i <= matris.length; i++) {
            for (int j = 0; j < matris.length; j++) {
                System.out.print(" "+matris[j][i]);
            }
            System.out.println();
        }
    }
}
