import java.util.Scanner;

public class PositiveNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int sayi;

        /*while (sayi > 0){
            System.out.println("Sayi Giriniz: ");
            sayi = input.nextInt();
        }
        System.out.println("Girdiginiz sayi 0 dan kücüktür: " + sayi); */
        do {
            System.out.println("Sayı Giriniz: ");
            sayi = input.nextInt();
        }while (sayi>0);
        System.out.println("Girdiginiz Sayi 0 dan kücüktür");
    }
}
