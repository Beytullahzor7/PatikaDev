package FolksDev;

import java.util.Arrays;
import java.util.Scanner;

public class _24_HackerRankDay7 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int a = input.nextInt();
        int[] abc = new int[a];

        for(int i=0; i<a; i++){
            abc[i] = input.nextInt();
        }
        System.out.println(Arrays.toString(abc));

        findReverseArray(abc, a);
    }

    public static void findReverseArray(int[] arr, int n){
        int[] b = new int[n];
        int j=n;

        for(int i=0; i<n; i++){
            b[j-1] = arr[i];
            j-=1;
        }
        for (int k = 0; k < n; k++) {
            System.out.print("[" +b[k] + "]");
        }
    }
}
