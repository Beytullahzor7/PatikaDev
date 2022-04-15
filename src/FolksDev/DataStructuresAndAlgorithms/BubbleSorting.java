package FolksDev.DataStructuresAndAlgorithms;

import java.util.Arrays;

public class BubbleSorting {
    public static void main(String[] args) {

        int[] arr = {-6,-9,5,-150,15,19,7};

        System.out.println(Arrays.toString(bubbleSorting(arr)));
    }

    public static int[] bubbleSorting(int[] intArray){
        for(int lastUnsortedIndex=intArray.length-1; lastUnsortedIndex>0; lastUnsortedIndex--){
            for(int i=0; i<lastUnsortedIndex; i++){
                if(intArray[i] > intArray[i+1]){
                    swap(intArray, i, i+1);
                }
            }
        }
        return intArray;
    }

    public static void swap(int[] arr, int i, int j){
        if(i == j) return;

        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
