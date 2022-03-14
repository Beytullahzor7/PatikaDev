package FolksDev;

import java.util.Random;
import java.util.Scanner;

public class _18_RandomClass3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int resultNumber = generateRandomNumber(10,50);

        int counter = 1;

        while (true){
            System.out.print("Bir sayi giriniz : ");
            int number = input.nextInt();

            if(number == resultNumber){
                System.out.println(counter + ". denemenizde sonuca ulastınız.");
                break;

            }else if(number < resultNumber){
                System.out.println("Lütfen daha büyük bir sayi giriniz");
            }
            else{
                System.out.println("Lütfen daha kücük bir sayi giriniz");
            }
            counter++;
        }

    }
    public static int generateRandomNumber(int min, int max){
        return new Random().nextInt(max-min) + min;
    }
}
