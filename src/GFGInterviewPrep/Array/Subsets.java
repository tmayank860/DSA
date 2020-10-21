package GFGInterviewPrep.Array;

import java.util.ArrayList;
import java.util.List;

public class Subsets {
    public static void main(String[] args) {
        int[] nums = {1, 2};
        List<List<Integer>> result=subsets(nums);
        for (List<Integer> ls:result){
            System.out.println(ls);
        }
    }

    public static List<List<Integer>> subsets(int[] nums) {
        List<Integer> ls = new ArrayList<>();
        List<List<Integer>> result = new ArrayList<>();
        int start = 0;
        set(start, nums, ls, result);
        return result;

    }

    public static void set(int start, int[] nums, List<Integer> ls, List<List<Integer>> result) {
        result.add(new ArrayList<>(ls));
        for (int i = start; i < nums.length; i++) {
            ls.add(nums[i]);
            set(i + 1, nums, ls, result);
            ls.remove(ls.size() - 1);
        }
    }
}
