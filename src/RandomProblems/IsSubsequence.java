package RandomProblems;

import java.util.ArrayList;

public class IsSubsequence {
    public static void main(String[] args) {
//        System.out.println(isSubsequence("abc","ahbgdc"));\
        int[] arr={2,0,2,1,1,0};
        sortColors(arr);

    }
    public static boolean isSubsequence(String s, String t) {
        int j = 0;
        for (int i = 0; i < t.length() && j < s.length(); i++)
            if (s.charAt(j) == t.charAt(i))
                j++;
        return (j == s.length());
    }

    public static void sortColors(int[] nums) {
        int c0=0,c1=0,c2=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0){
                c0++;
            }
            else if(nums[i]==1){
                c1++;
            }else{
                c2++;
            }
        }
        int i=0,j=0;
        while(i<c0){
            nums[j]=0;
            j++;
            i++;
        }
        i=0;
        while(i<c1){
            nums[j]=1;
            j++;
            i++;
        }
        i=0;
        while(i<c2){
            nums[j]=2;
            j++;
            i++;
        }
        for(int num:nums){
            System.out.print(num+" ");
        }
    }
}
