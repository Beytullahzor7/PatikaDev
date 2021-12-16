import java.util.Scanner;

public class AdvancedCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int select;

        String menu = "1- Toplama İşlemi\n"
                + "2 - Çıkarma İşlemi\n"
                + "3 - Çarpma İşlemi\n"
                + "4 - Bölme İşlemi\n"
                + "5 - Üs alma İşlemi\n"
                + "6 - Mod Alma İşlemi\n"
                + "7 - Dikdörtgen Alan ve Çevre Hesabı İşlemi\n"
                + "8-  Faktoriyel İşlemi\n"
                + "0 - Çıkış yap";

        System.out.println(menu);
        while (true){
            System.out.println("Bir İşlem Seçiniz: ");
            select = input.nextInt();

            if(select == 0){
                break;
            }

            System.out.print("İlk Sayi: ");
            int a = input.nextInt();

            System.out.print("İkinci Sayi: ");
            int b = input.nextInt();

            switch (select){
                case 1:
                    sum(a, b);
                    break;
                case 2:
                    minus(a, b);
                    break;
                case 3:
                    times(a, b);
                    break;
                case 4:
                    divide(a, b);
                    break;
                case 5:
                    power(a, b);
                    break;
                case 6:
                    mode(a, b);
                    break;
                case 7:
                    rectangle(a, b);
                    break;
                case 8:
                    factorial(a, b);
                    break;
                default:
                    System.out.println("Geçersiz Bir İşlem Girdiniz.");
            }
        }
        System.out.println("Programdan Cıkıs Yapılıyor...");
    }

    static int sum(int a, int b){
        int result = a + b;
        System.out.println("Toplam: " +result);
        return result;
    }

    static int minus(int a, int b){
        int result = a - b;
        System.out.println("Çıkarma: " +result);
        return result;
    }

    static int times(int a, int b){
        int result = a * b;
        System.out.println("Çarpım: " + result);
        return result;
    }

    static int divide(int a, int b){
        if (b == 0){
            System.out.println("İkinci sayi 0 dan farklı olmalıdır");
            return 0;
        }
        int result = a / b;
        System.out.println("Bölüm: " + result);
        return result;
    }

    static int power(int a, int b){
        int result = 1;
        for (int i=1; i<=b; i++){
            result *= a;
        }
        System.out.println("Power: " + result);
        return result;
    }

    static int mode(int a, int b){
        int result = a % b;
        System.out.println("Mode: " + result);
        return result;
    }

    static void rectangle(int a, int b){
        int result = 2 * (a + b);
        System.out.println("Dikdörtgenin Çevresi: " + result);

        int result2 = a*b;
        System.out.println("Dikdörtgenin Alanı: " + result2);
    }

    static void factorial(int a, int b){
        int result = 1;
        int result2 = 1;

        for(int i=1; i<=a; i++){
            result *= i;
        }
        System.out.println("İlk sayinin faktoriyeli: " +result);

        for(int i=1; i<=b; i++){
            result2 *= i;
        }
        System.out.println("İkinci sayinin faktoriyeli: " +result2);
    }
}
