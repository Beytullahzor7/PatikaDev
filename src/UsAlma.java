import java.util.Scanner;

public class UsAlma {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Üssünü Almak İstediginiz Sayi: ");
        int n = input.nextInt();

        System.out.println("Sayının Kacıncı Kuvvetini Almak İstiyorsunuz: ");
        int m = input.nextInt();

        int total=1;
        for(int i=1; i<=m; i++){
            total*=n;
        }
        System.out.println("Result: " +total);
    }
}
