package FolksDev.Exception;

import java.util.Scanner;

public class Try_Catch_Finally {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();
        int k = input.nextInt();

        try {
            System.out.printf("%d / %d = %s", n, k, n/k);
        }catch (ArithmeticException e){
            e.printStackTrace();
        }
        finally {
            System.out.println("Bu satır her kosulda calissin");
        }
    }
}
