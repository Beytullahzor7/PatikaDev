import java.util.Scanner;

public class UserLogin {
    public static void main(String[] args) {
        String userName, password, passwordsifirla, newPassword;

        Scanner input = new Scanner(System.in);

        System.out.println("Kullanıcı Adınız: ");
        userName = input.nextLine();

        System.out.println("Sifreniz: ");
        password = input.nextLine();

        if(userName.equals("beytullahzor7") && password.equals("12345")){
            System.out.println("Basarıyla giris yaptınız");

        }else {
            System.out.println("Girdiginiz Bilgiler yanlıs!");
            System.out.println("Sifrenizi sıfırlamak ister misiniz (E/H)");
            passwordsifirla = input.nextLine();

            if(passwordsifirla.equals("E")){
                System.out.println("Yeni sifrenizi giriniz");
                newPassword = input.nextLine();
                if(newPassword.equals(password)){
                    System.out.println("Yeni şifreniz eskisi ile aynı olamaz");
                }else{
                    System.out.println("Yeni sifreniz basarıyla oluşturuldu");
                }
            }else{
                System.out.println("Programdan Cıkıs Yapılıyor");
            }
            }
        }
    }

