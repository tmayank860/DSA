package GFGInterviewPrep.Array;

import java.util.Arrays;

public class MoveZerotoLast {
    public static void main(String[] args) {
        int[] arr = {67, 34, 0, 69, 24, 78, 58, 62, 64 ,5 ,45, 81, 27, 61, 91, 95, 42, 27, 36, 91 ,4 ,2, 53, 92, 82, 21, 16,
                18, 95, 47, 26, 71, 38, 69, 12, 67, 99, 35, 94, 3, 11};
//        System.out.println
                move(arr, arr.length);
    }

    public static void move(int[] arr, int n) {
        int i, j = 0;
        for (i = 0; i < n; i++) {
            if (arr[i] != 0) {
                arr[j++] = arr[i];
            }
        }
//        for (i = j; i < n; i++) {
//            arr[i] = 0;
//        }
        for (i = 0; i <j; i++) {
            System.out.print(arr[i]+" ");
        }
        while(j++<n){
            System.out.print(0+" ");
        }
//        return Arrays.toString(arr);
    }
}
