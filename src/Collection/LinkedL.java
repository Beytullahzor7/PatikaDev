package Collection;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class LinkedL {

    public static void main(String[] args) {
        List<String> liste = new LinkedList<>();

        liste.add("Beytullah");
        liste.add(" Zor");
        liste.add(" Java 102");

        Iterator<String> itr = liste.iterator();
        while (itr.hasNext()){
            System.out.print(itr.next());
        }
    }
}
