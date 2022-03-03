package Collection.TreeSet;

import java.util.LinkedHashMap;

public class LHashMap {
    public static void main(String[] args) {
        LinkedHashMap<Integer, Student> students = new LinkedHashMap<>();

        students.put(100, new Student("Ali", 50));
        students.put(101, new Student("Ayse", 60));
        students.put(102, new Student("Ahmet", 70));

        for(Student stu : students.values()){
            System.out.println(stu.getName());
        }
    }
}
