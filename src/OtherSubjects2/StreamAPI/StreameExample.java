package OtherSubjects2.StreamAPI;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.stream.Collectors;

public class StreameExample {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(25);
        list.add(12);
        list.add(3);
        list.add(89);
        list.add(25);
        list.add(44);
        list.add(100);
        list.add(7);
        list.add(63);
        list.add(100);

        //Stream
        //list.stream().forEach(i -> System.out.println(i));

        //Filter
        //list.stream().filter(num -> num > 50).forEach(System.out::println);

        //Distinct = tekrarsız veriler
        //list.stream().distinct().forEach(i -> System.out.println(i));

        //Sorted
        //list.stream().sorted().forEach(i -> System.out.println(i));

        //ReverseSorted
        //list.stream().sorted(Comparator.reverseOrder()).forEach(i -> System.out.println(i));

        //Limit
        //list.stream().limit(5).forEach(i -> System.out.println(i));

        //Count
        Long c = list.stream().distinct().count();
        //System.out.println(c);

        //AnyMatch
        boolean isContain = list.stream().anyMatch(i -> i>80);
        //System.out.println(isContain);

        //Map
        list.stream().map(i -> i*2).forEach(i -> System.out.println(i));

    }
}
