package LeetCodeMarch;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArithmeticSlices {
    public static void main(String[] args) {
        int[] nums={1,2,3,4,5,6};
        System.out.println(numberOfArithmeticSlices(nums));
    }
    public static int numberOfArithmeticSlices(int[] nums) {
        List<List<Integer>> ls=new ArrayList<>();
        return subSeq(nums,nums.length,0);
    }
    public static int subSeq(int[] nums,  int idx, int count ){
        if (idx<3){
            return 0;
        }
        if (nums[idx-1]-nums[idx-2]==nums[idx-2]-nums[idx-3]){
            count++;
            return count+subSeq(nums, idx-1, count);
        }
        else return subSeq(nums, idx-1, 0);
    }

}
