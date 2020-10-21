package Arrays;

public class EvenNumberofDigits {
    public static void main(String[] args) {

    }
    public static int findNumbers(int[] nums) {
        int count=0;
        for (int i=0;i<nums.length;i++){
            if(Integer.toString(nums[i]).length()%2==0){
                count++;
            }
        }
        return count;
    }
}
