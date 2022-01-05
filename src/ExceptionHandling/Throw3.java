package ExceptionHandling;

public class Throw3 {
    public static void main(String[] args) throws Exception {
        String a = "araba";
        String b = "b";

        System.out.println(indexOf(a,b));
    }

    public static int indexOf(String value, String searchedText) throws Exception{
        if(value == null){
            throw new Exception("Gelen deger null olamaz");
        }
        return value.indexOf(searchedText);
    }
}
