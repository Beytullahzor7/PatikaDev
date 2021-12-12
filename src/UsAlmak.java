import java.util.Scanner;

public class UsAlmak {
    public static void main(String[] args) {
        int n, k;

        Scanner input = new Scanner(System.in);

        System.out.println("Üssü alınacak Sayı: ");
        n = input.nextInt();

        System.out.println("Üs olacak Sayı: ");
        k = input.nextInt();

        int total=1;
        int i =1;
        while (i <= k){
            total*=n;
            i++;
        }
        System.out.println("Cevap: " + total);
    }
}
