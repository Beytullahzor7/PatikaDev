package Arrays;

public class Introduction2 {
    public static void main(String[] args) {
        int[] list = {10,20,30,40,50,60,70,80,90,100};
        int[] newList = reverse(list);
        printArr(newList);


    }
    public static int[] reverse(int[] list){
        int[] reverse = new int[list.length];
        for(int i=0, j=list.length-1; i < list.length; i++, j--){
            reverse[i] = list[j];
        }
        return reverse;
    }
    public static void printArr(int[] arr){
        for(int i=0; i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
}
