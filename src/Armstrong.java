import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Sayı Giriniz: ");
        int number = input.nextInt();
        int basNumber = 0;
        int tempNumber = number;
        int basValue;
        int result=0;
        int basPow;

        while (tempNumber != 0){
            tempNumber /= 10;
            basNumber++;
        }

        tempNumber = number;
        while (tempNumber != 0){
            basValue = tempNumber % 10;
            basPow = 1;
            for (int i=1; i<=basNumber; i++){
                basPow *= basValue;
            }
            result += basPow;
            tempNumber /= 10;
        }
        System.out.println(result);

    }
}