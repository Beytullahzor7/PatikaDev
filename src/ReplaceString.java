import java.util.Scanner;

public class ReplaceString {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Your input is: ");
        String text = input.nextLine();

        String output = translate(text);
        System.out.println("Output: " + output);
    }

    public static String translate(String text){
        if(text.isEmpty())
            return text;
        return translate(text.substring(1)) + text.charAt(0);
    }
}
