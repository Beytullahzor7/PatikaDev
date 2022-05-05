package FolksDev.javaStream;

import java.util.Arrays;

public class LetterCount {
    public static void main(String[] args) {
        String[] strArray = {"william", "jones", "aaron", "seppe", "frank", "gilliam"};
        System.out.println(getTotalNumberOfLettersOfNamesLongerThanFive(strArray));

    }

    //Gelen arrayin elemanlarını al ==> stream()
    //İsim uzunlugu 5 ten büyük olanları bul ==> filter()
    //Geri kalan listedeki tüm harflerin sayisini getir ==> mapToInt()
    //Harf sayilarini topla ==> sum()
    public static int getTotalNumberOfLettersOfNamesLongerThanFive(String... names) {
        return Arrays.stream(names)
                .filter(name -> name.length() > 5) //Stream<String>
                .mapToInt(name -> name.length())   //Stream<Integer>
                .sum();
    }
}
