import java.util.Scanner;

public class Pow {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Üssünü almak istediginiz sayi: ");
        int n = input.nextInt();

        System.out.println("Kacıncı Kuvvetini Alacaksınız: ");
        int m = input.nextInt();

        int result = 1;

        for(int i=1; i<=m; i++){
            result*=n;
        }
        System.out.println("Result: "+result);
    }
}
