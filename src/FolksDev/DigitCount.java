package FolksDev;

import java.util.Scanner;

public class DigitCount {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Start entering numbers: ");

        int num;

        while((num = Integer.parseInt(input.nextLine())) != 0){
            int countOfDigits = getDigitalCount(num);

            System.out.printf("The number of digits %d is : %d%n", num, countOfDigits);
            System.out.println("Enter a number");
        }
        System.out.println("The number of digits 0 is : 1");
    }

    public static int getDigitalCount(int num){
        if(num == 0){
            return 1;
        }

        int count = 0;
        while (num != 0){
            ++count;
            num /= 10;
        }
        return count;
    }
}
