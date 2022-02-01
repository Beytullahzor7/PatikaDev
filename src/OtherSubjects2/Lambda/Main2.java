package OtherSubjects2.Lambda;

public class Main2 {
    public static void main(String[] args) {
        Math toplam = (a,b) -> a + b;

        Math cikarma = (a,b) -> a - b;

        Math carpma = (a,b) -> a * b;

        Math bolme = (a,b) -> {
            if(b == 0){
                b=1;
            }
            return a * b;
        };

        Math[] islemler = {toplam,cikarma,carpma,bolme};
        for(Math i : islemler){
            System.out.println(i.transaction(4,5));
        }
    }
}
