package BinarySearch;

import java.util.Arrays;

public class TwoSumIIinputarrayissorted {
    public static void main(String[] args) {
        int[] arr={2,7,11,15};
        int [] result=twoSum(arr,9);
        for (int s:result){
            System.out.print(s+" ");
        }

    }
    public static int[] twoSum(int[] numbers, int target) {
        if (numbers==null||numbers.length<2){
            return new int[]{0,0};
        }
        int l=0,r=numbers.length-1;
        while (l<r){
            int sum=numbers[l]+numbers[r];
            if (sum==target){
                return new int[]{l+1,r+1};
            }else if(sum>target){
                r--;
            }else {
                l++;
            }
        }

        return new int[]{0,0};
    }

}
