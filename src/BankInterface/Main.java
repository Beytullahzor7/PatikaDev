package BankInterface;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Tutar giriniz: ");
        double price = input.nextDouble();

        System.out.print("Kart No Giriniz: ");
        String cardNumber = input.next();

        System.out.print("Son kullanma tarihini giriniz: ");
        String date = input.next();

        System.out.print("Guvenlik kodunu giriniz: ");
        String cvc = input.next();

        System.out.println("1. A Bankasi");
        System.out.println("2. B Bankasi");
        System.out.println("3. C Bankasi");
        System.out.println("Banka seciniz: ");
        int selectBank = input.nextInt();

        switch (selectBank){
            case 1:
                Abank a = new Abank("A bankasi", "116516", "25648");
                a.connect("127.0.0.1");
                a.payment(price, cardNumber, date, cvc);
                break;
            case 2:
                Bbank b = new Bbank("B bankasi", "4564646", "564654");
                b.connect("127.0.0.2");
                b.payment(price, cardNumber, date, cvc);

            default:
                System.out.println("Geçerli Banka giriniz");
        }



    }
}
