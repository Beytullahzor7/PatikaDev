import java.util.Scanner;

public class ManavKasa {
    public static void main(String[] args) {
        double perArmut=2.14, perElma=3.67, perDomates=1.11, perMuz=0.95, perPatlican=5.0;

        Scanner input = new Scanner(System.in);

        System.out.println("Armut Kac kilo: ");
        double kg1 = input.nextDouble();

        System.out.println("Elma Kac kilo: ");
        double kg2 = input.nextDouble();

        System.out.println("Domates Kac kilo: ");
        double kg3 = input.nextDouble();

        System.out.println("Muz Kac kilo: ");
        double kg4 = input.nextDouble();

        System.out.println("Patlıcan Kac kilo: ");
        double kg5 = input.nextDouble();

        double total = ((kg1*perArmut)+(kg2*perElma)+(kg3*perDomates)+(kg4*perMuz)+(kg5*perPatlican));
        System.out.println("Toplam Tutar: " +total+ " TL");




    }
}
