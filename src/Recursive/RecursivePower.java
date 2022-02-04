import java.util.Scanner;

public class RecursivePower {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Taban Değerini Giriniz: ");
        int base = input.nextInt();
        int a = base;

        System.out.print("Üs Değerini Giriniz: ");
        int exp = input.nextInt();
        int b = exp;

        System.out.println(power(a,b));
    }

    public static int power(int base, int exp){
        if(exp == 0){
            return 1;
        }else if(base == 1){
            return 1;
        }else{
            int result = 1;
            for(int i=1; i<=exp; i++){
                result *= base;
            }
            return result;
        }
    }
}
