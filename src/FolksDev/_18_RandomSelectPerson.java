package FolksDev;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class _18_RandomSelectPerson {
    public static void main(String[] args) {

        List<String> persons = new ArrayList<>(Arrays.asList("Ali","Veli","Merve","Gizem"));

        int counter = 0;

        while (counter < 2){
            String selected = persons.get(generateRandomNumber(0, persons.size()));
            persons.remove(selected); //Secilen kisiyi bir daha secilmemesi icin listeden cıkardık

            System.out.println(selected);
            counter++;
        }
    }

    public static int generateRandomNumber(int min, int max){
        return new Random().nextInt(max-min) + min;
    }
}
