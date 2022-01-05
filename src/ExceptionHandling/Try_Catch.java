package ExceptionHandling;

import java.util.Scanner;

public class Try_Catch {
    public static void main(String[] args) {
        System.out.println("Program Basladı!");
        Scanner input = new Scanner(System.in);

        int a = 1;
        int b = 20;
        int c;

        try{
            System.out.println("Bölme İslemi");
            System.out.println(b/a);
            System.out.println("Bölme islemi bitti");
            c = input.nextInt();
        } catch (ArithmeticException e){
            System.out.println("Aritmetik hata alındı");
            System.out.println(e.getMessage());
        } catch (Exception e){
            System.out.println(e.getMessage());
        } finally {
            System.out.println("Bu kısım kesinlikle calısacak");
        }
        System.out.println("Program bitti.");
    }
}
