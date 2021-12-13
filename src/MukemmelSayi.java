import java.util.Scanner;

public class MukemmelSayi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Sayiyi Giriniz: ");
        int n = input.nextInt();
        int toplam = 0;

        for(int i=1; i<=n; i++){
            if(n % i == 0){
                toplam+=i;
            }
        }
        if((toplam-n) == n){
            System.out.println(n + " mükemmel sayıdır");
        }
        else{
            System.out.println(n + " mükemmel sayi degildir.");
        }
    }
}
