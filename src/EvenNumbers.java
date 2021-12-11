import java.util.Scanner;

public class EvenNumbers {
    public static void main(String[] args) {
        double toplam = 0;
        int kacSayi = 0;

        Scanner input = new Scanner(System.in);

        System.out.println("Sayınızı Giriniz: ");
        int j = input.nextInt();

        for (int i=0; i<=j; i++){
            if(i%3 == 0 && i%4 == 0){
                toplam+=i;
                kacSayi+=1;
            }
        }
        System.out.println("3 ve 4 e Bölünen Sayıların Ortalaması " +toplam/kacSayi);
    }
}
