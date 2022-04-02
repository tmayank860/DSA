package Recursion;

import java.util.ArrayList;

public class SubSeqCount {
    public static void main(String[] args) {
        int[] arr={1,2,3,5,-2};
        System.out.println(count(arr,0,0,3));
    }
    public static int count(int[] arr,int sum, int idx, int target){
        if (idx==arr.length){
            if (sum==target){
                return 1;
            }else {
                return 0;
            }
        }
        sum+=arr[idx];
        int inc=count(arr,sum,idx+1,target);
        sum-=arr[idx];
        int exc=count(arr, sum, idx+1, target);
        return (inc+exc);
    }
}
