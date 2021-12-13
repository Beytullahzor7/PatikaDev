import java.util.Scanner;
import java.io.*;
import java.util.*;

public class HackerRank1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();

        for(int i=1; i<=10; i++){ //rows
            System.out.printf("%d x %d = %d%n", n, i, n*i );
        }
    }
}
