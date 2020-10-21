package Arrays;

import java.util.Arrays;

public class SmallerThantheCurrentNumber {
    public static void main(String[] args) {
        int[] nums = {8, 1, 2, 2, 3};
//        System.out.println(smallerNumbersThanCurrent(nums));
        System.out.println(hammingDistance(1,4));
    }

    public static String smallerNumbersThanCurrent(int[] nums) {
        int[] small = new int[nums.length];
        Arrays.fill(small, 0);
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                if (nums[i] > nums[j]) {
                    small[i]=small[i]+1;
                }
            }
        }
        return Arrays.toString(small);
    }
    public int[] smallerNumbersThanCurrent(int[] nums,int n) {
        int[] index = new int[101];
        for (int i : nums) {
            index[i]++;
        }

        int count = 0;
        for (int i = 0; i < index.length; i++) {
            int swap = index[i];
            index[i] = count;
            count += swap;
        }

        for (int i = 0; i < nums.length; i++) {
            nums[i] = index[nums[i]];

        }
        return nums;
    }
    public static int hammingDistance(int x, int y) {
       String s1= Integer.toBinaryString(x);
       String s2=Integer.toBinaryString(y);
       int i=0,j=0,count=0;
       if (s1.length()<s2.length()){
           while (s1.length()<s2.length()){
               s1="0"+s1;
           }
       }else {
           while (s2.length()<s1.length()){
               s2="0"+s2;
           }
       }
       while (i<s1.length()){
           if (s1.charAt(i++)!=s2.charAt(j++)){
               count++;
           }
       }
       return count;
    }
}
