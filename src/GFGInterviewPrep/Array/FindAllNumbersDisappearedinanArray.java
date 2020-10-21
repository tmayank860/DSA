package GFGInterviewPrep.Array;

import java.util.ArrayList;
import java.util.List;

public class FindAllNumbersDisappearedinanArray {
    public static void main(String[] args) {

    }

    public static List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> ls = new ArrayList<>();
       int[] arr=new int[nums.length];
       for (int i=0;i<nums.length;i++){
           arr[nums[i]-1]+=nums[i];
       }

        for (int i=0;i<nums.length;i++){
            if (arr[i]==0){
                ls.add(i+1);
            }
        }


        return ls;
    }
}
