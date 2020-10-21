package Arrays;

import java.util.Arrays;

public class MajorityElement {
    public static void main(String[] args) {
int[] nums={2,2,1,1,1,2,2};
System.out.println(majorityElement(nums));
    }
    public static int majorityElement(int[] nums) {
        Arrays.sort(nums);

            if (nums.length%2==0) {
                for (int i = 0; i < nums.length / 2; i++) {
                    if (nums[i] == nums[nums.length / 2 + i - 1]) {
                        return nums[i];
                    }
                }
            }else {
                for (int i = 0; i < nums.length / 2+1; i++) {
                if (nums[i] == nums[nums.length / 2 + i ]) {
                    return nums[i];
                }
            }
        }
        return -1;
    }
    public int majorityElement(int[] nums,int n) {
        // count and find out
        if(nums.length == 1) {
            return nums[0];
        }

        int current = nums[0];
        int count = 1;
        for(int i=1;i<nums.length;i++) {
            if(nums[i] == current) {
                count++;
            } else {
                if(count == 0) {
                    count = 1;
                    current = nums[i];
                } else {
                    count--;
                }
            }
        }

        return current;
    }
}
