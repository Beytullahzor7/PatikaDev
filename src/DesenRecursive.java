import java.util.Scanner;

public class DesenRecursive {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("N sayisi: ");
        int n = input.nextInt();
        int lastN = n;
        decrease(n, lastN);

    }
    public static void decrease(int n, int lastN){
        System.out.println(n + " ");
        if(n == 0 || n < 0 ){
            increase(n+5, lastN);
        }
        else{
            decrease(n-5, lastN);
        }
    }

    public static void increase(int n, int lastN){
        System.out.println(n +" ");
        if(n == lastN){
            return;
        }else{
            increase(n+5, lastN);
        }


    }
}
