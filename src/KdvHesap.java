import java.util.Scanner;

public class KdvHesap {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Please input your amount");
        double amount = input.nextDouble();

        boolean kdv = (amount>=0 && amount < 1000);
        double kdvCondition = kdv ? 0.18 : 0.08;

        double kdvAmount = amount*kdvCondition;
        double total = amount+kdvAmount;

        System.out.println("Kdv Amount: " + kdvAmount);
        System.out.println("Total Price: " +total);





    }
}
