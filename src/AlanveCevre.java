import java.util.Scanner;

public class AlanveCevre {
    public static void main(String[] args) {
        int r;
        double pi = 3.14;

        Scanner input = new Scanner(System.in);

        System.out.println("Yarıcapınızı giriniz: ");
        r = input.nextInt();

        double alan = pi*r*r;
        double cevre = 2*pi*r;

        System.out.println("Dairenin Alanı: " + alan);
        System.out.println("Darirenin Cevresi: " +cevre);


        System.out.println("*******************************************************");

        int aci, yaricap;
        double pi_sayisi = 3.14, alan2;

        Scanner input2 = new Scanner(System.in);

        System.out.println("Yarıcapınızı giriniz: ");
        yaricap = input2.nextInt();

        System.out.println("Acınızı Giriniz: ");
        aci = input2.nextInt();

        alan2 = (pi_sayisi*(yaricap*yaricap)*aci)/360;
        System.out.println("Alan: " + alan2);







    }
}
