import java.util.Scanner;

public class DoWhile {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int password;
        boolean askPassword = true;

        do {
            System.out.println("Sifre Giriniz: ");
            password = input.nextInt();

            if(password == 123){
                System.out.println("Dogru");
                askPassword = false;
            }else{
                System.out.println("Yanlıs");
            }
        }while (askPassword);
    }
}
