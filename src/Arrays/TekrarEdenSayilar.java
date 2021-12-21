package Arrays;

import java.util.Arrays;

public class TekrarEdenSayilar {
    public static void main(String[] args) {
        int[] list = {3,6,3,7,4,5,6,1,2,9,8,9,8,4,4};
        int[] duplicate = new int[list.length];
        int startIndex = 0;

        for(int i = 0; i<list.length; i++){
            for(int j = 0; j< list.length; j++){
                if((i != j) && (list[i] == list[j])){
                    if(!isFind(duplicate, list[i])){
                        if(list[i] % 2 == 0){
                            duplicate[startIndex++] = list[i];
                        }
                    }
                    break;
                }
            }
        }
        for (int value : duplicate){
            if(value != 0){
                System.out.println(value);
            }
        }
    }
    public static boolean isFind(int[] arr, int value){
        for(int i : arr){
            if(i == value){
                return true;
            }
        }
        return false;
    }
}
