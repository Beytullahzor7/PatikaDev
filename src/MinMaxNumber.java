import java.util.Scanner;

public class MinMaxNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int min=0, max=0;

        System.out.println("Kac tane sayi gireceksiniz: ");
        int n = input.nextInt();

        System.out.println("Kullanıcıdan " + n+ " sayı istenecektir.");

        for(int i=1; i<=n; i++){
            System.out.println(i+"." + "Sayiyi Giriniz: ");
            int sayi = input.nextInt();

            if (i==1){
                max=sayi;
                min=sayi;
            }
            if (sayi>max)
                max=sayi;

            if (sayi<min)
                min=sayi;
        }
        System.out.println("girdiginiz" + n + "sayi icinden en buyuk olani: " + max);
        System.out.println("girdiginiz" + n + "sayi icinden en kucuk olani: " + min);
    }
}
