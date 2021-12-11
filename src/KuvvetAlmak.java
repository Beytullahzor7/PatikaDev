import java.util.Scanner;

public class KuvvetAlmak {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Sayı Giriniz: ");
        int number = input.nextInt();

        for(int i=1; i<=number; i*=4){
            System.out.println("4 ün kuvvetleri: " + i);
        }

        System.out.println("*******************************************");
        for(int i=1; i<=number; i*=5){
            System.out.println("5 in kuvvetleri: " + i);
        }
    }
}
