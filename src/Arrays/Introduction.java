package Arrays;

public class Introduction {
    public static void main(String[] args) {
        int[] list = new int[11];

        for(int i=0; i<list.length; i++){
            list[i] = i*10;
            System.out.println(list[i]);
        }
    }
}
