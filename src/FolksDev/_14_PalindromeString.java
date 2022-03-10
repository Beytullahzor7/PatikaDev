package FolksDev;

public class _14_PalindromeString {
    public static void main(String[] args) {
        System.out.println(isPalindrome("level"));

        System.out.println(isPalindrome2("rotor"));

    }

    public static boolean isPalindrome(String input){
        String reverse = "";

        for (int i=input.length()-1; i>=0; i--){
            reverse += input.charAt(i);
        }
        if(reverse.equals(input)){
            return true;
        }
        return false;
    }

    public static boolean isPalindrome2(String str){
        int strLen = str.length();

        for(int i=0; i<strLen; i++){
            if(str.charAt(i) == str.charAt(strLen-1)){
                return true;
            }
        }
        return false;
    }
}
