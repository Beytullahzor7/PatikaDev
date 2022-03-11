package FolksDev;

public class _15_LengthEncoding {
    public static void main(String[] args) {
        String test1 = "AAAABBBCCD"; // 4A3B2C;
        System.out.println(runLengthEncoding(test1));
    }

    public static String runLengthEncoding(String s){
        String retString = "";

        int counter = 0;
        char holder = s.charAt(0);

        for(int i=0; i<s.length(); i++){
            if(s.charAt(i) == holder){
                counter++;
                if(counter == 9){
                    retString += counter+""+holder;
                    counter = 0;
                }
            }
            else{
                if(counter != 0)
                    retString += counter+""+holder;
                counter=1;
            }
            holder = s.charAt(i);
        }
        retString += counter+""+holder;
        return retString;
    }
}
