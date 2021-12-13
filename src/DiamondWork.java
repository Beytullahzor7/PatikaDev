import java.util.Scanner;

public class DiamondWork {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Basamak Sayısını Giriniz: ");
        int n = input.nextInt();

        for(int i=1; i<=10; i++){
            for(int j=10; j>=i; j--){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
