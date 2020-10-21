package Arrays;

import java.util.Arrays;

public class RotateArray {
    public static void main(String[] args) {
        int[] arr={1,2};
        rotate(arr,3);
    }
    public static void rotate(int[] nums, int k) {
        int i=0,n=nums.length;
        int[] a=new int[n];
        for (i=0;i<n;i++){
            a[(i+k)%n]=nums[i];
        }
        System.arraycopy(a,0,nums,0,n);
        for (int val:nums){
            System.out.print(val+" ");
        }
    }
}
