package LeetCodeMarch;

import java.util.ArrayList;
import java.util.List;

public class PickupAndDelivery {
    public static void main(String[] args) {
        System.out.println("Count..."+countOrders(6));
    }
    public static int countOrders(int n) {
//        ArrayList<String> arr=new ArrayList<>();
        String[] arr=new String[2*n];
        for (int i=0;i<n;i++){
            arr[i]="P"+Integer.toString(i+1);
            arr[i+n]="D"+Integer.toString(i+1);
        }
        List<List<String>> ls=new ArrayList<>();
        perm(0,arr,ls);
        System.out.println(ls);
        return ls.size();
    }
    public static void perm(int idx,String[] nums,List<List<String>> res){
        if (idx==nums.length){
            ArrayList<String> ls=new ArrayList<>();
            for (int i = 0; i < idx; i++) {
                ls.add(nums[i]);
            }
            boolean flag=false;
            for (int i = 0; i < idx; i++) {
                if (ls.indexOf("P"+Integer.toString(i+1))>ls.indexOf("D"+Integer.toString(i+1))){
                    flag=true;
                    break;
                }
            }
            if (flag==false){
                res.add(new ArrayList<>(ls));
            }
            return;
        }
        for (int i = idx; i < nums.length; i++) {
            swap(i,idx,nums);
            perm(idx+1,nums,res);
            swap(i,idx,nums);
        }
    }
    public static void swap(int i,int j,String[] nums){
        String temp=nums[i];
        nums[i]=nums[j];
        nums[j]=temp;
    }
}
