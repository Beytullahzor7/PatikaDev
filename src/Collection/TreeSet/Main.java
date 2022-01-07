package Collection.TreeSet;

import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        TreeSet<Student> students = new TreeSet<>(new OrderNoteComparator());
        //TreeSet<Student> students = new TreeSet<>(new OrderNoteComparator().reversed());
        //TreeSet<Student> students = new TreeSet<>(new OrderNameCompare());


        students.add(new Student("Beytullah", 100));
        students.add(new Student("Ali", 50));
        students.add(new Student("Merve", 70));
        students.add(new Student("Damla", 75));

        for(Student stu : students){
            System.out.println(stu.getName());
        }
    }
}
