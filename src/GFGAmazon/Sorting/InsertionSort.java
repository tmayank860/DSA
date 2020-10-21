package GFGAmazon.Sorting;

import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        int[]arr={5, 1, 4, 2, 8};
        insertionSort(arr,5);
        System.out.println(Arrays.toString(arr));
    }
    static void insertionSort(int[] arr,int n){
        int i,j,key;
        for (i=1;i<n;i++){
            key=arr[i];
            j=i-1;
            while (j>=0&&arr[j]>key){
                arr[j+1]=arr[j];
                j--;
            }
            arr[j+1]=key;
        }
    }
}
