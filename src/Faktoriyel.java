import java.util.Scanner;

public class Faktoriyel {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int i, j, n, m, ntoplam=1, mtoplam=1, atoplam=1;

        System.out.println("1. Sayıyı Giriniz: ");
        n = input.nextInt();

        System.out.println("2. Sayıyı Giriniz");
        m = input.nextInt();

        for (i=1; i<=n;i++){
            ntoplam*=i;
        }
        System.out.println("1. Sayının Faktöriyeli: " + ntoplam);

        for (j=1; j<=m;j++){
            mtoplam*=j;
        }
        System.out.println("2. Sayının Faktöriyeli: " + mtoplam);

        int a = n-m;
        for (i=1; i<=a;i++){
            atoplam*=i;
        }
        System.out.println("n-m nin faktöriyeli: " + atoplam);
        System.out.println("Kombinasyon: " + (ntoplam) / (mtoplam*(atoplam)));

    }
}
