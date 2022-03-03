package Collection;

import java.util.Iterator;
import java.util.TreeSet;

public class Tset {
    public static void main(String[] args) {
        TreeSet<Integer> nums = new TreeSet<>();

        nums.add(10);
        nums.add(60);
        nums.add(-5);
        nums.add(-4);

        Iterator<Integer> itr = nums.iterator();
        while (itr.hasNext()){
            System.out.println(itr.next());
        }

        TreeSet<String> words = new TreeSet<>();

        words.add("a");
        words.add("k");
        words.add("car");

        Iterator<String> itr2 = words.iterator();
        while (itr2.hasNext()){
            System.out.println(itr2.next());
        }
    }
}
