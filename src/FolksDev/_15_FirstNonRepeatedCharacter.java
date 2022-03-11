package FolksDev;

public class _15_FirstNonRepeatedCharacter {
    public static void main(String[] args) {
        String input = "abcdcaf"; // ilk tekrar etmeyen karakter b dir.
        String input2 = "aabcddeefefef";

        System.out.println(firstNonRepeatedCharacter(input2));

    }

    public static int firstNonRepeatedCharacter(String s){
        boolean isRepeated = false;

        for(int i=0; i<s.length(); i++){
            for(int j=0; j<s.length(); j++){
                if(s.charAt(i) == s.charAt(j) && i!=j){
                    isRepeated = true;
                    break;
                }
            }
            if(!isRepeated) return i;
            isRepeated=false;
        }
        return -1;
    }
}
