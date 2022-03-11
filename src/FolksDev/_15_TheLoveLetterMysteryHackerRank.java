package FolksDev;

public class _15_TheLoveLetterMysteryHackerRank {
    public static void main(String[] args) {
        // cde -> cdc (Palindrome yaptık)

    }
    public static int theLoveLetterMyMystery(String s){
        int resultOp = 0;
        int j = s.length()-1; //lastElement

        for(int i=0; i<j; i++){
            resultOp += Math.abs(s.charAt(i)-s.charAt(j));
            j--;
        }
        return resultOp;
    }
}
