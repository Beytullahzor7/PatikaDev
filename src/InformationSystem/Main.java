package InformationSystem;

public class Main {
    public static void main(String[] args) {
        Teacher t1 = new Teacher("Ali","123","MTM");
        Teacher t2 = new Teacher("Graham", "000", "FZK");
        Teacher t3 = new Teacher("Ahmet","1111", "BIO");

        Course matematik = new Course("Matematik", "101","MTM");
        matematik.addTeacher(t1);

        Course fizik = new Course("Fizik", "102", "FZK");
        fizik.addTeacher(t2);

        Course bio = new Course("Biyoloji", "103", "BIO");
        bio.addTeacher(t3);

        Student s1 = new Student("Mehmet","123","Matematik",matematik, fizik, bio);
        s1.addBulkExamNote(90,50,60);
        s1.isPass();



    }
}
