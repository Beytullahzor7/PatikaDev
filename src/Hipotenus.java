import java.util.Scanner;

public class Hipotenus {
    public static void main(String[] args) {
        int a, b;
        double c;

        Scanner input = new Scanner(System.in);

        System.out.println("Birinci kenarı giriniz");
        a = input.nextInt();

        System.out.println("İkinci kenarı giriniz");
        b = input.nextInt();

        c = Math.sqrt((a*a) + (b*b));
        System.out.println("Hipotenüs: " + c);

        System.out.println("*********************");

        Scanner alan = new Scanner(System.in);

        System.out.println("1. Kenar");
        int d = input.nextInt();

        System.out.println("2. Kenar");
        int e = input.nextInt();

        System.out.println("3. Kenar");
        int f = input.nextInt();

        int u = (d+e+f)/2;
        int alan2 = u*(u-d)*(u-e)*(u-f);
        double alan3 = Math.sqrt(alan2);
        System.out.println("Ücgenin Alanı " + alan3);














    }
}
