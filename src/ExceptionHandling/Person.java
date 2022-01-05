package ExceptionHandling;

public class Person {
    private int age;

    public void setAge(int age) throws IllegalArgumentException {
        if (age < 0) {
            throw new IllegalArgumentException("Yaş sıfırdan küçük olamaz!");
        }
        this.age = age;
    }
}
