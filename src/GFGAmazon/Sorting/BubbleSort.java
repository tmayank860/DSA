package GFGAmazon.Sorting;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[]arr={5, 1, 4, 2, 8};
        bubbleSort(arr,5);
        System.out.println(Arrays.toString(arr));
    }
    static void bubbleSort(int[] arr,int n){
        for (int i=0;i<n-1;i++){
            for (int j=0;j<n-1-i;j++){
                if (arr[j]>arr[j+1]){
                    swap(arr,j,j+1);
                }
            }
        }
    }

    private static void swap(int[] arr, int j, int i) {
        int temp=arr[j];
        arr[j]=arr[i];
        arr[i]=temp;
    }
}
