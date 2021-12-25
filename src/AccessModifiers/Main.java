package AccessModifiers;

public class Main {
    public static void main(String[] args) {
        Course c1 = new Course("Matematik","MAT-101",70);
        Course c2 = new Course("Fizik","FZK-101",30);
        Course c3 = new Course("Kimya","KMY-101",90);

        Course[] dersler = {c1,c2,c3};
        Calculate.calculateNote(dersler);

    }
}
