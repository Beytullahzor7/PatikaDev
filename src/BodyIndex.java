import java.util.Scanner;

public class BodyIndex {
    public static void main(String[] args) {
        double boy, kilo, bodyIndex;

        Scanner input = new Scanner(System.in);

        System.out.println("Lütfen boyunuzu (metre cinsinde) giriniz: ");
        boy = input.nextDouble();

        System.out.println("Lütfen kilonuzu giriniz: ");
        kilo = input.nextDouble();

        bodyIndex = kilo/(boy*boy);
        System.out.println("Vücut Kitle İndeksiniz: " + bodyIndex);






    }
}
