package FolksDev;

public class _15_PangramHackerRank {
    public static void main(String[] args) {
        System.out.println(pangrams("acxs"));
        System.out.println(pangrams("We promptly judged antique ivory buckles for the next prize"));

    }

    public static String pangrams(String s) {
        String alphabet = "abcdefghijklmnopqrstuwxyz";
        s = s.toLowerCase();

        for(int i=0; i<alphabet.length(); i++){
            if(!s.contains(alphabet.charAt(i)+"")){
                return "not pangram";
            }
        }
        return "pangram";
    }
}
