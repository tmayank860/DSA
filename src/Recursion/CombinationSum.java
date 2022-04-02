package Recursion;

import java.util.ArrayList;
import java.util.List;

public class CombinationSum {
    public static void main(String[] args) {
        int[] arr={1,5,0,2,5};
        System.out.println(combinationSum(arr,3));

    }
    public static List<List<Integer>> combinationSum(int[] arr, int target) {
        List<List<Integer>> ls=new ArrayList<>();
        combinations(0,arr,0,target,ls,new ArrayList<Integer>());
        return ls;
    }

    static void combinations(int idx,int[] arr,int sum,int target,List<List<Integer>> ls, List<Integer> ds){
        if (idx==arr.length){
            if (sum==target){
                ls.add(new ArrayList<>(ds));
            }
            return;
        }
        if (sum<=target){
            sum+=arr[idx];
            ds.add(arr[idx]);
            combinations(idx, arr, sum, target, ls, ds);
            sum-=arr[idx];
            ds.remove(ds.size()-1);
        }
        combinations(idx+1, arr, sum, target, ls, ds);
    }
}
