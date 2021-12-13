import java.util.Scanner;

public class EbobEkok {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("1. Sayiyi Giriniz: ");
        int n = input.nextInt();

        System.out.println("2. Sayiyi Giriniz: ");
        int k = input.nextInt();
        int ebob = 1;
        int ekok = 1;

       while (n <= k){
           for(int i=1; i<=n; i++){
               if(n % i == 0 && k % i == 0){
                   ebob = i;
               }
           }
           System.out.println("Ebob " + ebob);

           for(int i=1; i<=(n*k); i++){
               if(i % n == 0 && i % k == 0){
                   ekok = i;
               }
           }
           System.out.println("Ekok " + ekok);
           break;
       }
    }
}
