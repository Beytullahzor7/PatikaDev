package ExceptionHandling;

import java.util.Scanner;

public class Throw2 {
    public static void checkAge(int age) throws Exception{
        if(age < 18){
            throw new Exception("Yaşınız Tutmuyor!");
        }
        System.out.println("Yaşınız Uygundur...");
    }

    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        System.out.print("Yasınızı Giriniz: ");

        int age = input.nextInt();

        checkAge(age);

        System.out.println("Program Bitti...");
    }
}
