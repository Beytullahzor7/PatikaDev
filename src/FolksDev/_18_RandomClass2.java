package FolksDev;

import java.util.Arrays;
import java.util.Random;

public class _18_RandomClass2 {
    public static void main(String[] args) {

        int[] randNumbers = new int[10];

        for(int i=0; i<randNumbers.length; i++){
            randNumbers[i] = generateRandomNumber(70,100);
        }

        for(int i=0; i<randNumbers.length; i++){
            Arrays.sort(randNumbers);
            System.out.print(randNumbers[i]+ " ");
        }

    }

    public static int generateRandomNumber(int min, int max){
        return new Random().nextInt(max-min) + min;
    }
}
