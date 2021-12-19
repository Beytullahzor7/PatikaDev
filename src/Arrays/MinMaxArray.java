package Arrays;

public class MinMaxArray {
    public static void main(String[] args) {
        int[] list = {45, 12 ,16, -3, -4, 18, 27};

        int min = list[0]; //default values
        int max = list[0];

        for(int i : list){ //foreach
            if(i < min){
                min = i;
            }
            if(i > max){
                max = i;
            }
        }
        System.out.println("Min: " +min);
        System.out.println("Max: " +max);
    }
}
