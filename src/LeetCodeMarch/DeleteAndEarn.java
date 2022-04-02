package LeetCodeMarch;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

public class DeleteAndEarn {
    public static void main(String[] args) {
        int[] nums={3,4,2};
        System.out.println(deleteAndEarn(nums));
    }
    public static int deleteAndEarn(int[] nums) {
        if (nums.length==0){
            return 0;
        }
        if (nums.length==1){
            return nums[0];
        }
        Arrays.sort(nums);
        HashMap<Integer,Integer> hs=new HashMap<>();
        ArrayList<Integer> num= new ArrayList<>();
        for (int x:nums
             ) {
           if (!num.contains(x)){
               num.add(x);
           }
            if (hs.containsKey(x)){
                hs.put(x,hs.get(x)+1);
            }else {
                hs.put(x,1);
            }
        }
        int first=0;
        int second=0;
        for (int i=0;i<num.size();i++){
            int current=num.get(i) *hs.get(num.get(i));
            if (i>0&&num.get(i)==num.get(i-1)+1){
                int temp=second;
                second=Math.max(current+first,second);
                first=temp;
            }else {
                int temp=second;
                second=second+current;
                first=temp;
            }
        }
        return second;
    }
}
