package CodeStuudioInterviewEx;

import java.util.Arrays;

public class SortThree {
    public static void main(String[] args) {
        int[] arr={1,0,0,2,1,2,0,1};
        sort(arr,8);
        System.out.println(Arrays.toString(arr));
        String s="mkmkmk";
    }
    static void sort(int[] arr,int n){
        int l=0,r=n-1,mid=0;
        while (mid<=r){
            switch (arr[mid]){
                case 0:{
                    int temp=arr[l];
                    arr[l]=arr[mid];
                    arr[mid]=temp;
                    mid++;
                    l++;
                    break;
                }
                case 1:{
                    mid++;
                    break;
               }
                case 2:{
                    int temp=arr[mid];
                    arr[mid]=arr[r];
                    arr[r]=temp;
                    r--;
                    break;
                }

            }
        }
    }
}
