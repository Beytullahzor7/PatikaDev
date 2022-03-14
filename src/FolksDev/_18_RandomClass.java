package FolksDev;

import java.util.Random;

public class _18_RandomClass {
    public static void main(String[] args) {

        Random random = new Random();

        int number1 = random.nextInt(5);
        System.out.println(number1);

//        System.out.println(random.nextInt());
//        System.out.println(random.nextDouble()*10);
//        System.out.println(random.nextFloat());
//        System.out.println(random.nextBoolean());

        int number2 = random.nextInt(50) + 50; //Min value=50, max value=100;
        System.out.println(number2);

        int number3 = (int) (Math.random()*10);
        System.out.println(number3);

        System.out.println(generateRandomNumber(5));
    }

    public static int generateRandomNumber(int num){
        return new Random().nextInt(num);
    }
}
