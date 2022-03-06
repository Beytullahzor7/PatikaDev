package FolksDev;

import java.util.Scanner;

public class DigitsSum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number: ");

        int num;

        while((num = Integer.parseInt(input.nextLine())) != 0){
            int sumOfNumbersDigits = getDigitsSum(num);

            System.out.printf("The sum of the digits of %d is : %d%n", num, sumOfNumbersDigits);
            System.out.println("Enter a number");
        }
        System.out.println("The sum of the digits of 0 is 0");
    }

    public static int getDigitsSum(int num){
        int sum = 0;

        while (num != 0){
            sum += num % 10;
            num /= 10;
        }
        return sum;
    }
}
