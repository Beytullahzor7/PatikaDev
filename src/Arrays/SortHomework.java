package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class SortHomework {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Dizinin boyutu: ");
        int n = input.nextInt();

        int[] array = new int[n];
        System.out.println("Dizinin elemanlarını giriniz: ");

        for (int i=0; i<array.length; i++){
            System.out.print((i+1)+"." + " elemanı: ");
            int a = input.nextInt();
            array[i] = a;
        }
        //System.out.println("Dizi: "+Arrays.toString(array));
        System.out.println("Sıralama: "+sortArray(array));

    }
    public static String sortArray(int[] arr){
        Arrays.sort(arr);
        return Arrays.toString(arr);
    }


}
