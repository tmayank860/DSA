package Recursion;

import java.util.ArrayList;
import java.util.List;

public class SubSequence {
    public static void main(String[] args) {
        String s="781484";
//        int[] arr=Integer.parseInt()
        int[] arr={1,5,0,2,5};
//        ArrayList<Integer> ls=new ArrayList<>();
       subSequence(arr,arr.length);

    }
    //subsequence using iterative approach
    public static void subSeq(int[] arr, int n){
        for (int i=0;i<n;i++){
            for (int j=i;j<n;j++){
                for (int k=i;k<=j;k++){
                    System.out.print(arr[k]+" ");
                }
                System.out.println();
            }
        }
    }
    // Subsequence using recursive call
    public static List<List<Integer>> subSequence(int[] candidates, int n) {
            List<List<Integer>> ls=new ArrayList<>();
            List<Integer> cd=new ArrayList<>();
            comb(candidates,n,cd,0,ls);
        System.out.println(ls);
            return ls;
        }

        public static void comb(int[] candidates,int target,List<Integer> cd, int idx,List<List<Integer>> ls){
            if(idx==candidates.length){
                if(cd.size()==(target-2)){
                    ls.add(new ArrayList<>(cd));
                }
                return;

            }
            cd.add(candidates[idx]);
//            sum+=candidates[idx];
            comb(candidates,target,cd,idx+1,ls);
            cd.remove(cd.size()-1);
//            sum-=candidates[idx];
            comb(candidates,target,cd,idx+1,ls);
            return;
        }
}
