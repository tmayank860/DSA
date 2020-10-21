package GFGAmazon.Sorting;

import java.util.Arrays;

public class CountpossibleTriangles {
    public static void main(String[] args) {
        int[] arr = {60 ,-65 ,5 ,-21, 8 ,93};
        System.out.println(findNumberOfTriangles(arr, 6));
    }
// 4 6 7 8 9
    static int findNumberOfTriangles(int[] arr, int n) {
        // code here
        Arrays.sort(arr);
        int i = 0, j, k=2, count = 0;
        for (i = 0; i < n-2; i++) {
            k=i+2;
            for (j = i + 1; j < n; ++j) {
                while (k < n && arr[i] + arr[j] > arr[k]) {
                    k = k + 1;
                }
                if (k>j){
                    count=count+k-j-1;
                }
            }
        }
        return count;
    }
}
