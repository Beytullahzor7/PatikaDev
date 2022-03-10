package FolksDev;

public class _14_HackerrankString {
    public static void main(String[] args) {
        System.out.println(hackerrankInString("hhaacckkekraraannk"));
        System.out.println(hackerrankInString("rhbaasdndfsdskgbfefdbrsdfhuyatrjtcrtyytktjjt"));

    }

    public static String hackerrankInString(String s) {
        int iCheck = 0;
        String strChecker = "hackerrank";

        for(int i=0; i<s.length(); i++){
            if(s.charAt(i) == strChecker.charAt(iCheck)){
                iCheck++;
            }
            if(iCheck == strChecker.length()){
                return "YES";
            }
        }
        return "NO";
    }
}
