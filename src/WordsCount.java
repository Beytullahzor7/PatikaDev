import java.util.Scanner;

public class WordsCount {
    String WordCount(String str) {
        char[] myArray = str.toCharArray();
        Integer count = 1;

        for(int i = 1; i < str.length(); i++) {
            if (myArray[i] == ' ' && i+1 != str.length()){
                count++;
            }
        }
        str = count.toString();
        return str;
    }

    public static void main (String[] args) {
        // keep this function call here
        Scanner s = new Scanner(System.in);
        WordsCount c = new WordsCount();
        System.out.println(c.WordCount(s.nextLine()));
    }
}
