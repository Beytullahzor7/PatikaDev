package FolksDev;

import java.util.Scanner;

public class _1_SumOfNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Start entering numbers");

        int sum = 0;
        int num;

        while ((num = Integer.parseInt(input.nextLine())) != 0){
            sum+=num;
            System.out.printf("Sum : %d%n", sum);
        }
        System.out.println("Program ended");
    }
}
