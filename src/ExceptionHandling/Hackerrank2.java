package ExceptionHandling;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Hackerrank2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        try{
            int x = input.nextInt();
            int y = input.nextInt();
            System.out.println(x/y);

        }catch(ArithmeticException | InputMismatchException e){
            if(e instanceof ArithmeticException){
                System.out.println("java.lang.ArithmeticException: / by zero");
            }else if(e instanceof InputMismatchException){
                System.out.println("java.util.InputMismatchException");
            }
        }
        input.close();
    }
}
