package OtherSubjects;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class SayıTahmin {
    public static void main(String[] args) {
        Random rand = new Random();
        int number = rand.nextInt(100); //between 0-100

        Scanner input = new Scanner(System.in);
        int right=0;
        int selected;
        int[] wrongChoices = new int[5];
        boolean isWin = false;
        boolean isWrong = false;

        System.out.println(number);

        while (right < 5){
            System.out.print("Tahmininizi Giriniz: ");
            selected = input.nextInt();

            if(selected < 0 || selected > 99){
                System.out.println("Lütfen 0-100 arasında bir deger giriniz");
                if(isWrong){
                    right++;
                    System.out.println("Çok fazla hatalı deger girdiniz. Kalan hak: " + (5-right));
                }else{
                    isWrong = true;
                    System.out.println("Bir sonraki hatalı girişinizde hakkınız azalacaktır");
                }
                continue;
            }

            if(selected == number){
                System.out.println("Tebrikler sayiyi dogru tahmin ettiniz: " + number);
                isWin = true;
                break;
            }else{
                System.out.println("Girdiginiz tahmin dogru degil...");
                if(selected > number){
                    System.out.println(selected + " sayisi rasgele üretilen sayıdan büyüktür");
                }else{
                    System.out.println(selected + " sayisi rasgele üretilen sayıdan kücüktür");
                }
                wrongChoices[right++] = selected;
                System.out.println("Kalan hakkınız: " + (5-right));
            }
        }
        if(!isWin){
            System.out.println("Kaybettiniz!");
            if(!isWrong){
                System.out.println("Tahminleriniz: " + Arrays.toString(wrongChoices));
            }
        }
    }
}
