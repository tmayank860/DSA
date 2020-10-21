package Arrays;

import java.util.Arrays;

public class ShuffletheArray {
    public static void main(String[] args) {
        int[] nums={1,2,3,4,4,3,2,1};
        System.out.println(shuffle(nums,4));
    }
    public static String shuffle(int[] nums, int n) {
        int[] result=new int[2*n];
        int j=0,k=0;
        for (int i=0;i<2*n;i++){
            if ((i+1)%2!=0){
                result[i]=nums[k];
                k++;
            }else {
                result[i]=nums[n+j];
                j++;
            }
        }
        return Arrays.toString(result);
    }

}
