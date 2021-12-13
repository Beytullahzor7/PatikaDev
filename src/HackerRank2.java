import java.util.Scanner;

public class HackerRank2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();

        for(int i=0; i<n; i++){
            int a = input.nextInt();
            int b = input.nextInt();
            int c = input.nextInt();

            int sum = a;
            for(int j=0; j<c; j++){
                int nextElement = (int)Math.pow(2, j)*b;
                sum+=nextElement;
                System.out.printf("%s ", sum);
            }
            if(i < n-1){
                System.out.print("\n");
            }
        }
        input.close();
    }
}
