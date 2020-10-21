package GFGInterviewPrep.Array;

public class ProductofArrayExceptSelf {
    public static void main(String[] args) {

    }
    public int[] productExceptSelf(int[] nums) {
        int result=1;
        int[] res=new int[nums.length];
        for (int i=0;i<nums.length;i++){
            res[i]=result;
           result *=nums[i];
        }
        result=1;
        for (int i=0;i<nums.length;i++){
            nums[i]=result/nums[i];
        }
        return nums;

    }
}
