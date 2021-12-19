package Arrays;

import java.util.Arrays;

public class ArraysClass {
    public static void main(String[] args) {
        int[] list = {1,2,3,4,5};
        double[] list2 = {15,12,17,24,68};

        //System.out.println(Arrays.toString(list2));

        int[] list3 = {1,2,3,4,5,6,7};
        Arrays.fill(list3, 2,4,15);
        //System.out.println(Arrays.toString(list3));

        int[] liste = {6, 1, 55, 21, 33, -321, -21, 2, -11, 27};

        Arrays.sort(liste);
        //System.out.println(Arrays.toString(liste));
        //System.out.println(Arrays.binarySearch(liste,2));

        int[] liste5 = {6, 1, 55, 21, 33, -321, -21, 2, -11, 27};

        int[] copyArray = Arrays.copyOf(liste5, 3);
        System.out.println(Arrays.toString(copyArray));

        int[] copyOfRangeArray = Arrays.copyOfRange(liste5, 0,5);
        System.out.println(Arrays.toString(copyOfRangeArray));



    }
}
