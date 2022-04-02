package Recursion;

import java.util.ArrayList;

public class SubsetSum {
    public static void main(String[] args) {
        ArrayList<Integer> arr=new ArrayList<>();
        arr.add(5);
        arr.add(-1);
        arr.add(8);
        arr.add(2);
        arr.add(7);
        arr.add(0);
        System.out.println( findSubsetsThatSumToK(arr,arr.size(),7));
    }

    public static ArrayList<ArrayList<Integer>> findSubsetsThatSumToK(ArrayList<Integer> arr, int n, int k)
    {
        // Write your code here.
        ArrayList<ArrayList<Integer>> ls=new ArrayList<>();
        comps(0, arr,k,0,ls,new ArrayList<Integer>());
        return ls;
    }
    static void comps(int idx,ArrayList<Integer> arr,int target,int sum,ArrayList<ArrayList<Integer>> ls,ArrayList<Integer> ds){
        if(idx==arr.size()){
            if(sum==target){
                ls.add(new ArrayList<>(ds));
            }
            return;
        }
        sum+=arr.get(idx);
        ds.add(arr.get(idx));
        comps(idx+1,arr,target,sum,ls,ds);
        sum-=arr.get(idx);
        ds.remove(ds.size()-1);
        comps(idx+1,arr,target,sum,ls,ds);
    }
}
