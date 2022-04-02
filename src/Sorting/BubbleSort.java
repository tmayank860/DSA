package Sorting;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr={5,7,3,2,21,12};
        bubbleSort(arr,6);
        System.out.println(Arrays.toString(arr));
    }

    static void bubbleSort(int[] arr,int n){
        for (int i=0;i<n;i++){
//        for (int i=0;i<n-1;i++){
//            for (int j=0;j<n-i-1;j++){
//                if (arr[j]>arr[j+1]){
//                    swap(arr,j,j+1);
//                }
//            }
            for (int j=i+1;j<n-1;j++){
                if (arr[i]>arr[j]){
                    swap(arr,i,j);
                }
            }
        }
    }

    static void swap(int[] arr,int x,int y){
        int temp=arr[x];
        arr[x]=arr[y];
        arr[y]=temp;
    }
}
