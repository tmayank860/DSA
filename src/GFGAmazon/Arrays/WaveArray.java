package GFGAmazon.Arrays;

import java.util.Arrays;

public class WaveArray {
    public static void main(String[] args) {
        int[] arr={6907, 7808, 8551 ,8683 ,9205, 9980};
        convertToWave(arr,6);
        System.out.println(Arrays.toString(arr));
    }
    public static void convertToWave(int arr[], int n){

        // Your code here
        int i=0;
        while (i++<n-1) {
            if (i % 2 == 0) {
                if (arr[i] > arr[i - 1]) {
                    swap(arr, i, i - 1);
                }
                if (arr[i] > arr[i + 1]) {
                    swap(arr, i, i + 1);
                }
            }
        }

    }
    static void swap(int[] arr,int i,int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }

}
