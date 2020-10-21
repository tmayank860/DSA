package Crux;

import java.util.Scanner;

public class SortingInLinearTime {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        try {
            int n=sc.nextInt();
            int[] arr=new int[n];
            for (int i=0;i<n;i++){
                arr[i]=sc.nextInt();
            }
            int low=0,mid=0,high=n-1;
            while (mid<=high){
                if (arr[mid]==0){
                   swap(arr,mid,low);
                   low++;
                   mid++;
                }else if (arr[mid]==1){
                    mid++;
                }else {
                    swap(arr,mid,high);
                    high--;
                }
            }
            for (int i=0;i<n;i++){
                System.out.println(arr[i]);
            }
        }catch (Exception e){

        }
    }
    static void swap(int[]arr,int i,int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
}
