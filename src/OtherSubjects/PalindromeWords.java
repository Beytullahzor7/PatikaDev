package OtherSubjects;

public class PalindromeWords {
    public static void main(String[] args) {
        System.out.println(isPalindrome("kavak"));
        System.out.println(isPalindrome2("ara"));


    }
    public static boolean isPalindrome(String str){
        int i = 0; //firstIndex
        int j = str.length()-1; //lastIndex

        while (i < j){
            if(str.charAt(i) != str.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }

    public static boolean isPalindrome2(String str){
        String reverse = "";

        for(int i = str.length()-1; i>=0; i--){
            reverse += str.charAt(i);
        }
        return str.equals(reverse); //gonna return true or false
    }
}
