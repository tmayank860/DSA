package Recursion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CombinationSumII {
    public static void main(String[] args) {
        int[] arr={10,1,2,7,6,1,5};
        System.out.println(combinationSum(arr,8));
    }
    public static List<List<Integer>> combinationSum(int[] arr, int target) {
        List<List<Integer>> ls=new ArrayList<>();
        Arrays.sort(arr);
        combinations2(0,arr,target,ls,new ArrayList<Integer>());
        return ls;
    }

    static void combinations2(int idx,int[] arr,int target,List<List<Integer>> ls, List<Integer> ds){

            if (target==0){
                ls.add(new ArrayList<>(ds));
                return;
        }
        for (int i = idx; i < arr.length; i++) {
            if (i > idx && arr[i] == arr[i - 1]) continue;
            if (arr[i] > target) break;
            ds.add(arr[i]);
            combinations2(i+1, arr, target-arr[i], ls, ds);
            ds.remove(ds.size()-1);
        }
    }
}
