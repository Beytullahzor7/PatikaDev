package Arrays;

import java.util.Arrays;

public class DiziFrekans {
    public static void main(String[] args) {
        int[] list = {10, 20, 20, 10, 10, 20, 5, 20};
        int n = list.length;
        isFrequence(list, n);

    }
    public static boolean isFrequence(int[] arr, int n) {
        boolean[] visited = new boolean[n];
        Arrays.fill(visited, false); //default

        for (int i = 0; i < n; i++) {
            if (visited[i] == true)
                continue;

            int count = 1;
            for (int j = i + 1; j < n; j++) {
                if (arr[i] == arr[j]) {
                    visited[j] = true;
                    count++;
                }
            }
            if (count > 1) {
                System.out.println(arr[i] +" sayısı " +count + " kez tekrar etti");
            }
        }
        return false;
    }
}
