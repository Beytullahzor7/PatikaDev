package FolksDev;

import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        //123 -> 321
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num;
        while ((num = Integer.parseInt(input.nextLine())) != 0){
            int reversedNumber =  getReverse(num);
            System.out.printf("Reversed number of %d is %d%n", num, reversedNumber);
        }
        System.out.println("Program ended");
    }

    public static int getReverse(int num){
        int reverse = 0;

        while (num != 0){
            reverse = (reverse * 10) + (num % 10);
            num /= 10;
        }
        return reverse;
    }
}
