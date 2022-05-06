package FolksDev.javaStream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StringShouldOutputEvenUnevenString {
    public static void main(String[] args) {
        System.out.println(getString2(Arrays.asList(3, 44)));

    }

    public static String getString(List<Integer> list) {
        return null;
    }

    public static String getString2(List<Integer> list) {
        return list.stream()
                .map(i -> {
                    String s = "";

                    if (i % 2 == 0) {
                        s += "e" + i;
                    } else {
                        s += "o" + i;
                    }
                    return s;
                }).collect(Collectors.joining(",")) + ".";
    }
}
