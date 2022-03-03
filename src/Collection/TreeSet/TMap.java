package Collection.TreeSet;

import java.util.TreeMap;

public class TMap {
    public static void main(String[] args) {
        TreeMap<Integer, Student> students2 = new TreeMap<>(new OrderByNoLHashMap());

        students2.put(105, new Student("Ali", 50));
        students2.put(101, new Student("Ayse", 60));
        students2.put(102, new Student("Ahmet", 70));

        for(Student stu : students2.values()){
            System.out.println(stu.getName());
        }
    }
}
