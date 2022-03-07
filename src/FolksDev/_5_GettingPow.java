package FolksDev;

import java.util.Scanner;

public class _5_GettingPow {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        for(;;){
            System.out.print("Enter base number: ");
            int baseNumber = input.nextInt();

            System.out.print("Enter pow: ");
            int powerOfNumber = input.nextInt();

            System.out.printf("Pow(%d,%d) = %d%n", baseNumber, powerOfNumber, pow(baseNumber,powerOfNumber));
        }
    }

    public static int pow(int baseNumber, int powerOfNumber){
        if(powerOfNumber == 0){
            return 1;
        }

        int result = 1;
        for(int i=0; i < powerOfNumber; i++){
            result*=baseNumber;
        }
        return result;
    }
}
