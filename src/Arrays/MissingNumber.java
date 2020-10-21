package Arrays;

public class MissingNumber {
    public static void main(String[] args) {
    int[] nums={1,0,3};
    System.out.println(missingNumber(nums));
    }
    public static int missingNumber(int[] nums) {
        int n=nums.length;
        if (n%2==0) {
            for (int i = 1; i < n % 2; i++) {
                int temp = nums[i];
                nums[i] = nums[temp - 1];
                nums[temp - 1] = temp;
            }
        }else {
            for (int i = 1; i < n % 2+1; i++) {
                int temp = nums[i];
                nums[i] = nums[temp - 1];
                nums[temp - 1] = temp;
            }
        }
            for (int i=0;i<nums.length;i++){
                if (nums[i]==0){
                    return i+1;
                }
            }
        return -1;
    }
}
