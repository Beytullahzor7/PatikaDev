import java.util.Scanner;

public class CoderbyteMathChallenge {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        CoderbyteMathChallenge d = new CoderbyteMathChallenge();
        System.out.println(d.DivisionStringified(123456789,1000));

    }

    String DivisionStringified(int num1, int num2){
        double number = (double)num1/num2;
        return String.format("%,.4f", number);
    }
}
