package GFGInterviewPrep.Array;

import java.util.Arrays;

public class ReverseAnArray {
    public static void main(String[] args) {
        int[] nums = {30,20, 7};
         revrse(nums, 3);
        System.out.println(Arrays.toString(nums));
    }

    public static void revrse(int[] nums, int n) {
        int mid = (n) / 2;
        int s = 0, e = n - 1;
        if (n%2==0){
        while (s < mid ) {
            swap(nums, s, e);
            s++;
            e--;
        }
        }else {
            while (s < mid ) {
                swap(nums, s, e);
                s++;
                e--;
            }
        }
    }

    private static void swap(int[] nums, int s, int e) {
        int temp = nums[s];
        nums[s] = nums[e];
        nums[e] = temp;
    }
}
