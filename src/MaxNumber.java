import java.util.Scanner;

public class MaxNumber {
    public static void main(String[] args) {
        int num1, num2, num3;

        Scanner input = new Scanner(System.in);

        System.out.println("1. Number");
        num1 = input.nextInt();

        System.out.println("2. Number");
        num2 = input.nextInt();

        System.out.println("3 .Number");
        num3 = input.nextInt();

        int[] numbers = {num1,num2,num3};
        int maxNumber = maximum(numbers);

        System.out.println("The highest is: " + maxNumber);

    }
    public static int maximum(int[] numbers){
        int maxSoFar = numbers[0];
        for (int num : numbers){
            if (num > maxSoFar){
                maxSoFar = num;
            }
        }
        return maxSoFar;
    }
}
