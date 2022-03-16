package FolksDev;

import java.util.Scanner;

public class _23_HackerrankDay6 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int cases = scan.nextInt();

        for(int c=0; c<cases; c++) {
            String even="", odd="";
            String myString = scan.next();
            char[] charArray = myString.toCharArray();
            for (int i = 0; i < charArray.length; i += 2) {
                even += charArray[i];
            }
            for (int j = 1; j < charArray.length; j += 2) {
                odd += charArray[j];
            }
            System.out.println(even + " " + odd);
        }
    }
}
