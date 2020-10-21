package GFGInterviewPrep.Array;

public class MissingNumber {
    public static void main(String[] args) {
        int [] arr={1,2,3,5};
System.out.println(missingNumber(arr));
    }

    public static int missingNumber(int[] nums) {
        int res=0;
        for (int i = 0; i < nums.length; i++) {
            res=res^(nums[i]^(i+1));
        }
        return res;
    }
}
