import java.util.Scanner;

public class WhileExample {
    public static void main(String[] args) {
        int password, denemeHakki = 3;
        boolean isPasswordSuccess = false;

        Scanner input = new Scanner(System.in);

        while(!isPasswordSuccess){
            System.out.println("Şifre giriniz: ");
            password = input.nextInt();

            if(password == 123){
                System.out.println("Giriş Basarılı");
                isPasswordSuccess = true;
            }else{
                System.out.println("Şifrenizi kontrol ediniz!");
                denemeHakki-=1;
                if(denemeHakki == 0){
                    System.out.println("Giriş Hakkınız Doldu");
                    break;
                }
            }
        }
    }
}
