package BabbarSheet.Arrays;

//Move all negative numbers to beginning and positive to end with constant extra space

import java.util.Arrays;

public class NegativeAndPositive {
    public static void main(String[] args) {
        int[] arr = {-12, 11, -13, -5, 6, -7, 5, -3, -6};
        partition(arr, 9);
        System.out.println(Arrays.toString(arr));
    }

    static void partition(int[] arr, int n) {
        int i, j = 0;
        for (i = 0; i < n; i++) {
            if (arr[i] < 0) {
                swap(arr, i, j);
                j++;
            }
        }
    }

    static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
