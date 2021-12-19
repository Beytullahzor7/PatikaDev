package Arrays;

public class Foreach {
    public static void main(String[] args) {
        int[][] matris = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9},
                {10, 11, 12}
        };

        for(int[] i : matris){
            for(int eleman : i){
                System.out.print(eleman + " ");
            }
            System.out.println();
        }
    }
}
