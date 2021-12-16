import java.util.Scanner;

public class RecursiveAsal {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Sayi Giriniz: ");
        int sayi = input.nextInt();

        isAsal(sayi);

    }
    public static void isAsal(int n){
        if(n <= 1){
            System.out.println("1 ve 1 den küçük sayılar asal değildir!");
        }else if(n == 2){
            System.out.println("2 asal bir sayıdır");
        }else{
            int check = 0;
            for(int i=3; i<n; i++){
                if(n % i == 0){
                    System.out.println(n + " sayısı asal degildir");
                    check+=1;
                    break;
                }
            }
            if(check == 0){
                System.out.println(n + " sayısı asaldır");
            }
        }
    }
}
