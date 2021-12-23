package Arrays;

import java.util.Arrays;
import java.util.List;

public class AsList {
    public static void main(String[] args) {
        String[] array = {"Turkey", "Java"};
        List<String> v = Arrays.asList(array);
        v.set(0,"Community");
        System.out.println(v.contains("Community"));
    }
}
