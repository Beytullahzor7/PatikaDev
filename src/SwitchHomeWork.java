import java.util.Scanner;

public class SwitchHomeWork {
    public static void main(String[] args) {
        int n1, n2, islem;

        Scanner input = new Scanner(System.in);

        System.out.println("İlk sayıyı giriniz: ");
        n1 = input.nextInt();

        System.out.println("İkinci sayıyı giriniz: ");
        n2 = input.nextInt();

        System.out.println("1-Toplama\n2-Cıkarma\n3-Carpma\n4-Bolme");
        System.out.println("Yapmak istediğiniz işlemi seçiniz: ");
        islem = input.nextInt();

        switch (islem){
            case 1:
                System.out.println("Toplam: " + (n1+n2));
                break;
            case 2:
                System.out.println("Cıkarma: " + (n1-n2));
                break;
            case 3:
                System.out.println("Carpma: " + (n1*n2));
                break;
            case 4:
                if(n2 != 0){
                    System.out.println("Bolme: " + (n1/n2));
                }else{
                    System.out.println("Bir sayı 0 a bölünemez");
                }
                break;
            default:
                System.out.println("Yapmak istediğiniz işlemi tekrar seçiniz");
        }
    }
}
