package Arrays;

import java.util.Arrays;

public class SquareOfSorted {
    public static void main(String[] args) {

    }
    public static int[] sortedSquares(int[] nums) {
        for(int i=0;i<nums.length;i++){
            int x=nums[i]*nums[i];
            nums[i]=x;
        }
        Arrays.sort(nums);
        return (nums);
    }
}
