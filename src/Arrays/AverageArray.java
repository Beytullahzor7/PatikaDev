package Arrays;

public class AverageArray {
    public static void main(String[] args) {
        int[] list = {15, 6, 5, 7, 9, 13};
        double sum= 0;
        for(int i=0; i<list.length; i++){
            sum+=list[i];
        }
        double average = sum/list.length;
        System.out.println(average);
    }
}
