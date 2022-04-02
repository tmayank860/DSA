package Recursion;

import java.util.ArrayList;

public class SubSeqForGivenSum {
    public static void main(String[] args) {
        int[] arr={1,2,3,5,-2};
        ArrayList<Integer> ls=new ArrayList<>();
        ArrayList<ArrayList<Integer>> cd=new ArrayList<>();
        System.out.println(subSeq(arr,0,0,ls,3));
    }
    public static boolean subSeq(int[] arr, int idx,int sum, ArrayList<Integer> ls, int target){
        if (idx==arr.length){
            if (sum==target){
                for (int x:ls
                     ) {
                    System.out.print(x+" ");
                }
                    return true;
            }
                return false;
        }

        ls.add(arr[idx]);
        sum+=arr[idx];
        if (subSeq(arr,idx+1,sum,ls,target)==true){
            return true;
        }
        sum-=arr[idx];
        ls.remove(ls.size()-1);
        if(subSeq(arr, idx+1, sum, ls, target)==true){
            return true;
        }
        return false;
    }
}
