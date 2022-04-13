package FolksDev.Exception;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Array_Exception {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] arr = new int[3];

        try {
            arr[0]=input.nextInt();
            arr[1]=input.nextInt();
            arr[2]=input.nextInt();
            arr[3]=input.nextInt();
            System.out.println(Arrays.toString(arr));

        }catch (ArrayIndexOutOfBoundsException | InputMismatchException ex){
            System.out.println("Exception Occurred " + arr.length);
        }
    }
}
