package Collection;

import java.util.Iterator;
import java.util.Vector;

public class VectorExample {
    public static void main(String[] args) {
        Vector<String> vec = new java.util.Vector<>();

        vec.add("Samsun");
        vec.add("Ankara");
        vec.add("İzmir");
        vec.add("İstanbul");

        vec.add(1,"Bursa");

        System.out.println(vec.contains("Bursa"));

        Iterator<String> itr = vec.iterator();

        while (itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}
