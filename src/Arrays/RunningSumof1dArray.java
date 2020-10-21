package Arrays;

import java.util.Arrays;

public class RunningSumof1dArray {
    public static void main(String[] args) {
        int[] nums={1,2,3,4};
        System.out.println(runningSum(nums));


    }
    public static String runningSum(int[] nums) {
        int previousSum=nums[0];
        for (int i=1;i<nums.length;i++){
            nums[i]=previousSum+nums[i];
            previousSum=nums[i];
        }
        return Arrays.toString(nums);
    }
}
