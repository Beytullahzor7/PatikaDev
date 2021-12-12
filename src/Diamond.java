import java.util.Scanner;

public class Diamond {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("1 .Sayıyı Giriniz: ");
        int n = input.nextInt();

        System.out.println("2. Sayıyı Giriniz: ");
        int r = input.nextInt();

        for(int i=1; i<=5; i++){
            for(int k = 1; k <= (n-i); k++){
                System.out.print(" ");
            }
            for (int j=1; j <= (2*i)-1; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        for(int m=6; m<=9; m++){
            for(int p=1; p<=(m-5); p++){
                System.out.print(" ");
            }
            for(int s=4; s <= (12-m); s++){
                System.out.print("**");
            }
            System.out.println();
        }
    }
}
