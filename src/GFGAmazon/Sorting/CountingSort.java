package GFGAmazon.Sorting;

import java.util.Arrays;

public class CountingSort {
    public static void main(String[] args) {
        int[] arr={1, 4, 1, 2, 7, 5, 2};
        System.out.println(countingSort(arr,7));

    }
    static String  countingSort(int [] arr,int n){
        int max=Integer.MIN_VALUE;
        for (int i=0;i<n;i++){
            if (max<arr[i]){
                max=arr[i];
            }
        }
        int [] count=new int[max+1];
        Arrays.fill(count,0);
        for (int i=0;i<n;i++){
            count[arr[i]]++;
        }
        for (int i=1;i<max+1;i++){
            count[i]=count[i]+count[i-1];
        }
        int[] result=new int[n];
        for (int i=n-1;i>=0;i--){
            result[count[arr[i]]-1]=arr[i];
            count[arr[i]]--;
        }
        return Arrays.toString(result);
    }
}
