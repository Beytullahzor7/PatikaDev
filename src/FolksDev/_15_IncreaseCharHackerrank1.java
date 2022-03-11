package FolksDev;

public class _15_IncreaseCharHackerrank1 {
    public static void main(String[] args) {
        System.out.println(caesarCypherEncryptor("xyz", 2)); //xyz ->zab
        System.out.println(caesarCypherEncryptor("abc", 3)); //abc ->def

    }

    public static char makeFit(char ch, int key){
        int firstMove = (int)ch + key;
        if(firstMove > 122){ //ASCII tablosunda son harf olan Z 122 ye denk gelir. Z den sonra tekrar basa dönmesini istiyorum.
            firstMove-=26;
        }
        return (char)firstMove;
    }

    public static String caesarCypherEncryptor(String str, int key){
        String retStr = "";
        for(int i=0; i<str.length(); i++){
            retStr += makeFit(str.charAt(i), key%26);
        }
        return retStr;
    }
}
