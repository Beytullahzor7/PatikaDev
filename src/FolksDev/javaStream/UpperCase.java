package FolksDev.javaStream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.stream.Collectors;

public class UpperCase {
    public static void main(String[] args) {

        String[] strArray = {"a", "b", "c", "d"};
        System.out.println(mapToUpperCase2(strArray));
    }

    public static Collection<String> mapToUpperCase(String[] names) {
        Collection<String> uppercaseNames = new ArrayList<>();

        for (String name : names) {
            uppercaseNames.add(name.toUpperCase());
        }
        return uppercaseNames;
    }

    //Array elemanlarının tamamını al ==> stream()
    //Büyük harflere cevir ==> map()
    //Liste olarak geri dön ==> collect()

    public static Collection<String> mapToUpperCase2(String[] names) {
        return Arrays.stream(names).map(name -> name.toUpperCase()).collect(Collectors.toList());
    }
}
