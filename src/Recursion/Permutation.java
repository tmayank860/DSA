package Recursion;

import java.util.ArrayList;
import java.util.List;

public class Permutation {
    public static void main(String[] args) {
        System.out.println(permute(new int[]{1,2,3}));
    }
    public static List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> res=new ArrayList<>();
//        perm(0,nums,res);
        boolean[] flag=new boolean[nums.length];
        permutation(nums,res,new ArrayList<>(),flag);
        return res;
    }
    public static void perm(int idx,int[] nums,List<List<Integer>> res){
        if (idx==nums.length){
            ArrayList<Integer> ls=new ArrayList<>();
            for (int i = 0; i < idx; i++) {
                ls.add(nums[i]);
            }
            res.add(new ArrayList<>(ls));
            return;
        }
        for (int i = idx; i < nums.length; i++) {
            swap(i,idx,nums);
            perm(idx+1,nums,res);
            swap(i,idx,nums);
        }
    }

    public static void permutation(int [] nums,List<List<Integer>> res, List<Integer> ds,boolean [] flag){
        if (ds.size()== nums.length){
            res.add(new ArrayList<>(ds));
            return;
        }
        for (int i=0;i< nums.length;i++){
            if (!flag[i]){
                flag[i]=true;
                ds.add(nums[i]);
                permutation(nums, res, ds, flag);
                ds.remove(ds.size()-1);
                flag[i]=false;
            }
        }
    }
    public static void swap(int i,int j,int[] nums){
        int temp=nums[i];
        nums[i]=nums[j];
        nums[j]=temp;
    }
}
