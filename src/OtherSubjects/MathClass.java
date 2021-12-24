package OtherSubjects;

import java.util.Random;

public class MathClass {
    public static void main(String[] args) {
        int a = (int)(Math.random()*11);
        System.out.println(a);

        Random rand = new Random();
        int b = rand.nextInt(10);
        System.out.println(b);
    }
}
