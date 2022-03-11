package FolksDev;

import java.util.Scanner;

public class _15_HackerrankDataTypes {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int i = 4;
        double d = 4.0;
        String s = "HackerRank ";

        int i1 = input.nextInt();
        double d1 = input.nextDouble();

        input.nextLine();
        String s1 = input.nextLine();

        System.out.println(i + i1);
        System.out.println(d + d1);
        System.out.println(s.concat(s1));

        input.close();
    }
}
