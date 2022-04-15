package FolksDev.DataStructuresAndAlgorithms;

public class InsertionSort {
    public static void main(String[] args) {

        int[] arr = {600, -9, 5, -150, 15, 19, 7};

        insertionSort(arr);

        for(int temp : arr){
            System.out.println(temp);
        }
    }

    public static void insertionSort(int[] arr){

        for(int firstUnsortedIndex=1; firstUnsortedIndex<arr.length; firstUnsortedIndex++){
            int element = arr[firstUnsortedIndex];

            int i;
            for(i=firstUnsortedIndex; i>0 && arr[i-1] > element; i--){
                arr[i] = arr[i-1];
            }
            arr[i] = element;
        }
    }
}
