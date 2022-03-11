package FolksDev;

public class _15_IncreaseCharHackerRank {
    public static void main(String[] args) {
        System.out.println(Solution("abc", 2));
        System.out.println(Solution("xyz", 2));


    }

    public static String Solution(String str, int key){
        String result = "";

        for(int i= 0; i<str.length(); i++){
            char temp = (char)(str.charAt(i) + key);

            if((int)temp > 122){ //122=Z 26 cıkarırsak A dan devam eder yani harfler basa doner
                temp-=26;
            }
            result += temp;
        }
        return result;
    }
}
