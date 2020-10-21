package GFGAmazon.Sorting;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[]arr={5, 1, 4, 2, 8};
        selectionSort(arr,5);
        System.out.println(Arrays.toString(arr));
    }
    static void selectionSort(int[] arr,int n){
        int i,j,mid_indx;
        for (i=0;i<n-1;i++){
            mid_indx=i;
            for (j=i+1;j<n;j++){
                if (arr[j]<arr[mid_indx]){
                    mid_indx=j;
                }
            }
            swap(arr,mid_indx,i);
        }
    }
    private static void swap(int[] arr, int j, int i) {
        int temp=arr[j];
        arr[j]=arr[i];
        arr[i]=temp;
    }
}
