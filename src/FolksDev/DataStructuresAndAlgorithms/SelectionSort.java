package FolksDev.DataStructuresAndAlgorithms;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {

        int[] arr = {600, -9, 5, -150, 15, 19, 7};

        System.out.println(Arrays.toString(selectionSorting(arr)));
    }

    public static int[] selectionSorting(int[] intArray) {

        for(int lastUnsortedIndex=intArray.length-1; lastUnsortedIndex>0; lastUnsortedIndex-- ){

            int largestIndex = 0;

            for(int i=1; i<=lastUnsortedIndex; i++){
                if(intArray[i] > intArray[largestIndex]){
                    largestIndex = i;
                }
            }
            swap(intArray, largestIndex, lastUnsortedIndex);
        }
        return intArray;
    }

    public static void swap(int[] arr, int i, int j) {
        if (i == j) return;

        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
