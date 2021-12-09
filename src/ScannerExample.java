import java.util.Scanner;

public class ScannerExample {
    public static void main(String[] args) {
        java.util.Scanner input = new java.util.Scanner(System.in);
        System.out.println("your input is: ");
        String text = input.nextLine();

        String output = translate(text);
        System.out.println(output);
    }

    public static String translate(String text){
        if(text.isEmpty())
            return text;
        return translate(text.substring(1)) +text.charAt(0);
    }
}
