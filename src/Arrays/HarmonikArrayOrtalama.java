package Arrays;

public class HarmonikArrayOrtalama {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        double total = 0;

        for(int i=0; i<numbers.length; i++){
            total+=1.0 /numbers[i];
        }
        System.out.println(total);

    }
}
